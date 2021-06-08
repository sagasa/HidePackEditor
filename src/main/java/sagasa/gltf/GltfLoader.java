package sagasa.gltf;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GltfLoader {

	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	private static final int JSON_CHUNK = 0x4E4F534A;
	private static final int BIN_CHUNK = 0x004E4942;

	private static final TreeMap<Integer, Node> nodeCache = new TreeMap<>();

	public static GLBInfo LoadGlbFile(File file) throws IOException, GltfException {
		nodeCache.clear();
		DataInputStream stream = new DataInputStream(new FileInputStream(file));
		int magic = readUnsignedInt(stream);
		int version = readUnsignedInt(stream);
		int length = readUnsignedInt(stream);

		if (magic != 0x46546C67)
			throw new IllegalArgumentException("file is not GLB");
		if (version != 2)
			throw new IllegalArgumentException("GLB File is not v2");

		// First chunk is always JSON
		int chunkLength = readUnsignedInt(stream);
		int chunkType = readUnsignedInt(stream);
		byte[] data = new byte[chunkLength];
		if (stream.read(data, 0, chunkLength) != chunkLength) {
			throw new IOException("Failed to read file");
		}
		if (chunkType != JSON_CHUNK) {
			throw new IOException("first chunk is not json");
		}
		JsonParser parser = new JsonParser();
		JsonObject root = parser.parse(new String(data, StandardCharsets.UTF_8)).getAsJsonObject();

		// Load BIN data
		chunkLength = readUnsignedInt(stream);
		chunkType = readUnsignedInt(stream);
		data = new byte[chunkLength];
		if (stream.read(data, 0, chunkLength) != chunkLength) {
			throw new IOException("Failed to read GLB file");
		}
		if (chunkType != BIN_CHUNK) {
			throw new IOException("Expected BIN data but didn't get it");
		}

		// Get scene
		if (!root.has("scenes")) {
			throw new GltfException("scenes not found");
		}
		JsonObject scene = root.getAsJsonArray("scenes").get(root.has("scene") ? root.get("scene").getAsInt() : 0)
				.getAsJsonObject();

		// Load nodes
		int[] sceneNodes = gson.fromJson(scene.get("nodes"), int[].class);
		JsonArray nodeJsonArray = root.get("nodes").getAsJsonArray();
		ArrayList<Node> rootNodes = new ArrayList<>();
		for (int index : sceneNodes) {
			rootNodes.add(loadNode(nodeJsonArray, index));
		}

		// Load animations
		List<String> animations = new ArrayList<>();
		if (root.has("animations")) {
			for (JsonElement element : root.get("animations").getAsJsonArray()) {
				JsonObject object = element.getAsJsonObject();
				String name = getName(object, "default");
				animations.add(name);
			}
		}

		GLBInfo info = new GLBInfo();
		info.animations = animations;
		info.emptynodes = nodeCache.values().stream().filter(n -> !n.hasMesh).map(n -> n.name)
				.collect(Collectors.toList());
		return info;
	}

	public static class Node {
		boolean hasMesh;
		String name;
		List<Node> children;

		@Override
		public String toString() {
			return name;
		}
	}

	public static class GLBInfo {
		public List<String> animations;
		public List<String> emptynodes;

	}

	private static Node loadNode(JsonArray nodeJsonArray, int index) {
		if (nodeCache.containsKey(index)) {
			return nodeCache.get(index);
		}
		JsonObject nodeJson = nodeJsonArray.get(index).getAsJsonObject();

		Node node = new Node();
		node.name = getName(nodeJson, "default");

		ArrayList<Node> children = null;

		// Load children if there any
		if (nodeJson.has("children")) {
			int[] childrenIndexes = gson.fromJson(nodeJson.get("children"), int[].class);
			children = new ArrayList<>(childrenIndexes.length);
			for (int childIndex : childrenIndexes) {
				children.add(loadNode(nodeJsonArray, childIndex));
			}
			node.children = children;
		}

		// NOTE: depends on meshes being preloaded into the cache
		if (nodeJson.has("mesh")) {
			node.hasMesh = true;
		}

		nodeCache.put(index, node);
		return node;
	}

	private static String getName(JsonObject object, String defaultName) {
		if (object.has("name")) {
			return object.get("name").getAsString();
		}
		return defaultName;
	}

	private static int readUnsignedInt(DataInputStream stream) throws IOException {
		return Integer.reverseBytes(stream.readInt());
	}

	public static class GltfException extends Throwable {
		private static final long serialVersionUID = -7696024338732078517L;

		public GltfException(String str) {
			super(str);
		}
	}
}
