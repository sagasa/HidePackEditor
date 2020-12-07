package types.base;

import org.apache.commons.lang.StringUtils;

import types.base.DataBase.DataEntry;

public final class DataPath {
	private static final String SPLIT = "\\.";

	/** 空path */
	public static final DataPath BLANK_PATH = new DataPath("");

	public final String Path;
	// ファイナルだし初期化時に全部答えだしとく
	/** 深度があるか */
	public final boolean hasChild;
	/** 1つ目のフィールド名 */
	public final String fastName;
	/** 孫階層のパス なければNull */
	public final DataPath nextPath;

	/** 通常用コンストラクタ */
	private DataPath(String path) {
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

	/** 末尾にフィールド名を追加する 長さが０ならこの何もしない */
	public DataPath append(DataEntry<?> name) {
		if (name == null)
			return this;
		return new DataPath(this.Path + "." + name.toString());
	}

	/** 先頭にフィールド名を追加する 長さが０ならこの何もしない */
	public DataPath appendFirst(DataEntry<?> name) {
		if (name == null)
			return this;
		return new DataPath(name.toString() + "." + this.Path);
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

	public static DataPath of(DataEntry<?>... datas) {
		for (DataEntry<?> dataEntry : datas) {
			if (dataEntry.toString() == null) {
				System.out.println("ERRRRRRRRRR");
			}
		}
		return new DataPath(StringUtils.join(datas, "."));
	}
}
