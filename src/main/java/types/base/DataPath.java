package types.base;

public final class DataPath {
	private static final String SPLIT = "\\.";

	/**空path*/
	public static final DataPath BLANK_PATH = new DataPath("");

	public final String Path;
	//ファイナルだし初期化時に全部答えだしとく
	/**深度があるか*/
	public final boolean hasChild;
	/**1つ目のフィールド名*/
	public final String fastName;
	/**孫階層のパス なければNull*/
	public final DataPath nextPath;

	/**通常用コンストラクタ*/
	public DataPath(String path) {
		Path = path;
		String[] split = path.split(SPLIT, 2);
		if (split.length == 2) {
			fastName = split[0];
			nextPath = new DataPath(split[1]);
			hasChild = true;
		} else {
			fastName = split[0];
			nextPath = null;
			hasChild = false;
		}
	}

	/**末尾にフィールド名を追加する 長さが０ならこの何もしない*/
	public DataPath append(String name) {
		if (name.length() == 0)
			return this;
		return new DataPath(this.Path + "." + name);
	}

	@Override
	public String toString() {
		return Path;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof DataPath)
			return Path.equals(((DataPath) obj).Path);
		return false;
	}

	@Override
	public int hashCode() {
		return Path.hashCode();
	}
}
