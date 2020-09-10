package types.base;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javafx.collections.FXCollections;

public class DataHolder<T extends NamedData> {
	private Map<String, T> map = new ConcurrentHashMap<>();
	private boolean valid = false;

	public T getByDisplayName(String name) {
		return map.values().stream().filter(value -> value.getDisplayName() == name).findFirst().orElse(null);
	}

	@SuppressWarnings("unchecked")
	private void reMap() {
		Object[] values = map.values().toArray();
		map.clear();
		for (Object pbj : values) {
			T t = (T) pbj;
			map.put(t.getSystemName(), t);
		}
		valid = true;
	}

	public T get(String name) {
		if (valid)
			return map.get(name);
		return map.values().stream().filter(value -> value.getSystemName() == name).findFirst().orElse(null);
	}

	public void putAll(Collection<? extends T> collection) {
		collection.forEach(data -> put(data));
	}

	public boolean put(T data) {
		String str = (String) data.get(data.systemName(), null);
		if (map.containsKey(str)) {
			return false;
		}
		map.put(str, data);
		return true;
	}

	public Collection<T> getValues() {
		return map.values();
	}

	public void clear() {
		map.clear();
	}

	// == エディタ側 ==
	public List<T> Observable = FXCollections.observableArrayList();
}
