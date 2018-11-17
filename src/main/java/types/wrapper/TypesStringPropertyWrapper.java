package types.wrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import helper.EditHelper;
import javafx.beans.property.SimpleStringProperty;
import types.base.DataBase;

public class TypesStringPropertyWrapper extends SimpleStringProperty implements TypesUpdate{
	private static final Logger log = LoggerFactory.getLogger(TypesStringPropertyWrapper.class);
	private DataBase Data;
	private String Field;
	private boolean isinit = false;
	public TypesStringPropertyWrapper(DataBase data,String field) {
		Data = data;
		Field = field;
		if(!EditHelper.getType(Data, Field).equals(String.class)) {
			log.warn(Data+"."+Field+" is not String Field"+EditHelper.getType(Data, Field));
		}
	}

	@Override
	public void set(String arg0) {
		super.set(arg0);
		EditHelper.setData(Data, Field, arg0);
	}
	@Override
	public void setValue(String arg0) {
		this.set(arg0);
	}
	@Override
	public String get() {
		if(!isinit) {
			updateValue();
			isinit = true;
		}
		return super.get();
	}
	@Override
	public String getValue() {
		return this.get();
	}

	@Override
	public void updateValue() {
		super.set((String) EditHelper.getData(Data, Field));
	}
}
