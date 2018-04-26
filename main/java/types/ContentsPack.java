package types;

import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import helper.JsonWrapper;
import types.GunData.GunDataList;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class ContentsPack extends DataBase {

	/** 初期値 */
	public ContentsPack() {
		this(null);
	}

	/** 弾のデータ 初期値も同時に代入 */
	public enum PackDataList implements EnumDataList {
		/** パックの登録名 ファイル名ではない */
		PACK_NAME("PackName", "name", DataType.String),
		/** パックのバージョン */
		PACK_VERSION("PackVersion", "version", DataType.String),

		/** 新しいクリエイティブタブ 複数設定可能 : String配列型 **/
		NEW_CREATIVE_TAB("NewCreativeTab", new String[] {}, DataType.StringArray),;

		;
		/** 登録名 */
		private String name;
		/** 初期値 */
		private Object defaultValue;
		/** Type */
		private DataType types;

		/** コンストラクタ 表示名+データ+Type カテゴリはデフォルト */
		PackDataList(String name, Object obj, DataType types) {
			this.name = name;
			this.defaultValue = obj;
			this.types = types;
		}

		/** 登録名を返す */
		@Override
		public String getName() {
			return name;
		}

		/** 型を返す */
		@Override
		public DataType getType() {
			return types;
		}

		/** 初期値を返す */
		@Override
		public Object getDefaultValue() {
			return defaultValue;
		}

		/** データを設定する nullは上書きしない */
		public void setData(ContentsPack d, Object obj) {
			if (obj != null) {
				d.Data.replace(this.getName(), obj);
			}
		}

		@Override
		public Float getMin() {
			return null;
		}

		@Override
		public Float getMax() {
			return null;
		}

		@Override
		public int getCate() {
			return -1;
		}
	}

	static final String headName = "gun_";

	/** JsonStringからデータを読み込む */
	public ContentsPack(String json) {
		// 初期値を忘れずに
		Gson gson = new Gson();
		JsonWrapper w = new JsonWrapper(gson.fromJson(json, JsonObject.class));
		// マップに格納
		for (PackDataList d : PackDataList.values()) {
			// System.out.println(d.getName()+" "+d.getDefaultValue() + " "+
			// w.getString("gun_"+d.getName(), d.getDefaultValue().toString()));
			switch (d.types) {
			case Boolean:
				Data.put(d.toString(),
						w.getBoolean(headName + d.toString(), new Boolean(d.getDefaultValue().toString())));
				break;
			case String:
				Data.put(d.toString(), w.getString(headName + d.toString(), d.getDefaultValue().toString()));
				break;
			case Int:
				Data.put(d.toString(), w.getInt(headName + d.toString(), new Integer(d.getDefaultValue().toString())));
				break;
			case Float:
				Data.put(d.toString(), w.getFloat(headName + d.toString(), new Float(d.getDefaultValue().toString())));
				break;
			case StringArray:
				Data.put(d.toString(), w.getStringArray(headName + d.toString(), (String[]) d.getDefaultValue()));
				break;
			}
		}
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject JsonData = new JsonObject();
		for (PackDataList d : PackDataList.values()) {
			switch (d.types) {
			case Boolean:
				JsonData.addProperty(headName + d.toString(), this.getDataBoolean(d));
				break;
			case String:
				JsonData.addProperty(headName + d.toString(), this.getDataString(d));
				break;
			case Int:
				JsonData.addProperty(headName + d.toString(), this.getDataInt(d));
				break;
			case Float:
				JsonData.addProperty(headName + d.toString(), this.getDataFloat(d));
				break;
			case StringArray:
				JsonElement element = gson.toJsonTree(this.getDataStringArray(d), new TypeToken<String[]>() {
				}.getType());
				JsonData.add(headName + d.toString(), element.getAsJsonArray());
				break;
			}
		}
		return gson.toJson(JsonData);
	}
}
