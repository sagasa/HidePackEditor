package types.base;

public class ItemInfo {
	public String shortName;
	public String displayName;
	public String iconName;

	double maxHealth = 0;
	double movementSpeed = 0;
	double knockbackResistance = 0;
	double attackDamage = 0;

	public ItemInfo(String shortname,String displayname,String iconname) {
		shortName = shortname;
		displayName = displayname;
		iconName = iconname;
	}
}
