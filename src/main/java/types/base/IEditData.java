package types.base;

import java.io.Serializable;

import helper.DataPath;
import javafx.beans.property.Property;

public interface IEditData extends Serializable, Cloneable {
	/**構造体のクラスを取得*/
	public abstract Class<? extends IEditData> getType();

	/**プロパティをパスから取得 型チェック？？知らんな*/
	public abstract Property<?> getProperty(DataPath path);
}
