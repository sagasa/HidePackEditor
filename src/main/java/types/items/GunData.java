package types.items;

import org.apache.commons.lang.ArrayUtils;

import types.base.Curve;
import types.base.DataBase;
import types.base.IHideData;
import types.base.Info;
import types.effect.Explosion;
import types.effect.Recoil;
import types.effect.Sound;
import types.gun.GunFireMode;
import types.items.GunData.GunDataEnum;

public class GunData extends DataBase<GunDataEnum> {

	public static final int GunInfo = 0;
	public static final int BulletInfo = 1;
	public static final int DamageInfo = 4;
	public static final int KnockBackInfo = 5;
	public static final int ExplosionInfo = 6;
	public static final int ItemInfo = 2;
	public static final int ScopeInfo = 3;

	public static final GunData DEFAULT = new GunData();

	public GunData() {
		super(GunDataEnum.class);
	}

	public enum GunDataEnum implements IHideData {
		/** 表示名 String */
		DisplayName("sample"),
		/** 短縮名 String */
		ShortName("sample", new Info().IsName(true)),
		/** アイコン名 String */
		IconName("sample", new Info().IsResourceName(true)),
		/** モデル名 String */
		ModelName("", new Info().IsResourceName(true)),
		/** 所持しているときのHP増加量 Float */
		ItemMaxHealth(0f, new Info().Cate(ItemInfo)),
		/** 所持しているときの移動速度増加量 Float */
		ItemMoveSpeed(0f, new Info().Cate(ItemInfo).Scale("0.1")),
		/** 所持しているときのノックバック耐性増加量 Float */
		ItemKnockbackResistance(0f, new Info().Cate(ItemInfo).Scale("0.1")),
		/** 所持しているときの近接ダメージ増加量 Float */
		ItemAttackDamage(0f, new Info().Cate(ItemInfo).Scale("0.1")),

		/** 弾速 1Tickの移動距離(m)=弾速 Float **/
		BulletSpeed(5f, new Info().Cate(GunInfo).Min(0).Max(128)),
		/** 持ってから撃てるまで ; tickかかる : int型 **/
		PrepareTick(0, new Info().Cate(GunInfo).Min(0)),
		/** ADSへの切り替え時間 ; tickかかる : int型 **/
		ADSTick(0, new Info().Cate(GunInfo).Min(0)),

		/** fovズーム倍率 float型 */
		FOVZoom(1f, new Info().Cate(ScopeInfo).Min(0.5f).Max(8)),
		/** スコープの使用可否 Boolean */
		UseScope(false, new Info().Cate(ScopeInfo)),
		/** モデルスコープを使用するか Boolean */
		ModelScope(false, new Info().Cate(ScopeInfo)),
		/** スコープ名 : String型 */
		ScopeName("", new Info().IsResourceName(true)),
		/** スコープの表示サイズ 画面上の占有率 float */
		ScopeSize(0.7f, new Info().Cate(ScopeInfo).Min(0.1f).Max(1f)),
		/** スコープの中心位置 左上原点 Float */
		ScopeCenterX(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1)),
		/** スコープの中心位置 左上原点 Float */
		ScopeCenterY(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1)),
		/** スコープのズーム倍率 float型 */
		ScopeZoom(2f, new Info().Cate(ScopeInfo).Min(0.6f).Max(8)),

		/** リロード ; リロードにtickかかる : int型 **/
		ReloadTick(20, new Info().Cate(GunInfo).Min(0).Scale("5")),
		/** まとめてリロードできるか : boolean型 */
		ReloadAll(false, new Info().Cate(GunInfo)),
		/** リロード時にマガジンの抜き取りを行うかどうか */
		UnloadInReload(true, new Info().Cate(GunInfo)),
		/** マガジンをアンロードできるか */
		UseUnload(true, new Info().Cate(GunInfo)),
		/** 分間発射数 : int型 **/
		RPM(600, new Info().Cate(GunInfo).Min(1).Scale("10")),

		/** バーストの分間発射数 : int型 **/
		BurstRPM(800, new Info().Cate(GunInfo).Min(1).Scale("10")),
		/** バーストの発射数 : int型 **/
		BurstCount(3, new Info().Cate(GunInfo).Min(1)),
		/** 装填数 : int型 **/
		LoadSize(1, new Info().Cate(GunInfo).Min(1)),
		/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
		Accuracy(0f, new Info().Cate(GunInfo).Min(0)),
		/** ADS精度変化 : 基礎精度に加算 : float型 **/
		AccuracyADS(0f, new Info().Cate(GunInfo).Min(0)),
		/** Sneak精度変化 : 基礎精度に加算 : float型 **/
		AccuracySneak(0f, new Info().Cate(GunInfo).Min(0)),
		/** Sneak+ADS精度変化 : 基礎精度に加算 : float型 **/
		AccuracySneakADS(0f, new Info().Cate(GunInfo).Min(0)),
		/** セカンダリにできるか Boolean */
		UseSecondary(false, new Info().Cate(GunInfo)),
		/** 両手持ちできるか Boolean */
		UseDualwield(false, new Info().Cate(GunInfo)),

		/** 射撃モード : GunFireMode[] **/
		FireMode(new GunFireMode[] { GunFireMode.SEMIAUTO }, new Info()),

		/** 使用するマガジンの登録名 : String[] */
		UseMagazine(ArrayUtils.EMPTY_STRING_ARRAY, new Info().Cate(0)),

		/** デフォルトリコイル : Recoil */
		Recoil(new Recoil()),
		/** ADSリコイル : デフォルトに加算 : Recoil */
		RecoilADS(new Recoil().setUse(false)),
		/** スニークリコイル : デフォルトに加算 : GunRecoil型 */
		RecoilSneak(new Recoil().setUse(false)),
		/** スニークADSリコイル : デフォルトに加算 : GunRecoil型 */
		RecoilSneakADS(new Recoil().setUse(false)),

		/** 発射音 : Sound型 **/
		SoundShoot(new Sound("sample", 60)),
		/** リロード音 : Sound型 **/
		SoundReload(new Sound("sample", 10)),

		/** 弾の飛距離 : Float **/
		Range(500f, new Info().Cate(BulletInfo).Min(1)),
		/** 貫通力 圧延装甲mm : Float **/
		BulletPower(1f, new Info().Cate(BulletInfo).Min(1)),
		/** 発射数 : int型 **/
		ShootCount(1, new Info().Cate(BulletInfo).Min(1)),
		/** 防具貫通率 0-1 : Float **/
		ArmorPenetration(1f, new Info().Cate(DamageInfo).Min(0).Max(1).Scale("0.05")),
		/** HSダメージ倍率 : float型 **/
		HeadMultiplier(2f, new Info().Cate(DamageInfo).Scale("0.1")),
		/** 対人ダメージ keyは飛距離(m) : Curve **/
		DamagePlayer(new Curve(), new Info().Cate(DamageInfo)),
		/** 対MOBダメージ keyは飛距離(m) : Curve **/
		DamageLiving(new Curve(), new Info().Cate(DamageInfo)),
		/** 対地上兵器ダメージ keyは飛距離(m) : Curve **/
		DamageTank(new Curve(), new Info().Cate(DamageInfo)),
		/** 対航空機ダメージ keyは飛距離(m) : Curve **/
		DamageAir(new Curve(), new Info().Cate(DamageInfo)),

		/** 対人ノックバック keyは飛距離(m) : Curve **/
		KnockBackPlayer(new Curve(), new Info().Cate(KnockBackInfo)),
		/** 対MOBノックバック keyは飛距離(m) : Curve **/
		KnockBackLiving(new Curve(), new Info().Cate(KnockBackInfo)),
		/** 対地上兵器ノックバック keyは飛距離(m) : ノックバック距離(m)=ノックバック/重量 : Curve **/
		KnockBackTank(new Curve(), new Info().Cate(KnockBackInfo)),
		/** 対航空機ノックバック keyは飛距離(m) : ノックバック距離(m)=ノックバック/重量 : Curve **/
		KnockBackAir(new Curve(), new Info().Cate(KnockBackInfo)),

		/** 爆発機能の使用 Boolean */
		UseExplosion(false, new Info().Cate(ExplosionInfo)),
		/** 爆発するのに必要な衝撃(貫通力減少値) : Float **/
		FuzeSensitivity(10f, new Info().Cate(ExplosionInfo).Min(0)),
		/** 近接信管の安全距離 : Float **/
		ProximitySafeRange(0f, new Info().Cate(ExplosionInfo).Min(0)),
		/** 近接信管の作動半径 : Float **/
		ProximityRange(0f, new Info().Cate(ExplosionInfo).Min(0)),

		/** 基本のの爆発 : Explosion型 **/
		Explosion(new Explosion(), new Info().Cate(ExplosionInfo)),
		/** 地面に当たった時の爆発 基礎値に加算 : Explosion型 **/
		ExplosionHitGround(new Explosion(), new Info().Cate(ExplosionInfo)),
		/** エンティティに当たった時の爆発 基礎値に加算 : Explosion型 **/
		ExplosionHitEntity(new Explosion(), new Info().Cate(ExplosionInfo)),
		/** 時間経過の爆発 基礎値に加算 : Explosion型 **/
		ExplosionTimeout(new Explosion(), new Info().Cate(ExplosionInfo)),

		/** 着弾音 : Sound型 **/
		SoundHit(new Sound("sample", 60)),
		/** エンティティ着弾音 基礎値に加算 : Sound型 **/
		SoundHitEntity(new Sound("sample", 60)),
		/** 通過音 : Sound型 **/
		SoundPassing(new Sound("sample", 8)),

		/** 透過する・ブロック : String[]型 */
		ThroughBlock(ArrayUtils.EMPTY_STRING_ARRAY, new Info().Cate(BulletInfo)),
		/** 透過するエンティティ : String[]型 */
		ThroughEntity(ArrayUtils.EMPTY_STRING_ARRAY, new Info().Cate(BulletInfo)),

		;
		private Object def;
		private Info info;

		private GunDataEnum(Object defValue) {
			this(defValue, null);
		}

		private GunDataEnum(Object defValue, Info info) {
			def = defValue;
			this.info = info;
		}

		@Override
		public Object getDefault() {
			return def;
		}

		@Override
		public Info getInfo() {
			return info;
		}

		@Override
		public Class<? extends DataBase<?>> getContainer() {
			return GunData.class;
		}
	}
}
