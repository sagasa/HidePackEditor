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

public class DataMap<V> extends AbstractMap<DataEntry<?>, V> {
	private final DataEntry<?>[] keys;
	private final Object[] values;
	private final Class<?> type;

	private int size = 0;
	private int maxIndex = 0;

	public DataMap(Class<? extends DataBase> data) {
		int size = DataBase.getEntries(data).size();
		keys = new DataEntry[size];
		values = new Object[size];
		type = data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V put(DataEntry<?> key, V value) {
		if (Objects.isNull(key) || Objects.isNull(value))
			throw new NullPointerException();
		checkKey(key);
		maxIndex = Math.max(maxIndex, key.getIndex());
		V old = (V) values[key.getIndex()];
		keys[key.getIndex()] = key;
		values[key.getIndex()] = value;
		if (old == null)
			size++;
		return old;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V get(Object key) {
		return key == null ? null : (V) values[checkKey(key).getIndex()];
	}

	@SuppressWarnings("unchecked")
	@Override
	public V remove(Object arg) {
		DataEntry<?> key = checkKey(arg);
		maxIndex = Arrays.stream(keys).map((k) -> k.getIndex()).max(null).get();
		V old = (V) values[key.getIndex()];
		keys[key.getIndex()] = null;
		values[key.getIndex()] = null;
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
		return values[checkKey(arg).getIndex()] != null;
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
		if (!entry.getType().isAssignableFrom(type))
			throw new IllegalArgumentException("arg type is different " + entry.getType() + " " + type);
		return entry;
	}

	private Set<Entry<DataEntry<?>, V>> entrySet;

	@Override
	public Set<Entry<DataEntry<?>, V>> entrySet() {
		if (entrySet == null)
			entrySet = new EntrySet();
		return entrySet;
	}

	private class EntrySet extends AbstractSet<Entry<DataEntry<?>, V>> {

		@Override
		public Iterator<Entry<DataEntry<?>, V>> iterator() {
			return new Iterator<Map.Entry<DataEntry<?>, V>>() {
				int prevIndex = -1;

				@Override
				public Entry<DataEntry<?>, V> next() {
					for (int c = 0; c < size; c++) {
						for (int p = prevIndex + 1; p < values.length; p++) {
							if (values[p] != null) {
								prevIndex = p;
								final int index = p;
								return new Entry<DataBase.DataEntry<?>, V>() {
									@SuppressWarnings("unchecked")
									@Override
									public V setValue(V value) {
										V old = (V) values[index];
										values[index] = value;
										return old;
									}

									@SuppressWarnings("unchecked")
									@Override
									public V getValue() {
										return (V) values[index];
									}

									@Override
									public DataEntry<?> getKey() {
										return keys[index];
									}
								};
							}

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
