package types.wrapper;

import java.util.HashMap;
import java.util.Map;

import helper.DataPath;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import types.base.DataBase;
import types.base.IEditData;

public class ClipData implements IEditData {
	public ClipData(Class<? extends DataBase> clazz) {
		editClass = clazz;
	}

	private Class<? extends DataBase> editClass;
	private Map<DataPath, ObjectProperty<?>> propertyMap = new HashMap<>();

	@Override
	public Class<? extends IEditData> getType() {
		return editClass;
	}

	@Override
	public Property<?> getProperty(DataPath path) {
		return propertyMap.get(path);
	}

	@Override
	public boolean canEdit() {
		return true;
	}

	@Override
	public boolean addProperty(DataPath path) {
		propertyMap.put(path, new SimpleObjectProperty<>());
		return false;
	}

	@Override
	public boolean removeProperty(DataPath path) {
		propertyMap.remove(path);
		return false;
	}

}
