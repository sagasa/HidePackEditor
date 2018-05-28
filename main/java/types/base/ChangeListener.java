package types.base;

public interface ChangeListener {
	static final int PACKINFO_NAME = -1;
	static final int PACKINFO_VER = -2;
	static final int PACKINFO_ROOTNAME = -3;
	static final int ITEMINFO_SHORTNAME = 0;
	static final int ITEMINFO_DISPLAY = 1;
	static final int ITEMINFO_ICON = 2;
	
	static final int GUN_BULLETSPEAD = 3;
	static final int GUN_RELOAD = 4;
	static final int GUN_RATE = 5;
	static final int GUN_BULLETPOWER = 6;
	static final int GUN_BURSTRATE = 7;
	static final int GUN_BURSTNUM = 8;
	static final int GUN_LOADNUM = 9;
	static final int GUN_SHOOTNUM = 10;
	
	static final int GUN_ACCURACY = 11;
	static final int GUN_ACCURACYADS = 12;

	void ValueChange(int cate,Object value);
}
