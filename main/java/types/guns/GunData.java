package types.guns;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import types.ItemInfo;
import types.Sound;
import types.base.CloneableObj;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class GunData extends DataBase {
	public enum GunDataList implements EnumDataList {
		/** アイテムの名前 : ItemInfo型 */
		ITEM_INFO(null, null, new ItemInfo("sample", "Sample", "sample"), DataType.Object),
		/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
		BULLET_SPEED(0f, 128f, 5f, DataType.Float, 1),
		/** 持ってから撃てるまで ; tickかかる : int型 **/
		PREPARE_TICK(0f, null, 0, DataType.Int, 1),
		/** リロード ; リロードにtickかかる : int型 **/
		RELOAD_TICK(0f, null, 20, DataType.Int, 1),
		/** レート ; レートtick間隔で発射する : int型 **/
		RATE_TICK(0f, null, 2, DataType.Int, 1),
		/** 射撃モード : String配列型 **/
		FIREMODE(null, null, new String[] { "semiauto" }, DataType.Object),
		/** 貫通力 貫通力体のMOBにダメージが与えられる -1で∞ : int型 **/
		BULLET_POWER(-1f, null, 1, DataType.Int, 1),
		/** バーストのレート : int型 **/
		BURST_RATE_TICK(0f, null, 1, DataType.Int, 1),
		/** バーストの発射数 : int型 **/
		BURST_BULLET_NUM(1f, null, 3, DataType.Int, 1),
		/** 装填数 : int型 **/
		LOAD_NUM(1f, null, 1, DataType.Int, 1),
		/** 発射数 : int型 **/
		SHOOT_NUM(1f, null, 1, DataType.Int, 1),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY(0f, null, 0f, DataType.Float, 1),
		/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY_ADS(0f, null, 0f, DataType.Float, 1),
		/** デフォルトリコイル : GunRecoil型 */
		RECOIL_DEFAULT(null, null, new GunRecoil().setUse(true), DataType.Object),
		/** ADSリコイル : GunRecoil型 */
		RECOIL_ADS(null, null, new GunRecoil(), DataType.Object),
		/** スニークリコイル : GunRecoil型 */
		RECOIL_SNEAK(null, null, new GunRecoil(), DataType.Object),
		/** スニークADSリコイル : GunRecoil型 */
		RECOIL_SNEAK_ADS(null, null, new GunRecoil(), DataType.Object),
		/** 対人ダメージ加算値 : float型 **/
		PLAYER_DAMAGE_ADD(null, null, 0f, DataType.Float, 2),
		/** 対人ダメージ倍率 : float型 **/
		PLAYER_DAMAGE_DIAMETER(null, null, 1f, DataType.Float, 2),
		/** 対MOBダメージ加算値 : float型 **/
		LIVING_DAMAGE_ADD(null, null, 0f, DataType.Float, 2),
		/** 対MOBダメージ倍率 : float型 **/
		LIVING_DAMAGE_DIAMETER(null, null, 1f, DataType.Float, 2),
		/** 対地上兵器ダメージ加算値 : int型 **/
		VEHICLE_DAMAGE_ADD(null, null, 0, DataType.Int, 2),
		/** 対地上兵器ダメージ倍率 : float型 **/
		VEHICLE_DAMAGE_DIAMETER(null, null, 1f, DataType.Float, 2),
		/** 対航空機ダメージ加算値 : int型 **/
		AIRCRAFT_DAMAGE_ADD(null, null, 0, DataType.Int, 2),
		/** 対航空機ダメージ倍率 : float型 **/
		AIRCRAFT_DAMAGE_DIAMETER(null, null, 1f, DataType.Float, 2),
		/** 発射音 : Sound型 **/
		SOUND_SHOOT(null, null, new Sound("sample", 60), DataType.Object),
		/** リロード音 : Sound型 **/
		SOUND_RELOAD(null, null, new Sound("sample", 10), DataType.Object),
		/** 使用する弾 : StringArray型 */
		BULLET_USE(null, null, new String[0], DataType.Object),;

		/** カテゴリなし */
		private GunDataList(Float min, Float max, Object defaultValue, DataType type) {
			this(min, max, defaultValue, type, -1);
		}

		/** カテゴリ付き */
		private GunDataList(Float min, Float max, Object defaultValue, DataType type, int cate) {
			Max = max;
			Min = min;
			Default = defaultValue;
			Type = type;
			Cate = cate;
		}

		Float Max;
		Float Min;
		Object Default;
		DataType Type;
		int Cate;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getName() {
			return this.toString();
		}

		@Override
		public DataType getType() {
			return Type;
		}

		@Override
		public Object getDefaultValue() {
			return Default;
		}

		@Override
		public int getCate() {
			return Cate;
		}
	}

	public String[] useMagazines = new String[0];

	public GunData() {
		for (GunDataList data : GunDataList.values()) {
			//オブジェクトなら別インスタンスを
			if(data.getType().equals(DataType.Object)&&data.getDefaultValue() instanceof CloneableObj){
				try {
					Data.put(data.getName(), ((CloneableObj)data.getDefaultValue()).clone());
				} catch (CloneNotSupportedException e) {
				}
			}else{
				Data.put(data.getName(), data.getDefaultValue());
			}
		}
	}

	/** JsonStringからデータを読み込む */
	public GunData(String json) {
		this();
		Gson gson = new Gson();
		Data.putAll(gson.fromJson(json, new TypeToken<HashMap<String, Object>>() {
		}.getType()));
	}
}
