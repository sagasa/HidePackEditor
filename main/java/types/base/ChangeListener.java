package types.base;

public interface ChangeListener {
	static final int PACKINFO_NAME = -1;
	static final int PACKINFO_VER = -2;
	static final int PACKINFO_ROOTNAME = -3;
	static final int ITEMINFO_SHORTNAME = 0;
	static final int ITEMINFO_DISPLAY = 1;
	static final int ITEMINFO_ICON = 2;

	void ValueChange(int cate,Object value);
}
