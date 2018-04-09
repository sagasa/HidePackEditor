package hideMod;

import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import types.BulletData;
import types.ContentsPack;
import types.GunData;

/**パックの読み取り*/
public class loadPack {
	/**パックを置くディレクトリ*/
	public static File HideDir;
	/**パックを置くパス*/
	public static String HidePath;


	/**追加するクリエイティブタブのリスト*/
	public static List<ContentsPack> contentsPackList = new ArrayList<ContentsPack>();
	/**コンテンツパックのリスト*/
	public static List<String> newCreativeTabs = new ArrayList<String>();

	/**弾のリスト*/
	public static List<String> bulletList = new ArrayList<String>();
	/**弾のマップ*/
	public static HashMap<String,BulletData> bulletMap = new HashMap<String,BulletData>();

	/**銃のリスト*/
	public static List<String> gunList = new ArrayList<String>();
	/**銃のマップ*/
	public static HashMap<String,GunData> gunMap = new HashMap<String,GunData>();


		//初期化
		/*List <types.BulletData> BulletList;
		BulletData bulletData = new BulletData();
		*/

	/**パックから読み込む*/
	public static void load(FMLPreInitializationEvent event) {
		//パックのディレクトリを参照
		HideDir = new File(event.getModConfigurationDirectory().getParentFile(), "/Hide/");
		//パスにする
		HidePath = HideDir.getAbsolutePath()+"/";

		if (!HideDir.exists()){
			HideDir.mkdirs();
		}
		//使うパターン
		Pattern zipJar = Pattern.compile("(.+).(zip|jar)$");
		Pattern json = Pattern.compile("(.+).json$");

		//ファイルのリストを制作
		List<File> FileList = new ArrayList<File>();
		for (File file : HideDir.listFiles()){
			//Load folders and valid zip files
			if (file.isDirectory() || zipJar.matcher(file.getName()).matches())
			{
				//Add the directory to the content pack list
				HideMod.log("Loaded content pack : " + file.getName());
				FileList.add(file);
			}
		}
		//パックのリストを制作
		for (File file : FileList){
			//パックのパスを取得
			String PackPath = HidePath+file.getName()+"/";
			//Jsonファイルから読み込んでインスタンスを生成
			ContentsPack NewPack = new ContentsPack((JsonObject) Helper.ReadJson(HidePath+file.getName()+"/pack.json",JsonObject.class));
			contentsPackList.add(NewPack);
			for (String str : NewPack.packNewCreativeTab){
				//追加するクリエイティブタブは重複させない
				if (!newCreativeTabs.contains(str)){
					newCreativeTabs.add(str);
				}
			}
		}
		//銃のリストを制作
		for (File file : FileList){
			//パックのパスを取得
			String GunPath = HidePath+file.getName()+"/guns/";
			File Guns = new File(GunPath);
			for (File gun : Guns.listFiles()){
				//ファイルなら
				if (gun.isFile())
				{
					//Jsonファイルから読み込んでインスタンスを生成
					GunData NewGun = new GunData((JsonObject) Helper.ReadJson(gun.getAbsolutePath(),JsonObject.class));
					//重複チェック
					if(gunList.contains(NewGun.ShortName)){
						gunList.add(NewGun.ShortName);
						gunMap.put(NewGun.ShortName,NewGun);
					}
				}
			}

		}

		for(ContentsPack pack:contentsPackList){HideMod.log(pack.packName);}


		for (String str : newCreativeTabs){
			HideMod.log("クリエイティブタブ"+str);
		}
		Gson gson = new GsonBuilder().serializeNulls().create();

		/*
		HideMod.log(NewPack.packName);
		HideMod.log(NewPack.packVersion);
		for (String str : NewPack.packNewCreativeTab){
			HideMod.log(str);
		}
*/


		//実験用の弾を登録
		BulletData Sumplebullet = new BulletData();
		Sumplebullet.playerDamage = 1F;

		bulletMap.put("Sumple",Sumplebullet);


		//レシスタに書き込む
		Register();
	}

	/**レジスタに書き込み*/
	static void Register() {
		//アイテムをレジスタに
	}
}