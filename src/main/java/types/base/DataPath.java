package types.base;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.util.Strings;

import types.base.DataBase.DataEntry;

public final class DataPath {
	/** 正規表現用分割記号 */
	public static final String SPLIT_REGEX = "\\.";
	public static final String SPLIT = ".";

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

	public final int Depth;

	/** 通常用コンストラクタ */
	private DataPath(String path) {
		Path = path;
		String[] split = path.split(SPLIT_REGEX, 2);
		if (split.length == 2) {
			fastName = split[0];
			nextPath = new DataPath(split[1]);
			hasChild = true;
			Depth = nextPath.Depth + 1;
		} else {
			fastName = split[0];
			nextPath = null;
			hasChild = false;
			Depth = 0;
		}
	}

	public DataPath limit(int depth) {
		int index = -1;
		for (int i = 0; i < depth; i++) {
			index = Path.indexOf(SPLIT, index + 1);
		}
		if (index < 0) {
			return this;
		}
		return new DataPath(Path.substring(0, index));

	}

	/** 指定されたprefixを除去 */
	public DataPath sub(DataPath prefix) {
		String str = Path.replace(prefix.Path + SPLIT, "");
		return Strings.isBlank(str) ? BLANK_PATH : new DataPath(str);

	}

	/** 末尾にフィールド名を追加する */
	public DataPath append(DataEntry<?> name) {
		if (name == null)
			return this;
		return new DataPath(this.Path + "." + name.toString());
	}

	/** 末尾にPathを追加する */
	public DataPath append(DataPath next) {
		return next.isEmpty() ? this : new DataPath(this.Path + "." + next.Path);
	}

	/** 先頭にフィールド名を追加する */
	public DataPath appendFirst(DataEntry<?> name) {
		if (name == null)
			return this;
		return new DataPath(name.toString() + "." + this.Path);
	}

	public boolean isEmpty() {
		return this == BLANK_PATH || Path.isEmpty();
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
