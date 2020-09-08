package types;

import editer.HidePack;
import editer.IDataEntity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;

public class PackInfo implements IDataEntity {

	transient private ObjectProperty<PackInfo> thisProperty = new ReadOnlyObjectWrapper<>(this);
	/** 参照か */
	transient public boolean isReference = false;
	/** 表示用カラー */
	transient public ObjectProperty<Color> PackColor = new SimpleObjectProperty<>(
			Color.rgb(HidePack.random.nextInt(256), HidePack.random.nextInt(256), HidePack.random.nextInt(256)));

	/** パックの登録名 ファイル名ではない */
	public String PACK_NAME = "sample";
	/** パックのバージョン */
	public String PACK_VER = "0";
	/** 登録時の名称 */
	public String PACK_ROOTNAME = "default";

	/** 参照データか確認 */
	public boolean isReference() {
		return isReference;
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return thisProperty;
	}

	@Override
	public String getDisplayName() {
		return PACK_NAME;
	}
}
