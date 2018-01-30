package hideEditer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import types.ContentsPack;
import types.GunData;
import types.GunData.GunDataList;

public class PackReader {



	/**パックを制作する*/
	public static ContentsPack NewPack() {
		int i = 1;
		try {
			//パックを仮に作る 名前を付ける

			while(new File("./newPack"+i).exists()){i ++;}
			File packDir = new File("./newPack"+i);
			packDir.mkdir();
			//中のファイルを作る
			new File(packDir.getAbsolutePath()+"/guns").mkdir();
			new File(packDir.getAbsolutePath()+"/bullets").mkdir();
			new File(packDir.getAbsolutePath()+"/magazines").mkdir();
			new File(packDir.getAbsolutePath()+"/resources").mkdir();
			new File(packDir.getAbsolutePath()+"/pack.json").createNewFile();
			System.out.println("パックを作成しました"+packDir.getName());

		} catch (IOException e) {
			e.printStackTrace();
		}

		ContentsPack pack = new ContentsPack();
		ContentsPack.PackDataList.PACK_NAME.setData(pack, "newPack"+i);
		Gson gson = new Gson();
		System.out.println("test: " + gson.toJson(pack));
		return pack;
	}

	/**パックを読む*/
	public static void Read(File file) {
		//パックがあるか調べる
		String Path = file.getAbsolutePath();
		if(checkDir(Path)){

		}
		//zipから読み込み
		try {
			zipRead(file);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		/*
		if (new File(Path+"/pack.json").exists()&&new File(Path+"/pack.json").isFile()) {
			System.out.println("パックを認識しました");
			ContentsPack pack = new ContentsPack();
			MainWindow.PackDir = file;
			MainWindow.Pack = pack;
		}*/
	}
	//パック確認変数
	static boolean packInfo;
	static Gson gson = new Gson();
	/**ZIPからデータを読み込む 中身の分岐は別*/
	static void zipRead(File file) throws IOException{
    	//読み込むファイル
		FileInputStream in = new FileInputStream(file);

		packInfo=false;
	    // 以下、zipを展開して、中身を確認する
		//TODO 将来的にlangで切り替え可能に…したいなぁ
    	ZipInputStream zipIn = new ZipInputStream(in,Charset.forName("Shift_JIS"));
        ZipEntry entry = null;
        while ((entry = zipIn.getNextEntry())!=null){
        	//dirかどうか確認
        	if (!entry.isDirectory()){
        		//内容を読み取り
        		byte[] buffer = new byte[(int) entry.getSize()];
        		int size = zipIn.read(buffer);
        		//パックラッパーに送る
        		PackWrapper(buffer,entry.getName());

	            //String zipString = new String(Arrays.copyOf(buffer, size));
	            //System.out.println(zipString+" "+entry.getName()+" "+entry.getSize());
        	}
        	zipIn.closeEntry();
        }
        zipIn.close();
        in.close();
	}
	/**byte配列とNameからパックの要素の当てはめる*/
	static void PackWrapper(byte[] data,String name){
		//JsonObject newData = gson.fromJson(new String(Arrays.copyOf(data, data.length)), JsonObject.class);
		//Gun認識
		if (Pattern.compile("^(.*)/guns/(.*).json").matcher(name).matches()){
			GunData newGun = new GunData(gson.fromJson(new String(Arrays.copyOf(data, data.length)), JsonObject.class));
			MainWindow.gunMap.put(GunDataList.DISPLAY_NAME.getData(newGun).toString(), newGun);
		}
		//bullet認識
		else if (Pattern.compile("^(.*)/bullets/(.*).json").matcher(name).matches()){
			System.out.println("bullet");
		}
		//magazines認識
		else if (Pattern.compile("^(.*)/magazines/(.*).json").matcher(name).matches()){
			System.out.println("magazine");
		}
		//packInfo認識
		else if (Pattern.compile("^(.*)/pack.json").matcher(name).matches()){
			System.out.println("pack");
		}

		//Resources認識
		//Icon
		if (Pattern.compile("^(.*)/Resources/icon/(.*).png").matcher(name).matches()){
			System.out.println("icon");
		}
		if (Pattern.compile("^(.*)/Resources/model/(.*).ogg").matcher(name).matches()){
			System.out.println("model");
		}
		if (Pattern.compile("^(.*)/Resources/texture/(.*).png").matcher(name).matches()){
			System.out.println("texture");
		}
		if (Pattern.compile("^(.*)/Resources/sounds/(.*).ogg").matcher(name).matches()){
			System.out.println("sounds");
		}

	}

	/**ファイルチェック*/
	static boolean checkDir(String path){
		File file = new File(path);
		if(!file.exists()){
			file.mkdirs();
		}
		return file.canRead();
	}

}
