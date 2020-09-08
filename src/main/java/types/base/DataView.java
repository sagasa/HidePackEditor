package types.base;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class DataView<K extends Enum<K> & IHideData> {

	public DataView(Class<K> type) {
		caschMap = new EnumMap<>(type);
	}

	private Map<K, Object> caschMap;
	private List<DataBase<K>> values = new ArrayList<>();

	private Object getWithoutCache(K key) {
		Object obj = key.getDefault();
		for (DataBase<K> data : values) {
			obj = data.get(key, obj);
		}
		return obj;
	}

	/** キャッシュを利用して取得 */
	public Object get(K key) {
		if (caschMap.containsKey(key))
			return key;
		Object res = getWithoutCache(key);
		caschMap.put(key, res);
		return res;
	}

	public String getString(K key) {
		return (String) get(key);
	}

	public int getInteger(K key) {
		return (Integer) get(key);
	}

	public float getFloat(K key) {
		return (Float) get(key);
	}

	@SuppressWarnings("unchecked")
	public <V> V getAs(K key, Class<V> clazz) {
		return (V) get(key);
	}

	@SuppressWarnings("unlikely-arg-type")
	public void onChange(IHideData type) {
		caschMap.remove(type);
	}
}
