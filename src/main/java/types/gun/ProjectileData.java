package types.gun;

import types.base.DataBase;
import types.base.Info;
import types.effect.Explosion;
import types.effect.Recoil;
import types.effect.Sound;
import types.value.Curve;

public class ProjectileData extends DataBase {

	public static final int GunInfo = 0;
	public static final int BulletInfo = 1;
	public static final int DamageInfo = 4;
	public static final int KnockBackInfo = 5;
	public static final int ExplosionInfo = 6;

	public static final ProjectileData DEFAULT = new ProjectileData();

	/** デフォルトリコイル : Recoil */
	public static final DataEntry<Recoil> Recoil = of(new Recoil());
	/** ADSリコイル変化 : Recoil */
	public static final DataEntry<Recoil> RecoilADS = of(new Recoil());
	/** スニークリコイル変化 : GunRecoil型 */
	public static final DataEntry<Recoil> RecoilSneak = of(new Recoil());

	/** 精度 : 50ブロック先で1辺精度mの正方形に当たる : float型 **/
	public static final DataEntry<Float> Accuracy = of(0f, new Info().Cate(GunInfo).Min(0));
	/** ADS精度変化 : float型 **/
	public static final DataEntry<Float> AccuracyADS = of(0f, new Info().Cate(GunInfo).Min(0));
	/** Sneak精度変化 : float型 **/
	public static final DataEntry<Float> AccuracySneak = of(0f, new Info().Cate(GunInfo).Min(0));
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

	/** 弾速 1Tickの移動距離(m)=弾速 Float **/
	public static final DataEntry<Float> BulletSpeed = of(5f, new Info().Cate(BulletInfo).Min(0).Max(128));
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
	public static final DataEntry<Boolean> UseFuse = of(false, new Info().Cate(ExplosionInfo));
	/** 安全距離 : Float **/
	public static final DataEntry<Float> SafeRange = of(0f, new Info().Cate(ExplosionInfo).Min(0));
	/** 爆発するのに必要な衝撃(貫通力減少値) : Float **/
	public static final DataEntry<Float> FuzeSensitivity = of(10f, new Info().Cate(ExplosionInfo).Min(0));
	/** 近接信管の作動半径 : Float **/
	public static final DataEntry<Float> ProximityRange = of(0f, new Info().Cate(ExplosionInfo).Min(0));
	/** タイムアウトで爆破するか Boolean */
	public static final DataEntry<Boolean> ExplosionOnTimeout = of(true, new Info().Cate(ExplosionInfo));

	/** 基本の爆発 : Explosion型 **/
	public static final DataEntry<Explosion> Explosion = of(new Explosion(), new Info().Cate(ExplosionInfo));

	/** 着弾音 : Sound型 **/
	public static final DataEntry<Sound> SoundHit = of(new Sound("sample", 60));
	/** エンティティ着弾音 基礎値に加算 : Sound型 **/
	public static final DataEntry<Sound> SoundHitEntity = of(new Sound("sample", 60));
	/** 通過音 : Sound型 **/
	public static final DataEntry<Sound> SoundPassing = of(new Sound("sample", 8));

	/** 発射音 : Sound型 **/
	public static final DataEntry<Sound> SoundShoot = of(new Sound("sample", 60));
	/** リロード音 : Sound型 **/
	public static final DataEntry<Sound> SoundReload = of(new Sound("sample", 10));
}
