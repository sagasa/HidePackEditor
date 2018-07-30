package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import editer.ValueInfo;

/** langの読み込みと表示用  + 説明書きも対応*/
public class LocalizeHandler {
	/** UnlocalizedNameのリスト */
	static private ArrayList<String> UnlocalizedNames = new ArrayList<String>();
	/** ロードされたlangリスト */
	static private LinkedHashMap<String, HashMap<String, String>> LangMap = new LinkedHashMap<String, HashMap<String, String>>();
	/** 現在使用中のLang */
	static private String nowLang = "default";

	/** ここですべての登録するlangを追加する */
	public static void init() {
		for(Lang lang:Lang.values()){
			addName(lang.toString().toLowerCase());
		}
		// enumをノックしてインスタンスを作らせる
		ValueInfo.BulletDataList.values();
		ValueInfo.ExplosionDataList.values();
		ValueInfo.GunDataList.values();
		ValueInfo.ItemDataList.values();
		ValueInfo.RecoilDataList.values();
		ValueInfo.SoundDataList.values();

		writeDefaultLang();
	}

	/** UnlocalisedNameがvalueのlangファイルを出力 */
	public static void writeDefaultLang() {
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		File defaultLang = new File(langDir, "default.lang");
		try {
			defaultLang.createNewFile();
			FileWriter writer = new FileWriter(defaultLang);
			for (String name : UnlocalizedNames) {
				writer.write(name + " = " + name + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** langディレクトリをあさってLangを読む */
	public static void loadLang() {
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		// ファイルをあさる
		for (File file : langDir.listFiles()) {
			if (file.getName().endsWith(".lang")) {
				try {
					// Mapを用意
					HashMap<String, String> lang = new HashMap<>();
					// 不足分を確認
					@SuppressWarnings("unchecked")
					ArrayList<String> list = (ArrayList<String>) UnlocalizedNames.clone();
					FileReader r = new FileReader(file);
					BufferedReader reader = new BufferedReader(r);
					// 読み込む
					String line;
					while ((line = reader.readLine()) != null) {
						String[] split = line.split("=", 2);
						if (1 < split.length) {
							String key = split[0].trim();
							String value = split[1].trim();
							if (UnlocalizedNames.contains(key)) {
								lang.put(key, value);
								list.remove(key);
							}
						}
					}
					reader.close();
					r.close();
					// ファイル末尾に足りない分を記述 + 登録
					FileWriter writer = new FileWriter(file, true);
					for (String name : list) {
						writer.write(name + " = " + name + "\n");
						lang.put(name, name);
					}
					writer.close();
					// Mapを登録
					LangMap.put(file.getName().replace(".lang", ""), lang);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/** langのリストに_を.に変換して全部小文字にして追加 */
	public static void addName(String name) {
		UnlocalizedNames.add(name);
	}

	/** 有効なLang名の配列を返す */
	public static String[] getLangList() {
		return LangMap.keySet().toArray(new String[LangMap.keySet().size()]);
	}

	/** 今のLang名を取得 */
	public static String getLang() {
		return nowLang;
	}

	/** Langをセット できなければfalse */
	public static boolean setLang(String name) {
		if (LangMap.keySet().contains(name)) {
			nowLang = name;
			return true;
		}
		return false;
	}

	static public String getLocalizedName(String unlocalizedName) {
		Map<String, String> lang = LangMap.get(nowLang);
		if (lang.containsKey(unlocalizedName)) {
			return lang.get(unlocalizedName);
		}
		return null;
	}

	public static String getLocalizedName(Lang lang) {
		return getLocalizedName(lang.toString().toLowerCase());
	}
	
	/** メニュー用Lang */
	public enum Lang {
		File, Edit, New, Open, Save, SaveAs, Import, Gun, Magazine, Armor, Attachment, Icon, Sound, Scope, Lang, Exit,
	}
}
