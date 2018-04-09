package types;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import hideMod.HideMod;

public class ContentsPack {
	/**パックの登録名 ファイル名ではない*/
	public String packName;

	/**パックのバージョン*/
	public String packVersion;

	/**新しいクリエイティブタブ 複数指定化*/
	public List<String> packNewCreativeTab;

	/**初期値*/
	public ContentsPack() {
		packName = "NotSet";
		packVersion = "Version";
		packNewCreativeTab = new ArrayList<String>();
	}

	/**JsonObjectからデータを読み込む ; pack_name, pack_version, pack_newcreativetab[]*/
	public ContentsPack(JsonObject obj) {
		//初期値を忘れずに
		this();
		
		packName = obj.get("pack_name").getAsString();
		packVersion = obj.get("pack_version").getAsString();
		//アレイとしてみて要素を取り出す
		JsonArray NewCreativeTab = obj.get("pack_newCreativeTab").getAsJsonArray();
		for (int i = 0; i < NewCreativeTab.size(); i++) {
			packNewCreativeTab.add(NewCreativeTab.get(i).getAsString());
		}
	}
}
