package types;

import java.io.File;

import editer.DataEntityInterface;
import types.base.DataBase;

public class PackInfo extends DataBase implements DataEntityInterface{

	/**パックのパス*/
	transient public File PackPath = new File("./export/");
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
