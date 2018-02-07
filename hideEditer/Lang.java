package hideEditer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

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
		FILE("File"),
		Edit("Edit"),
		NEW("New"),
		OPEN("Open"),
		SAVE("Save"),
		;
		String Name;
		LangData(String name){
			Name=name;
		}
		/**表示用文字列を取得*/
		public String get(){
			if(LangDataMap.get(UseLang).containsKey(this.toString())){
				return LangDataMap.get(UseLang).get(this.toString());
			}else{
				return this.getDefault();
			}
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
	/**ファイルリストを要求*/
	public static String[] getLangList(){
		return LangList.toArray(new String[LangList.size()]);
	}
	/**Langセットを設定*/
	public static boolean setLang(String langName){
		if (LangList.contains(langName)){
			UseLang = langName;
			return true;
		}else{
			return false;
		}
	}
	//Englishを登録
	static void LangInit (File langDir) throws IOException{
		//例としてEnglish.langを出力
		FileWriter writer = new FileWriter(langDir.getAbsolutePath()+"/English.lang");
		for (LangData d:LangData.values()){
			writer.write(d.getName()+"="+d.getDefault()+"\n");
		}
		writer.close();
		UseLang = "English";
	}
	/**ファイルからLangを読み取る*/
	public static void readLang(String path){
		File langDir = new File(path);
		if (!langDir.exists()){
			langDir.mkdirs();
		}
		//System.out.println(langDir.getAbsolutePath());
		try {
			LangInit(langDir);
			for (File file : langDir.listFiles()){
				//.langのファイルだけ読み取る
				if (file.isFile() && file.getName().endsWith(".lang"))
				{
					//ファイル読み込み
					System.out.println("Loaded content Lang : " + file.getName());

					BufferedReader input = new BufferedReader(new FileReader(file));
					String line;
					HashMap<String,String> data = new HashMap<String,String>();
					while((line = input.readLine()) !=null){
						String[] split = line.split("=");
						if (split[1]!=null){
							data.put(split[0], split[1]);
						}
					}
					input.close();
					//Lang登録
					HashMap<String,String> newLang = new HashMap<String,String>();
					for(LangData d :LangData.values()){
						if (data.get(d.getName())!=null){
							newLang.put(d.getName(), data.get(d.getName()));
						}
						System.out.println(d.getName());
					}
					String langName = Pattern.compile(".lang").matcher(file.getName()).replaceAll("");
					LangDataMap.put(langName, newLang);
					LangList.add(langName);
				}

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
