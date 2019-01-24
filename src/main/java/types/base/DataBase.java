package types.base;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import editer.HidePack;
import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import types.wrapper.BooleanWrapper;
import types.wrapper.FloatWrapper;
import types.wrapper.IntegerWrapper;
import types.wrapper.StringWrapper;

/**
 * パックのデータのスーパークラス クローン可能 publicフィールドはすべてクローン可能なクラスにしてください
 * transient注釈が付いたフィールドはエディターでのみ使用 インスタンス生成後にinit(）を呼ぶこと
 */
public abstract class DataBase implements Cloneable {
	private final static Logger log = LogManager.getLogger();

	/** パックデータ エディタでのみ使用 */
	transient public long PackUID;
	/** パックデータ エディタでのみ使用 Integer Float Boolean String のフィールドのプロパティ */
	transient public Map<String, Property<?>> Property;

	/** 参照データか確認 */
	public boolean isReference() {
		return HidePack.getPack(PackUID).isReference;
	}

	transient private boolean doinit = false;

	/** エディター側のみのプロパティ関連の初期化 */
	public void init() {
		if (!doinit) {
			Property = new HashMap<>();
			for (Field field : this.getClass().getFields()) {
				if (field.getType().isAssignableFrom(int.class) || field.getType().isAssignableFrom(Integer.class)) {
					// Integer
					Property.put(field.getName(), new IntegerWrapper(this, field.getName()));
				} else if (field.getType().isAssignableFrom(float.class)
						|| field.getType().isAssignableFrom(Float.class)) {
					// Float
					Property.put(field.getName(), new FloatWrapper(this, field.getName()));
				} else if (field.getType().isAssignableFrom(boolean.class)
						|| field.getType().isAssignableFrom(Boolean.class)) {
					// Boolean
					Property.put(field.getName(), new BooleanWrapper(this, field.getName()));
				} else if (field.getType().isAssignableFrom(String.class)) {
					// String
					Property.put(field.getName(), new StringWrapper(this, field.getName()));
				} else if (field.getType().isAssignableFrom(List.class)) {
					Property.put(field.getName(), new SimpleListProperty<>(
							FXCollections.observableList((List<String>) EditHelper.getData(this, field.getName()))));
				} else if (DataBase.class.isAssignableFrom(field.getType())) {
					((DataBase) EditHelper.getData(this, field.getName())).init();
				}
			}
			doinit = true;
		}
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

	/** Mapから変更を適応する */
	public void setString(Map<String, String> valueMap) {
		for (String key : valueMap.keySet()) {
			// 型確認
			Class<?> clazz = getType(this, key);
			if (String.class.isAssignableFrom(clazz)) {
				setValue(this, key, valueMap.get(key));
			} else {
				log.error(key + " is not String field");
			}
		}
	}

	/** Mapから変更を適応する */
	public void addFloat(Map<String, Float> valueMap) {
		for (String key : valueMap.keySet()) {
			// 型確認
			Class<?> clazz = getType(this, key);
			if (int.class.isAssignableFrom(clazz) || Integer.class.isAssignableFrom(clazz)) {
				setValue(this, key, (int) ((int) getValue(this, key) + valueMap.get(key)));
			} else if (float.class.isAssignableFrom(clazz) || Float.class.isAssignableFrom(clazz)) {
				setValue(this, key, (float) ((float) getValue(this, key) + valueMap.get(key)));
			} else {
				log.error(key + " is not int,float field");
			}
		}
	}

	/** Mapから変更を適応する */
	public void multiplyFloat(Map<String, Float> valueMap) {
		for (String key : valueMap.keySet()) {
			// 型確認
			Class<?> clazz = getType(this, key);
			if (int.class.isAssignableFrom(clazz) || Integer.class.isAssignableFrom(clazz)) {
				setValue(this, key, (int) ((int) getValue(this, key) * valueMap.get(key)));
			} else if (float.class.isAssignableFrom(clazz) || Float.class.isAssignableFrom(clazz)) {
				setValue(this, key, (float) ((float) getValue(this, key) * valueMap.get(key)));
			} else {
				log.error(key + " is not int,float field");
			}
		}
	}

	/** .区切りのフィールド名のパスにの型取得する */
	public Class<?> getType(String path) {
		return getType(this, path);
	}

	/** .区切りのフィールド名のパスにの型取得する */
	public static Class<?> getType(DataBase data, String path) {
		String[] split = path.split("\\.", 2);
		try {
			// フィールド取得
			Field field = data.getClass().getField(split[0]);
			if (split.length == 2) {
				return getType((DataBase) field.get(data), split[1]);
			} else if (split.length == 1) {
				return field.getType();
			}
		} catch (NoSuchFieldException e) {
			log.error("cant find field : " + path + " from " + data.getClass().getSimpleName());
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/** .区切りのフィールド名のパスにデータを書き込む */
	public void setValue(String path, Object value) {
		setValue(this, path, value);
	}

	/** .区切りのフィールド名のパスにデータを書き込む */
	public static void setValue(DataBase data, String path, Object value) {
		String[] split = path.split("\\.", 2);
		try {
			// フィールド取得
			Field field = data.getClass().getField(split[0]);
			if (split.length == 2) {
				setValue((DataBase) field.get(data), split[1], value);
			} else if (split.length == 1) {
				field.set(data, value);
			}
		} catch (NoSuchFieldException e) {
			log.error("cant find field : " + path + " from " + data.getClass().getSimpleName());
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/** .区切りのフィールド名のパスからデータを取得する */
	public Object getValue(String path) {
		return getValue(this, path);
	}

	/** .区切りのフィールド名のパスからデータを取得する */
	public static Object getValue(DataBase data, String path) {
		String[] split = path.split("\\.", 2);
		try {
			// フィールド取得
			Field field = data.getClass().getField(split[0]);
			if (split.length == 2) {
				return getValue((DataBase) field.get(data), split[1]);
			} else if (split.length == 1) {
				return field.get(data);
			}
		} catch (NoSuchFieldException e) {
			log.error("cant find field : " + path + " from " + data.getClass().getSimpleName());
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	/** データ型にファンクションを適応 */
	public static <V> void changeFieldsByType(DataBase target, Class<V> key, BiFunction<V, Field, V> change,
			boolean deep) {
		try {
			for (Field f : target.getClass().getFields()) {
				if (key == null || key.isAssignableFrom(f.getType()))
					f.set(target, change.apply((V) f.get(target), f));
				if (DataBase.class.isAssignableFrom(f.getType()) && deep)
					changeFieldsByType((DataBase) f.get(target), key, change, deep);
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
		}
	}

	@Override
	/** DataBaseとString[]を個別クローン */
	public DataBase clone() {
		try {
			DataBase clone = (DataBase) super.clone();
			for (Field f : super.getClass().getFields()) {
				if (DataBase.class.isAssignableFrom(f.getType())) {
					f.set(clone, ((DataBase) f.get(this)).clone());
				} else if (String[].class.isAssignableFrom(f.getType())) {
					f.set(clone, ((String[]) f.get(this)).clone());
				}
			}
			return clone;
		} catch (CloneNotSupportedException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
