package editer;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

/**パック本体*/
public class HidePack {
	/** Info */
	public PackInfo Pack=null;
	/** 銃のMAP DisplayName-GunData */
	public Map<String, GunData> GunList = new HashMap<String, GunData>();
	/** 弾のMAP DisplayName-BulletData */
	public Map<String, BulletData> BulletList = new HashMap<String, BulletData>();
	/** IconのMAP Name - BufferedImage */
	public Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** ScopeのMAP Name - BufferedImage */
	public Map<String, BufferedImage> ScopeMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP Name - byte[] */
	public Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();
}
