package helper;

import java.util.Collection;
import java.util.List;

import javafx.beans.value.ObservableObjectValue;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.DataBase.DataEntry;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.base.Info;

/** リフレクションを利用したTypes編集ヘルパー */
public class EditHelper {

	/**
	 * 型取得
	 */
	public static Class<?> getType(Class<? extends DataBase> clazz, DataPath path) {
		return getEnum(clazz, path).Default.getClass();
	}

	public static Collection<DataEntry<?>> getEnums(Class<? extends DataBase> clazz, DataPath path) {
		return path == null ? DataBase.getEntries(clazz).values()
				: DataBase.getEntries(((DataBase) getEnum(clazz, path).Default).getClass()).values();
	}

	private static DataEntry<?> getEnum(Class<? extends DataBase> clazz, DataPath path) {
		DataEntry<?> current = DataBase.getEntries(clazz).get(path.fastName);
		if (path.hasChild) {
			return getEnum(((DataBase) current.Default).getClass(), path.nextPath);
		}
		return current;
	}

	/** pathから最大値を取得 */
	public static Float getMax(Class<? extends DataBase> clazz, DataPath path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Max;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return Float.MAX_VALUE;
	}

	/** pathから最小値を取得 */
	public static Float getMin(Class<? extends DataBase> clazz, DataPath path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Min;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return -Float.MAX_VALUE;
	}

	/** pathからカテゴリを取得 */
	public static int getCate(Class<? extends DataBase> clazz, DataPath path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Cate;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/** pathからスケールを取得 */
	public static String getScale(Class<? extends DataBase> clazz, DataPath path) {
		try {
			Info info = getInfo(clazz, path);
			if (info != null) {
				return info.Scale;
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return "1";
	}

	private static Info getInfo(Class<? extends DataBase> clazz, DataPath path) {
		System.out.println("getInfo " + path);
		return getEnum(clazz, path).Info;
	}

	/** プロパティを取得 */
	public static ObservableObjectValue<ValueEntry<?>> getProperty(DataBase data, DataPath path) {
		return data.getProperty(path);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isString(Class<? extends DataBase> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(String.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isBoolean(Class<? extends DataBase> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(boolean.class)
				|| getType(clazz, type).isAssignableFrom(Boolean.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isStringList(Class<? extends DataBase> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(List.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isNumber(Class<? extends DataBase> clazz, DataPath type) {
		return isFloat(clazz, type) || isInteger(clazz, type);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isFloat(Class<? extends DataBase> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(float.class) || getType(clazz, type).isAssignableFrom(Float.class))
			return true;

		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isInteger(Class<? extends DataBase> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(int.class) || getType(clazz, type).isAssignableFrom(Integer.class))
			return true;
		return false;
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(Class<? extends DataBase> clazz, DataPath field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(clazz, field));
	}

	/** UnlocalizedNameのフォーマット */
	public static String getUnlocalizedName(Class<? extends DataBase> clazz, DataPath field) {
		try {
			return (clazz.getSimpleName() + "." + getEnum(clazz, field).getName().replaceAll("_", ".")).toLowerCase();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
