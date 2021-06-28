package io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editor.HidePack;
import editor.controller.RootController;
import helper.ArrayEditor;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import resources.HideImage;
import resources.Model;
import resources.Sound;
import types.PackInfo;
import types.base.DataBase;
import types.base.NamedData;
import types.items.GunData;
import types.items.MagazineData;
import types.model.HideModel;

public class PackIO {
	private static final Logger log = LogManager.getLogger();
	public static boolean isChanged = false;

	/** 新しいパックを作る */
	public static void makePack() {
		HidePack.clear();
	}

	/** ファイル選択を開く */
	private static List<File> openFileChooser(ExtensionFilter... filter) {
		FileChooser filechooser = new FileChooser();
		filechooser.setInitialDirectory(new File("."));
		filechooser.getExtensionFilters().addAll(filter);
		List<File> list = filechooser.showOpenMultipleDialog(RootController.STAGE);
		return list == null ? Collections.emptyList() : list;
	}

	/**
	 * imageを読み込み
	 */
	public static HideImage readImage(File file) {
		try {
			return new HideImage(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""), ImageIO.read(file));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Soundを読み込み
	 */
	public static Sound readSound(File file) {
		try {
			return new Sound(file.getName().replaceAll(".ogg$", ""), Files.readAllBytes(file.toPath()));

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Modelを読み込み
	 */
	public static Model readModel(File file) {
		try {
			String name = file.getName();
			if (name.endsWith(".glb"))
				return Model.from(name.replaceAll(".glb$", ""), Files.readAllBytes(file.toPath()),
						PackPattern.MODEL_GLB);
			if (name.endsWith(".obj"))
				return Model.from(name.replaceAll(".obj$", ""), Files.readAllBytes(file.toPath()),
						PackPattern.MODEL_OBJ);
			throw new NoSuchElementException();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * iconをインポート
	 *
	 * @param packInfo
	 */
	public static void importIcon(PackInfo packInfo) {
		for (File file : openFileChooser(new ExtensionFilter("image", "*.png", "*.jpg", "*.bmp"))) {
			HideImage image = readImage(file);
			image.RootPack.set(packInfo);
			HidePack.IconList.add(image);
		}
	}

	/** Scopeをインポート */
	public static void importScope(PackInfo packInfo) {
		for (File file : openFileChooser(new ExtensionFilter("image", "*.png", "*.jpg", "*.bmp"))) {
			HideImage image = readImage(file);
			image.RootPack.set(packInfo);
			HidePack.ScopeList.add(image);
		}
	}

	/**
	 * Soundをインポート
	 *
	 * @param packInfo
	 */
	public static void importSound(PackInfo packInfo) {
		for (File file : openFileChooser(new ExtensionFilter("ogg", "*.ogg"))) {
			Sound sound = readSound(file);
			sound.RootPack.set(packInfo);
			HidePack.SoundList.add(sound);
		}
	}

	public static void importModel(PackInfo packInfo) {
		for (File file : openFileChooser(new ExtensionFilter("model", "*.obj", "*.glb"))) {
			Model model = readModel(file);
			model.RootPack.set(packInfo);
			HidePack.ModelList.add(model);
			HideModel hideModel = new HideModel(model);
			hideModel.getRootPack().set(packInfo);
			HidePack.ModelInfoList.add(hideModel);
		}
	}

	private static void addEntry(Map<PackInfo, Map<String, ByteArrayInputStream>> dataMap,
			Collection<? extends NamedData> data, PackPattern pattern) {
		for (NamedData d : data) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.getRootPack().get()).put(pattern.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.toJson().getBytes(UTF8)));
			}
		}
	}

	private static void addEntryImage(Map<PackInfo, Map<String, ByteArrayInputStream>> dataMap,
			Collection<? extends HideImage> data, PackPattern pattern) throws IOException {
		for (HideImage d : data) {
			// 参照ではなければ
			if (!d.isReference()) {
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				ImageIO.write(d.Image, "png", out);
				dataMap.get(d.RootPack.get()).put(pattern.toPath(d.getDisplayName()),
						new ByteArrayInputStream(out.toByteArray()));
			}
		}
	}

	/** パッキングして出力する */
	public static void export(File path) {
		// データをまとめる
		Map<PackInfo, Map<String, ByteArrayInputStream>> dataMap = new HashMap<>();
		for (PackInfo pack : HidePack.OpenPacks) {
			// 参照では無ければ
			dataMap.put(pack, new HashMap<>());
			// パックデータ
			dataMap.get(pack).put("pack.json", new ByteArrayInputStream(pack.toJson().getBytes(UTF8)));
		}

		// 銃のデータ
		addEntry(dataMap, HidePack.GunList, PackPattern.GUN);
		// 弾のデータ
		addEntry(dataMap, HidePack.MagazineList, PackPattern.MAGAZINE);

		// リソース
		try {
			// Icon
			addEntryImage(dataMap, HidePack.IconList, PackPattern.ICON);
			// Scope
			addEntryImage(dataMap, HidePack.ScopeList, PackPattern.SCOPE);

			addEntryImage(dataMap, HidePack.TextureList, PackPattern.TEXTURE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Sound d : HidePack.SoundList) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.RootPack.get()).put(PackPattern.SOUND.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.Sound));
			}
		}
		for (HideModel d : HidePack.ModelInfoList) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.getRootPack().get()).put(PackPattern.MODEL_INFO.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.toJson().getBytes(UTF8)));
				dataMap.get(d.getRootPack().get()).put(d.model.type.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.model.data));
			}
		}
		// 内容がないor参照のエントリを削除
		for (PackInfo pack : dataMap.keySet()) {
			if (dataMap.get(pack).size() <= 1 || pack.isReference) {
				dataMap.remove(pack);
				log.debug(pack.getDisplayName() + " dont have any contents or reference pack");
			}
		}

		try {
			path.mkdirs();
			// 全パック出力
			for (PackInfo pack : dataMap.keySet()) {
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(// TODO 出力先指定
						new File(path, pack.getDisplayName()) + ".zip"), Charset.forName("Shift_JIS"));
				for (Entry<String, ByteArrayInputStream> data : dataMap.get(pack).entrySet()) {
					ZipEntry entry = new ZipEntry(data.getKey());
					zos.putNextEntry(entry);
					try (InputStream is = new BufferedInputStream(data.getValue())) {
						byte[] buf = new byte[1024];
						for (int len = 0; 0 < (len = is.read(buf));) {
							zos.write(buf, 0, len);
						}
					}
				}
				zos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static PackCash readPack(File file) {
		// 読み込むファイル
		PackCash pack = new PackCash();
		try {
			FileInputStream in = new FileInputStream(file);
			// 以下、zipを展開して、中身を確認する
			ZipInputStream zipIn = new ZipInputStream(in, Charset.forName("Shift_JIS"));
			ZipEntry entry = null;
			while ((entry = zipIn.getNextEntry()) != null) {
				// dirかどうか確認
				if (!entry.isDirectory()) {
					// 内容を読み取り
					// byte[] buffer = new byte[0x6400000];
					byte[] buffer = new byte[1024];
					byte[] data = new byte[0];
					int size;
					while (0 < (size = zipIn.read(buffer))) {
						data = ArrayEditor.ByteArrayCombining(data, Arrays.copyOf(buffer, size));
						buffer = new byte[1024];

					}
					// パックラッパーに送る
					PackWrapper(data, entry.getName(), pack);
				}
				zipIn.closeEntry();
			}
			zipIn.close();
			in.close();
		} catch (Exception e) {

		}
		pack.setPack();
		return pack;
	}

	/** Cgarset UTF-8 使え！！！ */
	public static final Charset UTF8 = Charset.forName("UTF-8");

	/**
	 * byte配列とNameからパックの要素の当てはめる
	 *
	 * @throws IOException
	 */
	private static void PackWrapper(byte[] data, String name, PackCash pack) throws IOException {
		// JsonObject newData = gson.fromJson(new String(Arrays.copyOf(data,
		// data.length)), JsonObject.class);
		// Gun認識
		if (PackPattern.GUN.mache(name)) {
			GunData newGun = DataBase.fromJson(new String(data, UTF8));
			pack.GunList.add(newGun);
			// System.out.println("gun");
		}
		// bullet認識
		else if (PackPattern.MAGAZINE.mache(name)) {
			MagazineData newBullet = DataBase.fromJson(new String(data, UTF8));
			pack.MagazineList.add(newBullet);
			// System.out.println("bullet");
		}
		// packInfo認識
		else if (PackPattern.PACKINFO.mache(name)) {
			pack.Pack = DataBase.fromJson(new String(data, UTF8));
			// System.out.println("pack");
		}

		// Resources認識
		// Icon
		if (PackPattern.ICON.mache(name)) {
			String n = PackPattern.ICON.trim(name);
			pack.IconList.add(new HideImage(n, ImageIO.read(new ByteArrayInputStream(data))));
			// System.out.println("icon");
		}
		// Scope
		if (PackPattern.SCOPE.mache(name)) {
			String n = PackPattern.SCOPE.trim(name);
			pack.ScopeList.add(new HideImage(n, ImageIO.read(new ByteArrayInputStream(data))));
			// System.out.println("scope");
		}
		// model
		if (PackPattern.MODEL_GLB.mache(name)) {
			pack.ModelList.add(Model.from(PackPattern.MODEL_GLB.trim(name), data, PackPattern.MODEL_GLB));
			// System.out.println("model");
		}
		// model
		if (PackPattern.MODEL_OBJ.mache(name)) {
			pack.ModelList.add(Model.from(PackPattern.MODEL_GLB.trim(name), data, PackPattern.MODEL_OBJ));
			// System.out.println("model");
		}
		// model
		if (PackPattern.MODEL_INFO.mache(name)) {
			pack.ModelInfoList.add(DataBase.fromJson(new String(data, UTF8)));
			// System.out.println("model");
		}
		// texture
		if (PackPattern.TEXTURE.mache(name)) {
			// System.out.println("texture");
			pack.TextureList
					.add(new HideImage(PackPattern.TEXTURE.trim(name), ImageIO.read(new ByteArrayInputStream(data))));
		}
		// sounds
		if (PackPattern.SOUND.mache(name)) {
			String n = PackPattern.SOUND.trim(name);
			pack.SoundList.add(new Sound(n, data));
			// System.out.println("sounds");
		}
	}

	/** パック認識用パターン エディター側と完全互換 */
	public enum PackPattern {
		GUN("guns", "json"), MAGAZINE("magazines", "json"), PACKINFO(Pattern.compile("^(.*)pack\\.json$"), "json"),
		ICON("icons", "png"), SCOPE("scopes", "png"), TEXTURE("textures", "png"), SOUND("sounds", "ogg"),
		MODEL_OBJ("models", "obj"), MODEL_GLB("models", "glb"), MODEL_INFO("models", "json");

		private PackPattern(Pattern mache, String end) {
			this.mache = mache;
			this.end = end;
			this.start = "\\.";
		}

		private PackPattern(String start, String end) {
			mache = Pattern.compile("^(.*)" + start + "/(.*)\\." + end + "$");
			rep_start = Pattern.compile("^(.*)" + start + "/");
			rep_end = Pattern.compile("\\." + end + "$");
			this.start = start;
			this.end = end;
		}

		boolean mache(String path) {
			return mache.matcher(path).matches();
		}

		String trim(String path) {
			return rep_start.matcher(rep_end.matcher(path).replaceFirst("")).replaceFirst("");
		}

		String toPath(String name) {
			return start + "/" + name + "." + end;
		}

		private Pattern mache;
		private Pattern rep_start;
		private Pattern rep_end;
		private String start;
		private String end;
	}

}
