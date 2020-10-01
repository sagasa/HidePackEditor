package types.value;

import java.util.function.BiFunction;

import helper.ArrayEditor;

/** 親の値に対する操作 */
public enum Operator {
	SET((target, value) -> value), ADD((target, value) -> {
		if (Integer.class.isAssignableFrom(target.getClass())) {
			return ((Integer) target) + ((Integer) value);
		} else if (Float.class.isAssignableFrom(target.getClass())) {
			return ((Float) target) + ((Float) value);
		} else if (Curve.class.isAssignableFrom(target.getClass())) {
			Curve newValue = new Curve();
			newValue.Keys = ((Curve) value).Keys.clone();
			newValue.setAdd((Curve) target);
			return newValue;
		}
		throw new IllegalArgumentException(
				"Operator not supported for this type " + target.getClass() + " " + value.getClass());
	}), MULTIPLE((target, value) -> {
		if (Integer.class.isAssignableFrom(target.getClass())) {
			return ((Integer) target) * ((Integer) value);
		} else if (Float.class.isAssignableFrom(target.getClass())) {
			return ((Float) target) * ((Float) value);
		} else if (Curve.class.isAssignableFrom(target.getClass())) {
			Curve newValue = new Curve();
			newValue.Keys = ((Curve) value).Keys.clone();
			newValue.setMultiple((Curve) target);
			return newValue;
		}
		throw new IllegalArgumentException(
				"Operator not supported for this type " + target.getClass() + " " + value.getClass());
	}), ARRAY_ADD((target, value) -> ArrayEditor.makeSumArray((Object[]) target, (Object[]) value)),
	ARRAY_REMOVE((target, value) -> ArrayEditor.makeSubArray((Object[]) target, (Object[]) value));

	private static Operator[] NUMBER = new Operator[] { SET, ADD, MULTIPLE };
	private static Operator[] ARRAY = new Operator[] { SET, ARRAY_ADD, ARRAY_REMOVE };
	private static Operator[] OTHER = new Operator[] { SET };

	private BiFunction<Object, Object, Object> func;

	/** 元値 変更値 -> 結果 */
	private Operator(BiFunction<Object, Object, Object> func) {
		this.func = func;
	}

	@SuppressWarnings("unchecked")
	public <T> T apply(T tartget, T value) {
		return (T) func.apply(tartget, value);
	}

	public static Operator[] getAllow(Class<?> clazz) {
		if (clazz.isArray())
			return ARRAY;
		else if (Integer.class.isAssignableFrom(clazz) || int.class.isAssignableFrom(clazz)
				|| Float.class.isAssignableFrom(clazz) || float.class.isAssignableFrom(clazz)) {
			return NUMBER;
		}
		return OTHER;
	}

}