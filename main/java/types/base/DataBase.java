package types.base;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import helper.JsonWrapper;

public abstract class DataBase implements Cloneable {

	/** MAP初期化 */
	abstract protected void newMap();

	/** MAP取得 */
	abstract protected Map<String, Object> getMap();

	/** DataList取得 */
	abstract protected EnumDataList[] getDataList();

	/** データ取得 */
	public int getDataInt(EnumDataList type) {
		if (type.getType() == DataType.Int) {
			return new Integer(getMap().get(type.toString()).toString()).intValue();
		}
		return 0;
	}

	/** データ取得 */
	public float getDataFloat(EnumDataList type) {
		if (type.getType() == DataType.Float) {
			return new Float(getMap().get(type.toString()).toString()).floatValue();
		}
		return 0;
	}

	/** データ取得 */
	public String getDataString(EnumDataList type) {
		if (type.getType() == DataType.String || type.getType() == DataType.Int || type.getType() == DataType.Float) {
			return getMap().get(type.toString()).toString();
		}
		return "";
	}

	/** データ取得 */
	public boolean getDataBoolean(EnumDataList type) {
		if (type.getType() == DataType.Boolean) {
			return new Boolean(getMap().get(type.toString()).toString()).booleanValue();
		}
		return false;
	}

	/** データ取得 */
	public Object getDataObject(EnumDataList type) {
		return getMap().get(type.toString());
	}

	/** データ上書き */
	public void setData(EnumDataList type, Object data) {
		// intへのキャスト
		if (type.getType() == DataType.Int && data instanceof Float) {
			data = Math.round((Float) data);
		}
		getMap().replace(type.toString(), data);
	}

	/** デフォルト値代入 */
	public DataBase() {
		newMap();
		for (EnumDataList data : getDataList()) {
			// オブジェクトなら別インスタンスを
			if (data.getType().isObject() && data.getDefaultValue() instanceof CloneableObj) {
				try {
					getMap().put(data.getName(), ((CloneableObj) data.getDefaultValue()).clone());
				} catch (CloneNotSupportedException e) {
				}
			} else {
				getMap().put(data.getName(), data.getDefaultValue());
			}
		}
	}

	/** JsonStringからデータを読み込む */
	public DataBase(String json) {
		this();
		JsonWrapper wrapper = new JsonWrapper(json);
		for (EnumDataList data : getDataList()) {
			getMap().put(data.getName(), wrapper.getObject(data));
		}
	}

	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(getMap());
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		DataBase clone = (DataBase) super.clone();
		clone.newMap();
		for (EnumDataList data : getDataList()) {
			Object obj = this.getMap().get(data.toString());
			// オブジェクトならクローン
			if (data.getType().isObject() && data.getDefaultValue() instanceof CloneableObj) {
				obj = ((CloneableObj) obj).clone();
			}
			clone.getMap().put(data.getName(), obj);
		}
		return clone;
	}

	@Override
	public String toString() {
		return super.toString() + getMap().toString();
	}
}
