package types;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;

public class GunData {

	/**エディタのみで使用するデータ*/
	public boolean UseSneakRecoil = false;
	public boolean UseADSRecoil = false;
	public boolean UseADSSneakRecoil = false;

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
		/** リロード ; リロードにtickかかる : int型 **/
		RELOAD_TIME("Reload",20 , "int" ,0),
		/** レート ; レートtick間隔で発射する : int型 **/
		RATE("Rate",1 , "int" ,0,1F),
		/** 装弾数 : int型 **/
		MAGAZINE_NUMBER("MagazineNumber",1 , "int" ,0 ,1F),
		/** 発射数 : int型 **/
		BULLET_NUMBER("ShootNumner",1 ,"int" ,0 ,1F),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY("Accuracy",0F ,"float" ,0 ,0F),
		/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ADS_ACCURACY("ADSAccuracy",0F ,"float" ,0 ,0F),

		/** Yawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_YAW_RECOIL_BASE("MIN_YawRecoilBase",0F ,"float" ,1),
		/** Yawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_YAW_RECOIL_SPREAD("MIN_YawRecoilSpread",0F ,"float" ,1 ,0F),
		/** Pitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_PITCH_RECOIL_BASE("MIN_PitchRecoilBase",0F ,"float" ,1),
		/** Pitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_PITCH_RECOIL_SPREAD("MIN_PitchRecoilSpread",0F ,"float" ,1 ,0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		DEFAULT_RECOIL_TIME("DefaultRecoilTime",1 ,"int", 9 ,1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		DEFAULT_RECOIL_RETURN("DefaultRecoilReturn",0F ,"float" ,9 ,0F),

		/** スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_SNEAK_YAW_RECOIL_BASE("MIN_SneakYawRecoilBase",0F ,"float" ,2),
		/** スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_SNEAK_YAW_RECOIL_SPREAD("MIN_SneakYawRecoilSpread",0F ,"float" ,2 ,0F),
		/** スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_SNEAK_PITCH_RECOIL_BASE("MIN_SneakPitchRecoilBase",0F ,"float" ,2),
		/** スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_SNEAK_PITCH_RECOIL_SPREAD("MIN_SneakPitchRecoilSpread",0F ,"float" ,2 ,0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		SNEAK_RECOIL_TIME("SneakRecoilTime",1 ,"int", 10 ,1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		SNEAK_RECOIL_RETURN("SneakRecoilReturn",0F ,"float" ,10 ,0F),

		/** ADS時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_YAW_RECOIL_BASE("MIN_ADSYawRecoilBase",0F ,"float" ,3),
		/** ADS時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_YAW_RECOIL_SPREAD("MIN_ADSYawRecoilSpread",0F ,"float" ,3 ,0F),
		/** ADS時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_PITCH_RECOIL_BASE("MIN_ADSPitchRecoilBase",0F ,"float" ,3),
		/** ADS時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_PITCH_RECOIL_SPREAD("MIN_ADSPitchRecoilSpread",0F ,"float" ,3 ,0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		ADS_RECOIL_TIME("ADSRecoilTime",1 ,"int", 11 ,1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		ADS_RECOIL_RETURN("ADSRecoilReturn",0F ,"float" ,11 ,0F),

		/** ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_SNEAK_YAW_RECOIL_BASE("MIN_ADSSneakYawRecoilBase",0F ,"float" ,4),
		/** ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_SNEAK_YAW_RECOIL_SPREAD("MIN_ADSSneakYawRecoilSpread",0F ,"float" ,4 ,0F),
		/** ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_SNEAK_PITCH_RECOIL_BASE("MIN_ADSSneakPitchRecoilBase",0F ,"float" ,4),
		/** ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_SNEAK_PITCH_RECOIL_SPREAD("MIN_ADSSneakPitchRecoilSpread",0F ,"float" ,4 ,0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		ADS_SNEAK_RECOIL_TIME("ADSSneakRecoilTime",1 ,"int", 12 ,1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		ADS_SNEAK_RECOIL_RETURN("ADSSneakRecoilReturn",0F ,"float" ,12 ,0F),

		/** Yawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_YAW_RECOIL_BASE("MAX_YawRecoilBase",0F ,"float" ,5),
		/** Yawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_YAW_RECOIL_SPREAD("MAX_YawRecoilSpread",0F ,"float" ,5 ,0F),
		/** Pitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_PITCH_RECOIL_BASE("MAX_PitchRecoilBase",0F ,"float" ,5),
		/** Pitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_PITCH_RECOIL_SPREAD("MAX_PitchRecoilSpread",0F ,"float" ,5 ,0F),

		/** スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_SNEAK_YAW_RECOIL_BASE("MAX_SneakYawRecoilBase",0F ,"float" ,6),
		/** スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_SNEAK_YAW_RECOIL_SPREAD("MAX_SneakYawRecoilSpread",0F ,"float" ,6 ,0F),
		/** スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_SNEAK_PITCH_RECOIL_BASE("MAX_SneakPitchRecoilBase",0F ,"float" ,6),
		/** スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_SNEAK_PITCH_RECOIL_SPREAD("MAX_SneakPitchRecoilSpread",0F ,"float" ,6 ,0F),

		/** ADS時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_YAW_RECOIL_BASE("MAX_ADSYawRecoilBase",0F ,"float" ,7),
		/** ADS時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_YAW_RECOIL_SPREAD("MAX_ADSYawRecoilSpread",0F ,"float" ,7 ,0F),
		/** ADS時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_PITCH_RECOIL_BASE("MAX_ADSPitchRecoilBase",0F ,"float" ,7),
		/** ADS時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_PITCH_RECOIL_SPREAD("MAX_ADSPitchRecoilSpread",0F ,"float" ,7 ,0F),

		/** ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_SNEAK_YAW_RECOIL_BASE("MAX_ADSSneakYawRecoilBase",0F ,"float" ,8),
		/** ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_SNEAK_YAW_RECOIL_SPREAD("MAX_ADSSneakYawRecoilSpread",0F ,"float" ,8 ,0F),
		/** ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_SNEAK_PITCH_RECOIL_BASE("MAX_ADSSneakPitchRecoilBase",0F ,"float" ,8),
		/** ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_SNEAK_PITCH_RECOIL_SPREAD("MAX_ADSSneakPitchRecoilSpread",0F ,"float" ,8 ,0F),

		/** 対人ダメージ倍率 : float型 **/
		PLAYER_DAMAGE_DIAMETER("playerDamageDiameter",1F ,"float" ,20 ,0F),
		/** 対MOBダメージ倍率 : float型 **/
		LIVING_DAMAGE_DIAMETER("livingDamageDiameter",1F ,"float" ,20 ,0F),
		/** 対地上兵器ダメージ倍率 : float型 **/
		TANK_DAMAGE_DIAMETER("tankDamageDiameter",1F ,"float" ,20 ,0F),
		/** 対航空機ダメージ倍率 : float型 **/
		AIRCRAFT_DAMAGE_DIAMETER("aircraftDamageDiameter",1F ,"float" ,20 ,0F),

		/** 発射音のファイル名 : string型 **/
		SOUND_SHOOT_NAME("SoundShootName","sample" ,"String" ,20),
		/** 発射音の距離 : float型 **/
		SOUND_SHOOT_RANGE("SoundShootRange",50F ,"float" ,20),
		/** 発射音のピッチ : float型 **/
		SOUND_SHOOT_PITCH("SoundShootPitch",1F ,"float" ,20),

		/** 使用する弾の名前 複数設定可能 : String配列型 **/
		TYPES_BULLETS("BulletNames", new String[] {},"String[]"),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {},"String[]"),;

		public static final int MIN_DEFAULT_RECOIL = 1;
		public static final int MIN_SNEAK_RECOIL = 2;
		public static final int MIN_ADS_RECOIL = 3;
		public static final int MIN_ADS_SNEAK_RECOIL = 4;
		public static final int MAX_DEFAULT_RECOIL = 5;
		public static final int MAX_SNEAK_RECOIL = 6;
		public static final int MAX_ADS_RECOIL = 7;
		public static final int MAX_ADS_SNEAK_RECOIL = 8;

		public static final int DAMAGE_DIAMETER = 20;
		public static final int SOUND_OPTION = 21;

		/**登録名*/
		private String name;
		/**初期値*/
		private Object defaultValue;
		/**カテゴリID : デフォルト=-1*/
		private int cate;
		/**Type*/
		private String types;
		/**最小値*/
		private Float min;

		/**コンストラクタ 表示名+データ+Type カテゴリはデフォルト*/
		GunDataList(String name, Object obj ,String types) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = -1;
			this.min = null;
			if (types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
				this.types = types;
			}
		}

		/**コンストラクタ +カテゴリ*/
		GunDataList(String name, Object obj,String types ,int cate) {
			this(name, obj, types);
			this.cate = cate;
		}

		/**最小値の設定*/
		GunDataList(String name, Object obj,String types ,int cate,float minimam){
			this(name, obj, types, cate);
			this.min = minimam;
		}
		/**最小値の設定*/
		GunDataList(String name, Object obj,String types ,float minimam){
			this(name, obj, types);
			this.min = minimam;
		}

		/**最小値を返す*/
		public Float getMin() {
			return min;
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
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
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
