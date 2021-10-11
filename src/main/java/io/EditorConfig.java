package io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class EditorConfig {
	private transient static final File configFile = new File("./editor.cfg");

	public List<String> openFiles;
	public String editDir = "./";

	transient private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public static EditorConfig load() {
		try {
			return gson.fromJson(
					new String(Files.readAllBytes(Paths.get(configFile.getPath())), StandardCharsets.UTF_8),
					EditorConfig.class);
		} catch (JsonSyntaxException | IOException e) {
			e.printStackTrace();
			EditorConfig config = new EditorConfig();
			save(config);
			return config;
		}
	}

	public static void save(EditorConfig config) {
		try {
			Files.write(Paths.get(configFile.getPath()), gson.toJson(config).getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
