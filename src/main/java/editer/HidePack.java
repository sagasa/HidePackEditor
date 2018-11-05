package editer;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javafx.scene.paint.Color;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

/** パック本体 */
public class HidePack {

	/** 銃のMAP DisplayName-GunData */
	public static List<GunData> GunList = new ArrayList<GunData>();
	/** 弾のMAP DisplayName-BulletData */
	public static List<BulletData> BulletList = new ArrayList<BulletData>();
	/** IconのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** ScopeのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> ScopeMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP Name - byte[] */
	public static Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();
	/** 編集中のパック */
	public static List<HidePack> OpenPacks = new ArrayList<HidePack>();
	public static HidePack DefaultPack;

	/** 銃取得 */
	public static GunData getGunData(String displayName) {
		for (GunData data : GunList) {
			if (data.ITEM_DISPLAYNAME.equals(displayName)) {
				return data;
			}
		}
		return null;
	}

	/** 弾取得 */
	public static BulletData getBulletData(String displayName) {
		for (BulletData data : BulletList) {
			if (data.ITEM_DISPLAYNAME.equals(displayName)) {
				return data;
			}
		}
		return null;
	}
	/** パック取得 */
	public static HidePack getPack(String packName) {
		for (HidePack data : OpenPacks) {
			if (data.Pack.PACK_NAME.equals(packName)) {
				return data;
			}
		}
		return null;
	}

	/** パック取得 */
	public static HidePack getPack(long uid) {
		for (HidePack data : OpenPacks) {
			if (data.Pack.PackUID==uid) {
				return data;
			}
		}
		return null;
	}

	private static Random random = new Random();

	static {
		HidePack pack = new HidePack();
		pack.Pack = new PackInfo();
		pack.Pack.PackUID = random.nextLong();
		pack.Pack.PACK_NAME = "default";
		pack.Pack.PACK_ROOTNAME = "default";
		pack.Pack.PACK_VER = "";
		pack.isDefault = true;
		pack.PackColor = Color.GRAY;
		DefaultPack = pack;
		OpenPacks.add(pack);
	}


	/** 表示用カラー */
	public Color PackColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	/** Info */
	public PackInfo Pack = null;
	/** デフォルトか */
	public boolean isDefault = false;
}
