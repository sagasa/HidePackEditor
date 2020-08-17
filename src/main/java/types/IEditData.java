package types;

import java.io.Serializable;

import javafx.beans.property.Property;
import types.base.DataPath;

/***/
public interface IEditData extends Cloneable {
	/**構造体のクラスを取得*/
	public abstract Class<? extends IEditData> getType();

	/**プロパティをパスから取得 型チェック？？知らんな*/
	public abstract Property<?> getProperty(DataPath path);

	/**プロパティの追加・削除ができるか*/
	public boolean canEdit();

	public boolean addProperty(DataPath path);

	public boolean removeProperty(DataPath path);
}
