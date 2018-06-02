package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import editer.Window;
import helper.ArrayEditer;
import types.BulletData;
import types.ContentsPack;
import types.guns.GunData;

public class PackIO {
	/** 新しいパックを作る */
	public static void makePack() {
		Window.Pack = new ContentsPack();
		Window.BulletList = new HashMap<String, BulletData>();
		Window.GunList = new HashMap<String, GunData>();
		Window.IconMap = new HashMap<String, BufferedImage>();
		Window.ItemList.write();
		Window.ItemEditer.clearEditer();
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
			Window.Pack = null;
			Window.BulletList = new HashMap<String, BulletData>();
			Window.GunList = new HashMap<String, GunData>();
			Window.IconMap = new HashMap<String, BufferedImage>();
			Window.ItemList.write();
			Window.ItemEditer.clearEditer();
		}
	}

	/** パックの中身だけ追加する */
	public static void inportPack() {

	}

	/** パッキングして出力する */
	public static void exportPack() {

	}

	/** ZipReader 
	 * @throws IOException */
	private void zpReader(File file) throws IOException {
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

				// String zipString = new String(data);
				// System.out.println(zipString+" "+entry.getName()+"
				// "+entry.getSize());
			}
			zipIn.closeEntry();
		}
		zipIn.close();
		in.close();
	}
	/** byte配列とNameからパックの要素の当てはめる
	 * @throws IOException */
	static void PackWrapper(byte[] data, String name) throws IOException {
		// JsonObject newData = gson.fromJson(new String(Arrays.copyOf(data,
		// data.length)), JsonObject.class);
		// Gun認識
		if (name.matches("^(.*)guns/(.*).json")) {
			GunData newGun = new GunData(new String(data, Charset.forName("UTF-8")));

			System.out.println("gun");
		}
		// bullet認識
		else if (name.matches("^(.*)bullets/(.*).json")) {
			BulletData newBullet = new BulletData(new String(data, Charset.forName("UTF-8")));
		
			System.out.println("bullet");
		}
		// packInfo認識
		else if (name.matches("^(.*)pack.json")) {
			System.out.println("pack :" + new String(data, Charset.forName("UTF-8")));
	
		}

		// Resources認識
		// Icon
		if (name.matches("^(.*)resources/icon/(.*).png")) {
			String n = name.replace(".png$", "").replace("^(.*)resources/icon/", "");
 		
			System.out.println("icon");
		}
		//model
		if (name.matches("^(.*)resources/model/(.*).json")) {
			System.out.println("model");
		}
		//texture
		if (name.matches("^(.*)resources/texture/(.*).png")) {
			System.out.println("texture");
		}
		//sounds
		if (name.matches("^(.*)resources/sounds/(.*).ogg")) {
			System.out.println("sounds");
		}

	}
}
