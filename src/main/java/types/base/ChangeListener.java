package types.base;

public interface ChangeListener {
	static final int DATA_MASK = 0xFFFF;
	static final int DOMAIN_MASK = 0xFFFF0000;

	static final int DOMAIN_GUN = 0x10000;
	static final int DOMAIN_MAGAZINE = 0x20000;
	
	static final int PACKINFO_NAME = -1;
	static final int PACKINFO_VER = -2;
	static final int PACKINFO_ROOTNAME = -3;
	static final int ITEMINFO_DISPLAY = 0;

	static final int GRAPH_UPDATE= 9;


	void ValueChange(int cate,Object value);
}
