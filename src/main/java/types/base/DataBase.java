package types.base;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.beans.property.Property;
import types.wrapper.TypesBooleanPropertyWrapper;
import types.wrapper.TypesFloatPropertyWrapper;
import types.wrapper.TypesIntegerPropertyWrapper;
import types.wrapper.TypesStringPropertyWrapper;

/**
 * パックのデータのスーパークラス クローン可能 publicフィールドはすべてクローン可能なクラスにしてください
 * transient注釈が付いたフィールドはエディターでのみ使用
 */
public abstract class DataBase implements Cloneable {

	/** パックデータ エディタでのみ使用 */
	transient public long PackUID;
	/** パックデータ エディタでのみ使用 */
	transient public boolean isReference = false;
	/** パックデータ エディタでのみ使用 Integer Float Boolean String のフィールドのプロパティ */
	transient public Map<String, Property<?>> Property = new HashMap<>();

	/** コンストラクタでプロパティMapを作成 */
	public DataBase() {
		for (Field field : this.getClass().getFields()) {
			if (field.getType().isAssignableFrom(int.class) || field.getType().isAssignableFrom(Integer.class)) {
				// Integer
				Property.put(field.getName(), new TypesIntegerPropertyWrapper(this, field.getName()));
			} else if (field.getType().isAssignableFrom(float.class) || field.getType().isAssignableFrom(Float.class)) {
				// Float
				Property.put(field.getName(), new TypesFloatPropertyWrapper(this, field.getName()));
			} else if (field.getType().isAssignableFrom(boolean.class)
					|| field.getType().isAssignableFrom(Boolean.class)) {
				// Boolean
				Property.put(field.getName(), new TypesBooleanPropertyWrapper(this, field.getName()));
			} else if (field.getType().isAssignableFrom(String.class)) {
				// String
				Property.put(field.getName(), new TypesStringPropertyWrapper(this,field.getName()));
			}
		}
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
				System.out.println("overwrite" + f.getName());
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
