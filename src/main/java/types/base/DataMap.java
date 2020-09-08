package types.base;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import types.base.DataBase.DataEntry;

public class DataMap extends AbstractMap<DataEntry<?>, Object> {
	private final DataEntry<?>[] keys;
	private final Object[] values;
	private final Class<?> type;

	private int size = 0;
	private int maxIndex = 0;

	public DataMap(DataBase data) {
		keys = new DataEntry[data.size()];
		values = new Object[data.size()];
		type = data.getClass();
	}

	@Override
	public Object put(DataEntry<?> key, Object value) {
		if (Objects.isNull(key) || Objects.isNull(value))
			throw new NullPointerException();
		checkKey(key);
		maxIndex = Math.max(maxIndex, key.Index);
		Object old = values[key.Index];
		keys[key.Index] = key;
		values[key.Index] = value;
		if (old == null)
			size++;
		return old;
	}

	@Override
	public Object get(Object key) {
		return key == null ? null : values[checkKey(key).Index];
	}

	@Override
	public Object remove(Object arg) {
		DataEntry<?> key = checkKey(arg);
		maxIndex = Math.max(maxIndex, key.Index);
		Object old = values[key.Index];
		keys[key.Index] = null;
		values[key.Index] = null;
		size--;
		return old;
	}

	@Override
	public void clear() {
		Arrays.fill(keys, null);
		Arrays.fill(values, null);
		size = 0;
	}

	@Override
	public boolean containsKey(Object arg) {
		if (arg == null || !(arg instanceof DataEntry))
			return false;
		return values[checkKey(arg).Index] != null;
	}

	@Override
	public int size() {
		return size;
	}

	/** 違ったらIllegalArgumentException */
	protected DataEntry<?> checkKey(Object obj) {
		if (obj == null)
			return null;
		if (!(obj instanceof DataEntry))
			throw new IllegalArgumentException("arg is not DataEntry");
		DataEntry<?> entry = (DataEntry<?>) obj;
		if (entry.Type != type)
			throw new IllegalArgumentException("arg type is different " + entry.Type + " " + type);
		return entry;
	}

	private Set<Entry<DataEntry<?>, Object>> entrySet;

	@Override
	public Set<Entry<DataEntry<?>, Object>> entrySet() {
		if (entrySet == null)
			entrySet = new EntrySet();
		return entrySet;
	}

	private class EntrySet extends AbstractSet<Entry<DataEntry<?>, Object>> {

		@Override
		public Iterator<Entry<DataEntry<?>, Object>> iterator() {
			return new Iterator<Map.Entry<DataEntry<?>, Object>>() {
				int prevIndex = 0;

				@Override
				public Entry<DataEntry<?>, Object> next() {
					for (int j = prevIndex; j < size; j++) {
						if (values[j] != null) {
							prevIndex = j;
							final int i = j;
							return new Entry<DataBase.DataEntry<?>, Object>() {
								@Override
								public Object setValue(Object value) {
									Object old = values[i];
									values[i] = value;
									return old;
								}

								@Override
								public Object getValue() {
									return values[i];
								}

								@Override
								public DataEntry<?> getKey() {
									return keys[i];
								}
							};
						}

					}
					throw new NoSuchElementException();
				}

				@Override
				public boolean hasNext() {
					return prevIndex < maxIndex;
				}
			};
		}

		@Override
		public int size() {
			return size;
		}

	}
}
