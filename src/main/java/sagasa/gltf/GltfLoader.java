package sagasa.gltf;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GltfLoader {

    private static final Gson gson = new Gson();
    private static final int JSON_CHUNK = 0x4E4F534A;
    private static final int BIN_CHUNK = 0x004E4942;
	 public static void LoadGlbFile(File file) throws IOException {
	        DataInputStream stream = new DataInputStream(new FileInputStream(file));
	        int magic = readUnsignedInt(stream);
	        int version = readUnsignedInt(stream);
	        int length = readUnsignedInt(stream);

	        if (magic != 0x46546C67) throw new IllegalArgumentException("File specified is not in the GLB format!");
	        if (version != 2) throw new IllegalArgumentException("GLB File is not version 2");

	        // First chunk is always JSON
	        int chunkLength = readUnsignedInt(stream);
	        int chunkType = readUnsignedInt(stream);
	        byte[] data = new byte[chunkLength];
	        if (stream.read(data, 0, chunkLength) != chunkLength) {
	            throw new IOException("Failed to read GLB file");
	        }
	        if (chunkType != JSON_CHUNK) {
	            throw new IOException("Expected JSON data but didn't get it");
	        }
	        JsonParser parser = new JsonParser();
	        JsonObject root = parser.parse(new String(data)).getAsJsonObject();

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


	    }

	 private static int readUnsignedInt(DataInputStream stream) throws IOException {
	        return Integer.reverseBytes(stream.readInt());
	    }
}
