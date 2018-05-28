package types.base;

public class ItemInfo extends CloneableObj{
	public String shortName;
	public String displayName;
	public String iconName;

	public double maxHealth = 0;
	public double movementSpeed = 1;
	public double knockbackResistance = 0;
	public double attackDamage = 0;

	public ItemInfo(String shortname,String displayname,String iconname) {
		shortName = shortname;
		displayName = displayname;
		iconName = iconname;
	}
}
