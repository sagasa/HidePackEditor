package editer;

import javafx.beans.property.ObjectProperty;
import types.PackInfo;

/** 名前とUIDのゲッター */
public interface IDataEntity extends Comparable<IDataEntity> {
	abstract public String getDisplayName();

	public default ObjectProperty<PackInfo> getRootPack(){
		return null;
	}

	@Override
	default int compareTo(IDataEntity o) {
		return this.getDisplayName().compareTo(o.getDisplayName());
	}
}
