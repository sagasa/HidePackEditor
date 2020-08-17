package types.base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils;

import types.base.DataBase.DataEntry;

public class DataView<K extends Enum<K> & IHideData> {

	public DataView(Class<K> type) {
		caschMap = new EnumMap<>(type);
	}

	private Map<K, Object> caschMap;
	private List<DataBase<K>> values = new ArrayList<>();

	private Object getWithoutCache(K key) {
		Object obj = key.getDefault();
		for (DataBase<K> data : values) {
			DataEntry entry = data.getEntry(key);
			if (entry != null)
				obj = entry.apply(obj);
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

	protected void onChange(IHideData type) {
		// キャッシュを削除
		caschMap.remove(type);
		// 子に通知
		Iterator<WeakReference<DataBase<K>>> itr = children.iterator();
		while (itr.hasNext()) {
			WeakReference<DataBase<K>> ref = itr.next();
			// 消えてたら削除
			if (ref.get() == null) {
				itr.remove();
				continue;
			}
			ref.get().onChange(type);
		}
	}

	protected DataBase<K> parent;
	protected List<WeakReference<DataBase<K>>> children = new ArrayList<>();

	public void setPearnt(DataBase<K> newParent) {
		if (ObjectUtils.equals(newParent, parent))
			return;
		if (parent != null)
			parent.removeChilde(this);
		parent = newParent;
		parent.children.add(new WeakReference<>(this));
	}

	protected void removeChilde(DataBase<K> childe) {
		Iterator<WeakReference<DataBase<K>>> itr = children.iterator();
		while (itr.hasNext())
			if (childe.equals(itr.next().get())) {
				itr.remove();
				return;
			}
	}
}
