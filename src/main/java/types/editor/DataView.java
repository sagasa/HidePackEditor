package types.editor;

import java.util.HashMap;
import java.util.Map;

import helper.EditHelper;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectPropertyBase;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableObjectValue;
import types.base.DataBase;
import types.base.DataPath;

/** エディタ用 */
public class DataView<V extends DataBase> {

	Class<V> clazz;
	private ObjectProperty<V>[] values;

	@SuppressWarnings("unchecked")
	public DataView(Class<V> clazz, int size) {
		values = new ObjectProperty[size];
		this.clazz = clazz;
	}

	ChangeListener<V> listener = (v, ov, nv) -> {
		if (ov != null)
			ov.removeView(this);
		if (nv != null)
			nv.addView(this);
	};

	/** リスナを更新して値を書き換え */
	public void setValue(int index, ObservableObjectValue<V> value) {
		if (values[index] == null)
			values[index] = new SimpleObjectProperty<>();
		if (value != null)
			values[index].bind(value);
		else
			values[index].unbind();
	}

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
			for (ObservableObjectValue<V> data : values) {
				if (data != null && data.get() != null)
					def = EditHelper.getValue(data.get(), path, def);
			}
			return def;
		}
	}
}
