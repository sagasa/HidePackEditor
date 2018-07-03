package types.guns;

import types.ItemInfo;
import types.Sound;
import types.base.DataBase;

public class GunData extends DataBase {
	public GunData(String json) {
		super(json);
	}

	public GunData() {
		super();
	}

	/** アイテムの名前 : ItemInfo型 */
	public ItemInfo ITEM_INFO =  new ItemInfo("sample", "Sample", "sample");
	/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
	public float BULLET_SPEED = 5f;
	/** 持ってから撃てるまで ; tickかかる : int型 **/
	public int PREPARE_TICK = 0;
	/** リロード ; リロードにtickかかる : int型 **/
	public int RELOAD_TICK= 20;
	/** レート ; レートtick間隔で発射する : int型 **/
	public int RATE_TICK = 2;
	/** 射撃モード : String配列型 **/
	public String[] FIREMODE=new String[] { "semiauto" };
	/** 貫通力 貫通力体のMOBにダメージが与えられる -1で∞ : int型 **/
	public int BULLET_POWER = 1;
	/** バーストのレート : int型 **/
	public int BURST_RATE_TICK = 1;
	/** バーストの発射数 : int型 **/
	public int BURST_BULLET_NUM = 3;
	/** 装填数 : int型 **/
	public int LOAD_NUM= 1;
	/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	public float ACCURACY= 0f;
	/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	public float ACCURACY_ADS= 0f;
	/** デフォルトリコイル : GunRecoil型 */
	public Recoil RECOIL_DEFAULT=new Recoil().setUse(true);
	/** ADSリコイル : GunRecoil型 */
	public Recoil RECOIL_ADS=new Recoil();
	/** スニークリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK=new Recoil();
	/** スニークADSリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK_ADS=new Recoil();
	/** 対人ダメージ加算値 : float型 **/
	public float PLAYER_DAMAGE_ADD=0f;
	/** 対人ダメージ倍率 : float型 **/
	public float PLAYER_DAMAGE_DIAMETER=1;
	/** 対MOBダメージ加算値 : float型 **/
	public float LIVING_DAMAGE_ADD=0f;
	/** 対MOBダメージ倍率 : float型 **/
	public float LIVING_DAMAGE_DIAMETER=1f;
	/** 対地上兵器ダメージ加算値 : int型 **/
	public int VEHICLE_DAMAGE_ADD=0;
	/** 対地上兵器ダメージ倍率 : float型 **/
	public float VEHICLE_DAMAGE_DIAMETER=1f;
	/** 対航空機ダメージ加算値 : int型 **/
	public int AIRCRAFT_DAMAGE_ADD=0;
	/** 対航空機ダメージ倍率 : float型 **/
	public float AIRCRAFT_DAMAGE_DIAMETER=1f;
	/** 発射音 : Sound型 **/
	public Sound SOUND_SHOOT=new Sound("sample", 60);
	/** リロード音 : Sound型 **/
	public Sound SOUND_RELOAD=new Sound("sample", 10);
	/** 使用する弾 : StringArray型 */
	public String[] BULLET_USE=new String[0];

	/**使用マガジンやアタッチメントなどの名前を更新*//**
	public void setDomain(String Domain) {
		ItemInfo item = getItemInfo();
		item.shortName = item.shortName+PackLoader.DOMAIN_GUN+Domain;

		String[] bullets = (String[]) getDataObject(GunDataList.BULLET_USE);
		for (int i = 0; i < bullets.length; i++) {
			bullets[i] = bullets[i]+PackLoader.DOMAIN_MAGAZINE+Domain;
		}
	}*/
	
}
