package editer;

import javafx.beans.property.ObjectProperty;
import types.PackInfo;

/** 名前とUIDのゲッター */
public interface IDataEntity extends Comparable<IDataEntity> {
	abstract public String getDisplayName();

	public ObjectProperty<PackInfo> getRootPack();

	public default boolean isReference() {
		PackInfo info = getRootPack().get();
		return info == null ? false : info.isReference;
	}

	@Override
	default int compareTo(IDataEntity o) {
		return this.getDisplayName().compareTo(o.getDisplayName());
	}
}
