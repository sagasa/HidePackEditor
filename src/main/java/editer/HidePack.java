package editer;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import io.PackCash;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import resources.HideImage;
import resources.Model;
import resources.Sound;
import types.PackInfo;
import types.base.NamedData;
import types.items.GunData;
import types.items.MagazineData;
import types.model.HideModel;
import types.value.Operator;

/** パック本体 */
public class HidePack {

	/** 未設定時のイメージ */
	public static final Image NullImage = new Image("/icon/notSet.png");

	/** 銃のList GunData */
	public static ObservableList<GunData> GunList;
	/** 弾のList MagazineData */
	public static ObservableList<MagazineData> MagazineList;
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

	public static Random random = new Random();

	/** 追加時にinit()を呼ばせる */

	private static final ListChangeListener<NamedData> namedinit = (e) -> {
		while (e.next())
			if (0 < e.getAddedSize())
				e.getAddedSubList().forEach(add -> add.container = e.getList());
	};
	static {
		GunList = FXCollections.observableArrayList();
		MagazineList = FXCollections.observableArrayList();
		IconList = FXCollections.observableArrayList();
		ScopeList = FXCollections.observableArrayList();
		SoundList = FXCollections.observableArrayList();
		TextureList = FXCollections.observableArrayList();
		OpenPacks = FXCollections.observableArrayList();
		ModelList = FXCollections.observableArrayList();
		ModelInfoList = FXCollections.observableArrayList();
		DefaultPack = new PackInfo();
		DefaultPack.put(PackInfo.PackName, Operator.SET, "default");
		DefaultPack.put(PackInfo.PackDomain, Operator.SET, "default");
		DefaultPack.put(PackInfo.PackVar, Operator.SET, "");
		DefaultPack.PackColor.set(Color.GRAY);
		OpenPacks.add(DefaultPack);

		GunList.addListener(namedinit);
		MagazineList.addListener(namedinit);
		ModelInfoList.addListener(namedinit);
	}

	/** パック初期化 */
	public static void clear() {
		GunList.clear();
		MagazineList.clear();
		IconList.clear();
		ScopeList.clear();
		SoundList.clear();
		TextureList.clear();
		OpenPacks.clear();
		ModelList.clear();
		ModelInfoList.clear();
		DefaultPack = new PackInfo();
		DefaultPack.put(PackInfo.PackName, Operator.SET, "default");
		DefaultPack.put(PackInfo.PackDomain, Operator.SET, "default");
		DefaultPack.put(PackInfo.PackVar, Operator.SET, "");
		DefaultPack.PackColor.set(Color.GRAY);
		OpenPacks.add(DefaultPack);
	}

	public static boolean isEmpty() {
		return GunList.isEmpty() && MagazineList.isEmpty() && IconList.isEmpty() && ScopeList.isEmpty()
				&& SoundList.isEmpty() && TextureList.isEmpty() && ModelList.isEmpty() && ModelInfoList.isEmpty();
	}

	/** 各種編集関数実行 false返すと削除 */
	public static void editToAll(Function<IDataEntity, Boolean> func) {
		edit(GunList, func);
		edit(MagazineList, func);
		edit(IconList, func);
		edit(ScopeList, func);
		edit(SoundList, func);
		edit(TextureList, func);
		edit(ModelList, func);
		edit(ModelInfoList, func);
	}

	private static void edit(List<? extends IDataEntity> list, Function<IDataEntity, Boolean> func) {
		Iterator<? extends IDataEntity> itr = list.iterator();
		while (itr.hasNext())
			if (!func.apply(itr.next()))
				itr.remove();
	}

	public static void mergePack(PackInfo from, PackInfo to) {
		editToAll(e -> {
			ObjectProperty<PackInfo> prop = e.getRootPack();
			if (from.equals(prop.get())) {
				prop.set(to);
			}
			return true;
		});
	}

	/** PackCashインポート */
	public static void addPack(PackCash pack) {
		// 放り込む
		GunList.addAll(pack.GunList);
		MagazineList.addAll(pack.MagazineList);
		IconList.addAll(pack.IconList);
		ScopeList.addAll(pack.ScopeList);
		SoundList.addAll(pack.SoundList);
		if (pack.Pack != null)
			OpenPacks.add(pack.Pack);
	}

	public static PackInfo addPack(PackInfo pack) {
		if (getPack(pack.getDisplayName()) == null || getPack(pack.getDisplayName()).isReference != pack.isReference) {
			OpenPacks.add(pack);
			return pack;
		} else {
			return getPack(pack.getDisplayName());
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
	public static GunData getGunData(String displayName) {
		return getDataByName(GunList, displayName);
	}

	/** 弾取得 */
	public static MagazineData getMagazineData(String displayName) {
		return getDataByName(MagazineList, displayName);
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
