package helper;

import java.util.ArrayList;
import java.util.Arrays;

/**プリミティブ配列の結合など*/
public class ArrayEditer {
	/**byte配列2つを結合*/
	static public byte[] ByteArrayCombining(byte[] in1,byte[] in2){
		byte[] out = new byte[in1.length + in2.length];
		System.arraycopy(in1,0,out,0,in1.length); //a→cにコピー
		System.arraycopy(in2,0,out,in1.length, in2.length); //b→cにコピー
		return out;
	}
	/**配列から要素を削除*/
	static public String[] RemoveFromArray(String[] array ,String data){
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		Array.remove(data);
		return Array.toArray(new String[Array.size()]);
	}
	/**配列に要素を追加*/
	static public String[] AddToArray(String[] array ,String data){
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		Array.add(data);
		return Array.toArray(new String[Array.size()]);
	}
	/**配列の要素をインデックス指定で交換*/
	static public String[] ChangeArrayIndex(String[] array ,int index1,int index2){
		ArrayList<String> Array = new ArrayList<String>(Arrays.asList(array));
		String str1 = Array.get(index1);
		String str2 = Array.get(index2);
		Array.set(index1, str2);
		Array.set(index2, str1);
		return Array.toArray(new String[Array.size()]);
	}
}
