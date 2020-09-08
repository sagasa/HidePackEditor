package editer;

import java.util.List;
import java.util.Random;

import io.PackCash;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import resources.HideImage;
import resources.Model;
import resources.Sound;
import types.PackInfo;
import types.base.DataHolder;
import types.base.NamedData;
import types.items.GunData.GunDataEnum;
import types.items.MagazineData.MagDataEnum;
import types.model.HideModel;

/** パック本体 */
public class HidePack {

	/** 未設定時のイメージ */
	public static final Image NullImage = new Image("/icon/notSet.png");

	/** 銃のList GunData */
	public static DataHolder<GunDataEnum> GunList = new DataHolder<>();
	/** 弾のList MagazineData */
	public static DataHolder<MagDataEnum> MagazineList = new DataHolder<>();
	/** IconのList Image */
	public static ObservableList<HideImage> IconList;
	/** ScopeのList Image */
	public static ObservableList<HideImage> ScopeList;
	/** SoundのList Sound */
	public static ObservableList<Sound> SoundList;
	/** TextureのList Image */
	public static ObservableList<HideImage> TextureList;
	/** ModelのList Model */
	public static ObservableList<Model> ModelList;
	/** ModelInfoのList HideModel */
	public static ObservableList<HideModel> ModelInfoList;
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
		GunList.clear();
		MagazineList.clear();
		IconList = FXCollections.observableArrayList();
		ScopeList = FXCollections.observableArrayList();
		SoundList = FXCollections.observableArrayList();
		TextureList = FXCollections.observableArrayList();
		OpenPacks = FXCollections.observableArrayList();
		ModelList = FXCollections.observableArrayList();
		ModelInfoList = FXCollections.observableArrayList();
		DefaultPack = new PackInfo();
		DefaultPack.PACK_NAME = "default";
		DefaultPack.PACK_ROOTNAME = "default";
		DefaultPack.PACK_VER = "";
		DefaultPack.PackColor.set(Color.GRAY);
		OpenPacks.add(DefaultPack);
	}

	/** PackCashインポート */
	public static void addPack(PackCash pack) {
		// 放り込む
		GunList.putAll(pack.GunList);
		MagazineList.putAll(pack.MagazineList);
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

	/** リストから一致する名前を取得 複数ある場合も1つしか戻らない */
	public static <T extends IDataEntity> T getDataByName(List<T> list, String displayName) {
		for (T data : list) {
			if (data.getDisplayName().equals(displayName)) {
				return data;
			}
		}
		return null;
	}

	/** 銃取得 */
	public static NamedData<GunDataEnum> getGunData(String displayName) {
		return GunList.get(displayName);
	}

	/** 弾取得 */
	public static NamedData<MagDataEnum> getMagazineData(String displayName) {
		return MagazineList.get(displayName);
	}

	/** パック取得 */
	public static PackInfo getPack(String packName) {
		return getDataByName(OpenPacks, packName);
	}

	/** アイコン取得 */
	public static HideImage getIcon(String displayName) {
		return getDataByName(IconList, displayName);
	}

	/** Model取得 */
	public static Model getModel(String displayName) {
		return getDataByName(ModelList, displayName);
	}

	/** ModelInfo取得 */
	public static HideModel getModelInfo(String displayName) {
		return getDataByName(ModelInfoList, displayName);
	}

	/** テクスチャ取得 */
	public static HideImage getTexture(String displayName) {
		return getDataByName(TextureList, displayName);
	}
}
