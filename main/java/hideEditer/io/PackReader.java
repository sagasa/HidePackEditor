package hideEditer.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.google.gson.Gson;
import helper.ArrayEditer;
import hideEditer.MainWindow;
import types.BulletData;
import types.BulletData.BulletDataList;
import types.ContentsPack;
import types.GunData;
import types.GunData.GunDataList;
import types.ImageData;

public class PackReader {

	/** パックを制作する */
	public static ContentsPack NewPack() {
		int i = 1;
		// パックを仮に作る 名前を付ける
		ContentsPack pack = new ContentsPack();
		ContentsPack.PackDataList.PACK_NAME.setData(pack, "NotSet");
		Gson gson = new Gson();
		System.out.println("test: " + gson.toJson(pack));
		return pack;
	}

	static ContentsPack loadedPack;

	/** パックを読む */
	public static ContentsPack Read(File file) {
		// 初期化
		loadedPack = null;
		MainWindow.gunMap.clear();
		//TODO 後でぜんType追加
		// パックがあるか調べる
		String Path = file.getAbsolutePath();
		if (checkDir(Path)) {
			try {
				// zipから読み込み
				zipRead(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return loadedPack;
	}

	// パック確認変数
	static boolean packInfo;
	static Gson gson = new Gson();

	/** ZIPからデータを読み込む 中身の分岐は別 */
	static void zipRead(File file) throws IOException {
		// 読み込むファイル
		FileInputStream in = new FileInputStream(file);

		packInfo = false;
		// 以下、zipを展開して、中身を確認する
		// TODO 将来的にlangで切り替え可能に…したいなぁ
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
		if (Pattern.compile("^(.*)guns/(.*).json").matcher(name).matches()) {
			GunData newGun = new GunData(new String(data, Charset.forName("UTF-8")));
			MainWindow.gunMap.put(newGun.getDataString(GunDataList.DISPLAY_NAME), newGun);
			System.out.println("gun");
		}
		// bullet認識
		else if (Pattern.compile("^(.*)bullets/(.*).json").matcher(name).matches()) {
			BulletData newBullet = new BulletData(new String(data, Charset.forName("UTF-8")));
			MainWindow.bulletMap.put(BulletDataList.DISPLAY_NAME.getData(newBullet).toString(), newBullet);
			System.out.println("bullet");
		}
		// packInfo認識
		else if (Pattern.compile("^(.*)pack.json").matcher(name).matches()) {
			System.out.println("pack :" + new String(data, Charset.forName("UTF-8")));
			loadedPack = new ContentsPack(new String(data, Charset.forName("UTF-8")));
		}

		// Resources認識
		// Icon
		if (Pattern.compile("^(.*)resources/icon/(.*).png").matcher(name).matches()) {
			String n = Pattern.compile(".png$").matcher(Pattern.compile("^(.*)resources/icon/").matcher(name).replaceAll("")).replaceAll("");
			ImageData newImage = new ImageData(data,n);
			MainWindow.iconMap.put(n, newImage);
 			System.out.println("icon");
		}
		//model
		if (Pattern.compile("^(.*)resources/model/(.*).json").matcher(name).matches()) {
			System.out.println("model");
		}
		//texture
		if (Pattern.compile("^(.*)resources/texture/(.*).png").matcher(name).matches()) {
			System.out.println("texture");
		}
		//sounds
		if (Pattern.compile("^(.*)resources/sounds/(.*).ogg").matcher(name).matches()) {
			System.out.println("sounds");
		}

	}

	/** ファイルチェック */
	static boolean checkDir(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		return file.canRead();
	}
}
