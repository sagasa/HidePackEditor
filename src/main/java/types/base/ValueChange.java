package types.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class ValueChange extends DataBase {

	public String PATH = "";

	public Operater OPERATER = Operater.Set;

	/**自動解釈が入る*/
	public String VALUE = null;

	public transient Object VALUE_CASH = null;

	/**与えられたクラスから型を引き出して適切なオブジェクトを代入する*/
	public void makeCash(Class<?> clazz) {
		try {
			Class<?> type = DataBase.getType(clazz, PATH);
			//ListならTypeの中身を変更
			if (List.class.isAssignableFrom(type) && (OPERATER == Operater.ListAdd || OPERATER == Operater.ListRemove)) {
				type = (Class<?>) ((ParameterizedType) DataBase.getGenericType(clazz, PATH)).getActualTypeArguments()[0];
			}

			if (int.class.isAssignableFrom(type) || float.class.isAssignableFrom(type)) {
				VALUE_CASH = Float.valueOf(VALUE);
			} else if (String.class.isAssignableFrom(type)) {
				VALUE_CASH = VALUE;
			} else {
				VALUE_CASH = DataBase.getGson().fromJson(VALUE, type);
			}
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}

	public enum Operater {
		Set, Add, Multiply, ListAdd, ListRemove
	}
}