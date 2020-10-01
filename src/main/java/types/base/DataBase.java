package types.base;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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

import helper.EditHelper;
import javafx.beans.property.ReadOnlyObjectPropertyBase;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import types.editor.DataView;
import types.value.Curve;
import types.value.Operator;

/**
 * 多目的なホルダークラス
 */
public abstract class DataBase {

	public static class DataEntry<T> {
		public final T Default;
		public final Info Info;
		private int index = -1;
		private Class<? extends DataBase> type;
		private String name;

		private DataEntry(T def, Info info) {
			Default = def;
			Info = info;
		}

		public int getIndex() {
			return index;
		}

		public Class<? extends DataBase> getType() {
			return type;
		}

		public String getName() {
			return name;
		}

		/** getNameと同一 */
		@Override
		public String toString() {
			return getName();
		}
	}

	/** 編集禁止 */
	public Map<String, DataEntry<?>> getEntries() {
		initEntry();
		return nameEntryMap.get(getTypeName(getClass()));
	}

	/** 編集禁止 */
	public static Map<String, DataEntry<?>> getEntries(Class<? extends DataBase> clazz) {
		initEntry(clazz);
		return nameEntryMap.get(getTypeName(clazz));
	}

	private int size = -1;

	public int size() {
		initEntry();
		if (size == -1)
			size = nameEntryMap.get(getTypeName(getClass())).size();
		return size;
	}

	/** DataEntryを作成 */

	protected static <T> DataEntry<T> of(T defaultValue) {
		return of(defaultValue, null);
	}

	/** DataEntryを作成 */
	protected static <T> DataEntry<T> of(T defaultValue, Info info) {
		DataEntry<T> entry = new DataEntry<>(defaultValue, info);
		return entry;
	}

	/** staticにDataEntryを名前から検索するための登録 */
	private static void initEntry(Class<? extends DataBase> clazz) {
		if (!nameTypeMap.containsKey(getTypeName(clazz))) {
			if (!nameEntryMap.containsKey(getTypeName(clazz)))
				nameEntryMap.put(getTypeName(clazz), new HashMap<>());
			registerEntry(clazz, 0, nameEntryMap.get(getTypeName(clazz)));
			nameTypeMap.put(getTypeName(clazz), clazz);
		}
	}

	/** 親クラスから順に登録する */
	@SuppressWarnings("unchecked")
	private static int registerEntry(Class<? extends DataBase> clazz, int index, Map<String, DataEntry<?>> map) {
		// 親がDataBase以外なら親から登録
		if (clazz.getSuperclass() != DataBase.class)
			index = registerEntry((Class<? extends DataBase>) clazz.getSuperclass(), index, map);

		try {
			for (Field field : clazz.getDeclaredFields()) {
				if (DataEntry.class.isAssignableFrom(field.getType())) {
					DataEntry<?> entry = (DataEntry<?>) field.get(null);
					if (entry != null) {
						// Indexがずれたら
						if (entry.index != -1 && entry.index != index)
							throw new RuntimeException("indexがずれた 再設計 " + entry.index + " " + index);
						;
						entry.index = index;
						index++;
						entry.type = (Class<? extends DataBase>) field.getDeclaringClass();
						entry.name = field.getName();
					}
					map.put(field.getName(), entry);
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return index;
	}

	private boolean isInit = false;

	private void initEntry() {
		if (dataMap == null && !isInit) {
			initEntry(getClass());
			init();
		}
	}

	// ====== HideDataホルダー ======
	private static Map<String, Map<String, DataEntry<?>>> nameEntryMap = new HashMap<>();
	private static Map<String, Class<? extends DataBase>> nameTypeMap = new HashMap<>();

	/** Classからシンプルネームに */
	public static String getTypeName(Class<?> clazz) {
		return clazz.getSimpleName();
	}

	/** 包含してる親 */
	private ValueEntry<?> root;

	protected DataBase parent;

	/** nullなら未初期化 */
	protected DataMap<ValueEntry<?>> dataMap;

	public DataBase() {
		// 初期化が終わっていなければ実行しない
		if (nameTypeMap.containsKey(getTypeName(getClass())))
			init();
	}

	/** 初回のインスタンス作成時のみ2回実行 */
	private void init() {
		isInit = true;
		dataMap = new DataMap<>(getClass());
	}

	/** 内包するDataBaseオブジェクトに親子関係を反映する */
	protected void initParent() {
		initEntry();
		for (DataEntry<?> key : getEntries().values()) {
			if (dataMap.containsKey(key) && key.Default instanceof DataBase) {
				DataBase _child = (DataBase) dataMap.get(key).getValue();
				Object _parent = parent == null ? null : parent.get(key, null);
				if (_parent == key.Default)
					_child.parent = null;
				else
					_child.parent = (DataBase) _parent;
				_child.initParent();
			}
		}
	}

	/**
	 * 変更通知付き値のエントリ 削除以外ではエントリのインスタンスを変えることはない
	 */
	public static class ValueEntry<T> {
		private ValueEntry(DataEntry<T> type, Operator operator, T value, DataBase data) {
			this.value = value;
			this.operator = operator;
			this.data = data;
			this.Type = type;
			ValueProp.init();
			OperatorProp.init();
			// rootを設定
			if (value instanceof DataBase) {
				((DataBase) value).root = this;
			}
		}

		protected Operator operator;
		protected T value;
		private DataBase data;
		public final DataEntry<T> Type;

		public Operator getOperator() {
			return operator;
		}

		public T getValue() {
			return value;
		}

		public ValueEntry<T> setOperator(Operator operator) {
			if (this.operator.equals(operator))
				return this;
			this.operator = operator;
			data.onChange(DataPath.of(Type));
			return this;
		}

		/** Nullは許容しない */
		public ValueEntry<T> setValue(T value) {
			if (value.equals(this.value))
				return this;
			// 古いの削除
			if (value != null && value instanceof DataBase) {
				((DataBase) value).root = null;
			}
			this.value = value;
			// rootを設定
			if (value instanceof DataBase) {
				((DataBase) value).root = this;
			}
			data.onChange(DataPath.of(Type));
			return this;
		}

		public T apply(T root) {
			return operator.apply(root, value);
		}

		// == editor ==
		public final Value2Prop ValueProp = new Value2Prop();

		public class Value2Prop extends SimpleObjectProperty<T> {
			private void init() {
				super.set(ValueEntry.this.getValue());
			}

			@Override
			public void set(T arg) {
				super.set(arg);
				ValueEntry.this.setValue(arg);
			}

			@Override
			public T get() {
				super.get();
				return ValueEntry.this.getValue();
			}
		}

		public final Operator2Prop OperatorProp = new Operator2Prop();

		public class Operator2Prop extends SimpleObjectProperty<Operator> {
			private void init() {
				super.set(ValueEntry.this.getOperator());
			}

			@Override
			public void set(Operator arg) {
				super.set(arg);
				ValueEntry.this.setOperator(arg);
			}

			@Override
			public Operator get() {
				super.get();
				return ValueEntry.this.getOperator();
			}
		}
	}

	/**
	 * 元値とキーから結果を返す
	 */
	public <T> T get(DataEntry<T> key, T base) {
		ValueEntry<T> entry = getEntry(key);
		// Baseが無ければ初期値を
		if (parent != null)
			base = parent.get(key, base);
		else
			// 最上位なら
			base = key.Default;
		if (entry != null)
			return entry.apply(base);
		else
			return base;
	}

	/**
	 * チェンジリスナ付きのエントリを取得
	 */
	@SuppressWarnings("unchecked")
	public <T> ValueEntry<T> getEntry(DataEntry<T> key) {
		initEntry();
		return (ValueEntry<T>) dataMap.get(key);
	}

	public void addView(DataView<?> view) {
		// 重複削除
		Iterator<WeakReference<DataView<?>>> itr = views.iterator();
		while (itr.hasNext())
			if (view.equals(itr.next().get())) {
				itr.remove();
				return;
			}
		views.add(new WeakReference<>(view));
	}

	protected void onChange(DataPath path) {
		// ビューに通知
		Iterator<WeakReference<DataView<?>>> itr = views.iterator();
		while (itr.hasNext()) {
			WeakReference<DataView<?>> ref = itr.next();
			// 消えてたら削除
			if (ref.get() == null) {
				itr.remove();
				continue;
			}
			ref.get().onChange(path);
		}
		// rootに通知
		if (root != null)
			root.data.onChange(path.appendFirst(root.Type));
	}

	public void removeView(DataView<?> view) {
		Iterator<WeakReference<DataView<?>>> itr = views.iterator();
		while (itr.hasNext())
			if (view.equals(itr.next().get())) {
				itr.remove();
				return;
			}
	}

	protected List<WeakReference<DataView<?>>> views = new ArrayList<>();

	/**適切なインスタンスを渡して初期化*/
	@SuppressWarnings("unchecked")
	public <T> void put(DataEntry<T> key) {
		initEntry();
		T value = key.Default;
		if(key.Default instanceof DataBase) {
			try {
				value = (T) key.Default.getClass().newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}else if(key.Default instanceof Curve) {
			value = (T) ((Curve)key.Default).clone();
		}
		put(key, Operator.SET, value);
	}

	public <T> void put(DataEntry<T> key, Operator operator, T value) {
		initEntry();
		if (!ArrayUtils.contains(Operator.getAllow(value.getClass()), operator))
			throw new IllegalArgumentException("Operator " + operator + " not supported for " + value.getClass());
		if (dataMap.containsKey(key)) {
			getEntry(key).setOperator(operator).setValue(value);
		} else {
			ValueEntry<T> entry = new ValueEntry<>(key, operator, value, this);
			dataMap.put(key, entry);
			onChange(DataPath.of(key));
			onEntryChange(DataPath.of(key));
		}
	}

	public void remove(DataEntry<?> key) {
		initEntry();
		if (dataMap.containsKey(key)) {
			dataMap.remove(key);
			onChange(DataPath.of(key));
			onEntryChange(DataPath.of(key));
		}
	}

	public boolean isEmpty() {
		return dataMap.size()==0;
	}

	public static class JsonInterface implements JsonSerializer<DataBase>, JsonDeserializer<DataBase> {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public DataBase deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			if (!json.isJsonObject())
				throw new JsonParseException("is not JsonObject");
			JsonObject obj = json.getAsJsonObject();
			Map<String, DataEntry<?>> map = nameEntryMap.get(obj.get("Type").getAsString());
			if (map == null)
				throw new JsonParseException("bad typename");
			Class<? extends DataBase> container = nameTypeMap.get(obj.get("Type").getAsString());

			DataBase database = null;

			// 違うならそいつのインスタンスを作成
			try {
				database = container.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}

			JsonObject values = obj.getAsJsonObject("Values");
			for (Entry<String, JsonElement> entry : values.entrySet()) {
				DataEntry data = map.get(entry.getKey());
				Operator operator;
				Object putValue;
				// 省略されていたらSET
				if (!entry.getValue().isJsonObject() || !entry.getValue().getAsJsonObject().has("Operator")) {
					operator = Operator.SET;
					putValue = context.deserialize(entry.getValue(), data.Default.getClass());

				} else {
					JsonObject value = entry.getValue().getAsJsonObject();
					putValue = context.deserialize(value.get("Object"), data.Default.getClass());
					operator = Operator.valueOf(value.getAsJsonPrimitive("Operator").getAsString());
				}

				database.put(data, operator, putValue);
			}
			return database;
		}

		@Override
		public JsonElement serialize(DataBase src, Type typeOfSrc, JsonSerializationContext context) {

			JsonObject obj = new JsonObject();
			obj.addProperty("Type", getTypeName(src.getClass()));
			JsonObject value = new JsonObject();
			obj.add("Values", value);
			src.dataMap.entrySet();
			for (Entry<?, ValueEntry<?>> entry : src.dataMap.entrySet()) {
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
	public static <T extends DataBase> T fromJson(String json) {
		return (T) gson.fromJson(json, DataBase.class);
	}

	// エディタ側
	private Map<DataPath, Entry2Prop> entryPropMap = new HashMap<>();

	public ObservableObjectValue<ValueEntry<?>> getEntryProp(DataPath path) {
		if (!entryPropMap.containsKey(path))
			entryPropMap.put(path, new Entry2Prop(path));
		// System.out.println(path + " ");
		return entryPropMap.get(path);
	}

	protected void onEntryChange(DataPath path) {
		if (entryPropMap.containsKey(path))
			entryPropMap.get(path).onChange();

		// rootに通知
		if (root != null)
			root.data.onEntryChange(path.appendFirst(root.Type));
	}

	/** エントリを保持するプロパティ */
	private class Entry2Prop extends ReadOnlyObjectPropertyBase<ValueEntry<?>> {

		protected DataPath path;

		private void onChange() {
			fireValueChangedEvent();
		}

		public Entry2Prop(DataPath path) {
			this.path = path;
		}

		@Override
		public Object getBean() {
			return null;
		}

		@Override
		public String getName() {
			return "Entry2Prop";
		}

		@Override
		public ValueEntry<?> get() {
			return EditHelper.getValueEntry(DataBase.this, path);
		}
	}
}
