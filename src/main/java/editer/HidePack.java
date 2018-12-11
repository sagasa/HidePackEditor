package editer;

import java.util.Random;

import io.PackCash;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import resources.HideImage;
import resources.Sound;
import types.PackInfo;
import types.base.DataBase;
import types.guns.BulletData;
import types.guns.GunData;

/** パック本体 */
public class HidePack {

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
	public static ObservableList<PackInfo> OpenPacks;
	/** デフォルトパック */
	public static PackInfo DefaultPack;
	/** 初回かどうか */
	public static boolean isNewPack = true;

	public static Random random = new Random();

	/** 追加時にinit()を呼ばせる */

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
		DefaultPack = new PackInfo();
		DefaultPack.PackUID = random.nextLong();
		DefaultPack.PACK_NAME = "default";
		DefaultPack.PACK_ROOTNAME = "default";
		DefaultPack.PACK_VER = "";
		DefaultPack.isDefault = true;
		DefaultPack.PackColor = Color.GRAY;
		OpenPacks.add(DefaultPack);
		// DataBaseを追加時にinitを呼ぶリスナー
		ListChangeListener<DataBase> initListener = change -> {
			while (change.next()) {
				change.getAddedSubList().forEach(data -> data.init());
			}
		};

		GunList.addListener(initListener);
		BulletList.addListener(initListener);
		OpenPacks.addListener(initListener);
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

	public static PackInfo addPack(PackInfo pack) {
		if (getPack(pack.PACK_NAME) == null || getPack(pack.PACK_NAME).isReference != pack.isReference) {
			OpenPacks.add(pack);
			return pack;
		} else {
			return getPack(pack.PACK_NAME);
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
	public static PackInfo getPack(String packName) {
		for (PackInfo data : OpenPacks) {
			if (data.PACK_NAME.equals(packName)) {
				return data;
			}
		}
		return null;
	}

	/** パック取得 */
	public static PackInfo getPack(long uid) {
		for (PackInfo data : OpenPacks) {
			if (data.PackUID == uid) {
				return data;
			}
		}
		return null;
	}

	/** アイコン取得 */
	public static HideImage getIcon(String string) {
		for (HideImage data : IconList) {
			if (data.getDisplayName().equals(string)) {
				return data;
			}
		}
		return null;
	}
}
