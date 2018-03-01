package types;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;
import types.GunData.GunDataList;

public class BulletData {

	/**全データ*/
	HashMap<String,Object> Data = new HashMap<String,Object>();

	/**弾のデータ 初期値も同時に代入*/
	public enum BulletDataList {
		/** 登録名 : String型**/
		NAME("ShortName","name","String"),

		/**弾の寿命 (tick) : int型**/
		BULLET_LIFE("bulletLife",600,"int"),

		/**直撃の対人ダメージ : float型**/
		HIT_DAMAGE_PLAYER("playerDamage",0F,"float"),
		/**直撃の対MOBダメージ : float型**/
		HIT_DAMAGE_LIVING("livingDamage",0F,"float"),
		/**直撃の対地上兵器ダメージ : int型**/
		HIT_DAMAGE_TANK("tankDamage",0,"int"),
		/**直撃の対航空機ダメージ : int型**/
		HIT_DAMAGE_AIR("aircraftDamage",0,"int"),

		/**直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_PLAYER("playerKnockback",0F,"float"),
		/**直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型**/
		HIT_KNOCKBACK_LIVING("livingKnockback",0F,"float"),
		/**直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_TANK("tankKnockback",0F,"float"),
		/**直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型**/
		HIT_KNOCKBACK_AIR("aircraftKnockback",0F,"float"),

		/**爆風範囲 :int型**/
		EXP_RANGE("explosionRange",0,"int"),

		/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_PLAYER("playerExplosionDamageBase",0F,"float"),
		/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_PLAYER("playerExplosionDamageCoe",0F,"float"),
		/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_BASE_LIVING("livingExplosionDamageBase",0F,"float"),
		/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		EXP_DAMAGE_COE_LIVING("livingExplosionDamageCoe",0,"int"),
		/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_TANK("tankExplosionDamageBase",0,"int"),
		/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_TANK("tankExplosionDamageCoe",0,"int"),
		/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_BASE_AIR("aircraftExplosionDamageBase",0,"int"),
		/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		EXP_DAMAGE_COE_AIR("aircraftExplosionDamageCoe",0,"int"),

		/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_PLAYER("playerExplosionKnockbackBase",0F,"float"),
		/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_PLAYER("playerExplosionKnockbackCoe",0F,"float"),
		/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_BASE_LIVING("livingExplosionKnockbackBase",0F,"float"),
		/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		EXP_KNOCKACK_COE_LIVING("livingExplosionKnockbackCoe",0F,"float"),
		/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_TANK("tankExplosionKnockbackBase",0F,"float"),
		/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_TANK("tankExplosionKnockbackCoe",0F,"float"),
		/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_BASE_AIR("aircraftExplosionKnockbackBase",0F,"float"),
		/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		EXP_KNOCKACK_COE_AIR("aircraftExplosionKnockbackCoe",0F,"float"),

		/**距離減衰を使用するか : boolean型**/
		DECAY_USE("useDecay",false,"boolean"),

		/**弾道落下を使用するか : boolean型**/
		GRAVITY_USE("useGravity",false,"boolean"),

		/**透過する・ブロック : String[]型*/
		THROUGH_BLOCK("throughBlock", new String[] {},"String[]"),
		/**透過するエンティティ : String[]型*/
		THROUGH_ENTITY("throughEntity", new String[] {},"String[]"),

		/**エンティティを貫通するか : boolean型**/
		BULLET_BOWERED("BulletPowered",false,"boolean"),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {},"String[]"),
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
		private String types;

		/**コンストラクタ 表示名+データ+Type カテゴリはデフォルト*/
		BulletDataList(String name, Object obj ,String types) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = -1;
			if (types.equals("boolean")||types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
				this.types = types;
			}
		}

		/**コンストラクタ 表示名+データ+Type+カテゴリ*/
		BulletDataList(String name, Object obj,String types ,int cate) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = cate;
			//一応チェック
			if (types.equals("boolean")||types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
				this.types = types;
			}

		}
		/**登録名を返す*/
		public String getName() {
			return name;
		}
		/**型を返す*/
		public String getType() {
			return types;
		}
		/**データを返す*/
		public Object getData(BulletData d) {
			return d.Data.get(this.getName());
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
				d.Data.replace(this.getName(), obj);
			}
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
			case "boolean":
				Data.put(d.getName(), w.getBoolean(headName+d.getName(),new Boolean (d.getDefaultValue().toString())));
			break;
			case "String":
				Data.put(d.getName(), w.getString(headName+d.getName(),d.getDefaultValue().toString()));
			break;
			case "int":
				Data.put(d.getName(), w.getInt(headName+d.getName(), new Integer (d.getDefaultValue().toString())));
			break;
			case "float":
				Data.put(d.getName(), w.getFloat(headName+d.getName(), new Float (d.getDefaultValue().toString())));
			break;
			case "String[]":
				Data.put(d.getName(), w.getStringArray(headName+d.getName(), (String[]) d.getDefaultValue()));
			break;
			}
		}
	}
	/**JsonObjectを作成*/
	public String MakeJsonData(){
		Gson gson = new Gson();
		JsonObject JsonData = new JsonObject();
		for (BulletDataList d:BulletDataList.values()){
			switch (d.types){
			case "boolean":
				JsonData.addProperty(headName+d.getName(),new Boolean(d.getData(this).toString()));
			break;
			case "String":
				JsonData.addProperty(headName+d.getName(),d.getData(this).toString());
			break;
			case "int":
				JsonData.addProperty(headName+d.getName(), new Integer (d.getData(this).toString()));
			break;
			case "float":
				JsonData.addProperty(headName+d.getName(), new Float (d.getData(this).toString()));
			break;
			case "String[]":
				JsonElement element =
			     gson.toJsonTree((String[])d.getData(this) , new TypeToken<String[]>() {}.getType());
				JsonData.add(headName+d.getName(), element.getAsJsonArray());
			break;
			}
		}
		return gson.toJson(JsonData);
	}
}
