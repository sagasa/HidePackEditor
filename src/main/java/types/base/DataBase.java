package types.base;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import helper.DataPath;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.collections.FXCollections;
import types.wrapper.ObjectWrapper;

/**
 * パックのデータのスーパークラス クローン可能 publicフィールドはすべてクローン可能なクラスにしてください
 * transient注釈が付いたフィールドはエディターでのみ使用 インスタンス生成後にinit(）を呼ぶこと
 */
public abstract class DataBase implements IEditData {

	private static final List<Entry> JsonOptions = new ArrayList<>();
	// Gsonオプション系
	public static class Entry {
		public Entry(Type type, Object value) {
			Type = type;
			Value = value;
		}

		public Type Type;
		public Object Value;
	}

	/** オプションを登録 */
	public static final void addGsonOption(Type type, Object option) {
		JsonOptions.add(new Entry(type, option));
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

	/** カスタムシリアライザ使用のGson */
	public static Gson getGson() {
		GsonBuilder gson = new GsonBuilder().setPrettyPrinting();
		JsonOptions.forEach(entry -> {
			gson.registerTypeAdapter(entry.Type, entry.Value);
		});
		return gson.create();
	}

	@Override
	public Property<?> getProperty(DataPath path) {
		checkInit();
		if (path.hasChild) {
			try {
				return ((IEditData) getClass().getField(path.fastName).get(this)).getProperty(path.nextPath);

			} catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException | SecurityException e) {
				e.printStackTrace();
			}
		}
		return propertyMap.get(path.fastName);
	}

	@Override
	public Class<? extends IEditData> getType() {
		return this.getClass();
	}

	@Override
	public boolean canEdit() {
		return false;
	}

	@Override
	public boolean addProperty(DataPath path) {
		return false;
	}

	@Override
	public boolean removeProperty(DataPath path) {
		return false;
	}

	public String[] getPropertyNames() {
		checkInit();
		return propertyMap.keySet().toArray(new String[propertyMap.keySet().size()]);
	}

	/**
	 * パスではなくフィールド名からプロパティを取得する
	 *
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	public <T> Property<T> getProperty(String name) {
		checkInit();
		return (Property<T>) propertyMap.get(name);
	}

	protected final static Logger log = LogManager.getLogger();

	/** パックデータ エディタでのみ使用 Integer Float Boolean String のフィールドのプロパティ */
	transient private Map<String, Property<?>> propertyMap;

	transient private boolean doinit = false;

	private void checkInit() {
		if (!doinit) {
			doinit = true;
			init();
		}
	}

	/** エディター側のみのプロパティ関連の初期化 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void init() {
		try {
			propertyMap = new HashMap<>();
			for (Field field : this.getClass().getFields()) {
				if (field.getType().isAssignableFrom(List.class)) {
					propertyMap.put(field.getName(),
							new SimpleListProperty<>(FXCollections.observableList((List) field.get(this))));
				} else if (field.getType().isAssignableFrom(Map.class)) {
					propertyMap.put(field.getName(),
							new SimpleMapProperty<>(FXCollections.observableMap((Map) field.get(this))));
				} else {
					propertyMap.put(field.getName(), new ObjectWrapper(this, field.getName()));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		return getGson().toJson(this);
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
