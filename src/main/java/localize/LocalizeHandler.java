package localize;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.ResourceBundle;

import helper.DataPath;
import helper.EditHelper;
import types.PackInfo;
import types.base.DataBase;
import types.effect.Explosion;
import types.effect.Recoil;
import types.effect.Sound;
import types.items.GunData;
import types.items.MagazineData;
import types.projectile.BulletData;

/** langの読み込みと表示用 + 説明書きも対応 */
public class LocalizeHandler {
	/** UnlocalizedNameのリスト */
	static private ArrayList<String> UnlocalizedNames = new ArrayList<String>();
	/** ロードされたlangリスト */
	static private LinkedHashMap<String, ResourceBundle> LangMap = new LinkedHashMap<String, ResourceBundle>();
	/** 現在使用中のLang */
	static private String nowLang = "default";

	static private ResourceBundle defaultRB;

	/** ここですべての登録するlangを追加する */
	public static void init() {
		for (Lang lang : Lang.values()) {
			addName(lang.toString().toLowerCase());
		}
		// DataBaseクラスのローカライズファイルを作成
		makeLocalize(GunData.class);
		makeLocalize(BulletData.class);
		makeLocalize(Recoil.class);
		makeLocalize(Sound.class);
		makeLocalize(Explosion.class);
		makeLocalize(PackInfo.class);
		makeLocalize(MagazineData.class);

		writeDefaultLang();
	}

	private static void makeLocalize(Class<? extends DataBase> clazz) {
		for (Field field : clazz.getFields()) {
			LocalizeHandler.addName(EditHelper.getUnlocalizedName(clazz, new DataPath(field.getName())));
		}
	}

	/** UnlocalisedNameがvalueのlangファイルを出力 */
	public static void writeDefaultLang() {
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		// デフォルトを書き込み
		try (FileWriter writer = new FileWriter("./lang/lang_default.properties", false)) {
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
		//デフォルトLangを読み込み
		defaultRB = ResourceBundle.getBundle("lang");
		//jar外のLang読み取り
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		// クラスローダーを用意
		try (URLClassLoader cl = new URLClassLoader(new URL[] { langDir.toURI().toURL() })) {
			for (File file : langDir.listFiles()) {
				if (file.getName().endsWith(".properties") && file.getName().startsWith("lang_")) {
					String lang = file.getName().replace(".properties", "").replace("lang_", "");
					ResourceBundle rb = ResourceBundle.getBundle("lang", new Locale(lang), cl);
					LangMap.put(lang, rb);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/** langのリストに_を.に変換して全部小文字にして追加 */
	public static void addName(String name) {
		if (!UnlocalizedNames.contains(name))
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
		ResourceBundle lang = LangMap.get(nowLang);
		if (lang != null && lang.containsKey(unlocalizedName))
			return lang.getString(unlocalizedName);
		if (defaultRB.containsKey(unlocalizedName))
			return defaultRB.getString(unlocalizedName);
		return null;
	}

	static public String getLocalizedName(DataBase data, DataPath path) {
		return getLocalizedName(EditHelper.getUnlocalizedName(data.getClass(), path));
	}

	/** メニュー用ローカライズデータ取得 */
	public static String getLocalizedName(Lang lang) {
		return getLocalizedName(lang.toString().toLowerCase());
	}

	/** メニュー用Lang */
	public enum Lang {
		File, Edit, New, Open, Save, SaveAs, Import, Gun, Magazine, Armor, Attachment, Icon, Sound, Scope, Lang, Exit,
	}
}
