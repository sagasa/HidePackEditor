package types;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ContentsPack{

	/** パックの登録名 ファイル名ではない */
	public String PACK_NAME = "sample";
	/** パックのバージョン */
	public String PACK_VER = "0";
	/**登録時の名称*/
	public String PACK_ROOTNAME = "default";


	/** JsonStringからデータを読み込む */
	public ContentsPack(String json) {
		Gson gson = new Gson();
		ContentsPack loaded = gson.fromJson(json, this.getClass());
		this.PACK_NAME = loaded.PACK_NAME;
		this.PACK_VER = loaded.PACK_VER;
		this.PACK_ROOTNAME = loaded.PACK_ROOTNAME;
	}

	public ContentsPack() {
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
}
