package types;

import editer.HidePack;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import types.base.NamedData;

/** 親子関係は利用しない */
public class PackInfo extends NamedData {

	transient private ObjectProperty<PackInfo> thisProperty = new ReadOnlyObjectWrapper<>(this);
	/** 参照か */
	transient public boolean isReference = false;
	/** 表示用カラー */
	transient public ObjectProperty<Color> PackColor = new SimpleObjectProperty<>(
			Color.rgb(HidePack.random.nextInt(256), HidePack.random.nextInt(256), HidePack.random.nextInt(256)));

	/** パックの登録名 ファイル名ではない */
	public static final DataEntry<String> PackName = of("sample");
	/** パックのバージョン */
	public static final DataEntry<String> PackVar = of("0");
	/** 登録時の名称 */
	public static final DataEntry<String> PackDomain = of("default");

	/** 参照データか確認 */
	public boolean isReference() {
		return isReference;
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return thisProperty;
	}

	@Override
	public DataEntry<String> displayName() {
		return PackName;
	}

	@Override
	public DataEntry<String> systemName() {
		return PackDomain;
	}
}
