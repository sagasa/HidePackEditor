package types.items;

import editer.DataEntityInterface;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.Info;
import types.PackInfo;
import types.base.DataBase;

public abstract class ItemData extends DataBase implements DataEntityInterface {
	/** パックデータ エディタでのみ使用 */
	transient public ObjectProperty<PackInfo> RootPack = new SimpleObjectProperty<>();

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
	/**モデル名*/
	@Info(isResourceName = true)
	public String ITEM_MODELNAME = "";
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
	@SuppressWarnings({ })
	@Override
	public void init() {
		super.init();
		getProperty("USE_SHORTNAME").addListener((v, ov, nv) -> {
			if (!(boolean) nv) {
				getProperty("ITEM_SHORTNAME")
						.bindBidirectional(getProperty("ITEM_DISPLAYNAME"));
			} else {
				getProperty("ITEM_SHORTNAME")
						.unbindBidirectional(getProperty("ITEM_DISPLAYNAME"));
			}
		});
		if (!ITEM_DISPLAYNAME.equals(ITEM_SHORTNAME)) {
			getProperty("USE_SHORTNAME").setValue(true);
		}
	}

	/** 参照データか確認 */
	public boolean isReference() {
		return RootPack.get().isReference;
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return RootPack;
	}

	@Override
	public String getDisplayName() {
		return ITEM_DISPLAYNAME;
	}
}
