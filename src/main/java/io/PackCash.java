package io;

import java.util.ArrayList;
import java.util.List;

import editer.HidePack;
import resources.HideImage;
import resources.Sound;
import types.guns.BulletData;
import types.guns.GunData;

public class PackCash {
	/** 銃のList GunData */
	public List<GunData> GunList = new ArrayList<>();
	/** 弾のList BulletData */
	public List<BulletData> BulletList = new ArrayList<>();
	/** IconのList Image */
	public List<HideImage> IconList = new ArrayList<>();
	/** ScopeのList Image */
	public List<HideImage> ScopeList = new ArrayList<>();
	/** SoundのList Sound */
	public List<Sound> SoundList = new ArrayList<>();
	/** 読み込み中のパック */
	public HidePack Pack;

	/** パック情報を付与 trueでデフォルトパック 同じ名前があったら統合 */
	public void setPack(boolean useDefault) {
		Pack = useDefault ? HidePack.DefaultPack : Pack;
		long uid = HidePack.getPack(Pack.Pack.PACK_NAME) != null ? HidePack.getPack(Pack.Pack.PACK_NAME).Pack.PackUID
				: Pack.Pack.PackUID;
		if (HidePack.getPack(Pack.Pack.PACK_NAME) != null)
			Pack = null;
		GunList.forEach(data -> data.PackUID = uid);
		BulletList.forEach(data -> data.PackUID = uid);
		IconList.forEach(data -> data.PackUID = uid);
		ScopeList.forEach(data -> data.PackUID = uid);
		SoundList.forEach(data -> data.PackUID = uid);
	}
}
