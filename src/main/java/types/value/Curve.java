package types.value;

/** キーと任意の数値の配列 Larpして取得 */
public class Curve implements Cloneable{
	CurveKey[] Keys = new CurveKey[0];

	transient Operator operator;
	transient Curve pearnt;

	public Curve() {
		Keys = new CurveKey[] { new CurveKey(0, 0), new CurveKey(1, 10) };
	}

	void setAdd(Curve base) {
		operator = Operator.ADD;
		pearnt = base;
	}

	void setMultiple(Curve base) {
		operator = Operator.MULTIPLE;
		pearnt = base;
	}

	public float get(float key) {
		for (int i = 0; i < Keys.length; i++) {
			if (key <= Keys[i].Key) {
				float minKey = 0 < i ? Keys[i - 1].Key : 0;
				float minValue = 0 < i ? Keys[i - 1].Value : 0;
				float maxKey = Keys[i].Key;
				float maxValue = Keys[i].Value;

				Float res = minValue + ((key - minKey) / (maxKey - minKey) * (maxValue - minValue));
				// 親がいるなら
				if (pearnt != null)
					res = operator.apply(pearnt.get(key), res);
				return res;
			}
		}
		Float res = 0 < Keys.length ? Keys[Keys.length - 1].Value : 0;
		// 親がいるなら
		if (pearnt != null)
			res = operator.apply(pearnt.get(key), res);
		return res;
	}

	@Override
	public Curve clone() {
		Curve curve;
		try {
			curve = (Curve) super.clone();
			curve.Keys = new CurveKey[Keys.length];
			for (int i = 0; i < Keys.length; i++) {
				curve.Keys[i] = Keys[i].clone();
			}
			return curve;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static class CurveKey implements Cloneable{
		public float Key;
		public float Value;

		public CurveKey() {
		}

		public CurveKey(float key, float value) {
			Key = key;
			Value = value;
		}

		@Override
		protected CurveKey clone() {
			try {
				return (CurveKey) super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
}
