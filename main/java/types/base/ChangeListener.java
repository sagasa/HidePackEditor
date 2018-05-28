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

	static final int GUN_ACCURACY = 11;
	static final int GUN_ACCURACYADS = 12;


	void ValueChange(int cate,Object value);
}
