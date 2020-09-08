package helper;

import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import javafx.beans.value.ObservableObjectValue;
import localize.LocalizeHandler;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.base.IHideData;
import types.base.Info;

/** リフレクションを利用したTypes編集ヘルパー */
public class EditHelper {

	/**
	 * 型取得
	 */
	public static Class<?> getType(Class<? extends IHideData> clazz, DataPath path) {
		return getEnum(clazz, path).getDefault().getClass();
	}

	@SuppressWarnings("unchecked")
	public static <K extends Enum<K> & IHideData> K[] getEnums(Class<? extends IHideData> clazz, DataPath path) {
		Class<K> c = (Class<K>) clazz;
		if (path != null)
			System.out.println("getEnums " + path + " " + ArrayUtils
					.toString(((DataBase<?>) getEnum(clazz, path).getDefault()).enumType.getEnumConstants()));
		return path == null ? c.getEnumConstants()
				: (K[]) ((DataBase<?>) getEnum(clazz, path).getDefault()).enumType.getEnumConstants();
	}

	@SuppressWarnings("unchecked")
	private static <K extends Enum<K> & IHideData, R extends Enum<R> & IHideData> R getEnum(
			Class<? extends IHideData> clazz, DataPath path) {
		R current = (R) Enum.valueOf((Class<K>) clazz, path.fastName);
		if (path.hasChild) {
			return getEnum(((DataBase<?>) current.getDefault()).enumType, path.nextPath);
		}
		return current;
	}

	/** pathから最大値を取得 */
	public static Float getMax(Class<? extends IHideData> clazz, DataPath path) {
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
	public static Float getMin(Class<? extends IHideData> clazz, DataPath path) {
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
	public static int getCate(Class<? extends IHideData> clazz, DataPath path) {
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
	public static String getScale(Class<? extends IHideData> clazz, DataPath path) {
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

	private static <K extends Enum<K> & IHideData> Info getInfo(Class<? extends IHideData> clazz, DataPath path) {
		System.out.println("getInfo " + path);
		return getEnum(clazz, path).getInfo();
	}

	/** プロパティを取得 */
	public static ObservableObjectValue<ValueEntry> getProperty(DataBase<?> data, DataPath path) {
		return data.getProperty(path);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isString(Class<? extends IHideData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(String.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isBoolean(Class<? extends IHideData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(boolean.class)
				|| getType(clazz, type).isAssignableFrom(Boolean.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isStringList(Class<? extends IHideData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(List.class)) {
			return true;
		}
		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isNumber(Class<? extends IHideData> clazz, DataPath type) {
		return isFloat(clazz, type) || isInteger(clazz, type);
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isFloat(Class<? extends IHideData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(float.class) || getType(clazz, type).isAssignableFrom(Float.class))
			return true;

		return false;
	}

	/** プロパティとフィールドの型チェック */
	public static boolean isInteger(Class<? extends IHideData> clazz, DataPath type) {
		if (getType(clazz, type).isAssignableFrom(int.class) || getType(clazz, type).isAssignableFrom(Integer.class))
			return true;
		return false;
	}

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(Class<? extends IHideData> clazz, DataPath field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(clazz, field));
	}

	/** UnlocalizedNameのフォーマット */
	@SuppressWarnings("unchecked")
	public static <K extends Enum<K> & IHideData> String getUnlocalizedName(Class<? extends IHideData> clazz,
			DataPath field) {
		try {
			return (clazz.getSimpleName() + "." + getEnum((Class<K>) clazz, field).toString().replaceAll("_", "."))
					.toLowerCase();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}
