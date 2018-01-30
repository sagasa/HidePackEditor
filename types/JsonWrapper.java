package types;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**ここにJsonWrapper()でJsonオブジェクトを渡してからget()で取得する nullはデフォルトを返す*/
public class JsonWrapper {
	private JsonObject _obj;

	public JsonWrapper(JsonObject obj) {
		_obj = obj;
	}

	/**keyで取得したString型を返す nullならデフォルトを返す */
	public String getString(String key, String defaultValue) {
		if(_obj==null){
			return defaultValue;
		}
		JsonElement o = _obj.get(key);
		if(o == null){
			return defaultValue;
		}
		return o.getAsString();
	}

	/**keyで取得したFloat型を返す nullならデフォルトを返す */
	public Float getFloat(String key, Float defaultValue) {
		if(_obj==null){
			return defaultValue;
		}
		JsonElement o = _obj.get(key);
		if(o == null){
			return defaultValue;
		}
		return o.getAsFloat();
	}

	/**keyで取得したInteger型を返す nullならデフォルトを返す */
	public Integer getInt(String key, Integer defaultValue) {
		if(_obj==null){
			return defaultValue;
		}
		JsonElement o = _obj.get(key);
		if(o == null){
			return defaultValue;
		}
		return o.getAsInt();
	}
	
	/**keyで取得したboolean型を返す nullならデフォルトを返す */
	public boolean getBoolean(String key, boolean defaultValue) {
		if(_obj==null){
			return defaultValue;
		}
		JsonElement o = _obj.get(key);
		if(o == null){
			return defaultValue;
		}
		return o.getAsBoolean();
	}
	
	/**keyで取得したString[]型を返す nullならデフォルトを返す 内容がなければ空リストを返す */
	public String[] getStringArray(String key, String[] defaultValue) {
		if(_obj==null){
			return defaultValue;
		}
		JsonElement o = _obj.get(key);
		if(o == null){
			return defaultValue;
		};
		JsonArray array = o.getAsJsonArray();
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < array.size(); i++) {
			result.add(array.get(i).getAsString());
		}
		return result.toArray(new String[]{});
	}
}
