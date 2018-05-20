package hideEditer.dataEditer;

/**SetPanel用変更通知インターフェース*/
public interface ChangeListener {
	/**数値変更*/
	static public final int NUMBER_CHANGE = 0;
	/**名前変更*/
	static public final int NAME_CHANGE = 1;
	/**チェックボックス変更*/
	static public final int CHECK_CHANGE = 2;
	void valueChange(int event);
}
