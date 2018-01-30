package types;

import java.util.ArrayList;
import java.util.HashMap;

/**Langファイル関係*/
public class Lang {
	
	/**登録名のリスト*/
	static ArrayList<String> LangList = new ArrayList<String>();
	/**登録名-LangのMAP*/
	static HashMap<String,HashMap<String,String>> LangDataMap = new HashMap<String,HashMap<String,String>>();
	/**使用するLang(登録名)*/
	static String UseLang;
	
	/**インターフェースの文字列*/
	public enum LangData{
		/** 登録名 : String型 全部小文字 **/
		SET("set"),
		;
		String Name;
		LangData(String name){
			Name=name;
		}
		/**表示用文字列を取得*/
		public String get(){
			return LangDataMap.get(UseLang).get(this.toString());
		}
		/**登録名を取得*/
		public String getName(){
			return this.toString();
		}
		/**デフォルト表示を取得*/
		public String getDefault(){
			return this.Name;
		}
	}
	public Lang (){
		HashMap<String,String> newLang = new HashMap<String,String>();
	}
}
