package types.base;

import editer.HasDisplayName;

public abstract class ItemData extends DataBase implements HasDisplayName{
	/** 登録名 */
	public String ITEM_SHORTNAME = "sample";
	/** 表示名 */
	public String ITEM_DISPLAYNAME = "sample";
	/** アイコン名 */
	public String ITEM_ICONNAME = "sample";

	@Override
	public String getDisplayName() {
		return ITEM_DISPLAYNAME;
	}
}
