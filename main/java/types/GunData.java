package types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class GunData extends DataBase {

	/** エディタのみで使用するデータ */
	public boolean UseSneakRecoil = false;
	public boolean UseADSRecoil = false;
	public boolean UseADSSneakRecoil = false;

	/** 弾のデータ 初期値も同時に代入 */
	public enum GunDataList implements EnumDataList {
		/** 登録名 : String型 全部小文字 **/
		SHORT_NAME("ShortName", "name", DataType.String),
		/** 表示名 : String型 **/
		DISPLAY_NAME("DisplayName", "name", DataType.String),
		/** アイテムのアイコン : String型 **/
		ICON("Icon", "sanple", DataType.String),

		/** プレイヤーの移動速度 : デフォルトは1 : float型 **/
		PLAYER_SPEED("PlayerSpeed", 1F, DataType.Float, 0, 0F),
		/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
		BULLET_SPEED("BulletSpeed", 1F, DataType.Float, 0, 0F),
		/** リロード ; リロードにtickかかる : int型 **/
		RELOAD_TIME("Reload", 20, DataType.Int, 0, 1F),
		/** レート ; レートtick間隔で発射する : int型 **/
		RATE("Rate", 1, DataType.Int, 0, 1F),
		/** 射撃モード : String配列型 **/
		FIRE_MODE("FireMode", new String[] { "semiauto" }, DataType.StringArray, 22),
		/** 装弾数 : int型 **/
		MAGAZINE_NUMBER("MagazineNumber", 1, DataType.Int, 0, 1F),
		/** 発射数 : int型 **/
		BULLET_NUMBER("ShootNumner", 1, DataType.Int, 0, 1F),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY("Accuracy", 0F, DataType.Float, 0, 0F),
		/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ADS_ACCURACY("ADSAccuracy", 0F, DataType.Float, 0, 0F),

		/** Yawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_YAW_RECOIL_BASE("MIN_YawRecoilBase", 0F, DataType.Float, 1),
		/** Yawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_YAW_RECOIL_SPREAD("MIN_YawRecoilSpread", 0F, DataType.Float, 1, 0F),
		/** Pitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_PITCH_RECOIL_BASE("MIN_PitchRecoilBase", 0F, DataType.Float, 1),
		/** Pitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_PITCH_RECOIL_SPREAD("MIN_PitchRecoilSpread", 0F, DataType.Float, 1, 0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		DEFAULT_RECOIL_TIME("DefaultRecoilTime", 1, DataType.Int, 9, 1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		DEFAULT_RECOIL_RETURN("DefaultRecoilReturn", 0F, DataType.Float, 9, 0F),
		/** 1発当たりのリコイルパワーの増加数 : int型 **/
		DEFAULT_RECOILPOWER_SHOOT("RecoilPowerAddPerShoot", 0, DataType.Int, 9, 0F),
		/** 1tick当たりのリコイルパワーの減少数 : int型 **/
		DEFAULT_RECOILPOWER_TICK("RecoilPowerRemovePerTick", 0, DataType.Int, 9, 0F),

		/** スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_SNEAK_YAW_RECOIL_BASE("MIN_SneakYawRecoilBase", 0F, DataType.Float, 2),
		/** スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_SNEAK_YAW_RECOIL_SPREAD("MIN_SneakYawRecoilSpread", 0F, DataType.Float, 2, 0F),
		/** スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_SNEAK_PITCH_RECOIL_BASE("MIN_SneakPitchRecoilBase", 0F, DataType.Float, 2),
		/** スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_SNEAK_PITCH_RECOIL_SPREAD("MIN_SneakPitchRecoilSpread", 0F, DataType.Float, 2, 0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		SNEAK_RECOIL_TIME("SneakRecoilTime", 1, DataType.Int, 10, 1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		SNEAK_RECOIL_RETURN("SneakRecoilReturn", 0F, DataType.Float, 10, 0F),
		/** 1発当たりのリコイルパワーの増加数 : int型 **/
		SNEAK_RECOILPOWER_SHOOT("RecoilPowerAddPerShoot", 0, DataType.Int, 10, 0F),
		/** 1tick当たりのリコイルパワーの減少数 : int型 **/
		SNEAK_RECOILPOWER_TICK("RecoilPowerRemovePerTick", 0, DataType.Int, 10, 0F),

		/** ADS時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_YAW_RECOIL_BASE("MIN_ADSYawRecoilBase", 0F, DataType.Float, 3),
		/** ADS時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_YAW_RECOIL_SPREAD("MIN_ADSYawRecoilSpread", 0F, DataType.Float, 3, 0F),
		/** ADS時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_PITCH_RECOIL_BASE("MIN_ADSPitchRecoilBase", 0F, DataType.Float, 3),
		/** ADS時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_PITCH_RECOIL_SPREAD("MIN_ADSPitchRecoilSpread", 0F, DataType.Float, 3, 0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		ADS_RECOIL_TIME("ADSRecoilTime", 1, DataType.Int, 11, 1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		ADS_RECOIL_RETURN("ADSRecoilReturn", 0F, DataType.Float, 11, 0F),
		/** 1発当たりのリコイルパワーの増加数 : int型 **/
		ADS_RECOILPOWER_SHOOT("RecoilPowerAddPerShoot", 0, DataType.Int, 11, 0F),
		/** 1tick当たりのリコイルパワーの減少数 : int型 **/
		ADS_RECOILPOWER_TICK("RecoilPowerRemovePerTick", 0, DataType.Int, 11, 0F),

		/** ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_SNEAK_YAW_RECOIL_BASE("MIN_ADSSneakYawRecoilBase", 0F, DataType.Float, 4),
		/** ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_SNEAK_YAW_RECOIL_SPREAD("MIN_ADSSneakYawRecoilSpread", 0F, DataType.Float, 4, 0F),
		/** ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MIN_ADS_SNEAK_PITCH_RECOIL_BASE("MIN_ADSSneakPitchRecoilBase", 0F, DataType.Float, 4),
		/** ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MIN_ADS_SNEAK_PITCH_RECOIL_SPREAD("MIN_ADSSneakPitchRecoilSpread", 0F, DataType.Float, 4, 0F),

		/** 反動の速さ : 反動を適応する時間(tick) : int型 **/
		ADS_SNEAK_RECOIL_TIME("ADSSneakRecoilTime", 1, DataType.Int, 12, 1F),
		/** 反動の戻り率 : 反動から復帰する割合 : float型 **/
		ADS_SNEAK_RECOIL_RETURN("ADSSneakRecoilReturn", 0F, DataType.Float, 12, 0F),
		/** 1発当たりのリコイルパワーの増加数 : int型 **/
		ADS_SNEAK_RECOILPOWER_SHOOT("RecoilPowerAddPerShoot", 0, DataType.Int, 12, 0F),
		/** 1tick当たりのリコイルパワーの減少数 : int型 **/
		ADS_SNEAK_RECOILPOWER_TICK("RecoilPowerRemovePerTick", 0, DataType.Int, 12, 0F),

		/** Yawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_YAW_RECOIL_BASE("MAX_YawRecoilBase", 0F, DataType.Float, 5),
		/** Yawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_YAW_RECOIL_SPREAD("MAX_YawRecoilSpread", 0F, DataType.Float, 5, 0F),
		/** Pitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_PITCH_RECOIL_BASE("MAX_PitchRecoilBase", 0F, DataType.Float, 5),
		/** Pitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_PITCH_RECOIL_SPREAD("MAX_PitchRecoilSpread", 0F, DataType.Float, 5, 0F),

		/** スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_SNEAK_YAW_RECOIL_BASE("MAX_SneakYawRecoilBase", 0F, DataType.Float, 6),
		/** スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_SNEAK_YAW_RECOIL_SPREAD("MAX_SneakYawRecoilSpread", 0F, DataType.Float, 6, 0F),
		/** スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_SNEAK_PITCH_RECOIL_BASE("MAX_SneakPitchRecoilBase", 0F, DataType.Float, 6),
		/** スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_SNEAK_PITCH_RECOIL_SPREAD("MAX_SneakPitchRecoilSpread", 0F, DataType.Float, 6, 0F),

		/** ADS時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_YAW_RECOIL_BASE("MAX_ADSYawRecoilBase", 0F, DataType.Float, 7),
		/** ADS時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_YAW_RECOIL_SPREAD("MAX_ADSYawRecoilSpread", 0F, DataType.Float, 7, 0F),
		/** ADS時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_PITCH_RECOIL_BASE("MAX_ADSPitchRecoilBase", 0F, DataType.Float, 7),
		/** ADS時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_PITCH_RECOIL_SPREAD("MAX_ADSPitchRecoilSpread", 0F, DataType.Float, 7, 0F),

		/** ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_SNEAK_YAW_RECOIL_BASE("MAX_ADSSneakYawRecoilBase", 0F, DataType.Float, 8),
		/** ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_SNEAK_YAW_RECOIL_SPREAD("MAX_ADSSneakYawRecoilSpread", 0F, DataType.Float, 8, 0F),
		/** ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型 **/
		MAX_ADS_SNEAK_PITCH_RECOIL_BASE("MAX_ADSSneakPitchRecoilBase", 0F, DataType.Float, 8),
		/** ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型 **/
		MAX_ADS_SNEAK_PITCH_RECOIL_SPREAD("MAX_ADSSneakPitchRecoilSpread", 0F, DataType.Float, 8, 0F),

		/** 対人ダメージ加算値 : float型 **/
		PLAYER_DAMAGE_ADDITION("playerDamageAddition", 0F, DataType.Float, 20),
		/** 対MOBダメージ加算値 : float型 **/
		LIVING_DAMAGE_ADDITION("livingDamageAddition", 0F, DataType.Float, 20),
		/** 対地上兵器ダメージ加算値 : int型 **/
		TANK_DAMAGE_ADDITION("tankDamageAddition", 0, DataType.Int, 20),
		/** 対航空機ダメージ加算値 : int型 **/
		AIRCRAFT_DAMAGE_ADDITION("aircraftDamageAddition", 0, DataType.Int, 20),
		/** 対人ダメージ倍率 : float型 **/
		PLAYER_DAMAGE_DIAMETER("playerDamageDiameter", 1F, DataType.Float, 20, 0F),
		/** 対MOBダメージ倍率 : float型 **/
		LIVING_DAMAGE_DIAMETER("livingDamageDiameter", 1F, DataType.Float, 20, 0F),
		/** 対地上兵器ダメージ倍率 : float型 **/
		TANK_DAMAGE_DIAMETER("tankDamageDiameter", 1F, DataType.Float, 20, 0F),
		/** 対航空機ダメージ倍率 : float型 **/
		AIRCRAFT_DAMAGE_DIAMETER("aircraftDamageDiameter", 1F, DataType.Float, 20, 0F),

		/** 発射音のファイル名 : string型 **/
		SOUND_SHOOT_NAME("SoundShootName", "sample", DataType.String, 21),
		/** 発射音の距離 : float型 **/
		SOUND_SHOOT_RANGE("SoundShootRange", 50F, DataType.Float, 21),
		/** 発射音のピッチ : float型 **/
		SOUND_SHOOT_PITCH("SoundShootPitch", 1F, DataType.Float, 21),

		/** リロード音のファイル名 : string型 **/
		SOUND_RELOAD_NAME("SoundReloadName", "sample", DataType.String, 21),
		/** リロード音の距離 : float型 **/
		SOUND_RELOAD_RANGE("SoundReloadRange", 20F, DataType.Float, 21),
		/** リロード音のピッチ : float型 **/
		SOUND_RELOAD_PITCH("SoundReloadPitch", 1F, DataType.Float, 21),

		/** 使用する弾の名前 複数設定可能 : String配列型 **/
		TYPES_BULLETS("BulletNames", new String[] {}, DataType.StringArray),
		/** 使用できるアタッチメントのType 複数設定可能 : String配列型 **/
		TYPES_ATTACHMENTS("AttachmentNames", new String[] {}, DataType.StringArray),;

		public static final int OPTIONS = 0;
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
		public static final int FIRE_MODE_OPTION = 22;

		/** 登録名 */
		private String name;
		/** 初期値 */
		private Object defaultValue;
		/** カテゴリID : デフォルト=-1 */
		private int cate;
		/** Type */
		private DataType types;
		/** 最小値 */
		private Float min;
		/** 最大値 */
		private Float max;

		/** コンストラクタ 表示名+データ+Type カテゴリはデフォルト */
		GunDataList(String name, Object obj, DataType types) {
			this.name = name;
			this.defaultValue = obj;
			this.cate = -1;
			this.min = null;
			this.types = types;
		}

		/** コンストラクタ +カテゴリ */
		GunDataList(String name, Object obj, DataType types, int cate) {
			this(name, obj, types);
			this.cate = cate;
		}

		/** 最小値の設定 */
		GunDataList(String name, Object obj, DataType types, int cate, float minimam) {
			this(name, obj, types, cate);
			this.min = minimam;
		}

		/** 最小値の設定 */
		GunDataList(String name, Object obj, DataType types, float minimam) {
			this(name, obj, types);
			this.min = minimam;
		}

		/** データを設定する nullは上書きしない */
		public void setData(GunData d, Object obj) {
			if (obj != null) {
				d.Data.replace(this.toString(), obj);
			}
		}

		@Override
		public Float getMin() {
			return min;
		}

		@Override
		public Float getMax() {
			return max;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public DataType getType() {
			return types;
		}

		@Override
		public Object getDefaultValue() {
			return defaultValue;
		}

		@Override
		public int getCate() {
			return cate;
		}
	}

	public void setUnuseRecoil(){
		if (!UseSneakRecoil){
			int p1 = 0;
			int p2 = 0;
			float[] stack1 = new float[8];
			int p3 = 0;
			int p4 = 0;
			float[] stack2 = new float[8];
			for(GunDataList d:GunDataList.values()){
				if(d.cate == GunDataList.MIN_DEFAULT_RECOIL){
					stack1[p1] = getDataFloat(d);
					p1++;
				}
				if(d.cate == GunDataList.MIN_SNEAK_RECOIL){
					setData(d, stack1[p2]);
					p2++;
				}
				if(d.cate == GunDataList.MAX_DEFAULT_RECOIL){
					stack2[p3] = getDataFloat(d);
					p3++;
				}
				if(d.cate == GunDataList.MAX_SNEAK_RECOIL){
					setData(d, stack2[p4]);
					p4++;
				}
			}
		}
		if (!UseADSRecoil){
			int p1 = 0;
			int p2 = 0;
			float[] stack1 = new float[8];
			int p3 = 0;
			int p4 = 0;
			float[] stack2 = new float[8];
			for(GunDataList d:GunDataList.values()){
				if(d.cate == GunDataList.MIN_DEFAULT_RECOIL){
					stack1[p1] = getDataFloat(d);
					p1++;
				}
				if(d.cate == GunDataList.MIN_ADS_RECOIL){
					setData(d, stack1[p2]);
					p2++;
				}
				if(d.cate == GunDataList.MAX_DEFAULT_RECOIL){
					stack2[p3] = getDataFloat(d);
					p3++;
				}
				if(d.cate == GunDataList.MAX_ADS_RECOIL){
					setData(d, stack2[p4]);
					p4++;
				}
			}
		}
		if (!UseADSSneakRecoil){
			int p1 = 0;
			int p2 = 0;
			float[] stack1 = new float[8];
			int p3 = 0;
			int p4 = 0;
			float[] stack2 = new float[8];
			for(GunDataList d:GunDataList.values()){
				if(d.cate == GunDataList.MIN_SNEAK_RECOIL){
					stack1[p1] = getDataFloat(d);
					p1++;
				}
				if(d.cate == GunDataList.MIN_ADS_SNEAK_RECOIL){
					setData(d, stack1[p2]);
					p2++;
				}
				if(d.cate == GunDataList.MAX_SNEAK_RECOIL){
					stack2[p3] = getDataFloat(d);
					p3++;
				}
				if(d.cate == GunDataList.MAX_ADS_SNEAK_RECOIL){
					setData(d, stack2[p4]);
					p4++;
				}
			}
		}
	}

	static final String headName = "gun_";

	/** JsonStringからデータを読み込む */
	public GunData(String json) {
		// 初期値を忘れずに
		Gson gson = new Gson();
		JsonWrapper w = new JsonWrapper(gson.fromJson(json, JsonObject.class));
		// マップに格納
		for (GunDataList d : GunDataList.values()) {
			// System.out.println(d.getName()+" "+d.getDefaultValue() + " "+
			// w.getString("gun_"+d.getName(), d.getDefaultValue().toString()));
			switch (d.types) {
			case Boolean:
				Data.put(d.toString(),
						w.getBoolean(headName + d.toString(), new Boolean(d.getDefaultValue().toString())));
				break;
			case String:
				Data.put(d.toString(), w.getString(headName + d.toString(), d.getDefaultValue().toString()));
				break;
			case Int:
				Data.put(d.toString(), w.getInt(headName + d.toString(), new Integer(d.getDefaultValue().toString())));
				break;
			case Float:
				Data.put(d.toString(), w.getFloat(headName + d.toString(), new Float(d.getDefaultValue().toString())));
				break;
			case StringArray:
				Data.put(d.toString(), w.getStringArray(headName + d.toString(), (String[]) d.getDefaultValue()));
				break;
			}
		}
	}

	public GunData() {
		this(null);
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject JsonData = new JsonObject();
		for (GunDataList d : GunDataList.values()) {
			switch (d.types) {
			case Boolean:
				JsonData.addProperty(headName + d.toString(), this.getDataBoolean(d));
				break;
			case String:
				JsonData.addProperty(headName + d.toString(), this.getDataString(d));
				break;
			case Int:
				JsonData.addProperty(headName + d.toString(), this.getDataInt(d));
				break;
			case Float:
				JsonData.addProperty(headName + d.toString(), this.getDataFloat(d));
				break;
			case StringArray:
				JsonElement element = gson.toJsonTree(this.getDataStringArray(d), new TypeToken<String[]>() {
				}.getType());
				JsonData.add(headName + d.toString(), element.getAsJsonArray());
				break;
			}
		}
		return gson.toJson(JsonData);
	}

}
