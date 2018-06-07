package types;

import helper.JsonWrapper;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;
import types.guns.GunData.GunDataList;

public class BulletData extends DataBase{

	/**弾のデータ 初期値も同時に代入*/
	public enum BulletDataList implements EnumDataList{
		/** アイテムの名前 : ItemInfo型 */
		ITEM_INFO(null, null, new ItemInfo("sample", "Sample", "sample"), DataType.ItemInfo),

		/** 装弾数 : int型 **/
		MAGAZINE_SIZE(1f,null,10,DataType.Int,1),

		/** スタックサイズ : int型 **/
		STACK_SIZE(1f,null,4,DataType.Int,1),

		/**弾の寿命 (tick) : int型**/
		BULLET_LIFE(1f,null,600,DataType.Int,1),

		/**弾の貫通力 : int型**/
		BULLET_POWER(-1f,null,1,DataType.Int,1),

		/** 発射数 : int型 **/
		SHOOT_NUM(1f, null, 1, DataType.Int, 1),

		/**リロード時にマガジンが破棄されるか : boolean型**/
		MAGAZINE_BREAK(null,null,true,DataType.Boolean,1),

		/**直撃の対人ダメージ : float型**/
		HIT_DAMAGE_PLAYER(null,null,0F,DataType.Float,2),
		/**直撃の対MOBダメージ : float型**/
		HIT_DAMAGE_LIVING(null,null,0F,DataType.Float,2),
		/**直撃の対地上兵器ダメージ : int型**/
		HIT_DAMAGE_TANK(null,null,0,DataType.Int,2),
		/**直撃の対航空機ダメージ : int型**/
		HIT_DAMAGE_AIR(null,null,0,DataType.Int,2),

		/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_PLAYER(null,null,0F,DataType.Float,3),
		/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_LIVING(null,null,0F,DataType.Float,3),
		/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_TANK(null,null,0F,DataType.Float,3),
		/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_AIR(null,null,0F,DataType.Float,3),

		/**爆風範囲 :int型**/
		EXP_RANGE(0f,null,0,DataType.Int,4),

		/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_PLAYER(null,null,0F,DataType.Float,4),
		/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_PLAYER(null,null,0F,DataType.Float,4),
		/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_LIVING(null,null,0F,DataType.Float,4),
		/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_LIVING(null,null,0,DataType.Float,4),
		/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_TANK(null,null,0,DataType.Int,4),
		/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_TANK(null,null,0,DataType.Int,4),
		/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_AIR(null,null,0,DataType.Int,4),
		/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_AIR(null,null,0,DataType.Int,4),

		/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_PLAYER(null,null,0F,DataType.Float,5),
		/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_PLAYER(null,null,0F,DataType.Float,5),
		/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_LIVING(null,null,0F,DataType.Float,5),
		/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_LIVING(null,null,0F,DataType.Float,5),
		/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_TANK(null,null,0F,DataType.Float,5),
		/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_TANK(null,null,0F,DataType.Float,5),
		/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_AIR(null,null,0F,DataType.Float,5),
		/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_AIR(null,null,0F,DataType.Float,5),

		/**対人ダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_START_PLAYER(null,null,0F,DataType.Float,10),
		/**対人ダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_COE_PLAYER(null,null,0F,DataType.Float,10),
		/**対人ダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_MAX_PLAYER(null,null,0F,DataType.Float,10),

		/**対MOBダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_START_LIVING(null,null,0F,DataType.Float,10),
		/**対MOBダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_COE_LIVING(null,null,0F,DataType.Float,10),
		/**対MOBダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_MAX_LIVING(null,null,0F,DataType.Float,10),

		/** 着弾音 : Sound型 **/
		SOUND_HIT_GROUND(null,null, new Sound("sample", 8), DataType.Sound, 21),

		/** エンティティ着弾音を使用するか : boolean型 **/
		SOUND_HIT_ENTITY(null,null, new Sound("sample", 8), DataType.Sound, 21),

		/** 通過音を使用するか : boolean型 **/
		SOUND_PASSING_USE(null,null, new Sound("sample", 8), DataType.Sound, 21),

		/**弾道落下を使用するか : boolean型**/
		GRAVITY_USE(null,null,false,DataType.Boolean),

		/**透過する・ブロック : String[]型*/
		THROUGH_BLOCK(null,null, new String[] {},DataType.StringArray),
		/**透過するエンティティ : String[]型*/
		THROUGH_ENTITY(null,null, new String[] {},DataType.StringArray),


		;

		/*
		エンティティの設定項目
		 エフェクト：着弾時・飛翔中(エンティティに当たった時に付与する効果)
		 飛翔中のエフェクトの効果(音などを追加してもいいかも
		 弾道落下：true/false・配列とその中の数式
		 威力減衰：true/false・配列とその中の数式
		 モデル
		 近接信管・反応するエンティティ
		 誘導：true/false・手動/ロックオン/継続ロックオン・反応するエンティティ
		 */

		public static final int BULLET_INFO = 1;
		public static final int BULLET_HIT_DAMAGE = 2;
		public static final int BULLET_HIT_KNOCKBACK = 3;
		public static final int BULLET_EXP_DAMAGE = 4;
		public static final int BULLET_EXP_KNOCKBACK = 5;

		/** カテゴリなし */
		private BulletDataList(Float min, Float max, Object defaultValue, DataType type) {
			this(min, max, defaultValue, type, -1);
		}

		/** カテゴリ付き */
		private BulletDataList(Float min, Float max, Object defaultValue, DataType type, int cate) {
			Max = max;
			Min = min;
			Default = defaultValue;
			Type = type;
			Cate = cate;
		}

		Float Max;
		Float Min;
		Object Default;
		DataType Type;
		int Cate;

		/**登録名を返す*/
		public String getName() {
			return this.toString();
		}
		/**型を返す*/
		public DataType getType() {
			return Type;
		}
		/**データを返す*/
		public Object getData(BulletData d) {
			return d.Data.get(this.toString());
		}
		/**Nameからデータを返す*/
		public Object getData(BulletData d,String Name) {
			return d.Data.get(Name);
		}
		/**初期値を返す*/
		public Object getDefaultValue() {
			return Default;
		}
		/**カテゴリを返す*/
		public int getCate() {
			return Cate;
		}
		/**データを設定する nullは上書きしない*/
		public void setData(BulletData d,Object obj) {
			if (obj != null){
				d.Data.replace(this.toString(), obj);
			}
		}

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}
	}
	public ItemInfo getItemInfo(){
		return (ItemInfo) this.getDataObject(GunDataList.ITEM_INFO);
	}

	/** 初期値*/
	public BulletData() {
		for (BulletDataList data : BulletDataList.values()) {
			Data.put(data.getName(), data.getDefaultValue());
		}
	}

	static final String headName = "bullet_";
	/** JsonStringからデータを読み込む */
	public BulletData(String json) {
		JsonWrapper wrapper = new JsonWrapper(json);
		for (BulletDataList data : BulletDataList.values()) {
			Data.put(data.getName(), wrapper.getObject(data));
		}
	}
}
