package types;

import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;

public class ContentsPack {

	/**初期値*/
	public ContentsPack() {
		this(null);
	}

	/**全データ*/
	HashMap<String,Object> Data = new HashMap<String,Object>();

	/**弾のデータ 初期値も同時に代入*/
	public enum PackDataList {
		/**パックの登録名 ファイル名ではない*/
		PACK_NAME("PackName","name","String"),
		/**パックのバージョン*/
		PACK_LORE("PackLore","lore","String"),

		/** 新しいクリエイティブタブ 複数設定可能 : String配列型 **/
		NEW_CREATIVE_TAB("NewCreativeTab", new String[] {},"String[]"),;

		;
		/**登録名*/
		private String name;
		/**初期値*/
		private Object defaultValue;
		/**Type*/
		private String types;

		/**コンストラクタ 表示名+データ+Type カテゴリはデフォルト*/
		PackDataList(String name, Object obj ,String types) {
			this.name = name;
			this.defaultValue = obj;
			if (types.equals("String")||types.equals("int")||types.equals("float")||types.equals("String[]")){
				this.types = types;
			}
		}


		/**登録名を返す*/
		public String getName() {
			return name;
		}
		/**型を返す*/
		public String getType() {
			return types;
		}
		/**データを返す*/
		public Object getData(ContentsPack d) {
			return d.Data.get(this.getName());
		}
		/**Nameからデータを返す*/
		public Object getData(ContentsPack d,String Name) {
			return d.Data.get(Name);
		}
		/**初期値を返す*/
		public Object getDefaultValue() {
			return defaultValue;
		}

		/**データを設定する nullは上書きしない*/
		public void setData(ContentsPack d,Object obj) {
			if (obj != null){
				d.Data.replace(this.getName(), obj);
			}
		}
	}

	/**JsonObjectからデータを読み込む ; pack_name, pack_version, pack_newcreativetab[]*/
	public ContentsPack(String json) {
		//初期値を忘れずに
		Gson gson = new Gson();
		JsonWrapper w = new JsonWrapper(gson.fromJson(json, JsonObject.class));

		//マップに格納
		for (PackDataList d:PackDataList.values()){
			switch (d.types){
			case "String":
				Data.put(d.getName(), w.getString("pack_"+d.getName(),d.getDefaultValue().toString()));
			break;
			case "int":
				Data.put(d.getName(), w.getInt("pack_"+d.getName(), new Integer (d.getDefaultValue().toString())));
			break;
			case "float":
				Data.put(d.getName(), w.getFloat("pack_"+d.getName(), new Float (d.getDefaultValue().toString())));
			break;
			case "String[]":
				Data.put(d.getName(), w.getStringArray("pack_"+d.getName(), (String[]) d.getDefaultValue()));
			break;
			}
		}

	}
	/**JsonObjectを作成*/
	public String MakeJsonData(){
		Gson gson = new Gson();
		JsonObject JsonData = new JsonObject();
		for (PackDataList d:PackDataList.values()){
			switch (d.types){
			case "String":
				JsonData.addProperty("pack_"+d.getName(),d.getData(this).toString());
			break;
			case "int":
				JsonData.addProperty("pack_"+d.getName(), new Integer (d.getData(this).toString()));
			break;
			case "float":
				JsonData.addProperty("pack_"+d.getName(), new Float (d.getData(this).toString()));
			break;
			case "String[]":
				JsonElement element =
			     gson.toJsonTree((String[])d.getData(this) , new TypeToken<String[]>() {}.getType());
				JsonData.add("pack_"+d.getName(), element.getAsJsonArray());
			break;
			}
		}
		return gson.toJson(JsonData);
	}
}
