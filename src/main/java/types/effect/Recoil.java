package types.effect;

import types.base.Curve;
import types.base.DataBase;
import types.base.IHideData;
import types.base.Info;
import types.base.Operator;
import types.effect.Recoil.RecoilData;

public class Recoil extends DataBase<RecoilData> {

	public Recoil() {
		super(RecoilData.class);
	}

	public enum RecoilData implements IHideData {
		/** 使用可否 Boolean */
		Use(true, new Info().Cate(0)),
		/** 横反動の基礎値 +で右 Curve */
		HorizontalBase(new Curve(), new Info().Scale("0,1")),
		/** 横反動の拡散値 +で右 Curve */
		HorizontalSpread(new Curve(), new Info().Scale("0,1").Min(0)),
		/** 横反動の復帰率 射撃したタイミングで戻りの予約を入れる Curve */
		HorizontalReturn(new Curve(), new Info().Scale("0,1").Min(0)),
		/** 横反動適応時間 Curve */
		HorizontalRecoilTick(new Curve(), new Info().Min(0)),
		/** 横反動復帰時間 Curve */
		HorizontalReturnTick(new Curve(), new Info().Min(0)),

		/** 縦反動の基礎値 +で上 Curve */
		VerticalBase(new Curve(), new Info().Scale("0,1")),
		/** 縦反動の拡散値 +で上 Curve */
		VerticalSpread(new Curve(), new Info().Scale("0,1").Min(0)),
		/** 縦反動の復帰率 射撃したタイミングで戻りの予約を入れる Curve */
		VerticalReturn(new Curve(), new Info().Scale("0,1").Min(0)),
		/** 縦反動適応時間 Curve */
		VerticalRecoilTick(new Curve(), new Info().Min(0)),
		/** 縦反動復帰時間 Curve */
		VerticalReturnTick(new Curve(), new Info().Min(0)),

		/** 射撃毎のパワーの増加値 最大1 Float */
		PowerShoot(0.0f, new Info().Min(0).Max(1).Scale("0.05")),
		/** Tick毎のパワーの減少値 最大1 Float */
		PowerTick(0.0f, new Info().Min(0).Max(1).Scale("0.05")),;

		private Object def;
		private Info info;

		private RecoilData(Object defValue) {
			this(defValue, null);
		}

		private RecoilData(Object defValue, Info info) {
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
			return Recoil.class;
		}
	}

	public Recoil setUse(boolean b) {
		put(RecoilData.Use, Operator.SET, b);
		return this;
	}
}
