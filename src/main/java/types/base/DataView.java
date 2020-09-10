package types.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import types.base.DataBase.DataEntry;

public class DataView {

	public DataView(DataBase type) {
		caschMap = new DataMap<>(type);
	}

	private Map<DataEntry<?>, Object> caschMap;
	private List<DataBase> values = new ArrayList<>();

	private <T> T getWithoutCache(DataEntry<T> key) {
		T obj = key.Default;
		for (DataBase data : values) {
			obj = data.get(key, obj);
		}
		return obj;
	}

	/**
	 * キャッシュを利用して取得
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(DataEntry<T> key) {
		if (caschMap.containsKey(key))
			return (T) caschMap.get(key);
		T res = getWithoutCache(key);
		caschMap.put(key, res);
		return res;
	}

	public void onChange(DataEntry<?> type) {
		caschMap.remove(type);
	}
}
