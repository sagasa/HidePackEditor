package types.effect;

import types.base.Curve;
import types.base.DataBase;
import types.base.IHideData;
import types.base.Info;
import types.effect.Explosion.ExplosionData;

public class Explosion extends DataBase<ExplosionData> {

	public Explosion() {
		super(ExplosionData.class);
	}

	public enum ExplosionData implements IHideData {
		/** 再生する音 Sound */
		Sound(new Sound("minecraft:random.explode", 50f)),

		/** 計算する半径 Float */
		Range(0.0f, new Info().Min(0)),
		/** 対プレイヤーダメージ Curve */
		DamagePlayer(new Curve()),
		/** 対Mobダメージ Curve */
		DamageLiving(new Curve()),
		/** 対地上兵器ダメージ Curve */
		DamageTank(new Curve()),
		/** 対航空機ダメージ Curve */
		DamageAir(new Curve()),

		/** 対プレイヤーダメージ Curve */
		KnockBackPlayer(new Curve()),
		/** 対Mobダメージ Curve */
		KnockBackLiving(new Curve()),
		/** 対地上兵器ダメージ Curve */
		KnockBackTank(new Curve()),
		/** 対航空機ダメージ Curve */
		KnockBackAir(new Curve()),;

		private Object def;
		private Info info;

		private ExplosionData(Object defValue) {
			this(defValue, null);
		}

		private ExplosionData(Object defValue, Info info) {
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
			return Explosion.class;
		}
	}
}