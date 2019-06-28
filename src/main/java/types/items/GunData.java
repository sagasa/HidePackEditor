package types.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.beans.property.Property;
import types.Info;
import types.effect.Recoil;
import types.effect.Sound;

public class GunData extends ItemData {

	@Override
	public void init() {
		super.init();
		bindRecoil(RECOIL_DEFAULT, RECOIL_ADS);
		bindRecoil(RECOIL_DEFAULT, RECOIL_SNEAK);
		bindRecoil(RECOIL_SNEAK, RECOIL_SNEAK_ADS);
	}

	/** リコイル非使用時のバインド用 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void bindRecoil(Recoil from, Recoil to) {
		to.getProperty("USE").addListener((value, oldV, newV) -> {
			for (String str : from.getPropertyNames()) {
				if (!str.equals("USE")) {
					if ((boolean) newV) {
						to.getProperty(str).unbind();
					} else {
						to.getProperty(str).bind((Property) from.getProperty(str));
					}
				}
			}
		});
	}

	/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
	@Info(Cate = 0, Min = 0, Max = 128)
	public float BULLET_SPEED = 5f;
	/** 持ってから撃てるまで ; tickかかる : int型 **/
	@Info(Cate = 0, Min = 0)
	public int PREPARE_TICK = 0;
	/** ADSへの切り替え時間 ; tickかかる : int型 **/
	@Info(Cate = 0, Min = 0)
	public int ADS_TICK = 0;
	/** fovズーム倍率 float型 */
	@Info(Cate = 2, Min = 0.5f, Max = 2f)
	public float FOV_ZOOM_DIA = 1.2f;
	/** スコープの使用可否 */
	@Info(Cate = 2)
	public boolean USE_SCOPE = true;
	/** モデルスコープを使用するか */
	@Info(Cate = 2)
	public boolean MODEL_SCOPE = false;
	/** スコープ名 : String型 */
	@Info(isResourceName = true)
	public String SCOPE_NAME = "";
	/** スコープの表示サイズ */
	@Info(Cate = 2, Min = 0.1f, Max = 1f)
	public float SCOPE_SIZE = 0.7f;
	/** スコープの中心位置 */
	@Info(Cate = 2, Min = 0f, Max = 1f)
	public float SCOPE_CENTER_X = 0.5f;
	/** スコープの中心位置 */
	@Info(Cate = 2, Min = 0f, Max = 1f)
	public float SCOPE_CENTER_Y = 0.5f;
	/** スコープのズーム倍率 float型 */
	@Info(Cate = 2, Min = 0.6f, Max = 8f)
	public float SCOPE_DIA = 2f;
	/** リロード ; リロードにtickかかる : int型 **/
	@Info(Cate = 0, Min = 0, Scale = "5")
	public int RELOAD_TICK = 20;
	/** まとめてリロードできるか : boolean型 */
	@Info(Cate = 0)
	public boolean RELOAD_ALL = false;
	/** リロード時にマガジンの抜き取りを行うかどうか */
	@Info(Cate = 0)
	public boolean UNLOAD_IN_RELOADING = true;
	/** マガジンをアンロードできるか */
	@Info(Cate = 0)
	public boolean USE_UNLOAD = true;
	/** 分間発射数 : int型 **/
	@Info(Cate = 0, Min = 0, Scale = "10")
	public float RPM = 600;
	/** 射撃モード : String配列型 **/
	public List<String> FIREMODE = new ArrayList<>(Arrays.asList("semiauto"));
	/** 貫通力 貫通力体のMOBにダメージが与えられる -1で∞ : int型 **/
	@Info(Cate = 0, Min = -1)
	public int BULLET_POWER = 1;
	/** バーストの分間発射数 : int型 **/
	@Info(Cate = 0, Min = 0, Scale = "10")
	public float BURST_RPM = 800;
	/** バーストの発射数 : int型 **/
	@Info(Cate = 0, Min = 1)
	public int BURST_BULLET_NUM = 3;
	/** 装填数 : int型 **/
	@Info(Cate = 0, Min = 1)
	public int LOAD_NUM = 1;
	/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	@Info(Cate = 0, Min = 0)
	public float ACCURACY = 0f;
	/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	@Info(Cate = 0, Min = 0)
	public float ACCURACY_ADS = 0f;
	/** デフォルトリコイル : GunRecoil型 */
	public Recoil RECOIL_DEFAULT = new Recoil();
	/** ADSリコイル : GunRecoil型 */
	public Recoil RECOIL_ADS = new Recoil().setUse(false);
	/** スニークリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK = new Recoil().setUse(false);
	/** スニークADSリコイル : GunRecoil型 */
	public Recoil RECOIL_SNEAK_ADS = new Recoil().setUse(false);
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
	public List<String> MAGAZINE_USE = new ArrayList<>();
	/** セカンダリにできるか */
	@Info(Cate = 0)
	public boolean USE_SECONDARY = false;
	/** 両手持ちできるか */
	@Info(Cate = 0)
	public boolean USE_DUALWIELD = false;
}
