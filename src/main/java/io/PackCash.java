package io;

import java.util.ArrayList;
import java.util.List;

import editer.HidePack;
import resources.Image;
import resources.Sound;
import types.guns.BulletData;
import types.guns.GunData;

public class PackCash {
	/** 銃のList GunData */
	public List<GunData> GunList = new ArrayList<>();
	/** 弾のList BulletData */
	public List<BulletData> BulletList = new ArrayList<>();
	/** IconのList Image */
	public List<Image> IconList = new ArrayList<>();
	/** ScopeのList Image */
	public List<Image> ScopeList = new ArrayList<>();
	/** SoundのList Sound */
	public List<Sound> SoundList = new ArrayList<>();
	/** 読み込み中のパック */
	public HidePack Pack;

}
