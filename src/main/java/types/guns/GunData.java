package types.guns;

import types.Info;
import types.base.ItemData;
import types.effect.Recoil;
import types.effect.Sound;

public class GunData extends ItemData {

	public float ITEM_MAX_HEALTH = 0f;
	public float ITEM_MOVE_SPEED = 0f;
	public float ITEM_KNOCKBACK_RESISTANCE = 0f;
	public float ITEM_ATTACK_DAMAGE = 0f;

	/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
	@Info(Cate = 0, Min = 0, Max = 128)
	public float BULLET_SPEED = 5f;
	/** 持ってから撃てるまで ; tickかかる : int型 **/
	@Info(Cate = 0, Min = 0)
	public int PREPARE_TICK = 0;
	/** ADSへの切り替え時間 ; tickかかる : int型 **/
	@Info(Cate = 0, Min = 0)
	public int ADS_TICK = 0;
	/** スコープ名 : String型 */
	@Info(Cate = 0)
	public String SCOPE_NAME = "";
	/** ズーム倍率 float型 */
	@Info(Cate = 2, Min = 0.2f, Max = 16f)
	public float SCOPE_DIA = 2f;
	/** リロード ; リロードにtickかかる : int型 **/
	@Info(Cate = 0, Min = 0, Scale = "5")
	public int RELOAD_TICK = 20;
	/** まとめてリロードできるか : boolean型 */
	@Info(Cate = 0)
	public boolean RELOAD_ALL = false;
	/** 分間発射数 : int型 **/
	@Info(Cate = 0,Min=0,Scale="10")
	public int RPM = 600;
	/** 射撃モード : String配列型 **/
	public String[] FIREMODE = new String[] { "semiauto" };
	/** 貫通力 貫通力体のMOBにダメージが与えられる -1で∞ : int型 **/
	@Info(Cate = 0,Min=-1)
	public int BULLET_POWER = 1;
	/** バーストの分間発射数 : int型 **/
	@Info(Cate = 0,Min=0,Scale="10")
	public int BURST_RPM = 800;
	/** バーストの発射数 : int型 **/
	@Info(Cate = 0,Min=1)
	public int BURST_BULLET_NUM = 3;
	/** 装填数 : int型 **/
	@Info(Cate = 0,Min=1)
	public int LOAD_NUM = 1;
	/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	@Info(Cate = 0,Min=0)
	public float ACCURACY = 0f;
	/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	@Info(Cate = 0,Min=0)
	public float ACCURACY_ADS = 0f;
	/** デフォルトリコイル : GunRecoil型 */
	public Recoil RECOIL_DEFAULT = new Recoil().setUse(true);
	/** ADSリコイル : GunRecoil型 */
	public Recoil RECOIL_ADS = new Recoil();
	/** スニークリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK = new Recoil();
	/** スニークADSリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK_ADS = new Recoil();
	/** 対人ダメージ加算値 : float型 **/
	@Info(Cate = 1)
	public float PLAYER_DAMAGE_ADD = 0f;
	/** 対人ダメージ倍率 : float型 **/
	@Info(Cate = 1)
	public float PLAYER_DAMAGE_DIAMETER = 1;
	/** 対MOBダメージ加算値 : float型 **/
	@Info(Cate = 1)
	public float LIVING_DAMAGE_ADD = 0f;
	/** 対MOBダメージ倍率 : float型 **/
	@Info(Cate = 1)
	public float LIVING_DAMAGE_DIAMETER = 1f;
	/** 対地上兵器ダメージ加算値 : int型 **/
	@Info(Cate = 1)
	public int VEHICLE_DAMAGE_ADD = 0;
	/** 対地上兵器ダメージ倍率 : float型 **/
	@Info(Cate = 1)
	public float VEHICLE_DAMAGE_DIAMETER = 1f;
	/** 対航空機ダメージ加算値 : int型 **/
	@Info(Cate = 1)
	public int AIRCRAFT_DAMAGE_ADD = 0;
	/** 対航空機ダメージ倍率 : float型 **/
	@Info(Cate = 1)
	public float AIRCRAFT_DAMAGE_DIAMETER = 1f;
	/** 発射音 : Sound型 **/
	public Sound SOUND_SHOOT = new Sound("sample", 60);
	/** リロード音 : Sound型 **/
	public Sound SOUND_RELOAD = new Sound("sample", 10);
	/** 使用する弾 : StringArray型 */
	public String[] BULLET_USE = new String[0];
	/** セカンダリにできるか */
	@Info(Cate = 0)
	public boolean USE_SECONDARY = false;
	/** 両手持ちできるか */
	@Info(Cate = 0)
	public boolean USE_DUALWIELD = false;
}
