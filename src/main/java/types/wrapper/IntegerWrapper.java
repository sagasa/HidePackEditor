package types.wrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import helper.EditHelper;
import javafx.beans.property.SimpleIntegerProperty;
import types.base.DataBase;

public class IntegerWrapper extends SimpleIntegerProperty implements TypesUpdate {
	private static final Logger log = LogManager.getLogger();
	private DataBase Data;
	private String Field;
	private boolean isinit = false;

	public IntegerWrapper(DataBase data, String field) {
		Data = data;
		Field = field;
		if (!(EditHelper.getType(Data, Field).equals(Integer.class)
				|| EditHelper.getType(Data, Field).equals(int.class))) {
			log.warn(Data + "." + Field + " is not Integer Field");
		}
	}

	@Override
	public void set(int arg0) {
		super.set(arg0);
		EditHelper.setData(Data, Field, arg0);
	}

	@Override
	public void setValue(Number arg0) {
		super.setValue(arg0);
	}

	@Override
	public int get() {
		if (!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}

	@Override
	public Integer getValue() {
		return this.get();
	}

	@Override
	public void updateValue() {
		super.setValue((Number) EditHelper.getData(Data, Field));
	}
}
