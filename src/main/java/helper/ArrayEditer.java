package helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import editer.DataEntityInterface;

/** プリミティブ配列の結合など */
public class ArrayEditer {

	// ===========検索============
	private static final String space = " ";// TODO

	/** 検索一致判定処理 スペースで区切ってそれぞれ判定、1つでも含んでいたらtrue */
	public static List<DataEntityInterface> Search(List<? extends DataEntityInterface> value, String key) {
		return value.stream().filter(data -> Search(data.getDisplayName(), key)).sorted().collect(Collectors.toList());
	}

	/**
	 * 検索一致判定処理 スペースで区切ってそれぞれ判定、1つでも含んでいたらtrue
	 */
	public static boolean Search(String value, String keys) {
		if (keys == null)
			return true;
		if (value == null)
			return false;
		value = value.trim();

		int p = 0;
		for(String key:keys.split(space)) {
			p = value.indexOf(key, p);
			if(p==-1) {
				return false;
			}
		}

		/*// 旧検索処理 キーの順序を問わない
		Map<String, Integer> keyMap = new HashMap<>();
		for (String key : keys.split(space)) {
			if (keyMap.containsKey(key)) {
				keyMap.put(key, keyMap.get(key) + 1);
			} else {
				keyMap.put(key, 1);
			}
		}

		for (String key : keyMap.keySet()) {
			int keyNum = keyMap.get(key);
			int matchNum = 0;
			int pointer = 0;
			while (keyNum > matchNum) {
				// 検索
				pointer = value.indexOf(key, pointer);
				if (pointer == -1) {
					return false;
				}
				pointer += key.length();
				matchNum++;
			}
		}//*/
		return true;
	}

	/** byte配列2つを結合 */
	static public byte[] ByteArrayCombining(byte[] in1, byte[] in2) {
		byte[] out = new byte[in1.length + in2.length];
		System.arraycopy(in1, 0, out, 0, in1.length); // a→cにコピー
		System.arraycopy(in2, 0, out, in1.length, in2.length); // b→cにコピー
		return out;
	}

	/** 配列から要素を削除 */
	static public String[] RemoveFromArray(String[] array, String data) {
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		Array.remove(data);
		return Array.toArray(new String[Array.size()]);
	}

	/** 配列に要素を追加 */
	static public String[] AddToArray(String[] array, String data) {
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		Array.add(data);
		return Array.toArray(new String[Array.size()]);
	}

	/** 配列の要素をインデックス指定で交換 */
	static public String[] ChangeArrayIndex(String[] array, int index1, int index2) {
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		String str1 = Array.get(index1);
		String str2 = Array.get(index2);
		Array.set(index1, str2);
		Array.set(index2, str1);
		return Array.toArray(new String[Array.size()]);
	}
}
