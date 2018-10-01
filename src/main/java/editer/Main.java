package editer;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import editer.mainWindow.MainWindow;
import io.PackIO;
import localize.LocalizeHandler;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

public class Main {
	/**開いているpath*/
	public static String packPath;

	/** パック */
	public static PackInfo Pack;
	/** 銃のMAP DisplayName-GunData */
	public static Map<String, GunData> GunList = new HashMap<String, GunData>();
	/** 弾のMAP DisplayName-BulletData */
	public static Map<String, BulletData> BulletList = new HashMap<String, BulletData>();
	/** IconのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** ScopeのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> ScopeMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP Name - byte[] */
	public static Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();

	public static void main(String[] arg){
		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		PackIO.makePack();
		new MainWindow();
	}

	/** パック初期化 */
	public static void clear() {
		packPath = null;
		Pack = null;
		BulletList = new HashMap<String, BulletData>();
		GunList = new HashMap<String, GunData>();
		IconMap = new HashMap<String, BufferedImage>();
		ScopeMap = new HashMap<String, BufferedImage>();
		SoundMap = new HashMap<String, byte[]>();
	}
}
