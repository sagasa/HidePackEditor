package types.wrapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.IEditData;
import types.base.DataBase;
import types.base.DataPath;

public class ClipData implements IEditData {
	public ClipData(Class<? extends DataBase> clazz) {
		editClass = clazz;
		try {
			defaultValue = editClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		init(null, editClass);
	}

	/**初期値参照用*/
	DataBase defaultValue;

	@SuppressWarnings("unchecked")
	private void init(DataPath path, Class<? extends DataBase> clazz) {
		for (Field field : clazz.getFields()) {
			DataPath fieldPath = path == null ? new DataPath(field.getName()) : path.append(field.getName());
			if (field.getType().isAssignableFrom(List.class)) {
				propertyMap.put(fieldPath, new SimpleListProperty<>(null));
			} else if (DataBase.class.isAssignableFrom(field.getType())) {
				init(fieldPath, (Class<? extends DataBase>) field.getType());
			} else {
				propertyMap.put(fieldPath, new SimpleObjectProperty<>(null));
			}
		}
	}

	private final Class<? extends DataBase> editClass;
	private Map<DataPath, Property<?>> propertyMap = new HashMap<>();

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
		propertyMap.get(path).setValue(getDefault(path));
		return false;
	}


	@SuppressWarnings("unchecked")
	private <T> T getDefault(DataPath path) {
		return (T) EditHelper.getData(defaultValue, path);
	}

	@Override
	public boolean removeProperty(DataPath path) {
		if (!propertyMap.containsKey(path))
			return false;
		propertyMap.get(path).setValue(null);
		return true;
	}
}
