package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

import model.ModelPart;

public class ModelIO {
	public static final String SPACE = " ";// TODO
	public static final String SLASH = "/";

	public static Map<String, ModelPart> read() {
		File file = new File("./[AR1]StG44/ModelStG44.obj");

		float[] vertexArray = null;
		float[] uvArray = null;
		Map<String, ModelPart> model = new HashMap<>();

		String part = null;
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
					uvArray = ArrayUtils.addAll(uvArray, toFloatArray(value, SPACE, 2));
				} else if (key.equalsIgnoreCase("f")) {
					// 入ってないなら初期化
					if (!model.containsKey(part))
						model.put(part, new ModelPart());
					int[] poly = null;
					for (String str : value.split(SPACE)) {
						poly = ArrayUtils.addAll(poly, toIntegerArray(str, SLASH, 2));
					}
					//3角形なら
					int i = poly.length/2;
					if(i==3) {
						model.get(part).faces= ArrayUtils.addAll(model.get(part).faces, poly);
					}else {
						int[] triangle = new int[6];
						for (int j = 0; j < i-2; j++) {
							triangle = ArrayUtils.addAll(triangle, ArrayUtils.subarray(poly, j, j+1));
						}
					}


				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return model;
	}

	private static float[] toFloatArray(String str, String key, int length) {
		String[] split = str.split(key);
		float[] res = new float[length];
		for (int i = 0; i < length; i++) {
			if (split.length<i+1||split[i] == null)
				res[i] = 0f;
			res[i] = Float.valueOf(split[i]);
		}
		return res;
	}

	private static int[] toIntegerArray(String str, String key, int length) {
		String[] split = str.split(key);
		int[] res = new int[length];
		for (int i = 0; i < length; i++) {
			if (split.length<i+1||split[i] == null)
				res[i] = 0;
			res[i] = Integer.valueOf(split[i]);
		}
		return res;
	}
}
