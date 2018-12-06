package editer;

/** 名前とUIDのゲッター */
public interface DataEntityInterface extends Comparable<DataEntityInterface> {
	abstract public String getDisplayName();

	abstract public long getPackUID();

	@Override
	default int compareTo(DataEntityInterface o) {
		return this.getDisplayName().compareTo(o.getDisplayName());
	}
}
