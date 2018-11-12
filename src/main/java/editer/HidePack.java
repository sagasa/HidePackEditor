package editer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.paint.Color;
import resources.Image;
import resources.Sound;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

/** パック本体 */
public class HidePack {

	/** 銃のMAP GunData */
	public static List<GunData> GunList = new ArrayList<>();
	/** 弾のMAP BulletData */
	public static List<BulletData> BulletList = new ArrayList<>();
	/** IconのMAP Image */
	public static List<Image> IconList = new ArrayList<>();
	/** ScopeのMAP Image */
	public static List<Image> ScopeList = new ArrayList<>();
	/** SoundのMAP Sound */
	public static List<Sound> SoundList = new ArrayList<>();
	/** 編集中のパック */
	public static List<HidePack> OpenPacks = new ArrayList<>();
	/**デフォルトパック*/
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
			if (data.Pack.PackUID == uid) {
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
	public PackInfo Pack = new PackInfo();
	/** デフォルトか */
	public boolean isDefault = false;
}
