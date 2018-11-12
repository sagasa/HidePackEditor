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
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;

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
				PackRead(filechooser.getSelectedFile());
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
			Image image = new Image(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""));
			image.Image = ImageIO.read(file);
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
			Image image = new Image(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""));
			image.Image = ImageIO.read(file);
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
			Sound sound = new Sound(file.getName().replaceAll(".ogg$", ""));
			sound.Sound = Files.readAllBytes(file.toPath());
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
		filechooser.setSelectedFile(new File(Main.Pack.PACK_NAME + ".zip"));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("zip file", "zip");
		filechooser.setFileFilter(filter);
		// filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		int selected = filechooser.showSaveDialog(null);
		// System.out.println(selected);
		// パックを書く
		if (selected == 0) {
			File file = filechooser.getSelectedFile();
			if (!file.getPath().endsWith(".zip")) {
				file = new File(file.getAbsolutePath() + ".zip");
			}
			export(file);
			Main.packPath = filechooser.getSelectedFile().getAbsolutePath();
		}
	}

	/** パッキングして出力する */
	private static void export(File packFile) {
		// パックがあるなら
		if (Main.Pack != null) {
			// データをまとめる
			HashMap<String, ByteArrayInputStream> dataList = new HashMap<String, ByteArrayInputStream>();
			// 銃のデータ
			for (GunData d : Main.GunList.values()) {
				dataList.put("guns/" + d.ITEM_DISPLAYNAME + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes()));
			}
			// 弾のデータ
			for (BulletData d : Main.BulletList.values()) {
				dataList.put("bullets/" + d.ITEM_DISPLAYNAME + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes()));
			}

			// パックデータ
			dataList.put("pack.json", new ByteArrayInputStream(Main.Pack.MakeJsonData().getBytes()));

			// リソース
			try {
				// Icon
				for (String name : Main.IconMap.keySet()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();

					ImageIO.write(Main.IconMap.get(name), "png", out);

					dataList.put("icon/" + name + ".png", new ByteArrayInputStream(out.toByteArray()));
				}
				// Scope
				for (String name : Main.ScopeMap.keySet()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();

					ImageIO.write(Main.ScopeMap.get(name), "png", out);

					dataList.put("scope/" + name + ".png", new ByteArrayInputStream(out.toByteArray()));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			for (String name : Main.SoundMap.keySet()) {
				dataList.put("sounds/" + name + ".ogg", new ByteArrayInputStream(Main.SoundMap.get(name)));
			}

			ZipOutputStream zos;
			try {
				if (packFile.exists()) {
					packFile.createNewFile();
				}

				zos = new ZipOutputStream(new FileOutputStream(packFile), Charset.forName("Shift_JIS"));
				for (String name : dataList.keySet()) {
					// System.out.println(name);
					ZipEntry entry = new ZipEntry(name);
					zos.putNextEntry(entry);

					try (InputStream is = new BufferedInputStream(dataList.get(name))) {
						byte[] buf = new byte[1024];
						for (int len = 0; 0 < (len = is.read(buf));) {
							zos.write(buf, 0, len);
						}
					}
				}
				zos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ZipReader
	 *
	 * @throws IOException
	 */
	private static void PackRead(File file) throws IOException {
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
	static void PackWrapper(byte[] data, String name) throws IOException {
		// JsonObject newData = gson.fromJson(new String(Arrays.copyOf(data,
		// data.length)), JsonObject.class);
		// Gun認識
		if (name.matches("^(.*)guns/(.*).json")) {
			GunData newGun = gson.fromJson(new String(data, Charset.forName("UTF-8")), GunData.class);
			Main.GunList.put(newGun.ITEM_DISPLAYNAME, newGun);
			// System.out.println("gun");
		}
		// bullet認識
		else if (name.matches("^(.*)bullets/(.*).json")) {
			BulletData newBullet = gson.fromJson(new String(data, Charset.forName("UTF-8")), BulletData.class);
			Main.BulletList.put(newBullet.ITEM_DISPLAYNAME, newBullet);
			// System.out.println("bullet");
		}
		// packInfo認識
		else if (name.matches("^(.*)pack.json")) {
			Main.Pack = gson.fromJson(new String(data, Charset.forName("UTF-8")), PackInfo.class);
			;
			// System.out.println("pack");
		}

		// Resources認識
		// Icon
		if (name.matches("^(.*)icon/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)icon/", "");
			Main.IconMap.put(n, ImageIO.read(new ByteArrayInputStream(data)));
			// System.out.println("icon");
		}
		// Scope
		if (name.matches("^(.*)scope/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)scope/", "");
			Main.ScopeMap.put(n, ImageIO.read(new ByteArrayInputStream(data)));
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
			Main.SoundMap.put(n, data);
			// System.out.println("sounds");
		}

	}
}
