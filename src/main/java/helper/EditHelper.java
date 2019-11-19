package helper;

import java.lang.reflect.Field;
import java.util.List;

import javafx.beans.property.Property;
import localize.LocalizeHandler;
import types.Info;
import types.base.IEditData;

/** リフレクションを利用したTypes編集ヘルパー */
public class EditHelper {
	/** 型取得 */
	public static Class<?> getType(IEditData data, DataPath path) {
		return getType(data.getType(), path);
	}

	/** 型取得 */
	public static Class<?> getType(Class<? extends IEditData> clazz, DataPath path) {
		return getField(clazz, path).getType();
	}

	@SuppressWarnings("unchecked")
	private static Field getField(Class<? extends IEditData> clazz, DataPath path) {
		try {
			Field field = clazz.getField(path.fastName);
			if (path.hasChild) {
				return getField((Class<? extends IEditData>) field.getType(), path.nextPath);
			}
			return field;
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * データ取得
	 */
	public static Object getData(IEditData data, DataPath path) {
		Property<?> prop = getProperty(data, path);
		if (prop == null)
			throw new NullPointerException("try get non exist property");
		return prop.getValue();
	}

	/**
	 * データ上書き
	 *
	 * @param <T>
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void setData(IEditData data, DataPath path, Object value) {
		Property prop = getProperty(data, path, value.getClass());
		if (prop == null)
			throw new NullPointerException("try get non exist property");
		prop.setValue(value);
	}

	/** pathから最大値を取得 */
	public static Float getMax(Class<? extends IEditData> clazz, DataPath path) {
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
	public static Float getMin(Class<? extends IEditData> clazz, DataPath path) {
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
	public static int getCate(Class<? extends IEditData> clazz, DataPath path) {
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
	public static String getScale(Class<? extends IEditData> clazz, DataPath path) {
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
	private static Info getInfo(Class<? extends IEditData> clazz, DataPath path) {
		try {
			Field field = clazz.getField(path.fastName);
			if (path.hasChild) {
				return getInfo((Class<? extends IEditData>) field.getType(), path.nextPath);
			}
			return field.getAnnotation(Info.class);
		} catch (NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** プロパティを取得 */
	public static Property<?> getProperty(IEditData data, DataPath path) {
		return data.getProperty(path);
	}

	/** プロパティを取得 */
	@SuppressWarnings("unchecked")
	public static <T> Property<T> getProperty(IEditData data, DataPath field, Class<T> clazz) {
		return (Property<T>) getProperty(data, field);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isString(Class<? extends IEditData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(String.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isBoolean(Class<? extends IEditData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(boolean.class)
				|| getType(clazz, type).isAssignableFrom(Boolean.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isStringList(Class<? extends IEditData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(List.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isNumber(Class<? extends IEditData> clazz, DataPath type) {
		return isFloat(clazz, type) || isInteger(clazz, type);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isFloat(Class<? extends IEditData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(float.class) || getType(clazz, type).isAssignableFrom(Float.class))
			return true;

		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isInteger(Class<? extends IEditData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(int.class) || getType(clazz, type).isAssignableFrom(Integer.class))
			return true;
		return false;
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(Class<? extends IEditData> clazz, DataPath field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(clazz, field));
	}

	/** UnlocalizedNameのフォーマット */
	public static String getUnlocalizedName(Class<? extends IEditData> clazz, DataPath field) {
		try {
			return (getField(clazz, field).getName().replaceAll("_", ".")).toLowerCase();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
