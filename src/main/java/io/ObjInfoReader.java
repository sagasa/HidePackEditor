package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class ObjInfoReader {
	public static final String SPACE = " ";// TODO
	public static final String SLASH = "/";

	/** Modelに頂点情報を書き込む */
	public static ModelInfo readInfo(byte[] data) {
		float[] vertexArray = null;
		float[] uvArray = null;
		Map<String, int[]> polygons = new HashMap<>();

		String part = "default";
		try {
			BufferedReader in = new BufferedReader(new StringReader(new String(data, StandardCharsets.UTF_8)));
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
						polygons.put(part, ArrayUtils.addAll(polygons.get(part), triangle));
					}
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ModelInfo model = new ModelInfo();
		// model.modelParts = polygons;
//		model.texArray = uvArray;
//		model.vertArray = vertexArray;
		model.animations = Collections.emptyList();

		model.emptynodes = new ArrayList<>();
		polygons.forEach((k, v) -> {
			if (v.length == 0)
				model.emptynodes.add(k);
		});
		return model;
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
