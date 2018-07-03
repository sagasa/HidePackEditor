package types;

import types.base.DataBase;

public class ItemInfo extends DataBase {
	public String NAME_SHORT = "sample";
	public String NAME_DISPLAY = "sample";
	public String NAME_ICON = "sample";
	public float MAX_HEALTH = 0f;
	public float MOVE_SPEED = 0f;
	public float KNOCKBACK_RESISTANCE = 0f;
	public float ATTACK_DAMAGE = 0f;

	public ItemInfo(String shortname, String displayname, String iconname) {
		NAME_SHORT = shortname;
		NAME_DISPLAY = displayname;
		NAME_ICON = iconname;
	}
}
