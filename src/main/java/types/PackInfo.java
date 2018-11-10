package types;

import editer.HasDisplayName;
import types.base.DataBase;

public class PackInfo extends DataBase implements HasDisplayName{
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
}
