package types.items;

import types.base.Info;

public class MagazineData extends ItemData {

	/** 装弾数 : int型 **/
	public static final DataEntry<Integer> MagazineSize = of(30, new Info().Min(0));
	/** リロード時にマガジンが破棄されるか : boolean型 **/
	public static final DataEntry<Boolean> MagazineBreak = of(true);
	/** 弾の情報 */
	public static final DataEntry<GunData> Data = of(GunData.DEFAULT);;

}
