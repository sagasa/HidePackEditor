package resources;

import editor.HidePack;
import editor.IDataEntity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.PackInfo;

/** 名前付きリソースのスーパークラス */
public abstract class Resource implements IDataEntity {
	public Resource(String name, PackInfo pack) {
		DisplayName = name;
		if (pack == null)
			pack = HidePack.DefaultPack.get();
		RootPack = new SimpleObjectProperty<>(pack);
	}

	public ObjectProperty<PackInfo> RootPack;
	public String DisplayName;

	public Resource setRootPack(PackInfo info) {
		RootPack.set(info);
		return this;
	}

	/** 参照データか確認 */
	@Override
	public boolean isReference() {
		return RootPack.get().isReference;
	}

	@Override
	public String getDisplayName() {
		return DisplayName;
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return RootPack;
	}
}