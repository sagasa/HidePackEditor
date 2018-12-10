package types.wrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import helper.EditHelper;
import javafx.beans.property.SimpleFloatProperty;
import types.base.DataBase;

public class FloatWrapper extends SimpleFloatProperty implements TypesUpdate {
	private static final Logger log = LogManager.getLogger();
	private DataBase Data;
	private String Field;
	private boolean isinit = false;

	public FloatWrapper(DataBase data, String field) {
		Data = data;
		Field = field;
		if (!(EditHelper.getType(Data, Field).equals(Float.class)
				|| EditHelper.getType(Data, Field).equals(float.class))) {
			log.warn(Data + "." + Field + " is not Integer Field");
		}
	}

	@Override
	public void set(float arg0) {
		super.set(arg0);
		EditHelper.setData(Data, Field, arg0);
	}

	@Override
	public void setValue(Number arg0) {
		super.setValue(arg0);
	}

	@Override
	public float get() {
		if (!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}

	@Override
	public Float getValue() {
		return this.get();
	}

	@Override
	public void updateValue() {
		super.setValue((Number) EditHelper.getData(Data, Field));
	}
}
