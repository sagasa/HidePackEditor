package types.base;

import java.util.HashMap;

public abstract class DataBase {
	/**全データ格納*/
	public HashMap<String,Object> Data;
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
	public String[] getDataStringArray(EnumDataList type){
		if (type.getType()==DataType.StringArray){
			return (String[])this.Data.get(type.toString());
		}
		return new String[0];
	}
	/**データ上書き*/
	public void setData(EnumDataList type,Object data){
		this.Data.replace(type.toString(),data);
	}
	public DataBase(){
		Data = new HashMap<String,Object>();
	}
}
