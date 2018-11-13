package helper;

import java.lang.reflect.Field;

import com.sun.javafx.binding.ExpressionHelper;

import javafx.beans.InvalidationListener;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import localize.LocalizeHandler;
import types.Info;
import types.PackInfo;
import types.base.DataBase;
import types.effect.Recoil;
import types.effect.Explosion;
import types.effect.Sound;
import types.guns.BulletData;
import types.guns.GunData;

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

	/** プロパティを取得 */
	public static Property<?> getProperty(DataBase data, String type) {
		try {
			data.getClass().getField(type);
			return new HideProperty<String>();


		} catch (IllegalArgumentException | SecurityException | NoSuchFieldException e) {
			return null;
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
		return null;
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
		return null;
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

	/** ローカライズした名前を取得 */
	public static String getLocalizedName(DataBase data, String field) {
		return LocalizeHandler.getLocalizedName(getUnlocalizedName(data.getClass(), field));
	}

	/** UnlocalizedNameのフォーマット */
	public static String getUnlocalizedName(Class<? extends DataBase> clazz, String field) {
		try {
			return (clazz.getSimpleName() + "." + clazz.getField(field).getName().replaceAll("_", ".")).toLowerCase();
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}


}
