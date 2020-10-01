package types.effect;

import types.base.DataBase;
import types.base.Info;
import types.value.Curve;

public class Explosion extends DataBase {

	/** 再生する音 Sound */
	public static final DataEntry<types.effect.Sound> Sound = of(new Sound("minecraft:random.explode", 50f));

	/** 計算する半径 Float */
	public static final DataEntry<Float> Range = of(0.0f, new Info().Min(0));
	/** 対プレイヤーダメージ Curve */
	public static final DataEntry<Curve> DamagePlayer = of(new Curve());
	/** 対Mobダメージ Curve */
	public static final DataEntry<Curve> DamageLiving = of(new Curve());
	/** 対地上兵器ダメージ Curve */
	public static final DataEntry<Curve> DamageTank = of(new Curve());
	/** 対航空機ダメージ Curve */
	public static final DataEntry<Curve> DamageAir = of(new Curve());

	/** 対プレイヤーダメージ Curve */
	public static final DataEntry<Curve> KnockBackPlayer = of(new Curve());
	/** 対Mobダメージ Curve */
	public static final DataEntry<Curve> KnockBackLiving = of(new Curve());
	/** 対地上兵器ダメージ Curve */
	public static final DataEntry<Curve> KnockBackTank = of(new Curve());
	/** 対航空機ダメージ Curve */
	public static final DataEntry<Curve> KnockBackAir = of(new Curve());;

}