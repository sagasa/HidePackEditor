package helper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class ModelLoader {

	private static final String ColladaSchema = "org.collada._2005._11.colladaschema";

	public void load(File file) {

	}

	static class IDMap {
		Map<String, Object> map = new HashMap<>();

		void put(String key, Object value) {
			map.put(key, value);
		}

		@SuppressWarnings("unchecked")
		<T> T get(String key, Class<T> type) {
			return (T) map.get(key);
		}
	}

	static class DaeImage {
		String fileName;

		public DaeImage(String name) {
			fileName = name;
		}
	}

	static class DaeEffect {
		String texName;

		public DaeEffect(String tex) {
			texName = tex;
		}
	}

	static class DaeMat {
		String effectName;

		public DaeMat(String effect) {
			effectName = effect;
		}
	}

	static class DaeMesh {
		List<HideVertex> vertex;

		public DaeMesh(List<HideVertex> vert) {
			vertex = vert;
		}
	}

	public void run() {
		// ファイルから読み込み

	}

	interface InputData<T> {
		void setData(String key, int index, T value);

		/** １パラメータで数値をいくつ含むか */
		default int getSize() {
			return 1;
		}
	}

	static class Vec3 implements InputData<Float> {
		static final Vec3 ZERO = new Vec3();

		float X = 0;
		float Y = 0;
		float Z = 0;

		@Override
		public String toString() {
			return "[x=" + X + ",y=" + Y + ",z=" + Z + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
			switch (key) {

			case "X":
				X = value;
				break;
			case "Y":
				Y = value;
				break;
			case "Z":
				Z = value;
				break;
			default:
				break;
			}
		}
	}

	static class Mat4 implements InputData<Float> {
		static final Vec3 ZERO = new Vec3();

		float[][] value = new float[4][4];

		@Override
		public String toString() {
			return ArrayUtils.toString(value);
		}

		@Override
		public int getSize() {
			return 16;
		}

		@Override
		public void setData(String key, int index, Float value) {
			this.value[index % 4][index / 4] = value;
		}
	}

	static class Tex implements InputData<Float> {
		static final Tex ZERO = new Tex();

		float U = 0;
		float V = 0;

		@Override
		public String toString() {
			return "[u=" + U + ",v=" + V + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
			switch (key) {

			case "S":
				U = value;
				break;
			case "T":
				V = value;
				break;
			default:
				break;
			}
		}
	}

	static class Color implements InputData<Float> {
		static final Color WHITE = new Color();
		float R = 1;
		float G = 1;
		float B = 1;
		float A = 1;

		@Override
		public String toString() {
			return "[r=" + R + ",g=" + G + ",B=" + B + ",A=" + A + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
			switch (key) {
			case "R":
				R = value;
				break;
			case "G":
				G = value;
				break;
			case "B":
				B = value;
				break;
			case "A":
				A = value;
				break;
			default:
				break;
			}
		}
	}

	static class Joint implements InputData<String> {
		String Name;

		@Override
		public String toString() {
			return "[Name=" + Name + "]";
		}

		@Override
		public void setData(String key, int index, String value) {
			Name = value;
		}
	}

	private static String getLinkStr(String str) {
		return str.substring(0, 1).equalsIgnoreCase("#") ? str.substring(1) : str;

	}

	public static class HideJoint {
		public final Mat4 mat;
		public final String name;

		public HideJoint(Mat4 mat, String name) {
			this.mat = mat;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[" + mat + "," + name + "]";
		}
	}

	public static class HideVertex {
		public final float posX, posY, posZ, normalX, normalY, normalZ, colorR, colorG, colorB, colorA, texU, texV;

		public HideVertex(Vec3 pos, Vec3 norm, Tex tex, Color color) {
			posX = pos.X;
			posY = pos.Y;
			posZ = pos.Z;
			normalX = norm.X;
			normalY = norm.Y;
			normalZ = norm.Z;
			texU = tex.U;
			texV = tex.U;
			colorR = color.R;
			colorG = color.G;
			colorB = color.B;
			colorA = color.A;
		}

		@Override
		public String toString() {
			return "[" + posX + "," + posY + "," + posZ + " : " + texU + "," + texV + "]";
		}
	}

}
