package types;

import editer.DataEntityInterface;
import editer.HidePack;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.paint.Color;
import types.base.DataBase;

public class PackInfo extends DataBase implements DataEntityInterface {

	transient private ObjectProperty<PackInfo> thisProperty = new ReadOnlyObjectWrapper<PackInfo>(this);
	/** 参照か */
	transient public boolean isReference = false;
	/** 表示用カラー */
	transient public Color PackColor = Color.rgb(HidePack.random.nextInt(256), HidePack.random.nextInt(256),
			HidePack.random.nextInt(256));

	/** パックの登録名 ファイル名ではない */
	public String PACK_NAME = "sample";
	/** パックのバージョン */
	public String PACK_VER = "0";
	/**登録時の名称*/
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

