package editer;

import types.base.DataBase;
import types.base.EnumDataInfo;

/***/
public class ValueInfo {
	/**
	 * データ取得 EnumDataInfo.toString()と同じフィールド名を持つpublicなフィールドを取得可能
	 */
	public static Object getData(DataBase data, EnumDataInfo type) {
		try {
			return data.getField(type).get(data);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return null;
		}
	}

	/** データ上書き */
	public static boolean setData(DataBase data, EnumDataInfo type, Object value) {
		try {
			data.getField(type).set(data, value);
			return true;
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			return false;
		}
	}

	/** 銃 */
	public enum GunDataList implements EnumDataInfo {
		/** アイテムの名前 : ItemInfo型 */
		ITEM_INFO(null, null, "gun."),
		/** 弾速 1秒の移動距離(m)=弾速 : float型 **/
		BULLET_SPEED(0f, 128f, "gun."),
		/** 持ってから撃てるまで ; tickかかる : int型 **/
		PREPARE_TICK(0f, null, "gun."),
		/** リロード ; リロードにtickかかる : int型 **/
		RELOAD_TICK(0f, null, "gun."),
		/** レート ; レートtick間隔で発射する : int型 **/
		RATE_TICK(0f, null, "gun."),
		/** 射撃モード : String配列型 **/
		FIREMODE(null, null, "gun."),
		/** 貫通力 貫通力体のMOBにダメージが与えられる -1で∞ : int型 **/
		BULLET_POWER(-1f, null, "gun."),
		/** バーストのレート : int型 **/
		BURST_RATE_TICK(0f, null, "gun."),
		/** バーストの発射数 : int型 **/
		BURST_BULLET_NUM(1f, null, "gun."),
		/** 装填数 : int型 **/
		LOAD_NUM(1f, null, "gun."),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY(0f, null, "gun."),
		/** ADS精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		ACCURACY_ADS(0f, null, "gun."),
		/** デフォルトリコイル : GunRecoil型 */
		RECOIL_DEFAULT(null, null, "gun."),
		/** ADSリコイル : GunRecoil型 */
		RECOIL_ADS(null, null, "gun."),
		/** スニークリコイル : GunRecoil型 */
		RECOIL_SNEAK(null, null, "gun."),
		/** スニークADSリコイル : GunRecoil型 */
		RECOIL_SNEAK_ADS(null, null, "gun."),
		/** 対人ダメージ加算値 : float型 **/
		PLAYER_DAMAGE_ADD(null, null, "gun."),
		/** 対人ダメージ倍率 : float型 **/
		PLAYER_DAMAGE_DIAMETER(null, null, "gun."),
		/** 対MOBダメージ加算値 : float型 **/
		LIVING_DAMAGE_ADD(null, null, "gun."),
		/** 対MOBダメージ倍率 : float型 **/
		LIVING_DAMAGE_DIAMETER(null, null, "gun."),
		/** 対地上兵器ダメージ加算値 : int型 **/
		VEHICLE_DAMAGE_ADD(null, null, "gun."),
		/** 対地上兵器ダメージ倍率 : float型 **/
		VEHICLE_DAMAGE_DIAMETER(null, null, "gun."),
		/** 対航空機ダメージ加算値 : int型 **/
		AIRCRAFT_DAMAGE_ADD(null, null, "gun."),
		/** 対航空機ダメージ倍率 : float型 **/
		AIRCRAFT_DAMAGE_DIAMETER(null, null, "gun."),
		/** 発射音 : Sound型 **/
		SOUND_SHOOT(null, null, "gun."),
		/** リロード音 : Sound型 **/
		SOUND_RELOAD(null, null, "gun."),
		/** 使用する弾 : StringArray型 */
		BULLET_USE(null, null, "gun."),;

		private GunDataList(Float min, Float max, String unlocalizedname) {
			this(min, max, unlocalizedname, -1);
		}

		private GunDataList(Float min, Float max, String unlocalizedname, int cate) {
			Max = max;
			Min = min;
			Cate = cate;
			UnlocalizedName = unlocalizedname;
		}

		Float Max;
		Float Min;
		int Cate;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return Cate;
		}
	}

	/** リコイル用 */
	public enum RecoilDataList implements EnumDataInfo {

		/** リコイルパワー最小時のリコイル */
		MAX_YAW_BASE(null, null, "recoil."),
		/** リコイルパワー最小時のリコイル */
		MAX_YAW_SPREAD(null, null, "recoil."),
		/** リコイルパワー最小時のリコイル */
		MAX_YAW_RETURN(1f, 0f, "recoil."),
		/** リコイルパワー最小時のリコイル */
		MIN_YAW_BASE(null, null, "recoil."),
		/** リコイルパワー最小時のリコイル */
		MIN_YAW_SPREAD(null, null, "recoil."),
		/** リコイルパワー最小時のリコイル */
		MIN_YAW_RETURN(1f, 0f, "recoil."),
		/** リコイルが適応される時間 */
		YAW_RECOIL_TICK(null, 0f, "recoil."),
		/** リコイルが適応される時間 */
		YAW_RETURN_TICK(null, 0f, "recoil."),

		/** リコイルパワー最大時のリコイル */
		MAX_PITCH_BASE(null, null, "recoil."),
		/** リコイルパワー最大時のリコイル */
		MAX_PITCH_SPREAD(null, null, "recoil."),
		/** リコイルパワー最大時のリコイル */
		MAX_PITCH_RETURN(1f, 0f, "recoil."),
		/** リコイルパワー最大時のリコイル */
		MIN_PITCH_BASE(null, null, "recoil."),
		/** リコイルパワー最大時のリコイル */
		MIN_PITCH_SPREAD(null, null, "recoil."),
		/** リコイルパワー最大時のリコイル */
		MIN_PITCH_RETURN(1f, 0f, "recoil."),
		/** リコイルが適応される時間 */
		PITCH_RECOIL_TICK(null, 0f, "recoil."),
		/** リコイルが適応される時間 */
		PITCH_RETURN_TICK(null, 0f, "recoil."),
		/** tickあたりの減少量 */
		POWER_TICK(null, 0f, "recoil."),
		/** 射撃ごとの増加量 */
		POWER_SHOOT(null, 0f, "recoil."),

		/** 使用しない場合はより下位のリコイル外用される */
		USE(null, null, "recoil."),;

		private RecoilDataList(Float min, Float max, String unlocalizedname) {
			Max = max;
			Min = min;
			UnlocalizedName = unlocalizedname;
		}

		Float Max;
		Float Min;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return 0;
		}
	}

	/** 爆発用info */
	public enum ExplosionDataList implements EnumDataInfo {
		/** 爆風範囲 :int型 **/
		RANGE(0f, null, "exp.range"),

		/** 爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型 **/
		DAMAGE_BASE_PLAYER(null, null, "exp.damage.player.base"),
		/** 爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型 **/
		DAMAGE_COE_PLAYER(null, null, "exp.damage.player.coe"),
		/** 爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型 **/
		DAMAGE_BASE_LIVING(null, null, "exp.damage.living.base"),
		/** 爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型 **/
		DAMAGE_COE_LIVING(null, null, "exp.damage.living.coe"),
		/** 爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型 **/
		DAMAGE_BASE_TANK(null, null, "exp.damage.tank.base"),
		/** 爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型 **/
		DAMAGE_COE_TANK(null, null, "exp.damage.tank.coe"),
		/** 爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型 **/
		DAMAGE_BASE_AIR(null, null, "exp.damage.air.base"),
		/** 爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型 **/
		DAMAGE_COE_AIR(null, null, "exp.damage.air.coe"),

		/** 爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型 **/
		KNOCKBACK_BASE_PLAYER(null, null, "exp."),
		/** 爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型 **/
		KNOCKBACK_COE_PLAYER(null, null, "exp."),
		/** 爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型 **/
		KNOCKBACK_BASE_LIVING(null, null, "exp."),
		/** 爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型 **/
		KNOCKBACK_COE_LIVING(null, null, "exp."),
		/** 爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型 **/
		KNOCKBACK_BASE_TANK(null, null, "exp."),
		/** 爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型 **/
		KNOCKBACK_COE_TANK(null, null, "exp."),
		/** 爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型 **/
		KNOCKBACK_BASE_AIR(null, null, "exp."),
		/** 爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型 **/
		KNOCKBACK_COE_AIR(null, null, "exp."),

		/** 使用する音 : Sound型 **/
		SOUND(null, null, "exp."),;

		private ExplosionDataList(Float min, Float max, String unlocalizedname) {
			Max = max;
			Min = min;
			UnlocalizedName = unlocalizedname;
		}

		Float Max;
		Float Min;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return 0;
		}
	}

	/** Sound用info */
	public enum ItemDataList implements EnumDataInfo {
		/** アイテムの名前 : レジスタ登録用 半角小文字英数のみ */
		NAME_SHORT(null, null, "item.shortname", 0),
		/** アイテムの名前 : 標示名 */
		NAME_DISPLAY(null, null, "item.ddisplayname", 0),
		/** アイコンの名前 : "[domain]:"を先頭につけることでドメイン変更も可能 */
		NAME_ICON(null, null, "item.icon", 0),
		/***/
		MAX_HEALTH(null, null, "item.change.helth", 0),
		/***/
		MOVE_SPEED(null, null, "item.change.speed", 0),
		/***/
		KNOCKBACK_RESISTANCE(null, null, "item.change.knockback", 0),
		/***/
		ATTACK_DAMAGE(null, null, "item.change.damage", 0),;

		private ItemDataList(Float min, Float max, String unlocalizedname, int cate) {
			Max = max;
			Min = min;
			Cate = cate;
			UnlocalizedName = unlocalizedname;
		}

		Float Max;
		Float Min;
		int Cate;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return Cate;
		}
	}

	/** Sound用info */
	public enum SoundDataList implements EnumDataInfo {
		/** サウンドの名前 : "[domain]:"を先頭につけることでドメイン変更も可能 */
		NAME(null, null, "sound.name"), RANGE(0f, null, "sound.range"), VOL(0f, null, "sound.vol"), PITCH(0f, null,
				"sound.pitch"), USE_DECAY(null, null, "sound.decay"), USE_DELAY(null, null, "sound.delay"),;

		private SoundDataList(Float min, Float max, String unlocalizedname) {
			Max = max;
			Min = min;
			UnlocalizedName = unlocalizedname;
		}

		Float Max;
		Float Min;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return 0;
		}
	}

	/** bullet用type */
	public enum BulletDataList implements EnumDataInfo {
		/** アイテムの名前 : ItemInfo型 */
		ITEM_INFO(null, null, "bullet."),

		/** 装弾数 : int型 **/
		MAGAZINE_SIZE(1f, null, "bullet."),

		/** スタックサイズ : int型 **/
		STACK_SIZE(1f, 64f, "bullet."),

		/** 弾の寿命 (tick) : int型 **/
		BULLET_LIFE(1f, null, "bullet."),

		/** 弾の貫通力 : int型 **/
		BULLET_POWER(-1f, null, "bullet."),

		/** 発射数 : int型 **/
		SHOOT_NUM(1f, null, "bullet."),

		/** リロード時にマガジンが破棄されるか : boolean型 **/
		MAGAZINE_BREAK(null, null, "bullet."),

		/** 防具貫通 : boolean型 **/
		HIT_IGNORING_ARMOR(null, null, "bullet."),
		/** 直撃のHSダメージ : float型 **/
		HIT_DAMAGE_HEAD(null, null, "bullet."),
		/** 直撃の対人ダメージ : float型 **/
		HIT_DAMAGE_PLAYER(null, null, "bullet."),
		/** 直撃の対MOBダメージ : float型 **/
		HIT_DAMAGE_LIVING(null, null, "bullet."),
		/** 直撃の対地上兵器ダメージ : int型 **/
		HIT_DAMAGE_TANK(null, null, "bullet."),
		/** 直撃の対航空機ダメージ : int型 **/
		HIT_DAMAGE_AIR(null, null, "bullet."),

		/** 直撃の対人ノックバック : ノックバック距離(m)=ノックバック : float型 **/
		HIT_KNOCKBACK_PLAYER(null, null, "bullet."),
		/** 直撃の対MOBノックバック : ノックバック距離(m)=ノックバック : float型 **/
		HIT_KNOCKBACK_LIVING(null, null, "bullet."),
		/** 直撃の対地上兵器ノックバック : ノックバック距離(m)=ノックバック/重量 : float型 **/
		HIT_KNOCKBACK_TANK(null, null, "bullet."),
		/** 直撃の対航空機ノックバック : ノックバック距離(m)=ノックバック/重量 : float型 **/
		HIT_KNOCKBACK_AIR(null, null, "bullet."),

		/** エンティティに当たった時に爆発するか : Explosion型 **/
		EXP_ON_HIT_ENTITY(null, null, "bullet."),
		/** 地面に当たった時に爆発するか : Explosion型 **/
		EXP_ON_HIT_GROUND(null, null, "bullet."),
		/** 時間経過で爆発するか : Explosion型 **/
		EXP_ON_TIMEOUT(null, null, "bullet."),

		/** 対人ダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_START_PLAYER(null, null, "bullet."),
		/** 対人ダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_COE_PLAYER(null, null, "bullet."),
		/** 対人ダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_MAX_PLAYER(null, null, "bullet."),

		/** 対MOBダメージの減衰開始距離 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_START_LIVING(null, null, "bullet."),
		/** 対MOBダメージの減衰率 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_COE_LIVING(null, null, "bullet."),
		/** 対MOBダメージの最大減衰幅 : 減衰量=減衰開始から距離(m)*係数 : float **/
		DECAY_DAMAGE_MAX_LIVING(null, null, "bullet."),

		/** 着弾音 : Sound型 **/
		SOUND_HIT_GROUND(null, null, "bullet."),

		/** エンティティ着弾音 : Sound型 **/
		SOUND_HIT_ENTITY(null, null, "bullet."),

		/** 通過音 : Sound型 **/
		SOUND_PASSING_USE(null, null, "bullet."),

		/** 弾道落下を使用するか : boolean型 **/
		GRAVITY_USE(null, null, "bullet."),

		/** 透過する・ブロック : String[]型 */
		THROUGH_BLOCK(null, null, "bullet."),
		/** 透過するエンティティ : String[]型 */
		THROUGH_ENTITY(null, null, "bullet."),

		;

		/*
		 * エンティティの設定項目 エフェクト：着弾時・飛翔中(エンティティに当たった時に付与する効果)
		 * 飛翔中のエフェクトの効果(音などを追加してもいいかも 弾道落下：true/false・配列とその中の数式
		 * 威力減衰：true/false・配列とその中の数式 モデル 近接信管・反応するエンティティ
		 * 誘導：true/false・手動/ロックオン/継続ロックオン・反応するエンティティ
		 */

		public static final int BULLET_INFO = 1;
		public static final int BULLET_HIT_DAMAGE = 2;
		public static final int BULLET_HIT_KNOCKBACK = 3;
		public static final int BULLET_EXP_DAMAGE = 4;
		public static final int BULLET_EXP_KNOCKBACK = 5;

		/** カテゴリなし */
		private BulletDataList(Float min, Float max, String unlocalizedname) {
			this(min, max, unlocalizedname, -1);
		}

		/** カテゴリ付き */
		private BulletDataList(Float min, Float max, String unlocalizedname, int cate) {
			Max = max;
			Min = min;
			UnlocalizedName = unlocalizedname;
			Cate = cate;
		}

		Float Max;
		Float Min;
		int Cate;
		String UnlocalizedName;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getUnlocalizedName() {
			return UnlocalizedName;
		}

		@Override
		public int getCate() {
			return Cate;
		}
	}
}
