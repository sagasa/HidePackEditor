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

import editer.Window;
import helper.ArrayEditer;
import types.BulletData;
import types.ContentsPack;
import types.guns.GunData;

public class PackIO {
	public static boolean isChanged = false;
	private static Gson gson = new Gson();

	/** 新しいパックを作る */
	public static void makePack() {
		Window.INSTANCE.clear();
		Window.Pack = new ContentsPack();
		Window.PackInfoEditer.write();
	}

	/** 今開いているデータを消して新しいパックを開く */
	public static void openPack() {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter("zip file", "zip");
		filechooser.setFileFilter(filter);
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		int selected = filechooser.showOpenDialog(Window.INSTANCE);
		// System.out.println(selected);
		// パックを読む
		if (selected == 0) {
			System.out.println("REED" + filechooser.getSelectedFile());
			Window.INSTANCE.clear();
			try {
				PackRead(filechooser.getSelectedFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
			Window.packPath = filechooser.getSelectedFile().getPath();
			Window.ItemList.write();
			Window.ResourceList.write();
			Window.PackInfoEditer.write();
		}
	}

	/** 前に保存した場所に出力 */
	public static void save() {
		if (Window.packPath == null) {
			saveAs();
			return;
		}
		export(new File(Window.packPath));
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

	/** GunDataをインポート */
	public static void inportGun() {
		JFileChooser filechooser = makeFileChooser(new FileNameExtensionFilter("GunData", "json"));
		int selected = filechooser.showOpenDialog(null);

		if (selected == 0) {
			for (File file : filechooser.getSelectedFiles()) {
				inportGun(file);
			}
		}
	}

	/** GunDataをインポート */
	public static void inportGun(File file) {
		try {
			GunData data = gson.fromJson(Files.lines(file.toPath()).collect(Collectors.joining()), GunData.class);
			Window.GunList.put(data.ITEM_INFO.NAME_DISPLAY, data);
			Window.ItemList.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Magazineをインポート */
	public static void inportMagazine() {
		JFileChooser filechooser = makeFileChooser(new FileNameExtensionFilter("BulletData", "json"));
		int selected = filechooser.showOpenDialog(null);

		if (selected == 0) {
			for (File file : filechooser.getSelectedFiles()) {
				inportMagazine(file);
			}
		}
	}

	/** Magazineをインポート */
	public static void inportMagazine(File file) {
		try {
			BulletData data = gson.fromJson(Files.lines(file.toPath()).collect(Collectors.joining()), BulletData.class);
			Window.BulletList.put(data.ITEM_INFO.NAME_DISPLAY, data);
			Window.ItemList.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
			Window.IconMap.put(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""), ImageIO.read(file));
			// Window.ItemList.write();
			Window.ResourceList.write();
			Window.ItemList.showEditer();
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
			Window.ScopeMap.put(file.getName().replaceAll("(.png|.jpg|.bmp)$", ""), ImageIO.read(file));
			// Window.ItemList.write();
			Window.ResourceList.write();
			Window.ItemList.showEditer();
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
			Window.SoundMap.put(file.getName().replaceAll(".ogg$", ""), Files.readAllBytes(file.toPath()));
			// Window.ItemList.write();
			Window.ResourceList.write();
			Window.ItemList.showEditer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** ファイル指定して出力 */
	public static void saveAs() {
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		filechooser.setSelectedFile(new File(Window.Pack.PACK_NAME + ".zip"));
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
			Window.packPath = filechooser.getSelectedFile().getAbsolutePath();
		}
	}

	/** パッキングして出力する */
	private static void export(File packFile) {
		// パックがあるなら
		if (Window.Pack != null) {
			// データをまとめる
			HashMap<String, ByteArrayInputStream> dataList = new HashMap<String, ByteArrayInputStream>();
			// 銃のデータ
			for (GunData d : Window.GunList.values()) {
				dataList.put("guns/" + d.ITEM_INFO.NAME_DISPLAY + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes()));
			}
			// 弾のデータ
			for (BulletData d : Window.BulletList.values()) {
				dataList.put("bullets/" + d.ITEM_INFO.NAME_DISPLAY + ".json",
						new ByteArrayInputStream(d.MakeJsonData().getBytes()));
			}

			// パックデータ
			dataList.put("pack.json", new ByteArrayInputStream(Window.Pack.MakeJsonData().getBytes()));

			// リソース
			try {
				// Icon
				for (String name : Window.IconMap.keySet()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();

					ImageIO.write(Window.IconMap.get(name), "png", out);

					dataList.put("icon/" + name + ".png", new ByteArrayInputStream(out.toByteArray()));
				}
				// Scope
				for (String name : Window.ScopeMap.keySet()) {
					ByteArrayOutputStream out = new ByteArrayOutputStream();

					ImageIO.write(Window.ScopeMap.get(name), "png", out);

					dataList.put("scope/" + name + ".png", new ByteArrayInputStream(out.toByteArray()));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			for (String name : Window.SoundMap.keySet()) {
				dataList.put("sounds/" + name + ".ogg", new ByteArrayInputStream(Window.SoundMap.get(name)));
			}

			ZipOutputStream zos;
			try {
				if (packFile.exists()) {
					packFile.createNewFile();
				}

				zos = new ZipOutputStream(new FileOutputStream(packFile), Charset.forName("Shift_JIS"));
				for (String name : dataList.keySet()) {
					System.out.println(name);
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
			Window.GunList.put(newGun.ITEM_INFO.NAME_DISPLAY, newGun);
			System.out.println("gun");
		}
		// bullet認識
		else if (name.matches("^(.*)bullets/(.*).json")) {
			BulletData newBullet = gson.fromJson(new String(data, Charset.forName("UTF-8")), BulletData.class);
			Window.BulletList.put(newBullet.ITEM_INFO.NAME_DISPLAY, newBullet);
			System.out.println("bullet");
		}
		// packInfo認識
		else if (name.matches("^(.*)pack.json")) {
			Window.Pack = new ContentsPack(new String(data, Charset.forName("UTF-8")));
			System.out.println("pack");
		}

		// Resources認識
		// Icon
		if (name.matches("^(.*)icon/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)icon/", "");
			Window.IconMap.put(n, ImageIO.read(new ByteArrayInputStream(data)));
			System.out.println("icon");
		}
		// Scope
		if (name.matches("^(.*)scope/(.*).png")) {
			String n = name.replaceAll(".png", "").replaceAll("^(.*)scope/", "");
			Window.ScopeMap.put(n, ImageIO.read(new ByteArrayInputStream(data)));
			System.out.println("scope");
		}
		// model
		if (name.matches("^(.*)model/(.*).json")) {
			System.out.println("model");
		}
		// texture
		if (name.matches("^(.*)texture/(.*).png")) {
			System.out.println("texture");
		}
		// sounds
		if (name.matches("^(.*)sounds/(.*).ogg")) {
			String n = name.replaceAll(".ogg", "").replaceAll("^(.*)sounds/", "");
			Window.SoundMap.put(n, data);
			System.out.println("sounds");
		}

	}
}
