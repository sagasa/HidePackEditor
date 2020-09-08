package types.items;

public interface ItemData<K> {
	K iconName();

	/** 全部小文字[a-z][0-9] */
	K systemName();
}
