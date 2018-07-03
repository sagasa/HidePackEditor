package types;

import types.base.DataBase;

public class BulletData extends DataBase{
	/** アイテムの名前 : ItemInfo型 */
	ItemInfo ITEM_INFO = new ItemInfo("sample", "Sample", "sample");

	/** 装弾数 : int型 **/
	int MAGAZINE_SIZE = 10;

	/** スタックサイズ : int型 **/
	int STACK_SIZE = 4;

	/**弾の寿命 (tick) : int型**/
	int BULLET_LIFE = 600;

	/**弾の貫通力 : int型**/
	int BULLET_POWER = 1;

	/** 発射数 : int型 **/
	int SHOOT_NUM = 1;

	/**リロード時にマガジンが破棄されるか : boolean型**/
	boolean MAGAZINE_BREAK = true;

	/**防具貫通 : boolean型**/
	boolean HIT_IGNORING_ARMOR = false;
	/**直撃のHSダメージ : float型**/
	float HIT_DAMAGE_HEAD = 1F;
	/**直撃の対人ダメージ : float型**/
	float  HIT_DAMAGE_PLAYER = 0F;
	/**直撃の対MOBダメージ : float型**/
	float HIT_DAMAGE_LIVING = 0F;
	/**直撃の対地上兵器ダメージ : int型**/
	int HIT_DAMAGE_TANK = 0;
	/**直撃の対航空機ダメージ : int型**/
	int HIT_DAMAGE_AIR = 0;

	/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
	float HIT_KNOCKBACK_PLAYER = 0F;
	/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
	float HIT_KNOCKBACK_LIVING = 0F;
	/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
	float HIT_KNOCKBACK_TANK = 0F;
	/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
	float HIT_KNOCKBACK_AIR = 0F;

	/** エンティティに当たった時の爆発 : Explosion型 **/
	Explosion EXP_ON_HIT_ENTITY = new Explosion();
	/** 地面に当たった時の爆発 : Explosion型 **/
	Explosion EXP_ON_HIT_GROUND = new Explosion();
	/** 時間経過の爆発 : Explosion型 **/
	Explosion EXP_ON_TIMEOUT = new Explosion();

	/**対人ダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_START_PLAYER = 0F;
	/**対人ダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_COE_PLAYER = 0F;
	/**対人ダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_MAX_PLAYER = 0F;

	/**対MOBダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_START_LIVING = 0F;
	/**対MOBダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_COE_LIVING = 0F;
	/**対MOBダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
	float DECAY_DAMAGE_MAX_LIVING = 0F;

	/** 着弾音 : Sound型 **/
	Sound SOUND_HIT_GROUND = new Sound("sample", 8);

	/** エンティティ着弾音 : Sound型 **/
	Sound SOUND_HIT_ENTITY = new Sound("sample", 8);

	/** 通過音 : Sound型 **/
	Sound SOUND_PASSING_USE = new Sound("sample", 8);

	/**透過する・ブロック : String[]型*/
	String[] THROUGH_BLOCK = new String[0];
	/**透過するエンティティ : String[]型*/
	String[] THROUGH_ENTITY = new String[0];
}
