package types.base;

import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.ArrayUtils;
import org.checkerframework.checker.units.qual.K;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import javafx.beans.property.ReadOnlyObjectPropertyBase;
import javafx.beans.value.ObservableObjectValue;
import types.effect.Explosion;

/**
 * 多目的なホルダークラス IHideData継承のenumを渡して初期化する
 */
public abstract class DataBase {

	public static class DataEntry<T> {
		public final T Default;
		public final Info Info;
		public final int Index;
		public final Class<? extends DataBase> Type;

		private DataEntry(T def, Info info, Class<? extends DataBase> type, int index) {
			Default = def;
			Info = info;
			Index = index;
			Type = type;
		}
	}

	public static final DataEntry<Explosion> A = register(new Explosion(), new Info().Cate(1));

	private static int index = 0;

	public int size() {
		return index;
	}

	/** staticに自分のクラスを取得したい */
	abstract protected static Class<? extends DataBase> getType();

	protected static <T> DataEntry<T> register(T defaultValue, Info info) {
		DataEntry<T> entry = new DataEntry<>(defaultValue, info, getType(), index);
		index++;
		return entry;
	}

	public final Class<K> enumType;
	protected Map<K, ValueEntry> dataMap;

	protected DataBase<K> parent;

	/** 内包するDataBaseオブジェクトに親子関係を反映する */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void initParent() {
		for (K key : enumType.getEnumConstants()) {
			if (dataMap.containsKey(key) && key.getDefault() instanceof DataBase) {
				System.out.println(dataMap.get(key).getValue() + " " + dataMap.get(key).getOperator());
				DataBase<?> _child = (DataBase<?>) dataMap.get(key).getValue();
				Object _parent = parent == null ? null : parent.get(key, null);
				if (_parent == key.getDefault())
					_child.parent = null;
				else
					_child.parent = (DataBase) _parent;
				_child.initParent();
			}
		}
	}

	/** 変更通知付き */
	public static class ValueEntry {
		private ValueEntry(IHideData type, Operator operator, Object value, DataBase<?> data) {
			this.operator = operator;
			this.value = value;
			this.data = data;
			this.type = type;
		}

		protected Operator operator;
		protected Object value;
		private DataBase<?> data;
		private IHideData type;

		public Operator getOperator() {
			return operator;
		}

		public Object getValue() {
			return value;
		}

		public ValueEntry setOperator(Operator operator) {
			if (this.operator.equals(operator))
				return this;
			this.operator = operator;
			data.onChange(type);
			return this;
		}

		public ValueEntry setValue(Object value) {
			if (this.value.equals(value))
				return this;
			this.value = value;
			data.onChange(type);
			return this;
		}

		public Object apply(Object root) {
			return operator.apply(root, value);
		}
	}

	/**
	 * 元値とキーから結果を返す
	 */
	@SuppressWarnings("unchecked")
	public <V> V get(K key, V base) {
		ValueEntry entry = getEntry(key);
		// Baseが無ければ初期値を
		if (parent != null)
			base = parent.get(key, base);
		else
			// 最上位なら
			base = (V) key.getDefault();
		if (entry != null)
			return (V) entry.apply(base);
		else
			return base;
	}

	/** チェンジリスナ付きのエントリを取得 */
	public ValueEntry getEntry(K key) {
		return dataMap.get(key);
	}

	protected void addView(DataView<K> view) {
		// 重複削除
		Iterator<WeakReference<DataView<K>>> itr = views.iterator();
		while (itr.hasNext())
			if (view.equals(itr.next().get())) {
				itr.remove();
				return;
			}
		views.add(new WeakReference<>(view));
	}

	@SuppressWarnings("unlikely-arg-type")
	protected void onChange(IHideData type) {
		if (propertyMap.containsKey(type))
			propertyMap.get(type).onChange();
		// ビューに通知
		Iterator<WeakReference<DataView<K>>> itr = views.iterator();
		while (itr.hasNext()) {
			WeakReference<DataView<K>> ref = itr.next();
			// 消えてたら削除
			if (ref.get() == null) {
				itr.remove();
				continue;
			}
			ref.get().onChange(type);
		}
	}

	protected void removeView(DataView<K> view) {
		Iterator<WeakReference<DataView<K>>> itr = views.iterator();
		while (itr.hasNext())
			if (view.equals(itr.next().get())) {
				itr.remove();
				return;
			}
	}

	protected List<WeakReference<DataView<K>>> views = new ArrayList<>();

	public void put(K key, Operator operator, Object value) {
		if (!key.getDefault().getClass().isAssignableFrom(value.getClass()))
			throw new IllegalArgumentException(
					"type is different " + key.getDefault().getClass() + " , " + value.getClass());
		if (!ArrayUtils.contains(Operator.getAllow(value.getClass()), operator))
			throw new IllegalArgumentException("Operator " + operator + " not supported for " + value.getClass());
		if (dataMap.containsKey(key)) {
			getEntry(key).setOperator(operator).setValue(value);
		} else {
			dataMap.put(key, new ValueEntry(key, operator, value, this));
			onChange(key);
		}
	}

	@SuppressWarnings("unchecked")
	private void put(IHideData key, Operator operator, Object value) {
		put((K) key, operator, value);
	}

	// ====== HideDataホルダー ======
	private static Map<String, Class<? extends Enum<? extends IHideData>>> enumTypeMap = new HashMap<>();

	private static void register(Class<? extends Enum<? extends IHideData>> clazz) {
		if (!enumTypeMap.containsKey(getTypeName(clazz)))
			enumTypeMap.put(getTypeName(clazz), clazz);
	}

	/** シンプルネームからClassに */
	public static Class<? extends Enum<? extends IHideData>> getHideData(String name) {
		return enumTypeMap.get(name);
	}

	/** Classからシンプルネームに */
	public static String getTypeName(Class<? extends Enum<? extends IHideData>> clazz) {
		return clazz.getSimpleName();
	}

	public static class JsonInterface implements JsonSerializer<DataBase<?>>, JsonDeserializer<DataBase<?>> {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public DataBase<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			if (!json.isJsonObject())
				throw new JsonParseException("is not JsonObject");
			JsonObject obj = json.getAsJsonObject();
			Class<? extends Enum<? extends IHideData>> clazz = getHideData(obj.get("Type").getAsString());
			if (clazz == null)
				throw new JsonParseException("bad typename");
			Class<? extends DataBase> container = ((IHideData) clazz.getEnumConstants()[0]).getContainer();

			DataBase<? extends IHideData> database = null;

			if (container == DataBase.class) {
				// DataBaseがコンテナなら
				database = new DataBase(clazz);
			} else {
				// 違うならそいつのインスタンスを作成
				try {
					database = container.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}

			JsonObject values = obj.getAsJsonObject("Values");
			for (Entry<String, JsonElement> entry : values.entrySet()) {
				IHideData data = (IHideData) Enum.valueOf((Class) clazz, entry.getKey());
				Operator operator;
				Object putValue;
				// 省略されていたらSET
				if (!entry.getValue().isJsonObject() || !entry.getValue().getAsJsonObject().has("Operator")) {
					operator = Operator.SET;
					putValue = context.deserialize(entry.getValue(), data.getDefault().getClass());

				} else {
					JsonObject value = entry.getValue().getAsJsonObject();
					putValue = context.deserialize(value.get("Object"), data.getDefault().getClass());
					operator = Operator.valueOf(value.getAsJsonPrimitive("Operator").getAsString());
				}

				database.put(data, operator, putValue);
			}
			return database;
		}

		@Override
		public JsonElement serialize(DataBase<?> src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject obj = new JsonObject();
			obj.addProperty("Type", getTypeName(src.enumType));
			JsonObject value = new JsonObject();
			obj.add("Values", value);
			for (Entry<?, ValueEntry> entry : src.dataMap.entrySet()) {
				// SETの時は省略
				if (entry.getValue().operator == Operator.SET) {
					value.add(entry.getKey().toString(), context.serialize(entry.getValue().value));
				} else {
					JsonObject dataEntry = new JsonObject();
					value.add(entry.getKey().toString(), dataEntry);
					dataEntry.addProperty("Operator", entry.getValue().operator.toString());
					dataEntry.add("Object", context.serialize(entry.getValue().value));
				}
			}
			return obj;
		}

	}

	private static Gson gson = null;
	/** オプションを登録 */
	static {
		gson = new GsonBuilder().setPrettyPrinting().registerTypeHierarchyAdapter(DataBase.class, new JsonInterface())
				.create();
	}

	/** カスタムシリアライザ使用のGson */
	public static final Gson getGson() {
		return gson;
	}

	public String toJson() {
		return gson.toJson(this);
	}

	@SuppressWarnings("unchecked")
	public static <T extends DataBase<?>> T fromJson(String json) {
		return (T) gson.fromJson(json, DataBase.class);
	}

	// エディタ側
	private Map<K, Data2Prop> propertyMap;

	public ObservableObjectValue<ValueEntry> getProperty(DataPath path) {
		K key = Enum.valueOf(enumType, path.fastName);
		if (path.hasChild) {
			getEntry(key);
		}

		if (!propertyMap.containsKey(key))
			propertyMap.put(key, new Data2Prop(key));
		return propertyMap.get(key);
	}

	private class Data2Prop extends ReadOnlyObjectPropertyBase<ValueEntry> {

		private K key;

		private void onChange() {
			fireValueChangedEvent();
		}

		public Data2Prop(K key) {
			this.key = key;
		}

		@Override
		public Object getBean() {
			return null;
		}

		@Override
		public String getName() {
			return "";
		}

		@Override
		public ValueEntry get() {
			return DataBase.this.dataMap.get(key);
		}
	}
}
