package io;

import java.util.ArrayList;
import java.util.List;

import editer.HidePack;
import resources.HideImage;
import resources.Model;
import resources.Sound;
import types.PackInfo;
import types.items.GunData;
import types.items.MagazineData;
import types.model.HideModel;

public class PackCash {
	/** 銃のList */
	public List<GunData> GunList = new ArrayList<>();
	/** 弾のList */
	public List<MagazineData> MagazineList = new ArrayList<>();
	/** IconのList */
	public List<HideImage> IconList = new ArrayList<>();
	/** ScopeのList */
	public List<HideImage> ScopeList = new ArrayList<>();
	/** SoundのList */
	public List<Sound> SoundList = new ArrayList<>();
	/** ModelのList */
	public List<Model> ModelList = new ArrayList<>();
	/** HideModelのList Sound */
	public List<HideModel> ModelInfoList = new ArrayList<>();
	/** 読み込み中のパック */
	public PackInfo Pack;

	/** パック情報を付与 trueでデフォルトパック 同じ名前があったら統合 */
	void setPack() {
		PackInfo pack = HidePack.DefaultPack;
		if (Pack != null) {
			// 同じ名前なら優先
			PackInfo base = HidePack.getPack(Pack.getDisplayName());
			if (base != null && Pack.getSystemName().equals(base.getSystemName())) {
				pack = base;
				Pack = null;
			} else {
				pack = Pack;
			}
		}
		final PackInfo fInfo = pack;

		GunList.forEach(data -> data.getRootPack().set(fInfo));
		MagazineList.forEach(data -> data.getRootPack().set(fInfo));
		IconList.forEach(data -> data.RootPack.set(fInfo));
		ScopeList.forEach(data -> data.RootPack.set(fInfo));
		ModelList.forEach(data -> data.RootPack.set(fInfo));
		ModelInfoList.forEach(data -> data.getRootPack().set(fInfo));
	}
}
