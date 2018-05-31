package types.base;

public interface ChangeListener {
	static final int DATA_MASK = 0xFFFF;
	static final int DOMAIN_MASK = 0xFFFF0000;

	static final int PACKINFO_NAME = -1;
	static final int PACKINFO_VER = -2;
	static final int PACKINFO_ROOTNAME = -3;
	static final int ITEMINFO_SHORTNAME = 0;
	static final int ITEMINFO_DISPLAY = 1;
	static final int ITEMINFO_ICON = 2;
	static final int ITEMINFO_MAXHEALTH = 3;
	static final int ITEMINFO_SPEED = 4;
	static final int ITEMINFO_KNOCKBACKRESISTANCE = 5;
	static final int ITEMINFO_ATTACK = 6;

	static final int SOUND_NAME= 0x10000;
	static final int SOUND_PITCH= 0x20000;
	static final int SOUND_VOL= 0x30000;
	static final int SOUND_RANGE= 0x40000;

	static final int GUN_SOUND_SHOOT= 7;
	static final int GUN_SOUND_RELOAD= 8;

	static final int RECOIL_YAW_MAX_BASE = 0x50000;
	static final int RECOIL_YAW_MAX_SPREAD = 0x60000;
	static final int RECOIL_YAW_MAX_SHAKE = 0x70000;
	static final int RECOIL_PITCH_MAX_BASE = 0x80000;
	static final int RECOIL_PITCH_MAX_SPREAD = 0x90000;
	static final int RECOIL_PITCH_MAX_SHAKE = 0xa0000;
	static final int RECOIL_YAW_MIN_BASE = 0xb0000;
	static final int RECOIL_YAW_MIN_SPREAD = 0xc0000;
	static final int RECOIL_YAW_MIN_SHAKE = 0xd0000;
	static final int RECOIL_PITCH_MIN_BASE = 0xe0000;
	static final int RECOIL_PITCH_MIN_SPREAD = 0xf0000;
	static final int RECOIL_PITCH_MIN_SHAKE = 0x100000;
	static final int RECOIL_YAW_TICK = 0x110000;
	static final int RECOIL_YAW_TICK_RETURN = 0x120000;
	static final int RECOIL_PITCH_TICK = 0x130000;
	static final int RECOIL_PITCH_TICK_RETURN = 0x140000;
	static final int RECOIL_POWER_SHOOT = 0x150000;
	static final int RECOIL_POWER_TICK = 0x160000;


	static final int GUN_RECOIL_DEFAULT= 9;
	static final int GUN_RECOIL_SNEAK= 10;
	static final int GUN_RECOIL_ADS= 11;
	static final int GUN_RECOIL_SNEAKADS= 12;


	void ValueChange(int cate,Object value);
}
