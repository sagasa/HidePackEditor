package types;

public class BulletData {
	/**弾の寿命 (tick) : int型**/
	public int bulletLife;

	/**直撃の対人ダメージ : float型**/
	public float playerDamage;
	/**直撃の対MOBダメージ : float型**/
	public float livingDamage;
	/**直撃の対地上兵器ダメージ : int型**/
	public int tankDamage;
	/**直撃の対航空機ダメージ : int型**/
	public int aircraftDamage;

	/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
	public float playerKnockback;
	/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
	public float livingKnockback;
	/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
	public float tankKnockback;
	/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
	public float aircraftKnockback;

	/**爆風範囲 :int型**/
	public float explosionRange;

	/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
	public float playerExplosionDamageBase;
	/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
	public float playerExplosionDamageCoe;

	/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
	public float livingExplosionDamageBase;
	/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
	public float livingExplosionDamageCoe;

	/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
	public int tankExplosionDamageBase;
	/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
	public int tankExplosionDamageCoe;

	/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
	public int aircraftExplosionDamageBase;
	/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
	public int aircraftExplosionDamageCoe;


	/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
	public float playerExplosionKnockbackBase;
	/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
	public float playerExplosionKnockbackCoe;

	/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
	public float livingExplosionKnockbackBase;
	/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
	public float livingExplosionKnockbackCoe;

	/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
	public float tankExplosionKnockbackBase;
	/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
	public float tankExplosionKnockbackCoe;

	/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
	public float aircraftExplosionKnockbackBase;
	/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
	public float aircraftExplosionKnockbackCoe;

	/**エンティティを貫通するか : boolean型**/
	public boolean isBulletCanPerforate = false;


	//距離減衰と弾道落下は別メゾットで設定
	/**距離減衰を使用するか : boolean型**/
	public boolean useDecay;

	/**弾道落下を使用するか : boolean型**/
	public boolean useGravity;

	//透過するブロック・エンティティ





	//

	/****/
	/****/
	/****/
	/*
	エンティティの設定項目
	 エフェクト：着弾時・飛翔中(エンティティに当たった時に付与する効果)
	 飛翔中のエフェクトの効果(音などを追加してもいいかも
	 透過するエンティティ・ブロック
	 弾道落下：true/false・配列とその中の数式
	 威力減衰：true/false・配列とその中の数式
	 モデル
	 近接信管・反応するエンティティ
	 誘導：true/false・手動/ロックオン/継続ロックオン・反応するエンティティ
	 */

	/**初期値 全ダメージ0 速度1*/
	public BulletData(){
		//弾のパラメータ
		this.bulletLife = 600;

		//直撃ダメージ
		playerDamage = 0F;
		livingDamage = 0F;
		tankDamage = 0;
		aircraftDamage = 0;

		//直撃ノックバック
		playerKnockback = 0F;
		livingKnockback = 0F;
		tankKnockback = 0F;
		aircraftKnockback = 0F;

		//爆風関連
		explosionRange = 0;

		//爆風ダメージ
		playerExplosionDamageBase = 0F;
		playerExplosionDamageCoe = 0F;
		livingExplosionDamageBase = 0F;
		livingExplosionDamageCoe = 0F;
		tankExplosionDamageBase = 0;
		tankExplosionDamageCoe = 0;
		aircraftExplosionDamageBase = 0;
		aircraftExplosionDamageCoe = 0;

		//爆風ノックバック
		playerExplosionKnockbackBase = 0F;
		playerExplosionKnockbackCoe = 0F;
		livingExplosionKnockbackBase = 0F;
		livingExplosionKnockbackCoe = 0F;
		tankExplosionKnockbackBase = 0F;
		tankExplosionKnockbackCoe = 0F;
		aircraftExplosionKnockbackBase = 0F;
		aircraftExplosionKnockbackCoe = 0F;

		//距離減衰
		useDecay = false;

		//弾道落下
		useGravity = false;

	}
}
