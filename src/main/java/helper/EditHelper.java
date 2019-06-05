package helper;

import java.lang.reflect.Field;
import java.util.List;

import javafx.beans.property.Property;
import localize.LocalizeHandler;
import types.Info;
import types.base.IEditData;

/** リフレクションを利用したTypes編集ヘルパー */
public class EditHelper {

	public static final String SPLIT = "\\.";

	/** 型取得 */
	public static Class<?> getType(IEditData data, String path) {
		return getType(data.getClass(), path);
	}

	@SuppressWarnings("unchecked")
	private static Field getField(Class<? extends IEditData> clazz, String path) {
		try {
			String[] split = path.split(SPLIT, 2);
			Field field = clazz.getField(split[0]);
			if (split.length > 1) {
				return getField((Class<? extends IEditData>) field.getType(), split[1]);
			}
			return field;
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			return null;
		}
	}

	/** 型取得 */
	public static Class<?> getType(Class<? extends IEditData> clazz, String path) {
		return getField(clazz, path).getType();
	}

	/**
	 * データ取得
	 */
	public static Object getData(IEditData data, String path) {
		try {
			String[] split = path.split(SPLIT, 2);
			Field field = data.getClass().getField(split[0]);
			if (split.length > 1) {
				return getData((IEditData) field.get(data), split[1]);
			}
			return field.get(data);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** データ上書き */
	public static boolean setData(IEditData data, String path, Object value) {
		try {
			String[] split = path.split(SPLIT, 2);
			Field field = data.getClass().getField(split[0]);
			if (split.length > 1) {
				return setData((IEditData) field.get(data), split[1], value);
			}
			data.getClass().getField(path).set(data, value);
			return true;
		} catch (IllegalArgumentException | IllegalAccessException | SecurityException | NoSuchFieldException e) {
			return false;
		}
	}

	/** pathから最大値を取得 */
	public static Float getMax(Class<? extends IEditData> clazz, String path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Max();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return Float.MAX_VALUE;
	}

	/** pathから最小値を取得 */
	public static Float getMin(Class<? extends IEditData> clazz, String path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Min();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return Float.MIN_VALUE;
	}

	/** pathからカテゴリを取得 */
	public static int getCate(Class<? extends IEditData> clazz, String path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Cate();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/** pathからスケールを取得 */
	public static String getScale(Class<? extends IEditData> clazz, String path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Scale();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return "1";
	}

	@SuppressWarnings("unchecked")
	private static Info getInfo(Class<? extends IEditData> clazz, String path) {
		try {
			String[] split = path.split(SPLIT, 2);
			Field field = clazz.getField(split[0]);
			if (split.length > 1) {
				return getInfo((Class<? extends IEditData>) field.getType(), split[1]);
			}
			return field.getAnnotation(Info.class);
		} catch (NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** プロパティを取得 */
	public static Property<?> getProperty(IEditData data, String path) {
		String[] split = path.split(SPLIT, 2);
		if (split.length > 1) {
			try {
				return getProperty((IEditData) data.getClass().getField(split[0]).get(data), split[1]);

			} catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException | SecurityException e) {
				e.printStackTrace();
			}
		}
		return data.getProperty(split[0]);
	}

	/** プロパティを取得 */
	@SuppressWarnings("unchecked")
	public static <T> Property<T> getProperty(IEditData data, String field, Class<T> clazz) {
		return (Property<T>) getProperty(data, field);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isString(Class<? extends IEditData> clazz, String type) {
		if (getType(clazz, type).isAssignableFrom(String.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isBoolean(Class<? extends IEditData> clazz, String type) {
		if (getType(clazz, type).isAssignableFrom(boolean.class)
				|| getType(clazz, type).isAssignableFrom(Boolean.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isStringList(Class<? extends IEditData> clazz, String type) {
		if (getType(clazz, type).isAssignableFrom(List.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isNumber(Class<? extends IEditData> clazz, String type) {
		return isFloat(clazz, type) || isInteger(clazz, type);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isFloat(Class<? extends IEditData> clazz, String type) {
		if (getType(clazz, type).isAssignableFrom(float.class) || getType(clazz, type).isAssignableFrom(Float.class))
			return true;

		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isInteger(Class<? extends IEditData> clazz, String type) {
		if (getType(clazz, type).isAssignableFrom(int.class) || getType(clazz, type).isAssignableFrom(Integer.class))
			return true;
		return false;
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(Class<? extends IEditData> clazz, String field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(clazz, field));
	}

	/** UnlocalizedNameのフォーマット */
	public static String getUnlocalizedName(Class<? extends IEditData> clazz, String field) {
		try {

			return (getField(clazz, field).getName().replaceAll("_", ".")).toLowerCase();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
