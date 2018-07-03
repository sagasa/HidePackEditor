package types;

import types.base.DataBase;

public class Explosion extends DataBase {


	public float RANGE = 0;
	public Sound SOUND = new Sound("minecraft:random.explode", 50f);
	public float DAMAGE_BASE_PLAYER = 0;
	public float DAMAGE_COE_PLAYER = 0;
	public float DAMAGE_BASE_LIVING = 0;
	public float DAMAGE_COE_LIVING = 0;
	public int DAMAGE_BASE_TANK = 0;
	public int DAMAGE_COE_TANK = 0;
	public int DAMAGE_BASE_AIR = 0;
	public int DAMAGE_COE_AIR = 0;

	public float KNOCKBACK_BASE_PLAYER = 0;
	public float KNOCKBACK_COE_PLAYER = 0;
	public float KNOCKBACK_BASE_LIVING = 0;
	public float KNOCKBACK_COE_LIVING = 0;
	public float KNOCKBACK_BASE_TANK = 0;
	public float KNOCKBACK_COE_TANK = 0;
	public float KNOCKBACK_BASE_AIR = 0;
	public float KNOCKBACKDAMAGE_COE_AIR = 0;
}