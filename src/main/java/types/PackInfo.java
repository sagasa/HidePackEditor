package types;

import editer.DataEntityInterface;
import editer.HidePack;
import javafx.scene.paint.Color;
import types.base.DataBase;

public class PackInfo extends DataBase implements DataEntityInterface{

	/** 参照か */
	transient public boolean isReference = false;
	/** 表示用カラー */
	transient public Color PackColor = Color.rgb(HidePack.random.nextInt(256), HidePack.random.nextInt(256), HidePack.random.nextInt(256));
	/** デフォルトか */
	transient public boolean isDefault = false;

	/** パックの登録名 ファイル名ではない */
	public String PACK_NAME = "sample";
	/** パックのバージョン */
	public String PACK_VER = "0";
	/**登録時の名称*/
	public String PACK_ROOTNAME = "default";
	@Override
	public String getDisplayName() {
		return PACK_NAME;
	}
	@Override
	public long getPackUID() {
		return PackUID;
	}
}
