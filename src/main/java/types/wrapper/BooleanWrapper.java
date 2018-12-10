package types.wrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import helper.EditHelper;
import javafx.beans.property.SimpleBooleanProperty;
import types.base.DataBase;

public class BooleanWrapper extends SimpleBooleanProperty implements TypesUpdate {
	private static final Logger log = LogManager.getLogger();
	private DataBase Data;
	private String Field;
	private boolean isinit = false;

	public BooleanWrapper(DataBase data, String field) {
		Data = data;
		Field = field;
		if (!(EditHelper.getType(Data, Field).equals(Boolean.class)
				|| EditHelper.getType(Data, Field).equals(boolean.class))) {
			log.warn(Data + "." + Field + " is not Boolean Field");
		}
	}

	@Override
	public void set(boolean arg0) {
		super.set(arg0);
		EditHelper.setData(Data, Field, arg0);
	}

	@Override
	public void setValue(Boolean arg0) {
		this.set(arg0);
	}

	@Override
	public boolean get() {
		if (!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}

	@Override
	public Boolean getValue() {
		return this.get();
	}

	@Override
	public void updateValue() {
		super.set((Boolean) EditHelper.getData(Data, Field));
	}
}
