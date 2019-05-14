package types.wrapper;

import helper.EditHelper;
import javafx.beans.property.SimpleObjectProperty;
import types.base.DataBase;

public class ObjectWrapper extends SimpleObjectProperty<Object> implements TypesUpdate {
	private DataBase Data;
	private String Field;
	private boolean isinit = false;

	public ObjectWrapper(DataBase data, String field) {
		Data = data;
		Field = field;
	}

	@Override
	public void set(Object arg0) {
		super.set(arg0);
		EditHelper.setData(Data, Field, arg0);
	}

	@Override
	public void setValue(Object arg0) {
		super.setValue(arg0);
	}

	@Override
	public Object get() {
		if (!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}

	@Override
	public Object getValue() {
		return this.get();
	}

	@Override
	public void updateValue() {
		super.setValue((Object) EditHelper.getData(Data, Field));
	}

}
