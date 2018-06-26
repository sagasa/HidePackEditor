package types.base;

public interface EnumDataList {
	/**最小値を返す*/
	public Float getMin();
	/**最大値を返す*/
	public Float getMax();
	/**表示名を返す*/
	public String getName();
	/**型を返す*/
	public DataType getType();
	/**初期値を返す*/
	public Object getDefaultValue();
	/**カテゴリを返す*/
	public int getCate();
}
