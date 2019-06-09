package types.wrapper;

import javafx.beans.property.SimpleObjectProperty;
import types.base.DataBase;

public class ObjectWrapper<T> extends SimpleObjectProperty<T> {
	private DataBase Data;
	private String Field;
	private boolean isinit = false;

	public ObjectWrapper(DataBase data, String field) {
		Data = data;
		Field = field;
	}

	@Override
	public void set(T arg0) {
		super.set(arg0);
		try {
			Data.getClass().getField(Field).set(Data, arg0);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setValue(T arg0) {
		this.set(arg0);
	}

	@Override
	public T get() {
		if (!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}

	@Override
	public T getValue() {
		return this.get();
	}

	@SuppressWarnings("unchecked")
	public void updateValue() {;
		try {
			super.setValue((T) Data.getClass().getField(Field).get(Data));
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
