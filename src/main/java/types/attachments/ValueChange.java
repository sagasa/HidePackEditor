package types.attachments;

import java.lang.reflect.Field;
import java.util.List;

import types.base.DataBase;

public class ValueChange {

	public String TARGET;
	public ChangeType TYPE;
	public Object VALUE;

	public ValueChange(String target, ChangeType type, Object value) {
		TARGET = target;
		TYPE = type;
		VALUE = value;
	}

	@SuppressWarnings("unchecked")
	public void apply(DataBase data) {
		try {
			Field field = data.getClass().getField(TARGET);

			if (TYPE.valueType == NUMBER) {
				Double value = field.getDouble(data);
				if (TYPE == ChangeType.ADD_FLOAT)
					value = value + (Double) VALUE;
				else if (TYPE == ChangeType.DIA_FLOAT)
					value = value * (Double) VALUE;
				else if (TYPE == ChangeType.SET_FLOAT)
					value = (Double) VALUE;

				Class<?> clazz = field.getType();
				if (int.class.isAssignableFrom(clazz) || Integer.class.isAssignableFrom(clazz)) {
					field.set(data, (float) value);
				} else if (float.class.isAssignableFrom(clazz) || Float.class.isAssignableFrom(clazz)) {
					field.set(data, value);
				}
			}
			switch (TYPE) {
			case ADD_LIST_STRING:
				((List<String>) field.get(data)).add((String) VALUE);
				break;
			case REMOVE_LIST_STRING:
				((List<String>) field.get(data)).remove((String) VALUE);
				break;
			default:
				break;

			}
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return TARGET + " " + TYPE + " " + VALUE + super.toString();
	}

	private static final int STRING = 0;
	private static final int NUMBER = 1;

	public enum ChangeType {

		ADD_FLOAT(NUMBER), DIA_FLOAT(NUMBER), SET_FLOAT(NUMBER), ADD_LIST_STRING(STRING), REMOVE_LIST_STRING(STRING);
		private ChangeType(int type) {
			valueType = type;
		}

		int valueType;
	}
}
