package types.base;

import java.util.HashMap;
import java.util.Map;

import helper.EditHelper;
import javafx.beans.property.ReadOnlyObjectPropertyBase;
import javafx.beans.value.ObservableObjectValue;

public class DataView<V extends DataBase> {

	Class<? extends DataBase> clazz;
	private V[] values;

	@SuppressWarnings("unchecked")
	public DataView(Class<V> clazz, int size) {
		values = (V[]) new Object[size];
		this.clazz = clazz;
	}

	/**
	 * キャッシュを利用して取得
	 */
	@SuppressWarnings("unchecked")
	public <T> ObservableObjectValue<T> get(DataPath key) {
		if (!entryPropMap.containsKey(key))
			entryPropMap.put(key, new Data2Prop<>(key));
		return (ObservableObjectValue<T>) entryPropMap.get(key);
	}

	public void onChange(DataPath path) {
		if (entryPropMap.containsKey(path))
			entryPropMap.get(path).onChange();
	}

	// エディタ側
	private Map<DataPath, Data2Prop<?>> entryPropMap = new HashMap<>();

	/**
	 * エントリを保持するプロパティ
	 *
	 * @param <t>
	 */
	private class Data2Prop<T> extends ReadOnlyObjectPropertyBase<T> {

		protected DataPath path;

		private void onChange() {
			fireValueChangedEvent();
		}

		public Data2Prop(DataPath path) {
			this.path = path;
		}

		@Override
		public Object getBean() {
			return null;
		}

		@Override
		public String getName() {
			return "Data2Prop";
		}

		@SuppressWarnings("unchecked")
		@Override
		public T get() {
			T def = (T) EditHelper.getDataEntry(clazz, path).Default;
			for (V data : values) {
				if (data == null)
					def = EditHelper.getValue(data, path, def);
			}
			return def;
		}
	}
}
