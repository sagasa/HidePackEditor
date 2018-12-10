package editer;

import java.util.Random;

import io.PackCash;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import resources.HideImage;
import resources.Sound;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

/** パック本体 */
public class HidePack implements DataEntityInterface{

	/** 銃のList GunData */
	public static ObservableList<GunData> GunList;
	/** 弾のList BulletData */
	public static ObservableList<BulletData> BulletList;
	/** IconのList Image */
	public static ObservableList<HideImage> IconList;
	/** ScopeのList Image */
	public static ObservableList<HideImage> ScopeList;
	/** SoundのList Sound */
	public static ObservableList<Sound> SoundList;
	/** 編集中のパック デフォルトを含む */
	public static ObservableList<HidePack> OpenPacks;
	/** デフォルトパック */
	public static HidePack DefaultPack;
	/** 初回かどうか */
	public static boolean isNewPack = true;

	private static Random random = new Random();

	static {
		clear();
	}
	/** パック初期化 */
	public static void clear() {
		GunList = FXCollections.observableArrayList();
		BulletList = FXCollections.observableArrayList();
		IconList = FXCollections.observableArrayList();
		ScopeList = FXCollections.observableArrayList();
		SoundList = FXCollections.observableArrayList();
		OpenPacks = FXCollections.observableArrayList();
		DefaultPack = new HidePack();
		DefaultPack.Pack = new PackInfo();
		DefaultPack.Pack.PackUID = random.nextLong();
		DefaultPack.Pack.PACK_NAME = "default";
		DefaultPack.Pack.PACK_ROOTNAME = "default";
		DefaultPack.Pack.PACK_VER = "";
		DefaultPack.isDefault = true;
		DefaultPack.PackColor = Color.GRAY;
		OpenPacks.add(DefaultPack);
	}

	/** PackCashインポート */
	public static void addPack(PackCash pack) {
		// 放り込む
		GunList.addAll(pack.GunList);
		BulletList.addAll(pack.BulletList);
		IconList.addAll(pack.IconList);
		ScopeList.addAll(pack.ScopeList);
		SoundList.addAll(pack.SoundList);
		if (pack.Pack != null)
			OpenPacks.add(pack.Pack);
	}

	public static HidePack addPack(HidePack pack) {
		if (getPack(pack.Pack.PACK_NAME) == null || getPack(pack.Pack.PACK_NAME).isReference != pack.isReference) {
			OpenPacks.add(pack);
			return pack;
		} else {
			return getPack(pack.Pack.PACK_NAME);
		}
	}

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

	/**アイコン取得*/
	public static HideImage getIcon(String string) {
		for (HideImage data : IconList) {
			if (data.getDisplayName().equals(string)) {
				return data;
			}
		}
		return null;
	}

	/** 参照か */
	public boolean isReference = false;
	/** 表示用カラー */
	public Color PackColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	/** Info */
	public PackInfo Pack = new PackInfo();
	/** デフォルトか */
	public boolean isDefault = false;

	@Override
	public String getDisplayName() {
		return Pack.PACK_NAME;
	}

	@Override
	public long getPackUID() {
		return Pack.PackUID;
	}
}
