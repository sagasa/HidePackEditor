package types.base;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import helper.DataPath;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import types.wrapper.ObjectWrapper;

/**
 * パックのデータのスーパークラス クローン可能 publicフィールドはすべてクローン可能なクラスにしてください
 * transient注釈が付いたフィールドはエディターでのみ使用 インスタンス生成後にinit(）を呼ぶこと
 */
public abstract class DataBase implements IEditData {

	@Override
	public Property<?> getProperty(DataPath path) {
		initProp();
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
		return propertyMap.keySet().toArray(new String[propertyMap.keySet().size()]);
	}

	/**パスではなくフィールド名からプロパティを取得する*/
	public Property<?> getProperty(String name) {
		return propertyMap.get(name);
	}

	protected final static Logger log = LogManager.getLogger();

	/** パックデータ エディタでのみ使用 Integer Float Boolean String のフィールドのプロパティ */
	transient private Map<String, Property<?>> propertyMap;

	transient private boolean doinit = false;

	public void init() {
		initProp();
	}

	/** エディター側のみのプロパティ関連の初期化 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initProp() {
		if (!doinit) {
			try {
				propertyMap = new HashMap<>();
				for (Field field : this.getClass().getFields()) {
					if (field.getType().isAssignableFrom(List.class)) {
						propertyMap.put(field.getName(), new SimpleListProperty<>(
								FXCollections.observableList((List) field.get(this))));

					} else if (DataBase.class.isAssignableFrom(field.getType())) {
						((DataBase) field.get(this)).init();
					} else {
						propertyMap.put(field.getName(),
								new ObjectWrapper(this, field.getName()));
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			doinit = true;
		}
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

	/** データ型にファンクションを適応 */
	@SuppressWarnings("unchecked")
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
