package types.base;

import editer.HasDisplayName;

public abstract class ItemData extends DataBase implements HasDisplayName{
	/** 表示名 */
	public String ITEM_DISPLAYNAME = "sample";
	/**ショートネームを使用するか 使用しない場合表示名の編集をショートネームにも代入する*/
	transient public boolean USE_SHORTNAME = false;
	/** 短縮名 */
	public String ITEM_SHORTNAME = "sample";
	/** アイコン名 */
	public String ITEM_ICONNAME = "sample";

	@Override
	public String getDisplayName() {
		return ITEM_DISPLAYNAME;
	}
}
