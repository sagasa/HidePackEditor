package types;

import types.base.DataBase;
import types.guns.GunData;

public class Attachment extends DataBase {
	/**全数値0のマスク用GunData*/
	private static GunData MASK_DATA = new GunData();

	
	/** アイテムの名前 : ItemInfo型 */
	public ItemInfo ITEM_INFO = new ItemInfo("sample", "Sample", "sample");
	/**乗算マスク*/
	public GunData DIA_DATA = (GunData) MASK_DATA.dataBaseClone();
}
