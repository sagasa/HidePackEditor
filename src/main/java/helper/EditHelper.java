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
		return getDataEntry(clazz, path).Default.getClass();
	}

	public static Collection<DataEntry<?>> getDataEntries(Class<? extends DataBase> clazz, DataPath path) {
		return path == null ? DataBase.getEntries(clazz).values()
				: DataBase.getEntries(((DataBase) getDataEntry(clazz, path).Default).getClass()).values();
	}

	public static DataEntry<?> getDataEntry(Class<? extends DataBase> clazz, DataPath path) {
		DataEntry<?> current = DataBase.getEntries(clazz).get(path.fastName);
		if (path.hasChild) {
			return getDataEntry(((DataBase) current.Default).getClass(), path.nextPath);
		}
		return current;
	}

	public static ValueEntry<?> getValueEntry(DataBase data, DataPath path) {
		ValueEntry<?> current = data.getEntry(data.getEntries().get(path.fastName));
		if (current != null && path.hasChild) {
			return getValueEntry((DataBase) current.getValue(), path.nextPath);
		}
		return current;
	}

	public static void putValueEntry(DataBase data, DataPath path) {
		DataEntry<?> entry = data.getEntries().get(path.fastName);
		ValueEntry<?> current = data.getEntry(entry);
		if (current == null)
			data.put(entry);
		if (path.hasChild)
			putValueEntry((DataBase) current.getValue(), path.nextPath);
	}

	public static void removeValueEntry(DataBase data, DataPath path) {
		DataEntry<?> entry = data.getEntries().get(path.fastName);
		ValueEntry<?> current = data.getEntry(entry);

		if (path.hasChild) {
			removeValueEntry((DataBase) current.getValue(), path.nextPath);

		} else if (current != null)
			// 底なら消す
			data.remove(entry);

	}

	@SuppressWarnings("unchecked")
	public static <T> T getValue(DataBase data, DataPath path, T base) {
		ValueEntry<?> current = data.getEntry(data.getEntries().get(path.fastName));
		if (current == null)
			return base;
		if (path.hasChild) {
			return getValue((DataBase) current.getValue(), path.nextPath, base);
		}
		return data.get((DataEntry<T>) current.Type, base);
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
		return getDataEntry(clazz, path).Info;
	}

	/** プロパティを取得 */
	public static <T> ObservableObjectValue<ValueEntry<T>> getProperty(DataBase data, DataPath path) {
		return (ObservableObjectValue) data.getEntryProp(path);
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
	public static String getUnlocalizedName(Class<? extends DataBase> clazz, DataPath path) {
		DataEntry<?> current = DataBase.getEntries(clazz).get(path.fastName);
		if (path.hasChild) {
			return getUnlocalizedName(((DataBase) current.Default).getClass(), path.nextPath);
		}
		return (clazz.getSimpleName() + "." + getDataEntry(clazz, path).getName().replaceAll("_", ".")).toLowerCase();
	}
}
