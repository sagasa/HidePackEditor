package resources;

import editer.HasDisplayName;
import editer.HidePack;

/**名前付きリソースのスーパークラス*/
public abstract class Resource implements HasDisplayName{
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
}
