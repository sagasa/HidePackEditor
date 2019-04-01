package types.attachments;

import java.util.ArrayList;

public class ValueChange {

	public String TARGET;
	public ChangeType TYPE;
	public Object VALUE;

	public ValueChange(String target, ChangeType type, Object value) {
		TARGET = target;
		TYPE = type;
		VALUE = value;
	}

	@Override
	public String toString() {
		return TARGET + " " + TYPE + " " + VALUE + super.toString();
	}

	public enum ChangeType {

		ADD_FLOAT, DIA_FLOAT, SET_FLOAT, ADD_LIST_STRING, REMOVE_LIST_STRING;
		private ChangeType() {

		}
	}
}
