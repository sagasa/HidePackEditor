package types.effect;

import types.base.Curve;
import types.base.DataBase;
import types.base.Info;
import types.base.Operator;

public class Recoil extends DataBase {

	/** 使用可否 Boolean */
	public static final DataEntry<Boolean> Use = of(true, new Info().Cate(0));
	/** 横反動の基礎値 +で右 Curve */
	public static final DataEntry<Curve> HorizontalBase = of(new Curve(), new Info().Scale("0,1"));
	/** 横反動の拡散値 +で右 Curve */
	public static final DataEntry<Curve> HorizontalSpread = of(new Curve(), new Info().Scale("0,1").Min(0));
	/** 横反動の復帰率 射撃したタイミングで戻りの予約を入れる Curve */
	public static final DataEntry<Curve> HorizontalReturn = of(new Curve(), new Info().Scale("0,1").Min(0));
	/** 横反動適応時間 Curve */
	public static final DataEntry<Curve> HorizontalRecoilTick = of(new Curve(), new Info().Min(0));
	/** 横反動復帰時間 Curve */
	public static final DataEntry<Curve> HorizontalReturnTick = of(new Curve(), new Info().Min(0));

	/** 縦反動の基礎値 +で上 Curve */
	public static final DataEntry<Curve> VerticalBase = of(new Curve(), new Info().Scale("0,1"));
	/** 縦反動の拡散値 +で上 Curve */
	public static final DataEntry<Curve> VerticalSpread = of(new Curve(), new Info().Scale("0,1").Min(0));
	/** 縦反動の復帰率 射撃したタイミングで戻りの予約を入れる Curve */
	public static final DataEntry<Curve> VerticalReturn = of(new Curve(), new Info().Scale("0,1").Min(0));
	/** 縦反動適応時間 Curve */
	public static final DataEntry<Curve> VerticalRecoilTick = of(new Curve(), new Info().Min(0));
	/** 縦反動復帰時間 Curve */
	public static final DataEntry<Curve> VerticalReturnTick = of(new Curve(), new Info().Min(0));

	/** 射撃毎のパワーの増加値 最大1 Float */
	public static final DataEntry<Float> PowerShoot = of(0.0f, new Info().Min(0).Max(1).Scale("0.05"));
	/** Tick毎のパワーの減少値 最大1 Float */
	public static final DataEntry<Float> PowerTick = of(0.0f, new Info().Min(0).Max(1).Scale("0.05"));;

	public Recoil setUse(boolean b) {
		put(Use, Operator.SET, b);
		return this;
	}

}
