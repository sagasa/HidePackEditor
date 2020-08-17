package types.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataHolder<T extends DataBase<?> & INamedData> {
	private Map<String, T> map = new ConcurrentHashMap<>();

	public T get(String name) {
		return map.get(name);
	}

	public boolean put(T data) {
		if (!map.containsKey(data.getSystemName())) {
			return false;
		}
		map.put(data.getSystemName(), data);
		return true;
	}

	public void clear() {
		map.clear();
	}
}
