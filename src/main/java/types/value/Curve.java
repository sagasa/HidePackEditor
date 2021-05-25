package types.value;

import org.apache.commons.lang.ArrayUtils;

/** キーと任意の数値の配列 Larpして取得 */
public class Curve implements Cloneable {
	public CurveKey[] Keys = new CurveKey[0];

	transient Operator operator;
	transient Curve pearnt;

	public Curve() {
		Keys = new CurveKey[] { new CurveKey(0, 0) };
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
		if (Keys.length == 0)
			return 0;
		if (Keys.length == 1)
			return Keys[0].Value;
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
		Float res = Keys[Keys.length - 1].Value;
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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Curve) {
			Curve other = (Curve) obj;
			return operator == other.operator && ArrayUtils.isEquals(Keys, other.Keys);
		}
		return false;
	}

	@Override
	public String toString() {

		return ArrayUtils.toString(Keys);
	}

	public static class CurveKey implements Cloneable {
		public float Key;
		public float Value;

		public CurveKey() {
		}

		public CurveKey(float key, float value) {
			Key = key;
			Value = value;
		}

		@Override
		public String toString() {
			return String.format("key=%s,Value=%s", Key, Value);
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
