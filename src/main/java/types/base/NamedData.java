package types.base;

import org.apache.logging.log4j.util.Strings;
import org.checkerframework.checker.units.qual.K;

import editer.IDataEntity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.PackInfo;

/** 一番上に位置するDataに必要 */
public abstract class NamedData extends DataBase implements IDataEntity {

	public boolean findParent(DataHolder<K> holder) {
		String name = (String) get(parentName(), null);
		parent = Strings.isEmpty(name) ? null : holder.get(name);
		initParent();
		return parent != null;
	}

	public abstract K displayName();

	/** 親の名前 */
	public abstract K parentName();

	@Override
	public String getDisplayName() {
		return get(displayName(), null);
	}

	// エディタ側
	transient private ObjectProperty<PackInfo> rootPack = new SimpleObjectProperty<>();

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return rootPack;
	}
}
