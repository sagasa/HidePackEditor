package editer;

import javafx.beans.property.ObjectProperty;
import types.PackInfo;

/** 名前とUIDのゲッター */
public interface DataEntityInterface extends Comparable<DataEntityInterface> {
	abstract public String getDisplayName();

	public default ObjectProperty<PackInfo> getRootPack(){
		return null;
	}

	@Override
	default int compareTo(DataEntityInterface o) {
		return this.getDisplayName().compareTo(o.getDisplayName());
	}
}
