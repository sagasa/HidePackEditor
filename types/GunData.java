package types;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;

public class GunData {

	/**エディタのみで使用するデータ*/
	public boolean[] UseRecoil = {false,false,false};

	/**全データ*/
	HashMap<String,Object> Data = new HashMap<String,Object>();

	/**弾のデータ 初期値も同時に代入*/
	public enum GunDataList{
		/** 登録名 : String型 全部小文字 **/
		SHORT_NAME("ShortName","name","String"),
		/** 表示名 : String型 **/
		DISPLAY_NAME("DisplayName","name","String"),
		/** アイテムのアイコン : String型 **/
		ICON("Icon","sanple","String"),

		/** プレイヤーの移動速度 : デフォルトは1 : float型 **/
		PLAYER_SPEED("PlayerSpeed",1F ,"float" ,0),
		/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
		BULLET_SPEED("BulletSpeed",1F , "float" ,0),
		/** レート ; レートtick間隔で発射する : int型 **/
		RATE("Rate",1 , "int" ,0),
		/** 装弾数 : int型 **/
		MAGAZINE_SIZE("MagazineSize",1 , "int" ,0),
		/** 発射数 : int型 **/
		BULLET_NUMBER("ShootNumner",1 ,"int" ,0),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY("Accuracy",0F ,"float" ,0),
		/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ADS_ACCURACY("ADSAccuracy",0F ,"float" ,0),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		RECOIL_TIME("RecoilTime",1 ,"int" ,1),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		RECOIL_RETURN("RecoilReturn",0F ,"float" ,1),
		/** Yawの反動 : 反動の中央値(角度°) : float型 **/
		YAW_RECOIL_BASE("YawRecoilBase",0F ,"float" ,1),
		/** Yawの反動 : 反動の拡散値(角度°) : float型 **/
		YAW_RECOIL_SPREAD("YawRecoilSpread",0F ,"float" ,1),
		/** Pitchの反動 : 反動の中央値(角度°) : float型 **/
		PITCH_RECOIL_BASE("PitchRecoilBase",0F ,"float" ,1),
		/** Pitchの反動 : 反動の拡散値(角度°) : float型 **/
		PITCH_RECOIL_SPREAD("PitchRecoilSpread",0F ,"float" ,1),

		/** スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		SNEAK_YAW_RECOIL_BASE("SneakYawRecoilBase",0F ,"float" ,2),
		/** スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		SNEAK_YAW_RECOIL_SPREAD("SneakYawRecoilSpread",0F ,"float" ,2),
		/** スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		SNEAK_PITCH_RECOIL_BASE("SneakPitchRecoilBase",0F ,"float" ,2),
		/** スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		SNEAK_PITCH_RECOIL_SPREAD("SneakPitchRecoilSpread",0F ,"float" ,2),

		/** ADS時のYawの反動 : 反動の中央値(角度°) : float型 **/
		ADS_YAW_RECOIL_BASE("ADSYawRecoilBase",0F ,"float" ,3),
		/** ADS時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		ADS_YAW_RECOIL_SPREAD("ADSYawRecoilSpread",0F ,"float" ,3),
		/** ADS時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		ADS_PITCH_RECOIL_BASE("ADSPitchRecoilBase",0F ,"float" ,3),
		/** ADS時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		ADS_PITCH_RECOIL_SPREAD("ADSPitchRecoilSpread",0F ,"float" ,3),

		/** ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		ADS_SNEAK_YAW_RECOIL_BASE("ADSSneakYawRecoilBase",0F ,"float" ,4),
		/** ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		ADS_SNEAK_YAW_RECOIL_SPREAD("ADSSneakYawRecoilSpread",0F ,"float" ,4),
		/** ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		ADS_SNEAK_PITCH_RECOIL_BASE("ADSSneakPitchRecoilBase",0F ,"float" ,4),
		/** ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		ADS_SNEAK_PITCH_RECOIL_SPREAD("ADSSneakPitchRecoilSpread",0F ,"float" ,4),

		/** 対人ダメージ倍率 : float型 **/
		PLAYER_DAMAGE_DIAMETER("playerDamageDiameter",1F ,"float" ,5),
		/** 対MOBダメージ倍率 : float型 **/
		LIVING_DAMAGE_DIAMETER("livingDamageDiameter",1F ,"float" ,5),
		/** 対地上兵器ダメージ倍率 : float型 **/
		TANK_DAMAGE_DIAMETER("tankDamageDiameter",1F ,"float" ,5),
		/** 対航空機ダメージ倍率 : float型 **/
		AIRCRAFT_DAMAGE_DIAMETER("aircraftDamageDiameter",1F ,"float" ,5),

		/** 使用する弾の名前 複数設定可能 : String配列型 **/
		TYPES_BULLETS("BulletNames", new String[] {},"String[]"),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {},"String[]"),;

		;
		/**登録名*/
		private String name;
		/**初期値*/
		private Object defaultValue;
		/**カテゴリID : デフォルト=-1*/
		private int cate;
		/**Type*/
		private String types;

		/**コンストラクタ 表示名+データ+Type カテゴリはデフォルト*/
		GunDataList(String name, Object obj ,String types) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = -1;
			if (types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
				this.types = types;
			}
		}

		/**コンストラクタ 表示名+データ+Type+カテゴリ*/
		GunDataList(String name, Object obj,String types ,int cate) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = cate;
			//一応チェック
			if (types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
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
		public Object getData(GunData d) {
			return d.Data.get(this.getName());
		}
		/**Nameからデータを返す*/
		public Object getData(GunData d,String Name) {
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
		public void setData(GunData d,Object obj) {
			if (obj != null){
				d.Data.replace(this.getName(), obj);
			}
		}
	}


	/** 初期値*/
	public GunData() {
		this(null);
	}

	static final String headName = "gun_";
	/** JsonStringからデータを読み込む */
	public GunData(String json) {
		// 初期値を忘れずに
		Gson gson = new Gson();
		JsonWrapper w = new JsonWrapper(gson.fromJson(json, JsonObject.class));

		//マップに格納
		for (GunDataList d:GunDataList.values()){
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
		for (GunDataList d:GunDataList.values()){
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
