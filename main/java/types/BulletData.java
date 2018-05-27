package types;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class BulletData extends DataBase{

	/**弾のデータ 初期値も同時に代入*/
	public enum BulletDataList implements EnumDataList{
		/** 登録名 : String型 全部小文字 **/
		SHORT_NAME("ShortName","name",DataType.String),
		/** 表示名 : String型 **/
		DISPLAY_NAME("DisplayName","name",DataType.String),
		/** アイテムのアイコン : String型 **/
		ICON("Icon","sanple",DataType.String),

		/** 装弾数 : int型 **/
		MAGAZINE_SIZE("MagazineSize",10,DataType.Int,1),

		/** スタックサイズ : int型 **/
		STACK_SIZE("StackSize",4,DataType.Int,1),

		/**弾の寿命 (tick) : int型**/
		BULLET_LIFE("bulletLife",600,DataType.Int,1),

		/**弾の貫通力 : int型**/
		BULLET_POWER("bulletPower",1,DataType.Int,1,1f),

		/**リロード時にマガジンが破棄されるか : boolean型**/
		MAGAZINE_BREAK("BreakOnReload",true,DataType.Boolean),

		/**直撃の対人ダメージ : float型**/
		HIT_DAMAGE_PLAYER("playerDamage",0F,DataType.Float,2),
		/**直撃の対MOBダメージ : float型**/
		HIT_DAMAGE_LIVING("livingDamage",0F,DataType.Float,2),
		/**直撃の対地上兵器ダメージ : int型**/
		HIT_DAMAGE_TANK("tankDamage",0,DataType.Int,2),
		/**直撃の対航空機ダメージ : int型**/
		HIT_DAMAGE_AIR("aircraftDamage",0,DataType.Int,2),

		/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_PLAYER("playerKnockback",0F,DataType.Float,3),
		/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_LIVING("livingKnockback",0F,DataType.Float,3),
		/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_TANK("tankKnockback",0F,DataType.Float,3),
		/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_AIR("aircraftKnockback",0F,DataType.Float,3),

		/**爆風範囲 :int型**/
		EXP_RANGE("explosionRange",0,DataType.Int,4),

		/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_PLAYER("playerExplosionDamageBase",0F,DataType.Float,4),
		/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_PLAYER("playerExplosionDamageCoe",0F,DataType.Float,4),
		/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_LIVING("livingExplosionDamageBase",0F,DataType.Float,4),
		/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_LIVING("livingExplosionDamageCoe",0,DataType.Float,4),
		/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_TANK("tankExplosionDamageBase",0,DataType.Int,4),
		/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_TANK("tankExplosionDamageCoe",0,DataType.Int,4),
		/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_AIR("aircraftExplosionDamageBase",0,DataType.Int,4),
		/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_AIR("aircraftExplosionDamageCoe",0,DataType.Int,4),

		/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_PLAYER("playerExplosionKnockbackBase",0F,DataType.Float,5),
		/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_PLAYER("playerExplosionKnockbackCoe",0F,DataType.Float,5),
		/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_LIVING("livingExplosionKnockbackBase",0F,DataType.Float,5),
		/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_LIVING("livingExplosionKnockbackCoe",0F,DataType.Float,5),
		/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_TANK("tankExplosionKnockbackBase",0F,DataType.Float,5),
		/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_TANK("tankExplosionKnockbackCoe",0F,DataType.Float,5),
		/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_AIR("aircraftExplosionKnockbackBase",0F,DataType.Float,5),
		/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_AIR("aircraftExplosionKnockbackCoe",0F,DataType.Float,5),

		/**対人ダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_START_PLAYER("DecayPlayerDamageStart",0F,DataType.Float,10),
		/**対人ダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_COE_PLAYER("DecayPlayerDamageCoe",0F,DataType.Float,10),
		/**対人ダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_MAX_PLAYER("DecayPlayerDamageMax",0F,DataType.Float,10),

		/**対MOBダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_START_LIVING("DecayLivingDamageStart",0F,DataType.Float,10),
		/**対MOBダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_COE_LIVING("DecayLivingDamageCoe",0F,DataType.Float,10),
		/**対MOBダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float**/
		DECAY_DAMAGE_MAX_LIVING("DecayLivingDamageMax",0F,DataType.Float,10),

		/** 着弾音を使用するか : boolean型 **/
		SOUND_HIT_GROUND_USE("SoundHitGroundUse", true, DataType.Boolean, 21),
		/** 着弾音のファイル名 : string型 **/
		SOUND_HIT_GROUND_NAME("SoundHitGroundName", "BulletDirt", DataType.String, 21),
		/** 着弾音の距離 : float型 **/
		SOUND_HIT_GROUND_RANGE("SoundHitGroundRange", 5F, DataType.Float, 21),
		/** 着弾音の音量 : float型 **/
		SOUND_HIT_GROUND_VOL("SoundHitGroundVol", 1F, DataType.Float, 21),
		/** 着弾音のピッチ : float型 **/
		SOUND_HIT_GROUND_PITCH("SoundHitGroundPitch", 1F, DataType.Float, 21),

		/** エンティティ着弾音を使用するか : boolean型 **/
		SOUND_HIT_ENTITY_USE("SoundHitEntityUse", false, DataType.Boolean, 21),
		/** エンティティ着弾音のファイル名 : string型 **/
		SOUND_HIT_ENTITY_NAME("SoundHitEntityName", "sample", DataType.String, 21),
		/** エンティティ着弾音の距離 : float型 **/
		SOUND_HIT_ENTITY_RANGE("SoundHitEntityRange", 10F, DataType.Float, 21),
		/** エンティティ着弾音の音量 : float型 **/
		SOUND_HIT_ENTITY_VOL("SoundHitEntityVol", 1F, DataType.Float, 21),
		/** エンティティ着弾音のピッチ : float型 **/
		SOUND_HIT_ENTITY_PITCH("SoundHitEntityPitch", 1F, DataType.Float, 21),

		/** 通過音を使用するか : boolean型 **/
		SOUND_PASSING_USE("SoundPassingUse", true, DataType.Boolean, 21),
		/** 通過音のファイル名 : string型 **/
		SOUND_PASSING_NAME("SoundPassingName", "BulletDirt", DataType.String, 21),
		/** 通過音の距離 : float型 **/
		SOUND_PASSING_RANGE("SoundPassingRange", 2F, DataType.Float, 21),
		/** 通過音の音量 : float型 **/
		SOUND_PASSING_VOL("SoundPassingVol", 1F, DataType.Float, 21),
		/** 通過音のピッチ : float型 **/
		SOUND_PASSING_PITCH("SoundPassingPitch", 1F, DataType.Float, 21),

		/**弾道落下を使用するか : boolean型**/
		GRAVITY_USE("useGravity",false,DataType.Boolean),

		/**透過する・ブロック : String[]型*/
		THROUGH_BLOCK("throughBlock", new String[] {},DataType.Object),
		/**透過するエンティティ : String[]型*/
		THROUGH_ENTITY("throughEntity", new String[] {},DataType.Object),

		/**エンティティを貫通するか : boolean型**/
		BULLET_BOWERED("BulletPowered",false,DataType.Boolean),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {},DataType.Object),
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

		/**登録名*/
		private String name;
		/**初期値*/
		private Object defaultValue;
		/**カテゴリID : デフォルト=-1*/
		private int cate;
		/**Type*/
		private DataType types;
		/** 最小値 */
		private Float min;

		/**コンストラクタ 表示名+データ+Type カテゴリはデフォルト*/
		BulletDataList(String name, Object obj ,DataType types) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = -1;
			this.types = types;
		}


		/**コンストラクタ 表示名+データ+Type+カテゴリ*/
		BulletDataList(String name, Object obj,DataType types ,int cate) {
			this(name, obj, types);
			this.cate = cate;
		}
		/** 最小値の設定 */
		BulletDataList(String name, Object obj, DataType types, int cate, float minimam) {
			this(name, obj, types, cate);
			this.min = minimam;
		}

		/** 最小値の設定 */
		BulletDataList(String name, Object obj, DataType types, float minimam) {
			this(name, obj, types);
			this.min = minimam;
		}
		/**登録名を返す*/
		public String getName() {
			return name;
		}
		/**型を返す*/
		public DataType getType() {
			return types;
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
			return defaultValue;
		}
		/**カテゴリを返す*/
		public int getCate() {
			return cate;
		}
		/**データを設定する nullは上書きしない*/
		public void setData(BulletData d,Object obj) {
			if (obj != null){
				d.Data.replace(this.toString(), obj);
			}
		}

		@Override
		public Float getMin() {
			return null;
		}

		@Override
		public Float getMax() {
			return null;
		}
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
		this();
		Gson gson = new Gson();
		Data.putAll(gson.fromJson(json, new TypeToken<HashMap<String, Object>>() {
		}.getType()));
	}
}
