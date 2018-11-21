package helper;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.StringProperty;
import localize.LocalizeHandler;
import types.Info;
import types.base.DataBase;

/** リフレクションを利用したTypes編集ヘルパー */
public class EditHelper {

	/** 型取得 */
	public static Class<?> getType(DataBase data, String type) {
		try {
			return data.getClass().getField(type).getType();
		} catch (NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/**
	 * データ取得 EnumDataInfo.toString()と同じフィールド名を持つpublicなフィールドを取得可能
	 */
	public static Object getData(DataBase data, String string) {
		try {
			return data.getClass().getField(string).get(data);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** データ上書き */
	public static boolean setData(DataBase data, String type, Object value) {
		try {
			data.getClass().getField(type).set(data, value);
			return true;
		} catch (IllegalArgumentException | IllegalAccessException | SecurityException | NoSuchFieldException e) {
			return false;
		}
	}

	/** フィールド名から最大値を取得 */
	public static Float getMax(Class<? extends DataBase> clazz, String field) {
		try {
			Info info = getInfo(clazz, field);
			if (info != null) {
				return info.Max();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return Float.MAX_VALUE;
	}

	/** フィールド名から最小値を取得 */
	public static Float getMin(Class<? extends DataBase> clazz, String field) {
		try {
			Info info = getInfo(clazz, field);
			if (info != null) {
				return info.Min();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return Float.MIN_VALUE;
	}

	/** フィールド名からカテゴリを取得 */
	public static int getCate(Class<? extends DataBase> clazz, String field) {
		try {
			Info info = getInfo(clazz, field);
			if (info != null) {
				return info.Cate();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/** フィールド名からスケールを取得 */
	public static String getScale(Class<? extends DataBase> clazz, String field) {
		try {
			Info info = getInfo(clazz, field);
			if (info != null) {
				return info.Scale();
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return "1";
	}

	private static Info getInfo(Class<? extends DataBase> clazz, String field) {
		try {
			return clazz.getField(field).getAnnotation(Info.class);
		} catch (NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** プロパティを取得 */
	public static StringProperty getPropertyString(DataBase data, String type) {
		Property<?> property = data.Property.get(type);
		if (property != null && property instanceof StringProperty
				&& getType(data, type).isAssignableFrom(String.class)) {
			return (StringProperty) property;
		}
		return null;
	}

	/** プロパティを取得 */
	public static BooleanProperty getPropertyBoolean(DataBase data, String type) {
		Property<?> property = data.Property.get(type);
		if (property != null && property instanceof BooleanProperty
				&& (getType(data, type).isAssignableFrom(boolean.class)
						|| getType(data, type).isAssignableFrom(Boolean.class))) {
			return (BooleanProperty) property;
		}
		return null;
	}

	/** プロパティを取得 FloatとIntegerのみ */
	public static Property<Number> getPropertyNumber(DataBase data, String type) {
		if (getPropertyFloat(data, type) != null)
			return getPropertyFloat(data, type);
		else
			return getPropertyInteger(data, type);
	}

	/** プロパティを取得 */
	public static FloatProperty getPropertyFloat(DataBase data, String type) {
		Property<?> property = data.Property.get(type);
		if (property != null) {
			if (getType(data, type).isAssignableFrom(float.class) || getType(data, type).isAssignableFrom(Float.class))
				return (FloatProperty) property;
		}
		return null;
	}

	/** プロパティを取得 */
	public static IntegerProperty getPropertyInteger(DataBase data, String type) {
		Property<?> property = data.Property.get(type);
		if (property != null) {
			if (getType(data, type).isAssignableFrom(int.class) || getType(data, type).isAssignableFrom(Integer.class))
				return (IntegerProperty) property;
		}
		return null;
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(DataBase data, String field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(data.getClass(), field));
	}

	/** UnlocalizedNameのフォーマット */
	public static String getUnlocalizedName(Class<? extends DataBase> clazz, String field) {
		try {
			return (clazz.getField(field).getName().replaceAll("_", ".")).toLowerCase();
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

}
