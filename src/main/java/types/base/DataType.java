package types.base;

import types.guns.Recoil;
import types.ItemInfo;
import types.effect.Sound;
import types.effect.Explosion;;

/**引数のデータ型の列挙*/
public enum DataType{
	String(false,String.class),
	Float(false,Float.class,float.class),
	Int(false,Integer.class,int.class),
	Boolean(false,Boolean.class,boolean.class),
	Recoil(true,Recoil.class),
	Sound(true,Sound.class),
	ItemInfo(true,ItemInfo.class),
	Explosion(true,Explosion.class),
	StringArray(true,String[].class);

	boolean isObject;
	Class<?>[] Clazz;

	private DataType(boolean isObj,Class<?>... clazz) {
		isObject = isObj;
		Clazz = clazz;
	}

	/**DataTypeを取得*/
	public static DataType getType(DataBase data,EnumDataInfo info){
		try {
			Class<?> field = data.getField(info).getType();
			for(DataType type:DataType.values()){
				for(Class<?> clazz:type.Clazz){
					if(field.isAssignableFrom(clazz)){
						return type;
					}
				}
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isObject(){
		return isObject;
	}
}
