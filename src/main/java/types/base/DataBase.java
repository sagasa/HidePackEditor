package types.base;

import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.ArrayUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * 多目的なホルダークラス IHideData継承のenumを渡して初期化する
 */
public class DataBase<K extends Enum<K> & IHideData> {

	protected Class<K> enumType;
	protected Map<K, DataEntry> dataMap;

	public DataBase(Class<K> type) {
		enumType = type;
		dataMap = new EnumMap<>(enumType);
		register(enumType);
	}

	/** 変更通知付き */
	protected static class DataEntry {
		private DataEntry(IHideData type, Operator operator, Object value, DataBase<?> data) {
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
			return operator;
		}

		public DataEntry setOperator(Operator operator) {
			if (this.operator.equals(operator))
				return this;
			this.operator = operator;
			data.onChange(type);
			return this;
		}

		public DataEntry setValue(Object value) {
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

	public DataEntry getEntry(K key) {
		return dataMap.get(key);
	}

	/** 変更時に通知が来る */
	protected void onChange(K type) {
	}

	/** キャスト用 */
	@SuppressWarnings("unchecked")
	protected void onChange(IHideData type) {
		onChange((K) type);
	}

	public void put(K key, Operator operator, Object value) {
		if (!key.getDefault().getClass().isAssignableFrom(value.getClass()))
			throw new IllegalArgumentException(
					"type is different " + key.getDefault().getClass() + " , " + value.getClass());
		if (!ArrayUtils.contains(Operator.getAllow(value.getClass()), operator))
			throw new IllegalArgumentException("Operator " + operator + " not supported for " + value.getClass());
		if (dataMap.containsKey(key)) {
			getEntry(key).setOperator(operator).setValue(value);
		} else
			dataMap.put(key, new DataEntry(key, operator, value, this));
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
			for (Entry<?, DataEntry> entry : src.dataMap.entrySet()) {
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
}
