package types.items;

import org.apache.commons.lang.ArrayUtils;

import types.base.Curve;
import types.base.Info;
import types.effect.Explosion;
import types.effect.Recoil;
import types.effect.Sound;
import types.gun.GunFireMode;

public class GunData extends ItemData {

	public static final int GunInfo = 0;
	public static final int BulletInfo = 1;
	public static final int DamageInfo = 4;
	public static final int KnockBackInfo = 5;
	public static final int ExplosionInfo = 6;
	public static final int ItemInfo = 2;
	public static final int ScopeInfo = 3;

	public static final GunData DEFAULT = new GunData();

	/** 所持しているときのHP増加量 Float */
	public static final DataEntry<Float> ItemMaxHealth = of(0f, new Info().Cate(ItemInfo));
	/** 所持しているときの移動速度増加量 Float */
	public static final DataEntry<Float> ItemMoveSpeed = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));
	/** 所持しているときのノックバック耐性増加量 Float */
	public static final DataEntry<Float> ItemKnockbackResistance = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));
	/** 所持しているときの近接ダメージ増加量 Float */
	public static final DataEntry<Float> ItemAttackDamage = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));

	/** 弾速 1Tickの移動距離(m)=弾速 Float **/
	public static final DataEntry<Float> BulletSpeed = of(5f, new Info().Cate(GunInfo).Min(0).Max(128));
	/** 持ってから撃てるまで ; tickかかる : int型 **/
	public static final DataEntry<Integer> PrepareTick = of(0, new Info().Cate(GunInfo).Min(0));
	/** ADSへの切り替え時間 ; tickかかる : int型 **/
	public static final DataEntry<Integer> ADSTick = of(0, new Info().Cate(GunInfo).Min(0));

	/** fovズーム倍率 float型 */
	public static final DataEntry<Float> FOVZoom = of(1f, new Info().Cate(ScopeInfo).Min(0.5f).Max(8));
	/** スコープの使用可否 Boolean */
	public static final DataEntry<Boolean> UseScope = of(false, new Info().Cate(ScopeInfo));
	/** モデルスコープを使用するか Boolean */
	public static final DataEntry<Boolean> ModelScope = of(false, new Info().Cate(ScopeInfo));
	/** スコープ名 : String型 */
	public static final DataEntry<String> ScopeName = of("", new Info().IsResourceName(true));
	/** スコープの表示サイズ 画面上の占有率 float */
	public static final DataEntry<Float> ScopeSize = of(0.7f, new Info().Cate(ScopeInfo).Min(0.1f).Max(1f));
	/** スコープの中心位置 左上原点 Float */
	public static final DataEntry<Float> ScopeCenterX = of(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1));
	/** スコープの中心位置 左上原点 Float */
	public static final DataEntry<Float> ScopeCenterY = of(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1));
	/** スコープのズーム倍率 float型 */
	public static final DataEntry<Float> ScopeZoom = of(2f, new Info().Cate(ScopeInfo).Min(0.6f).Max(8));

	/** リロード ; リロードにtickかかる : int型 **/
	public static final DataEntry<Integer> ReloadTick = of(20, new Info().Cate(GunInfo).Min(0).Scale("5"));
	/** まとめてリロードできるか : boolean型 */
	public static final DataEntry<Boolean> ReloadAll = of(false, new Info().Cate(GunInfo));
	/** リロード時にマガジンの抜き取りを行うかどうか */
	public static final DataEntry<Boolean> UnloadInReload = of(true, new Info().Cate(GunInfo));
	/** マガジンをアンロードできるか */
	public static final DataEntry<Boolean> UseUnload = of(true, new Info().Cate(GunInfo));
	/** 分間発射数 : int型 **/
	public static final DataEntry<Integer> RPM = of(600, new Info().Cate(GunInfo).Min(1).Scale("10"));

	/** バーストの分間発射数 : int型 **/
	public static final DataEntry<Integer> BurstRPM = of(800, new Info().Cate(GunInfo).Min(1).Scale("10"));
	/** バーストの発射数 : int型 **/
	public static final DataEntry<Integer> BurstCount = of(3, new Info().Cate(GunInfo).Min(1));
	/** 装填数 : int型 **/
	public static final DataEntry<Integer> LoadSize = of(1, new Info().Cate(GunInfo).Min(1));
	/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	public static final DataEntry<Float> Accuracy = of(0f, new Info().Cate(GunInfo).Min(0));
	/** ADS精度変化 : 基礎精度に加算 : float型 **/
	public static final DataEntry<Float> AccuracyADS = of(0f, new Info().Cate(GunInfo).Min(0));
	/** Sneak精度変化 : 基礎精度に加算 : float型 **/
	public static final DataEntry<Float> AccuracySneak = of(0f, new Info().Cate(GunInfo).Min(0));
	/** Sneak+ADS精度変化 : 基礎精度に加算 : float型 **/
	public static final DataEntry<Float> AccuracySneakADS = of(0f, new Info().Cate(GunInfo).Min(0));
	/** セカンダリにできるか Boolean */
	public static final DataEntry<Boolean> UseSecondary = of(false, new Info().Cate(GunInfo));
	/** 両手持ちできるか Boolean */
	public static final DataEntry<Boolean> UseDualwield = of(false, new Info().Cate(GunInfo));

	/** 射撃モード : GunFireMode[] **/
	public static final DataEntry<GunFireMode[]> FireMode = of(new GunFireMode[] { GunFireMode.SEMIAUTO }, new Info());

	/** 使用するマガジンの登録名 : String[] */
	public static final DataEntry<String[]> UseMagazine = of(ArrayUtils.EMPTY_STRING_ARRAY, new Info().Cate(0));

	/** デフォルトリコイル : Recoil */
	public static final DataEntry<types.effect.Recoil> Recoil = of(new Recoil());
	/** ADSリコイル : デフォルトに加算 : Recoil */
	public static final DataEntry<types.effect.Recoil> RecoilADS = of(new Recoil());
	/** スニークリコイル : デフォルトに加算 : GunRecoil型 */
	public static final DataEntry<types.effect.Recoil> RecoilSneak = of(new Recoil());
	/** スニークADSリコイル : デフォルトに加算 : GunRecoil型 */
	public static final DataEntry<types.effect.Recoil> RecoilSneakADS = of(new Recoil());

	/** 発射音 : Sound型 **/
	public static final DataEntry<Sound> SoundShoot = of(new Sound("sample", 60));
	/** リロード音 : Sound型 **/
	public static final DataEntry<Sound> SoundReload = of(new Sound("sample", 10));

	/** 弾の飛距離 : Float **/
	public static final DataEntry<Float> Range = of(500f, new Info().Cate(BulletInfo).Min(1));
	/** 貫通力 圧延装甲mm : Float **/
	public static final DataEntry<Float> BulletPower = of(1f, new Info().Cate(BulletInfo).Min(1));
	/** 発射数 : int型 **/
	public static final DataEntry<Integer> ShootCount = of(1, new Info().Cate(BulletInfo).Min(1));
	/** 防具貫通率 0-1 : Float **/
	public static final DataEntry<Float> ArmorPenetration = of(1f,
			new Info().Cate(DamageInfo).Min(0).Max(1).Scale("0.05"));
	/** HSダメージ倍率 : float型 **/
	public static final DataEntry<Float> HeadMultiplier = of(2f, new Info().Cate(DamageInfo).Scale("0.1"));
	/** 対人ダメージ keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> DamagePlayer = of(new Curve(), new Info().Cate(DamageInfo));
	/** 対MOBダメージ keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> DamageLiving = of(new Curve(), new Info().Cate(DamageInfo));
	/** 対地上兵器ダメージ keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> DamageTank = of(new Curve(), new Info().Cate(DamageInfo));
	/** 対航空機ダメージ keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> DamageAir = of(new Curve(), new Info().Cate(DamageInfo));

	/** 対人ノックバック keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> KnockBackPlayer = of(new Curve(), new Info().Cate(KnockBackInfo));
	/** 対MOBノックバック keyは飛距離(m) : Curve **/
	public static final DataEntry<Curve> KnockBackLiving = of(new Curve(), new Info().Cate(KnockBackInfo));
	/** 対地上兵器ノックバック keyは飛距離(m) : ノックバック距離(m)=ノックバック/重量 : Curve **/
	public static final DataEntry<Curve> KnockBackTank = of(new Curve(), new Info().Cate(KnockBackInfo));
	/** 対航空機ノックバック keyは飛距離(m) : ノックバック距離(m)=ノックバック/重量 : Curve **/
	public static final DataEntry<Curve> KnockBackAir = of(new Curve(), new Info().Cate(KnockBackInfo));

	/** 爆発機能の使用 Boolean */
	public static final DataEntry<Boolean> UseExplosion = of(false, new Info().Cate(ExplosionInfo));
	/** 爆発するのに必要な衝撃(貫通力減少値) : Float **/
	public static final DataEntry<Float> FuzeSensitivity = of(10f, new Info().Cate(ExplosionInfo).Min(0));
	/** 近接信管の安全距離 : Float **/
	public static final DataEntry<Float> ProximitySafeRange = of(0f, new Info().Cate(ExplosionInfo).Min(0));
	/** 近接信管の作動半径 : Float **/
	public static final DataEntry<Float> ProximityRange = of(0f, new Info().Cate(ExplosionInfo).Min(0));

	/** 基本のの爆発 : Explosion型 **/
	public static final DataEntry<types.effect.Explosion> Explosion = of(new Explosion(),
			new Info().Cate(ExplosionInfo));
	/** 地面に当たった時の爆発 基礎値に加算 : Explosion型 **/
	public static final DataEntry<types.effect.Explosion> ExplosionHitGround = of(new Explosion(),
			new Info().Cate(ExplosionInfo));
	/** エンティティに当たった時の爆発 基礎値に加算 : Explosion型 **/
	public static final DataEntry<types.effect.Explosion> ExplosionHitEntity = of(new Explosion(),
			new Info().Cate(ExplosionInfo));
	/** 時間経過の爆発 基礎値に加算 : Explosion型 **/
	public static final DataEntry<types.effect.Explosion> ExplosionTimeout = of(new Explosion(),
			new Info().Cate(ExplosionInfo));

	/** 着弾音 : Sound型 **/
	public static final DataEntry<Sound> SoundHit = of(new Sound("sample", 60));
	/** エンティティ着弾音 基礎値に加算 : Sound型 **/
	public static final DataEntry<Sound> SoundHitEntity = of(new Sound("sample", 60));
	/** 通過音 : Sound型 **/
	public static final DataEntry<Sound> SoundPassing = of(new Sound("sample", 8));

	/** 透過する・ブロック : String[]型 */
	public static final DataEntry<String[]> ThroughBlock = of(ArrayUtils.EMPTY_STRING_ARRAY,
			new Info().Cate(BulletInfo));
	/** 透過するエンティティ : String[]型 */
	public static final DataEntry<String[]> ThroughEntity = of(ArrayUtils.EMPTY_STRING_ARRAY,
			new Info().Cate(BulletInfo));

}
