package localize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ResourceBundle;

import helper.EditHelper;
import types.PackInfo;
import types.base.DataBase;
import types.base.DataBase.DataEntry;
import types.base.DataPath;
import types.base.NamedData;
import types.effect.Explosion;
import types.effect.Recoil;
import types.effect.Sound;
import types.gun.ProjectileData;
import types.items.GunData;
import types.items.ItemData;
import types.items.MagazineData;

/** langの読み込みと表示用 + 説明書きも対応 */
public class LocalizeHandler {
	/** UnlocalizedNameのリスト */
	static private ArrayList<String> UnlocalizedNames = new ArrayList<>();
	/** ロードされたlangリスト */
	static private LinkedHashMap<String, ResourceBundle> LangMap = new LinkedHashMap<>();
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
		makeLocalize(Recoil.class);
		makeLocalize(Sound.class);
		makeLocalize(Explosion.class);
		makeLocalize(ItemData.class);
		makeLocalize(MagazineData.class);
		makeLocalize(NamedData.class);
		makeLocalize(ProjectileData.class);
		makeLocalize(PackInfo.class);
		// makeLocalize(Vec3f.class);
		// makeLocalize(HideModel.class);
		// makeLocalize(AnimationKey.class);

		writeDefaultLang();
	}

	private static void makeLocalize(Class<? extends DataBase> clazz) {
		DataBase.getEntries(clazz);
		try {
			for (Field field : clazz.getDeclaredFields()) {
				if (DataEntry.class.isAssignableFrom(field.getType())) {
					DataEntry<?> entry = (DataEntry<?>) field.get(null);
					if (entry != null)
						LocalizeHandler.addName(EditHelper.getUnlocalizedName(clazz, DataPath.of(entry)));
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/** UnlocalisedNameがvalueのlangファイルを出力 */
	public static void writeDefaultLang() {
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		// デフォルトを書き込み
		try (FileWriter writer = new FileWriter("./lang/default.properties", false)) {
			Map<String, String> map = new HashMap<>();
			for (String name : UnlocalizedNames) {
				writer.write(name + " = " + name + "\n");
				map.put(name, name);
			}
			defaultRB = new HideLocalizeResource(map);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** langディレクトリをあさってLangを読む */
	public static void loadLang() {
		// デフォルトLangを読み込み
		// jar外のLang読み取り
		File langDir = new File("./lang");
		if (!langDir.exists() || !langDir.isDirectory()) {
			langDir.mkdir();
		}
		try {
			for (File file : langDir.listFiles()) {
				if (file.getName().endsWith(".properties")) {
					String lang = file.getName().replace(".properties", "");
					InputStreamReader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
					LangMap.put(lang, new HideLocalizeResource(reader, defaultRB));
					reader.close();
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

	public static ResourceBundle getResourceBundle() {
		return LangMap.containsKey(nowLang) ? LangMap.get(nowLang) : defaultRB;
	}

	/** Langをセット できなければfalse */
	public static boolean setLang(String name) {
		if (LangMap.keySet().contains(name)) {
			nowLang = name;
			return true;
		}
		return false;
	}

	private static String getLocalized(String unlocalizedName) {
		ResourceBundle lang = LangMap.get(nowLang);
		if (lang != null && lang.containsKey(unlocalizedName))
			return lang.getString(unlocalizedName);
		else if (defaultRB.containsKey(unlocalizedName))
			return defaultRB.getString(unlocalizedName);
		throw new NullPointerException(unlocalizedName + " not found");
	}

	private static String toName(String unlocalizedName) {
		// System.out.println(unlocalizedName);
		return getLocalized(unlocalizedName).split(":", 2)[0];
	}

	private static String toLore(String unlocalizedName) {
		String[] split = getLocalized(unlocalizedName).split(":", 2);
		return split.length == 2 ? split[1] : null;
	}

	static public String getLocalizedName(Class<? extends DataBase> clazz, DataPath path) {
		return toName(EditHelper.getUnlocalizedName(clazz, path));
	}

	/** メニュー用ローカライズデータ取得 */
	public static String getLocalizedName(Lang lang) {
		return toName(lang.toString().toLowerCase());
	}

	static public String getLocalizedLore(Class<? extends DataBase> clazz, DataPath path) {
		return toLore(EditHelper.getUnlocalizedName(clazz, path));
	}

	/** メニュー用ローカライズデータ取得 */
	public static String getLocalizedLore(Lang lang) {
		return toLore(lang.toString().toLowerCase());
	}

	/** メニュー用Lang */
	public enum Lang {
		File, Edit, Help, New, NewOpen, Open, OpenDir, Save, SaveAs, Import, Gun, Magazine, Armor, Attachment, Icon,
		Sound, Scope, Lang, Exit, NotSet, Add, Remove, ParentPack, ClearPack, Merge, MergeAndDelete,
	}
}
