package helper;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.ArrayUtils;

import editer.IDataEntity;

/** プリミティブ配列の結合など */
public class ArrayEditor {

	// ===========検索============
	private static final String space = " ";// TODO

	/**
	 * 検索 結果のリストを返す
	 *
	 * @param <T>
	 */
	public static <T extends IDataEntity> List<T> Search(Collection<T> value, String key) {
		return value.stream().filter(data -> Search(data.getDisplayName(), key)).sorted().collect(Collectors.toList());
	}

	/**
	 * 検索一致判定処理 スペースで区切ってそれぞれ判定、すべて含んでいたらtrue
	 */
	public static boolean Search(String value, String keys) {
		if (keys == null)
			return true;
		if (value == null)
			return false;
		value = value.trim();

		int p = 0;
		for (String key : keys.split(space)) {
			p = value.indexOf(key, p);
			if (p == -1) {
				return false;
			}
		}

		/*
		 * // 旧検索処理 キーの順序を問わない Map<String, Integer> keyMap = new HashMap<>(); for
		 * (String key : keys.split(space)) { if (keyMap.containsKey(key)) {
		 * keyMap.put(key, keyMap.get(key) + 1); } else { keyMap.put(key, 1); } }
		 *
		 * for (String key : keyMap.keySet()) { int keyNum = keyMap.get(key); int
		 * matchNum = 0; int pointer = 0; while (keyNum > matchNum) { // 検索 pointer =
		 * value.indexOf(key, pointer); if (pointer == -1) { return false; } pointer +=
		 * key.length(); matchNum++; } }//
		 */
		return true;
	}

	/** byte配列2つを結合 */
	static public byte[] ByteArrayCombining(byte[] in1, byte[] in2) {
		byte[] out = new byte[in1.length + in2.length];
		System.arraycopy(in1, 0, out, 0, in1.length); // a→cにコピー
		System.arraycopy(in2, 0, out, in1.length, in2.length); // b→cにコピー
		return out;
	}

	/**
	 * 配列から要素を削除
	 *
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	static public <T> T[] removeFromArray(T[] array, T data) {
		int index = ArrayUtils.indexOf(array, data);
		if (index == -1)
			return array;
		return (T[]) ArrayUtils.remove(array, index);
	}

	/**
	 * 配列に要素を追加 重複を許可しない
	 *
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	static public <T> T[] addToArray(T[] array, T data) {
		if (ArrayUtils.contains(array, data))
			return array;
		else
			return (T[]) ArrayUtils.add(array, data);
	}

	/**
	 * 配列から要素を削除した新しい配列を返す 変更が無ければそのまま返す
	 *
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	static public <T> T[] makeSubArray(T[] array, T[] data) {
		if (data.length == 0) {
			return array;
		}

		int[] remove = new int[data.length];
		int removeSize = 0;
		for (T t : data) {
			int i = ArrayUtils.indexOf(array, t);
			if (i != -1) {
				remove[removeSize] = i;
				removeSize++;
			}
		}
		if (removeSize == 0)
			return array;
		remove = ArrayUtils.subarray(remove, 0, removeSize - 1);
		Arrays.sort(remove);
		Object res = Array.newInstance(array.getClass().getComponentType(), array.length - removeSize);
		int last = 0;
		int count = 0;
		for (int i : remove) {
			if (i < array.length - 1) {
				System.arraycopy(array, last - count, res, last, i - last);
			}
			last = i + 1;
			count++;
		}
		return (T[]) res;
	}

	/**
	 * 配列に要素を追加
	 *
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	static public <T> T[] makeSumArray(T[] array, T[] data) {
		if (data.length == 0) {
			return array;
		}

		Object[] add = new Object[data.length];
		int addSize = 0;
		for (T t : data) {
			if (!ArrayUtils.contains(array, t)) {
				add[addSize] = t;
				addSize++;
			}
		}
		if (addSize == 0)
			return array;
		Object res = Array.newInstance(array.getClass().getComponentType(), array.length + addSize);
		System.arraycopy(array, 0, res, 0, array.length);
		System.arraycopy(add, 0, res, array.length, addSize);
		return (T[]) res;
	}

	/**
	 * 配列の要素をインデックス指定で交換
	 */
	static public <T> T[] makeSwapArray(T[] array, int index1, int index2) {
		T[] res = array.clone();
		T cash = res[index1];
		res[index1] = res[index2];
		res[index2] = cash;
		return res;
	}
}
