package types;

import com.google.gson.JsonObject;

import helper.JsonWrapper;

public class MagazineData {

	/** 登録名 : String型 全部小文字 **/
	public String ShortName;

	/** 表示名 : String型 **/
	public String DisplayName;

	/** アイテムのアイコン : String型 **/
	public String Icon;

	/** 入る弾薬 : String型 **/
	public String Bullet;

	/** 装弾数 : int型 **/
	public int MagazineSize;

	/** スタックサイズ : int型 **/
	public int StackSize;


	/**初期値は下から持ってくる*/
	public MagazineData() {
		this(null);
	}

	/**JsonObjectからデータを読み込む ; pack_name, pack_version, pack_newcreativetab[]*/
	public MagazineData(JsonObject obj) {
		JsonWrapper w = new JsonWrapper(obj);

		ShortName = w.getString("magazine_shortName", "name");
		DisplayName = w.getString("magazine_displayName", "name");
		Icon = w.getString("magazine_icon", "sample");
		Bullet = w.getString("magazine_bullet", "sample");
		MagazineSize = w.getInt("magazine_magazineSize", 10);
		StackSize = w.getInt("magazine_stackSize", 1);
	}
}
