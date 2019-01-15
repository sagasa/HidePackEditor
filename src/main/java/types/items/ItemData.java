package types.items;

import editer.DataEntityInterface;
import helper.EditHelper;
import types.Info;
import types.base.DataBase;

public abstract class ItemData extends DataBase implements DataEntityInterface{
	/** 表示名 */
	public String ITEM_DISPLAYNAME = "sample";
	/**ショートネームを使用するか 使用しない場合表示名の編集をショートネームにも代入する*/
	transient public boolean USE_SHORTNAME = false;
	/** 短縮名 */
	@Info(isName = true)
	public String ITEM_SHORTNAME = "sample";
	/** アイコン名 */
	@Info(isResourceName = true)
	public String ITEM_ICONNAME = "sample";
	/**スタックサイズ*/
	public int ITEM_STACK_SIZE = 1;
	/** 所持しているときのHP増加量 */
	@Info(Cate = 3)
	public float ITEM_MAX_HEALTH = 0f;
	/** 所持しているときの移動速度増加量 */
	@Info(Cate = 3, Scale = "0.1")
	public float ITEM_MOVE_SPEED = 0f;
	/** 所持しているときのノックバック耐性増加量 */
	@Info(Cate = 3, Scale = "0.1")
	public float ITEM_KNOCKBACK_RESISTANCE = 0f;
	/** 所持しているときの近接ダメージ増加量 */
	@Info(Cate = 3)
	public float ITEM_ATTACK_DAMAGE = 0f;

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
