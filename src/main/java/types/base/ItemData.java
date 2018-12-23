package types.base;

import editer.DataEntityInterface;
import helper.EditHelper;

public abstract class ItemData extends DataBase implements DataEntityInterface{
	/** 表示名 */
	public String ITEM_DISPLAYNAME = "sample";
	/**ショートネームを使用するか 使用しない場合表示名の編集をショートネームにも代入する*/
	transient public boolean USE_SHORTNAME = false;
	/** 短縮名 */
	public String ITEM_SHORTNAME = "sample";
	/** アイコン名 */
	public String ITEM_ICONNAME = "sample";

	/**表示名と短縮名が同じならUSE_SHORTNAMEをtrueに*/
	@Override
	public void init() {
		super.init();
		if(!ITEM_DISPLAYNAME.equals(ITEM_SHORTNAME)) {
			EditHelper.getProperty(this, "USE_SHORTNAME",boolean.class).setValue(true);
		}
	}

	@Override
	public long getPackUID() {
		return PackUID;
	}
	@Override
	public String getDisplayName() {
		return ITEM_DISPLAYNAME;
	}
}
