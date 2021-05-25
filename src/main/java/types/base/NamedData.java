package types.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import editer.IDataEntity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.PackInfo;

/** 一番上に位置するDataに必要 */
public abstract class NamedData extends DataBase implements IDataEntity {

	/** 親の登録名 String */
	public static final DataEntry<String> ParentName = of("", new Info().IsName(true));

	protected void setParent(NamedData data) {
		if (parent == data)
			return;
		if (parent != null)
			parent.children.remove(this);
		parent = data;
		onChange(null);
		if (data != null) {
			parent.children.add(this);
		}
		initParent();
	}

	/** 依存関係の解決 */
	public static void resolvParent(Collection<? extends NamedData> collection) {
		Map<String, NamedData> map = new HashMap<>();
		collection.forEach(data -> {
			map.put(data.getSystemName(), data);
			data.children.clear();
		});
		collection.forEach(data -> data.setParent(map.get(data.get(NamedData.ParentName, null))));
	}

	public abstract DataEntry<String> displayName();

	/** 全部小文字[a-z][0-9] */
	public abstract DataEntry<String> systemName();

	@Override
	public String getDisplayName() {
		return get(displayName(), null);
	}

	public String getSystemName() {
		return get(systemName(), null);
	}

	// エディタ側
	transient private ObjectProperty<PackInfo> rootPack = new SimpleObjectProperty<>();
	transient public List<? extends NamedData> container;

	public void onChangeSystemName(String ov, String nv) {
		container.forEach(data -> {
			if (ov.equals(data.get(NamedData.ParentName, null)))
				data.setParent(null);
			if (nv.equals(data.get(NamedData.ParentName, null)))
				data.setParent(this);
		});
	}

	public void onChangeParentName(String ov, String nv) {
		container.forEach(data -> {
			if (ov.equals(data.getSystemName()))
				this.setParent(null);
			if (nv.equals(data.getSystemName()))
				this.setParent(data);
		});
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return rootPack;
	}
}
