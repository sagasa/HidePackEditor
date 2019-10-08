package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

import model.HideModel;

public class ModelIO {
	public static final String SPACE = " ";// TODO
	public static final String SLASH = "/";

	public static HideModel read() {
	}

	public static HideModel read(String data) {
		File file = new File("./[AR1]StG44/ModelStG44.obj");

		float[] vertexArray = null;
		float[] uvArray = null;
		Map<String, int[]> model = new HashMap<>();

		String part = "default";
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;

			String[] split;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				split = line.split(SPACE, 2);
				// 空なら
				if (split.length < 2)
					continue;
				String key = split[0];
				String value = split[1];
				if (key.equalsIgnoreCase("g")) {
					part = value;
				} else if (key.equalsIgnoreCase("v")) {
					vertexArray = ArrayUtils.addAll(vertexArray, toFloatArray(value, SPACE, 3));
				} else if (key.equalsIgnoreCase("vt")) {
					float[] tex = toFloatArray(value, SPACE, 2);
					tex[1] = 1 - tex[1];// TODO
					uvArray = ArrayUtils.addAll(uvArray, tex);
				} else if (key.equalsIgnoreCase("f")) {
					int[] poly = null;
					for (String str : value.split(SPACE)) {
						poly = ArrayUtils.addAll(poly, toIntegerArray(str, SLASH, 2));
					}
					// 3角形なら
					int i = poly.length / 2;

					int[] triangle;
					for (int j = 1; j < i - 1; j++) {
						triangle = ArrayUtils.subarray(poly, 0, 2);
						triangle = ArrayUtils.addAll(triangle, ArrayUtils.subarray(poly, j * 2, j * 2 + 4));
						// 1から始まるインデックスを0から始まるインデックスに
						for (int j2 = 0; j2 < triangle.length; j2++) {
							triangle[j2] = triangle[j2] - 1;
						}
						model.put(part, ArrayUtils.addAll(model.get(part), triangle));
					}
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new HideModel(vertexArray, uvArray, model);
	}

	private static float[] toFloatArray(String str, String key, int length) {
		String[] split = str.split(key);
		float[] res = new float[length];
		for (int i = 0; i < length; i++) {
			if (split.length < i + 1 || split[i] == null)
				res[i] = 0f;
			res[i] = Float.valueOf(split[i]);
		}
		return res;
	}

	private static int[] toIntegerArray(String str, String key, int length) {
		String[] split = str.split(key);
		int[] res = new int[length];
		for (int i = 0; i < length; i++) {
			if (split.length < i + 1 || split[i] == null)
				res[i] = 0;
			res[i] = Integer.valueOf(split[i]);
		}
		return res;
	}
}
