package resources;

import editer.DataEntityInterface;
import editer.HidePack;

/**名前付きリソースのスーパークラス*/
public abstract class Resource implements DataEntityInterface{
	public Resource(String name) {
		DisplayName = name;
	}
	public long PackUID;
	public String DisplayName;
	/**参照データか確認*/
	public boolean isReference() {
		return HidePack.getPack(PackUID).isReference;
	}
	@Override
	public String getDisplayName() {
		return DisplayName;
	}
	@Override
	public long getPackUID() {
		return PackUID;
	}
}