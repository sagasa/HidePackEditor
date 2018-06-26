package helper;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import types.Explosion;
import types.ItemInfo;
import types.Sound;
import types.base.EnumDataList;
import types.guns.GunRecoil;

/**ここにJsonWrapper()でJsonを渡してからget()で取得する nullはデフォルトを返す*/
public class JsonWrapper {
	private JsonObject _obj;
	Gson gson = new Gson();

	public JsonWrapper(String json) {
		_obj = gson.fromJson(json, JsonObject.class);
	}

	/**keyで取得して型変換して返す */
	public Object getObject(EnumDataList key) {
		if(_obj==null){
			return key.getDefaultValue();
		}
		JsonElement o = _obj.get(key.getName());
		if(o == null){
			return key.getDefaultValue();
		};
		switch (key.getType()) {
		case Boolean:
			return o.getAsBoolean();
		case Float:
			return o.getAsFloat();
		case GunRecoil:
			return gson.fromJson(o, GunRecoil.class);
		case Int:
			return o.getAsInt();
		case ItemInfo:
			return gson.fromJson(o, ItemInfo.class);
		case Sound:
			return gson.fromJson(o, Sound.class);
		case String:
			return o.getAsString();
		case StringArray:
			return gson.fromJson(o,new TypeToken<String[]>() {}.getType());
		case Explosion:
			return gson.fromJson(o, Explosion.class);
		default:
			break;
		}
		return key.getDefaultValue();
	}
}
