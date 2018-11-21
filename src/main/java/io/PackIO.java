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
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import controller.editer.EditerComponent;
import editer.HidePack;
import editer.Main;
import editer.mainWindow.MainWindow;
import helper.ArrayEditer;
import resources.Image;
import resources.Sound;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

public class PackIO {
	private static final Logger log = LoggerFactory.getLogger(PackIO.class);
	public static boolean isChanged = false;
	private static Gson gson = new Gson();

	/** 新しいパックを作る */
	public static void makePack() {
		Main.clear();
	}

	/** 今開いているデータを消して新しいパックを開く */
	public static void openPack() {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("zip file", "zip");
		filechooser.setFileFilter(filter);
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		int selected = filechooser.showOpenDialog(MainWindow.INSTANCE);
		// System.out.println(selected);
		// パックを読む
		if (selected == 0) {
			Main.clear();
			try {
				readPack(filechooser.getSelectedFile(),false);
			} catch (IOException e) {
				e.printStackTrace();
			}
			Main.packPath = filechooser.getSelectedFile().getPath();
		}
	}

	/** 前に保存した場所に出力 */
	public static void save() {
		if (Main.packPath == null) {
			saveAs();
			return;
		}
		export(new File(Main.packPath));
	}

	/** ファイル選択を開く */
	private static JFileChooser makeFileChooser(FileNameExtensionFilter filter) {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		filechooser.setFileFilter(filter);
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setMultiSelectionEnabled(true);
		return filechooser;
	}

	// TODO キャッチにエラーダイアログを
	/** iconをインポート */
	public static void inportIcon() {
		JFileChooser filechooser = makeFileChooser(new FileNameExtensionFilter("Image", "png", "jpg", "bmp"));
		int selected = filechooser.showOpenDialog(null);

		if (selected == 0) {
			for (File file : filechooser.getSelectedFiles()) {
				inportIcon(file);
			}
		}
	}

	/** iconをインポート */
	public static void inportIcon(File file) {
		try {
			Image image = new Image(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""),ImageIO.read(file));
			HidePack.IconList.add(image);
			MainWindow.INSTANCE.repaint();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Scopeをインポート */
	public static void inportScope() {
		JFileChooser filechooser = makeFileChooser(new FileNameExtensionFilter("Image", "png", "jpg", "bmp"));
		int selected = filechooser.showOpenDialog(null);

		if (selected == 0) {
			for (File file : filechooser.getSelectedFiles()) {
				inportScope(file);
			}
		}
	}

	/** Scopeをインポート */
	public static void inportScope(File file) {
		try {
			Image image = new Image(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""),ImageIO.read(file));
			HidePack.ScopeList.add(image);
			MainWindow.INSTANCE.repaint();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Soundをインポート */
	public static void inportSound() {
		JFileChooser filechooser = makeFileChooser(new FileNameExtensionFilter("Sound", "ogg"));
		int selected = filechooser.showOpenDialog(null);

		if (selected == 0) {
			for (File file : filechooser.getSelectedFiles()) {
				inportSound(file);
			}
		}
	}

	/** Soundをインポート */
	public static void inportSound(File file) {
		try {
			Sound sound = new Sound(file.getName().replaceAll(".ogg$", ""),Files.readAllBytes(file.toPath()));
			HidePack.SoundList.add(sound);
			MainWindow.INSTANCE.repaint();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** ファイル指定して出力 */
	public static void saveAs() {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("zip file", "zip");
		filechooser.setFileFilter(filter);
		filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		int selected = filechooser.showSaveDialog(null);
		// System.out.println(selected);
		// パックを書く
		if (selected == 0) {
			File file = filechooser.getSelectedFile();
			export(file);
			Main.packPath = filechooser.getSelectedFile().getAbsolutePath();
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
	private static void export(File packFile) {
		// 出力ディレクトリが使えるか
		if (!packFile.isDirectory()) {
			log.error("IO error " + packFile.getAbsolutePath() + " is not dir");
			return;
		}

		// データをまとめる
		Map<Long, List<Entry>> dataMap = new HashMap<>();
		for (HidePack pack : HidePack.OpenPacks) {
			// 参照では無ければ
			if (!pack.Pack.isReference) {
				dataMap.put(pack.Pack.PackUID, new ArrayList<>());
				// パックデータ
				dataMap.get(pack.Pack.PackUID)
						.add(new Entry("pack.json", new ByteArrayInputStream(pack.Pack.MakeJsonData().getBytes())));
			}
		}

		// 銃のデータ
		for (GunData d : HidePack.GunList) {
			// 参照ではなければ
			if (!d.isReference) {
				dataMap.get(d.PackUID).add(new Entry("guns/" + d.ITEM_DISPLAYNAME + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes())));
			}
		}
		// 弾のデータ
		for (BulletData d : HidePack.BulletList) {
			// 参照ではなければ
			if (!d.isReference) {
				dataMap.get(d.PackUID).add(new Entry("bullets/" + d.ITEM_DISPLAYNAME + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes())));
			}
		}

		// リソース
		try {
			// Icon
			for (Image d : HidePack.IconList) {
				// 参照ではなければ
				if (!d.isReference) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					ImageIO.write(d.Image, "png", out);
					dataMap.get(d.PackUID).add(
							new Entry("icon/" + d.DisplayName + ".png", new ByteArrayInputStream(out.toByteArray())));
				}
			}
			// Scope
			for (Image d : HidePack.ScopeList) {
				// 参照ではなければ
				if (!d.isReference) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					ImageIO.write(d.Image, "png", out);
					dataMap.get(d.PackUID).add(
							new Entry("scope/" + d.DisplayName + ".png", new ByteArrayInputStream(out.toByteArray())));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Sound d : HidePack.SoundList) {
			// 参照ではなければ
			if (!d.isReference) {
				dataMap.get(d.PackUID)
						.add(new Entry("sound/" + d.DisplayName + ".ogg", new ByteArrayInputStream(d.Sound)));
			}
		}
		// 内容がないエントリを削除
		for (Long id : dataMap.keySet()) {
			if (dataMap.get(id).size() <= 1) {
				dataMap.remove(id);
				log.debug(HidePack.getPack(id).Pack.PACK_NAME + " dont have any contents");
			}
		}

		try {
			// 全パック出力
			for (Long id : dataMap.keySet()) {
				ZipOutputStream zos = new ZipOutputStream(
						new FileOutputStream(new File(packFile, "/" + HidePack.getPack(id).Pack.PACK_NAME) + ".zip"),
						Charset.forName("Shift_JIS"));
				for (Entry data : dataMap.get(id)) {
					ZipEntry entry = new ZipEntry(data.Name);
					zos.putNextEntry(entry);
					try (InputStream is = new BufferedInputStream(data.Data)) {
						byte[] buf = new byte[1024];
						for (int len = 0; 0 < (len = is.read(buf));) {
							zos.write(buf, 0, len);
						}
					}
					zos.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/** 銃のList GunData */
	private List<GunData> GunList = new ArrayList<>();
	/** 弾のList BulletData */
	private List<BulletData> BulletList = new ArrayList<>();
	/** IconのList Image */
	private List<Image> IconList = new ArrayList<>();
	/** ScopeのList Image */
	private List<Image> ScopeList = new ArrayList<>();
	/** SoundのList Sound */
	private List<Sound> SoundList = new ArrayList<>();
	/**読み込み中のパック*/
	private HidePack Pack;

	private void readPack(File file,boolean isReference) throws IOException {
		// 読み込むファイル
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
					data = ArrayEditer.ByteArrayCombining(data, Arrays.copyOf(buffer, size));
					buffer = new byte[1024];

				}
				// パックラッパーに送る
				PackWrapper(data, entry.getName());
			}
			zipIn.closeEntry();
		}
		zipIn.close();
		in.close();
	}

	/**
	 * byte配列とNameからパックの要素の当てはめる
	 *
	 * @throws IOException
	 */
	private void PackWrapper(byte[] data, String name) throws IOException {
		// JsonObject newData = gson.fromJson(new String(Arrays.copyOf(data,
		// data.length)), JsonObject.class);
		// Gun認識
		if (name.matches("^(.*)guns/(.*).json")) {
			GunData newGun = gson.fromJson(new String(data, Charset.forName("UTF-8")), GunData.class);
			GunList.add(newGun);
			// System.out.println("gun");
		}
		// bullet認識
		else if (name.matches("^(.*)bullets/(.*).json")) {
			BulletData newBullet = gson.fromJson(new String(data, Charset.forName("UTF-8")), BulletData.class);
			BulletList.add(newBullet);
			// System.out.println("bullet");
		}
		// packInfo認識
		else if (name.matches("^(.*)pack.json")) {
			Pack = new HidePack();
			Pack.Pack = gson.fromJson(new String(data, Charset.forName("UTF-8")), PackInfo.class);
			// System.out.println("pack");
		}

		// Resources認識
		// Icon
		if (name.matches("^(.*)icon/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)icon/", "");
			IconList.add(new Image(n,ImageIO.read(new ByteArrayInputStream(data))));
			// System.out.println("icon");
		}
		// Scope
		if (name.matches("^(.*)scope/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)scope/", "");
			ScopeList.add(new Image(n,ImageIO.read(new ByteArrayInputStream(data))));
			// System.out.println("scope");
		}
		// model
		if (name.matches("^(.*)model/(.*).json")) {
			// System.out.println("model");
		}
		// texture
		if (name.matches("^(.*)texture/(.*).png")) {
			// System.out.println("texture");
		}
		// sounds
		if (name.matches("^(.*)sounds/(.*).ogg")) {
			String n = name.replaceAll(".ogg", "").replaceAll("^(.*)sounds/", "");
			SoundList.add(new Sound(n, data));
			// System.out.println("sounds");
		}

	}
}
