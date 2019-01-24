package types.items;

import types.Info;
import types.projectile.BulletData;

public class MagazineData extends ItemData {
	/** 装弾数 : int型 **/
	@Info(Cate = 0, Min = 1)
	public int MAGAZINE_SIZE = 10;
	/** リロード時にマガジンが破棄されるか : boolean型 **/
	@Info(Cate = 0)
	public boolean MAGAZINE_BREAK = true;
	/** 発射するエンティティのタイプ Bulletかグレネード系か */
	@Info(Cate = 0)
	public boolean USE_BULLETDATA = true;
	/** Bulletを使用する場合に必要になる */
	public BulletData BULLETDATA = new BulletData();
}
