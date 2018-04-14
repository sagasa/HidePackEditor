package types;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class BulletData extends DataBase{

	/**全データ*/
	HashMap<String,Object> Data = new HashMap<String,Object>();

	/**弾のデータ 初期値も同時に代入*/
	public enum BulletDataList implements EnumDataList{
		/** 登録名 : String型 全部小文字 **/
		SHORT_NAME("ShortName","name",DataType.String),
		/** 表示名 : String型 **/
		DISPLAY_NAME("DisplayName","name",DataType.String),
		/** アイテムのアイコン : String型 **/
		ICON("Icon","sanple",DataType.String),

		/** 装弾数 : int型 **/
		MAGAZINE_SIZE("MagazineSize",600,DataType.Int),

		/** スタックサイズ : int型 **/
		STACK_SIZE("StackSize",600,DataType.Int),

		/**弾の寿命 (tick) : int型**/
		BULLET_LIFE("bulletLife",600,DataType.Int),

		/**直撃の対人ダメージ : float型**/
		HIT_DAMAGE_PLAYER("playerDamage",0F,DataType.Float),
		/**直撃の対MOBダメージ : float型**/
		HIT_DAMAGE_LIVING("livingDamage",0F,DataType.Float),
		/**直撃の対地上兵器ダメージ : int型**/
		HIT_DAMAGE_TANK("tankDamage",0,DataType.Int),
		/**直撃の対航空機ダメージ : int型**/
		HIT_DAMAGE_AIR("aircraftDamage",0,DataType.Int),

		/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_PLAYER("playerKnockback",0F,DataType.Float),
		/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_LIVING("livingKnockback",0F,DataType.Float),
		/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_TANK("tankKnockback",0F,DataType.Float),
		/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_AIR("aircraftKnockback",0F,DataType.Float),

		/**爆風範囲 :int型**/
		EXP_RANGE("explosionRange",0,DataType.Int),

		/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_PLAYER("playerExplosionDamageBase",0F,DataType.Float),
		/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_PLAYER("playerExplosionDamageCoe",0F,DataType.Float),
		/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_LIVING("livingExplosionDamageBase",0F,DataType.Float),
		/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_LIVING("livingExplosionDamageCoe",0,DataType.Float),
		/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_TANK("tankExplosionDamageBase",0,DataType.Int),
		/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_TANK("tankExplosionDamageCoe",0,DataType.Int),
		/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_AIR("aircraftExplosionDamageBase",0,DataType.Int),
		/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_AIR("aircraftExplosionDamageCoe",0,DataType.Int),

		/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_PLAYER("playerExplosionKnockbackBase",0F,DataType.Float),
		/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_PLAYER("playerExplosionKnockbackCoe",0F,DataType.Float),
		/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_LIVING("livingExplosionKnockbackBase",0F,DataType.Float),
		/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_LIVING("livingExplosionKnockbackCoe",0F,DataType.Float),
		/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_TANK("tankExplosionKnockbackBase",0F,DataType.Float),
		/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_TANK("tankExplosionKnockbackCoe",0F,DataType.Float),
		/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_AIR("aircraftExplosionKnockbackBase",0F,DataType.Float),
		/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_AIR("aircraftExplosionKnockbackCoe",0F,DataType.Float),

		/**距離減衰を使用するか : boolean型**/
		DECAY_USE("useDecay",false,DataType.Boolean),

		/**弾道落下を使用するか : boolean型**/
		GRAVITY_USE("useGravity",false,DataType.Boolean),

		/**透過する・ブロック : String[]型*/
		THROUGH_BLOCK("throughBlock", new String[] {},DataType.StringArray),
		/**透過するエンティティ : String[]型*/
		THROUGH_ENTITY("throughEntity", new String[] {},DataType.StringArray),

		/**エンティティを貫通するか : boolean型**/
		BULLET_BOWERED("BulletPowered",false,DataType.Boolean),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {},DataType.StringArray),
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

		/**登録名*/
		private String name;
		/**初期値*/
		private Object defaultValue;
		/**カテゴリID : デフォルト=-1*/
		private int cate;
		/**Type*/
		private DataType types;

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
		this(null);
	}

	static final String headName = "bullet_";
	/** JsonStringからデータを読み込む */
	public BulletData(String json) {
		// 初期値を忘れずに
		Gson gson = new Gson();
		JsonWrapper w = new JsonWrapper(gson.fromJson(json, JsonObject.class));

		//マップに格納
		for (BulletDataList d:BulletDataList.values()){
			//System.out.println(d.getName()+"  "+d.getDefaultValue() + "  "+ w.getString("gun_"+d.getName(), d.getDefaultValue().toString()));
			switch (d.types){
			case Boolean:
				Data.put(d.getName(), w.getBoolean(headName+d.getName(),new Boolean (d.getDefaultValue().toString())));
			break;
			case String:
				Data.put(d.getName(), w.getString(headName+d.getName(),d.getDefaultValue().toString()));
			break;
			case Int:
				Data.put(d.getName(), w.getInt(headName+d.getName(), new Integer (d.getDefaultValue().toString())));
			break;
			case Float:
				Data.put(d.getName(), w.getFloat(headName+d.getName(), new Float (d.getDefaultValue().toString())));
			break;
			case StringArray:
				Data.put(d.getName(), w.getStringArray(headName+d.getName(), (String[]) d.getDefaultValue()));
			break;
			}
		}
	}
	/**JsonObjectを作成*/
	public String MakeJsonData(){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject JsonData = new JsonObject();
		for (BulletDataList d:BulletDataList.values()){
			switch (d.types){
			case Boolean:
				JsonData.addProperty(headName+d.getName(),new Boolean(d.getData(this).toString()));
			break;
			case String:
				JsonData.addProperty(headName+d.getName(),d.getData(this).toString());
			break;
			case Int:
				JsonData.addProperty(headName+d.getName(), new Integer (d.getData(this).toString()));
			break;
			case Float:
				JsonData.addProperty(headName+d.getName(), new Float (d.getData(this).toString()));
			break;
			case StringArray:
				JsonElement element =
			     gson.toJsonTree((String[])d.getData(this) , new TypeToken<String[]>() {}.getType());
				JsonData.add(headName+d.getName(), element.getAsJsonArray());
			break;
			}
		}
		return gson.toJson(JsonData);
	}
}
