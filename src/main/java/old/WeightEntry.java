package old;

import java.util.Objects;

import editor.IDataEntity;

/** EqualをValueのみで判断するように */
public class WeightEntry<T> {
	public float Weight = 1;
	public T Value;

	public WeightEntry() {
	}

	public WeightEntry(T value) {
		Value = value;
		Weight = 0;
	}

	public String getDisplayName() {
		if (Value instanceof IDataEntity)
			return ((IDataEntity) Value).getDisplayName();
		return Value.toString();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof WeightEntry)
			return Objects.equals(Value, ((WeightEntry) obj).Value);
		return false;
	}

	@Override
	public int hashCode() {
		return Value != null ? Value.hashCode() : 0;
	}
}
