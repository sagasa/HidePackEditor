package types.items;

import types.Info;

public class MagazineData extends ItemData {
	/** 装弾数 : int型 **/
	@Info(Cate = 0,Min = 1)
	public int MAGAZINE_SIZE = 10;
	/** スタックサイズ : int型 **/
	@Info(Cate = 0,Min = 1,Max=64)
	public int STACK_SIZE = 4;
	/**リロード時にマガジンが破棄されるか : boolean型**/
	@Info(Cate = 0)
	public boolean MAGAZINE_BREAK = true;
}
