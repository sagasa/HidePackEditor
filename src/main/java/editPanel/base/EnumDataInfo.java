package editPanel.base;

public interface EnumDataInfo {
	/**最小値を返す*/
	public Float getMin();
	/**最大値を返す*/
	public Float getMax();
	/**表示名を返す*/
	public String getUnlocalizedName();
	/**カテゴリを返す*/
	public int getCate();
	/**変更の単位を返す*/
	public String getScale();
}
