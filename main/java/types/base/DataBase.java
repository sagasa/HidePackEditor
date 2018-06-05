package types.base;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class DataBase {
	/**全データ格納*/
	public Map<String,Object> Data = new LinkedHashMap<String,Object>();;
	/**データ取得*/
	public int getDataInt(EnumDataList type){
		if (type.getType()==DataType.Int){
			return new Integer(this.Data.get(type.toString()).toString()).intValue();
		}
		return 0;
	}
	/**データ取得*/
	public float getDataFloat(EnumDataList type){
		if (type.getType()==DataType.Float){
			return new Float(this.Data.get(type.toString()).toString()).floatValue();
		}
		return 0;
	}
	/**データ取得*/
	public String getDataString(EnumDataList type){
		if (type.getType()==DataType.String||type.getType()==DataType.Int||type.getType()==DataType.Float){
			return this.Data.get(type.toString()).toString();
		}
		return "";
	}
	/**データ取得*/
	public boolean getDataBoolean(EnumDataList type){
		if (type.getType()==DataType.Boolean){
			return new Boolean(this.Data.get(type.toString()).toString()).booleanValue();
		}
		return false;
	}
	/**データ取得*/
	public Object getDataObject(EnumDataList type){
		return this.Data.get(type.toString());
	}
	/**データ上書き*/
	public void setData(EnumDataList type,Object data){
		//intへのキャスト
		if(type.getType()==DataType.Int&&data instanceof Float){
			data = Math.round((Float) data);
		}
		this.Data.replace(type.toString(),data);
	}
	/** JsonObjectを作成 */
	public String MakeJsonData() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this.Data);
	}
}
