package helper;

import java.util.ArrayList;
import java.util.Arrays;

/**プリミティブ配列の結合など*/
public class ArrayEditor {
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
}
