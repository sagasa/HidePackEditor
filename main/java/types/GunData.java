package types;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GunData {
	/**登録名 : String型 全部小文字**/
	public String ShortName;

	/**表示名 : String型**/
	public String DisplayName;

	/**アイテムのアイコン : String型**/
	public String Icon;

	/**弾速 1秒の移動距離(m)=弾速 : float型**/
	public float bulletSpeed;

	/**装弾数 : int型**/
	public int MagazineSize;

	/**精度 : 50ブロック先で1辺精度mの正方形に当たる : float型**/
	public float Accuracy;
	/**ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型**/
	public float ADSAccuracy;

	/**Yawの反動 : 反動の中央値(角度°) : float型**/
	public float YawRecoilBase;
	/**Yawの反動 : 反動の拡散値(角度°) : float型**/
	public float YawRecoilSpread;
	/**Pitchの反動 : 反動の中央値(角度°) : float型**/
	public float PitchRecoilBase;
	/**Pitchの反動 : 反動の拡散値(角度°) : float型**/
	public float PitchRecoilSpread;

	/**スニーク時のYawの反動 : 反動の中央値(角度°) : float型**/
	public float SneakYawRecoilBase;
	/**スニーク時のYawの反動 : 反動の拡散値(角度°) : float型**/
	public float SneakYawRecoilSpread;
	/**スニーク時のPitchの反動 : 反動の中央値(角度°) : float型**/
	public float SneakPitchRecoilBase;
	/**スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型**/
	public float SneakPitchRecoilSpread;

	/**ADS時のYawの反動 : 反動の中央値(角度°) : float型**/
	public float ADSYawRecoilBase;
	/**ADS時のYawの反動 : 反動の拡散値(角度°) : float型**/
	public float ADSYawRecoilSpread;
	/**ADS時のPitchの反動 : 反動の中央値(角度°) : float型**/
	public float ADSPitchRecoilBase;
	/**ADS時のPitchの反動 : 反動の拡散値(角度°) : float型**/
	public float ADSPitchRecoilSpread;

	/**ADS+スニーク時のYawの反動 : 反動の中央値(角度°) : float型**/
	public float ADSSneakYawRecoilBase;
	/**ADS+スニーク時のYawの反動 : 反動の拡散値(角度°) : float型**/
	public float ADSSneakYawRecoilSpread;
	/**ADS+スニーク時のPitchの反動 : 反動の中央値(角度°) : float型**/
	public float ADSSneakPitchRecoilBase;
	/**ADS+スニーク時のPitchの反動 : 反動の拡散値(角度°) : float型**/
	public float ADSSneakPitchRecoilSpread;

	/**使用する弾の名前 複数設定可能 : String配列型**/
	public List<String> BulletNames;

	/**対人ダメージ倍率 : float型**/
	public float playerDamageDiameter;
	/**対MOBダメージ倍率 : float型**/
	public float livingDamageDiameter;
	/**対地上兵器ダメージ倍率 : float型**/
	public float tankDamageDiameter;
	/**対航空機ダメージ倍率 : float型**/
	public float aircraftDamageDiameter;

	/**使用できるアタッチメントのType 複数設定可能 : String配列型**/
	public List<String> AttachmentTypes;

	/**初期値 何もしない*/
	public GunData(){
		ShortName = "name";
		DisplayName = "name";
		Icon = "sample";

		bulletSpeed = 1F;
		MagazineSize = 1;
		Accuracy = 0F;
		ADSAccuracy = 0F;

		YawRecoilBase = 0F;
		YawRecoilSpread = 0F;
		PitchRecoilBase = 0F;
		PitchRecoilSpread = 0F;

		SneakYawRecoilBase = 0F;
		SneakYawRecoilSpread = 0F;
		SneakPitchRecoilBase = 0F;
		SneakPitchRecoilSpread = 0F;

		ADSYawRecoilBase = 0F;
		ADSYawRecoilSpread = 0F;
		ADSPitchRecoilBase = 0F;
		ADSPitchRecoilSpread = 0F;

		ADSSneakYawRecoilBase = 0F;
		ADSSneakYawRecoilSpread = 0F;
		ADSSneakPitchRecoilBase = 0F;
		ADSSneakPitchRecoilSpread = 0F;

		BulletNames = new ArrayList<String>();

		playerDamageDiameter = 1F;
		livingDamageDiameter = 1F;
		tankDamageDiameter = 1F;
		aircraftDamageDiameter = 1F;

		AttachmentTypes = new ArrayList<String>();
	}

	/**JsonObjectからデータを読み込む ; */
	public GunData(JsonObject obj){
		//初期値を忘れずに
		this();
		ShortName = obj.get("gun_shortName").getAsString();
		DisplayName = obj.get("gun_displayName").getAsString();
		Icon = obj.get("gun_icon").getAsString();

		bulletSpeed = obj.get("gun_speed").getAsFloat();
		MagazineSize = obj.get("gun_magazineSize").getAsInt();
		Accuracy = obj.get("gun_accuracy").getAsFloat();
		ADSAccuracy = obj.get("gun_ADSaccuracy").getAsFloat();

		YawRecoilBase = obj.get("gun_yawRecoilBasee").getAsFloat();
		YawRecoilSpread = obj.get("gun_yawRecoilSpread").getAsFloat();
		PitchRecoilBase = obj.get("gun_pitchRecoilBase").getAsFloat();
		PitchRecoilSpread = obj.get("gun_pitchRecoilSpread").getAsFloat();

		SneakYawRecoilBase = obj.get("gun_sneakYawRecoilBase").getAsFloat();
		SneakYawRecoilSpread = obj.get("gun_sneakYawRecoilSpread").getAsFloat();
		SneakPitchRecoilBase = obj.get("gun_sneakPitchRecoilBase").getAsFloat();
		SneakPitchRecoilSpread = obj.get("gun_sneakPitchRecoilSpread").getAsFloat();

		ADSYawRecoilBase = obj.get("gun_ADSYawRecoilBase").getAsFloat();
		ADSYawRecoilSpread = obj.get("gun_ADSYawRecoilSpread").getAsFloat();
		ADSPitchRecoilBase = obj.get("gun_ADSPitchRecoilBase").getAsFloat();
		ADSPitchRecoilSpread = obj.get("gun_ADSPitchRecoilSpread").getAsFloat();

		ADSSneakYawRecoilBase = obj.get("gun_ADSSneakYawRecoilBase").getAsFloat();
		ADSSneakYawRecoilSpread = obj.get("gun_ADSSneakYawRecoilSpread").getAsFloat();
		ADSSneakPitchRecoilBase = obj.get("gun_ADSSneakPitchRecoilBase").getAsFloat();
		ADSSneakPitchRecoilSpread = obj.get("gun_ADSSneakPitchRecoilSpread").getAsFloat();

		playerDamageDiameter = obj.get("gun_playerDamageDiameter").getAsFloat();
		livingDamageDiameter = obj.get("gun_livingDamageDiameter").getAsFloat();
		tankDamageDiameter = obj.get("gun_tankDamageDiameter").getAsFloat();
		aircraftDamageDiameter = obj.get("gun_aircraftDamageDiameter").getAsFloat();

		//アレイとしてみて要素を取り出す
		JsonArray Bullets = obj.get("gun_bulletNames").getAsJsonArray();
		for (int i = 0; i < Bullets.size(); i++) {
			BulletNames.add(Bullets.get(i).getAsString());
		}

		JsonArray Attachments = obj.get("gun_bulletNames").getAsJsonArray();
		for (int i = 0; i < Attachments.size(); i++) {
			AttachmentTypes.add(Attachments.get(i).getAsString());
		}
	}
}
