package resources;

import editer.HasDisplayName;

/**名前付きリソースのスーパークラス*/
public abstract class Resource implements HasDisplayName{
	public Resource(String name) {
		DisplayName = name;
	}
	public String DisplayName;
	@Override
	public String getDisplayName() {
		return DisplayName;
	}
}
