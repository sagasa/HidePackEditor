package types.base;

import java.lang.reflect.Field;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * EnumDataInfoを利用してデータを取得できるクラス クローン可能 publicフィールドはすべてクローン可能なクラスにしてください
 */
public abstract class DataBase implements Cloneable {

	/**
	 * Field取得
	 *
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 */
	public Field getField(EnumDataInfo type) throws NoSuchFieldException, SecurityException {
		// ベースクラスじゃないほうからリフレクション
		return super.getClass().getField(type.toString());
	}

	/** 型確認 */
	public boolean isType(EnumDataInfo type, Class<?> clazz) {
		try {
			return getField(type).getType().isAssignableFrom(clazz);
		} catch (NoSuchFieldException | SecurityException e) {
			return false;
		}
	}

	/** デフォルト値代入 */
	public DataBase() {

	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

	/**
	 * 全てのパブリックフィールドを上書き 成功したらtrue クローンはされません！！
	 */
	public boolean overwrite(DataBase data) {
		// 型を比較
		if (!data.getClass().isAssignableFrom(this.getClass())) {
			return false;
		}
		Class<? extends DataBase> clazz = data.getClass();
		// 全てのパブリックフィールドを上書き
		try {
			for (Field f : clazz.getFields()) {
				f.set(this, f.get(data));
				System.out.println("overwrite"+f.getName());
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			return false;
		}
		return true;
	}

	/** 全てのパブリックフィールドに引数の各フィールドの値を加算 */
	public boolean overadd(DataBase data) {
		// 型を比較
		if (!data.getClass().isAssignableFrom(this.getClass())) {
			return false;
		}
		Class<? extends DataBase> clazz = data.getClass();
		// フィールドが数値型なら加算 DataBaseならoveradd実行
		try {
			for (Field f : clazz.getFields()) {
				if (f.getType().isAssignableFrom(float.class) || f.getType().isAssignableFrom(Float.class)) {
					f.set(this, f.getFloat(data) + f.getFloat(this));
				} else if (f.getType().isAssignableFrom(int.class) || f.getType().isAssignableFrom(Integer.class)) {
					f.set(this, f.getInt(data) + f.getInt(this));
				} else if (f.getType().isAssignableFrom(DataBase.class)) {
					((DataBase) f.get(this)).overadd((DataBase) f.get(data));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			return false;
		}
		return true;
	}

	/** 全てのパブリックフィールドに引数の各フィールドの値を加算 */
	public boolean overcoe(DataBase data) {
		// 型を比較
		if (!data.getClass().isAssignableFrom(this.getClass())) {
			return false;
		}
		Class<? extends DataBase> clazz = data.getClass();
		// フィールドが数値型なら加算 DataBaseならoveradd実行
		try {
			for (Field f : clazz.getFields()) {
				if (f.getType().isAssignableFrom(float.class) || f.getType().isAssignableFrom(Float.class)) {
					f.set(this, f.getFloat(data) * f.getFloat(this));
				} else if (f.getType().isAssignableFrom(int.class) || f.getType().isAssignableFrom(Integer.class)) {
					f.set(this, f.getInt(data) + f.getInt(this));
				} else if (f.getType().isAssignableFrom(DataBase.class)) {
					((DataBase) f.get(this)).overcoe((DataBase) f.get(data));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			return false;
		}
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		DataBase clone = (DataBase) super.clone();
		for (Field f : super.getClass().getFields()) {
			if (!f.getType().isPrimitive()) {
				try {
					f.set(clone, f.get(this));
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return clone;
	}
}
