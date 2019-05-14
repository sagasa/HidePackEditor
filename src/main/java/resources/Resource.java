package resources;

import editer.DataEntityInterface;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.PackInfo;

/**名前付きリソースのスーパークラス*/
public abstract class Resource implements DataEntityInterface {
	public Resource(String name, PackInfo pack) {
		DisplayName = name;
		RootPack = new SimpleObjectProperty<>(pack);
	}

	public ObjectProperty<PackInfo> RootPack;;
	public String DisplayName;

	/**参照データか確認*/
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