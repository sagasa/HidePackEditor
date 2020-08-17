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

	/** キャッシュを登録せず取得 */
	protected Object getWithoutCache(K key) {
		// キャッシュがあれば
		if (caschMap.containsKey(key))
			return caschMap.get(key);
		DataEntry entry = dataMap.get(key);
		if (entry != null && entry.operator == Operator.SET)
			return dataMap.get(key).value;
		Object root = parent == null ? key.getDefault() : parent.getWithoutCache(key);
		return entry == null ? root : entry.operator.apply(root, entry.value);
	}

	/** キャッシュを利用して取得 */
	public Object get(K key) {
		if (caschMap.containsKey(key))
			return key;
		Object res = super.get(key);
		caschMap.put(key, res);
		return res;
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
