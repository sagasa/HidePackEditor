package types.base;

/**プリミティブ型のみのデータ型*/
public abstract class CloneableObj implements Cloneable{
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
