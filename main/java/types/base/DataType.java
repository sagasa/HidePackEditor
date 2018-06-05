package types.base;

/**引数のデータ型の列挙*/
public enum DataType{
	String(false),
	Float(false),
	Int(false),
	Boolean(false),
	GunRecoil(true),
	Sound(true),
	ItemInfo(true),
	StringArray(true);

	boolean isObject;

	private DataType(boolean isObj) {
		isObject = isObj;
	}

	public boolean isObject(){
		return isObject;
	}
}
