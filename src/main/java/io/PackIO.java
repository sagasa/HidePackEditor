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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import editer.HidePack;
import editer.controller.RootController;
import helper.ArrayEditor;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import resources.HideImage;
import resources.Model;
import resources.Sound;
import types.PackInfo;
import types.items.GunData;
import types.items.MagazineData;

public class PackIO {
	private static final Logger log = LogManager.getLogger();
	public static boolean isChanged = false;
	private static Gson gson = new Gson();

	/** 新しいパックを作る */
	public static void makePack() {
		HidePack.clear();
	}

	/** ファイル選択を開く */
	private static FileChooser makeFileChooser(ExtensionFilter filter) {
		FileChooser filechooser = new FileChooser();
		filechooser.setInitialDirectory(new File("."));
		filechooser.getExtensionFilters().add(filter);
		return filechooser;
	}

	// TODO キャッチにエラーダイアログを
	/** iconをインポート */
	public static void importIcon() {
		FileChooser filechooser = makeFileChooser(new ExtensionFilter("image", "*.png", "*.jpg", "*.bmp"));
		List<File> files = filechooser.showOpenMultipleDialog(RootController.STAGE);
		if (files != null) {
			for (File file : files) {
				importIcon(file);
			}
		}
	}

	/** iconをインポート */
	public static void importIcon(File file) {
		try {
			HideImage image = new HideImage(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""), ImageIO.read(file));

			HidePack.IconList.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Scopeをインポート */
	public static void importScope() {
		FileChooser filechooser = makeFileChooser(new ExtensionFilter("image", "*.png", "*.jpg", "*.bmp"));
		List<File> files = filechooser.showOpenMultipleDialog(RootController.STAGE);
		if (files != null) {
			for (File file : files) {
				importScope(file);
			}
		}
	}

	/** Scopeをインポート */
	public static void importScope(File file) {
		try {
			HideImage image = new HideImage(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""), ImageIO.read(file));
			HidePack.ScopeList.add(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Soundをインポート */
	public static void importSound() {
		FileChooser filechooser = makeFileChooser(new ExtensionFilter("ogg", "*.ogg"));
		List<File> files = filechooser.showOpenMultipleDialog(RootController.STAGE);
		if (files != null) {
			for (File file : files) {
				importSound(file);
			}
		}
	}

	/** Soundをインポート */
	public static void importSound(File file) {
		try {
			Sound sound = new Sound(file.getName().replaceAll(".ogg$", ""), Files.readAllBytes(file.toPath()));
			HidePack.SoundList.add(sound);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Entry {
		String Name;
		ByteArrayInputStream Data;

		public Entry(String name, ByteArrayInputStream data) {
			Name = name;
			Data = data;
		}
	}

	/** パッキングして出力する */
	public static void export() {
		// データをまとめる
		Map<PackInfo, List<Entry>> dataMap = new HashMap<>();
		for (PackInfo pack : HidePack.OpenPacks) {
			// 参照では無ければ
			if (!pack.isReference()) {
				dataMap.put(pack, new ArrayList<>());
				// パックデータ
				dataMap.get(pack).add(new Entry("pack.json", new ByteArrayInputStream(pack.MakeJsonData().getBytes())));
			}
		}

		// 銃のデータ
		for (GunData d : HidePack.GunList) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.RootPack.get()).add(new Entry(PackPattern.GUN.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.MakeJsonData().getBytes())));
			}
		}
		// 弾のデータ
		for (MagazineData d : HidePack.MagazineList) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.RootPack.get()).add(new Entry(PackPattern.MAGAZINE.toPath(d.getDisplayName()),
						new ByteArrayInputStream(d.MakeJsonData().getBytes())));
			}
		}

		// リソース
		try {
			// Icon
			for (HideImage d : HidePack.IconList) {
				// 参照ではなければ
				if (!d.isReference()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					ImageIO.write(d.Image, "png", out);
					dataMap.get(d.RootPack.get()).add(new Entry(PackPattern.ICON.toPath(d.getDisplayName()),
							new ByteArrayInputStream(out.toByteArray())));
				}
			}
			// Scope
			for (HideImage d : HidePack.ScopeList) {
				// 参照ではなければ
				if (!d.isReference()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					ImageIO.write(d.Image, "png", out);
					dataMap.get(d.RootPack.get()).add(new Entry(PackPattern.SCOPE.toPath(d.getDisplayName()),
							new ByteArrayInputStream(out.toByteArray())));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Sound d : HidePack.SoundList) {
			// 参照ではなければ
			if (!d.isReference()) {
				dataMap.get(d.RootPack.get()).add(
						new Entry(PackPattern.SOUND.toPath(d.getDisplayName()), new ByteArrayInputStream(d.Sound)));
			}
		}
		// 内容がないエントリを削除
		for (PackInfo pack : dataMap.keySet()) {
			if (dataMap.get(pack).size() <= 1) {
				dataMap.remove(pack);
				log.debug(pack.PACK_NAME + " dont have any contents");
			}
		}

		try {
			File path = new File("./export/");
			path.mkdirs();
			// 全パック出力
			for (PackInfo pack : dataMap.keySet()) {
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(// TODO 出力先指定
						new File(path, pack.PACK_NAME) + ".zip"), Charset.forName("Shift_JIS"));
				for (Entry data : dataMap.get(pack)) {
					ZipEntry entry = new ZipEntry(data.Name);
					zos.putNextEntry(entry);
					try (InputStream is = new BufferedInputStream(data.Data)) {
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
			GunData newGun = gson.fromJson(new String(data, UTF8), GunData.class);
			pack.GunList.add(newGun);
			// System.out.println("gun");
		}
		// bullet認識
		else if (PackPattern.MAGAZINE.mache(name)) {
			MagazineData newBullet = gson.fromJson(new String(data, UTF8), MagazineData.class);
			pack.MagazineList.add(newBullet);
			// System.out.println("bullet");
		}
		// packInfo認識
		else if (PackPattern.PACKINFO.mache(name)) {
			pack.Pack = new PackInfo();
			pack.Pack = gson.fromJson(new String(data, UTF8), PackInfo.class);
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
		if (PackPattern.MODEL.mache(name)) {
			pack.ModelList.add(ModelIO.read(PackPattern.MODEL.trim(name), new String(data, UTF8)));
			// System.out.println("model");
		}
		// texture
		if (PackPattern.TEXTURE.mache(name)) {
			// System.out.println("texture");
		}
		// sounds
		if (PackPattern.SOUND.mache(name)) {
			String n = PackPattern.SOUND.trim(name);
			pack.SoundList.add(new Sound(n, data));
			// System.out.println("sounds");
		}
	}

	/** パック認識用パターン エディター側と完全互換 */
	private enum PackPattern {
		GUN("guns", "json"), MAGAZINE("magazines", "json"), PACKINFO(Pattern.compile("^(.*)pack\\.json$"), "json"),
		ICON("icons", "png"), SCOPE("scopes", "png"), TEXTURE("textures", "png"), SOUND("sounds", "ogg"),
		MODEL("models", "obj"), MODEL_INFO("models", "json");

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
