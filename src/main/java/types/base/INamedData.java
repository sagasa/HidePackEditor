package types.base;

/** 一番上に位置するDataに必要 */
public interface INamedData {
	String getDisplayName();

	/** 全部小文字[a-z][0-9] */
	String getSystemName();
}
