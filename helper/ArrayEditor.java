package helper;

/**プリミティブ配列の結合など*/
public class ArrayEditor {
	/**byte配列2つを結合*/
	static public byte[] ByteArrayCombining(byte[] in1,byte[] in2){
		byte[] out = new byte[in1.length + in2.length];
		System.arraycopy(in1,0,out,0,in2.length); //a→cにコピー
		System.arraycopy(in2,0,out,in1.length, in2.length); //b→cにコピー
		return out;
	}
}
