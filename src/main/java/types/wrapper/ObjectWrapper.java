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

	@SuppressWarnings("unchecked")
	public void updateValue() {
		;
		try {
			super.setValue((T) Data.getClass().getField(Field).get(Data));
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
