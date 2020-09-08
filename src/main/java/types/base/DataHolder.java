package types.base;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataHolder<K extends Enum<K> & IHideData> {
	private Map<String, NamedData<K>> map = new ConcurrentHashMap<>();

	public NamedData<K> get(String name) {
		return map.get(name);
	}

	/** 依存関係の解決 */
	public void reload() {
		map.values().forEach(v -> v.findParent(this));
	}

	public void putAll(Collection<? extends NamedData<K>> collection) {
		collection.forEach(data -> put(data));
	}

	public boolean put(NamedData<K> data) {
		String str = (String) data.get(data.systemName(), null);
		if (map.containsKey(str)) {
			return false;
		}
		map.put(str, data);
		return true;
	}

	public Collection<NamedData<K>> getValues() {
		return map.values();
	}

	public void clear() {
		map.clear();
	}
}
