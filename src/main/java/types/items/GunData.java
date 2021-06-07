package types.items;

import org.apache.commons.lang.ArrayUtils;

import types.base.Info;
import types.gun.GunFireMode;
import types.gun.ProjectileData;

public class GunData extends ItemData {

	public static final int GunInfo = 0;
	public static final int ItemInfo = 1;
	public static final int ScopeInfo = 2;

	public static final DataEntry<ProjectileData> Data = of(ProjectileData.DEFAULT);

	/** 所持しているときのHP増加量 Float */
	public static final DataEntry<Float> ItemMaxHealth = of(0f, new Info().Cate(ItemInfo));
	/** 所持しているときの移動速度増加量 Float */
	public static final DataEntry<Float> ItemMoveSpeed = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));
	/** 所持しているときのノックバック耐性増加量 Float */
	public static final DataEntry<Float> ItemKnockbackResistance = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));
	/** 所持しているときの近接ダメージ増加量 Float */
	public static final DataEntry<Float> ItemAttackDamage = of(0f, new Info().Cate(ItemInfo).Scale("0.1"));

	/** 持ってから撃てるまで ; tickかかる : int型 **/
	public static final DataEntry<Integer> PrepareTick = of(0, new Info().Cate(GunInfo).Min(0));
	/** ADSへの切り替え時間 ; tickかかる : int型 **/
	public static final DataEntry<Integer> ADSTick = of(0, new Info().Cate(GunInfo).Min(0));

	/** fovズーム倍率 float型 */
	public static final DataEntry<Float> FOVZoom = of(1f, new Info().Cate(ScopeInfo).Min(0.5f).Max(8));
	/** スコープの使用可否 Boolean */
	public static final DataEntry<Boolean> UseScope = of(false, new Info().Cate(ScopeInfo));
	/** モデルスコープを使用するか Boolean */
	public static final DataEntry<Boolean> ModelScope = of(false, new Info().Cate(ScopeInfo));
	/** スコープ名 : String型 */
	public static final DataEntry<String> ScopeName = of("", new Info().IsResourceName(true));
	/** スコープの表示サイズ 画面上の占有率 float */
	public static final DataEntry<Float> ScopeSize = of(0.7f, new Info().Cate(ScopeInfo).Min(0.1f).Max(1f));
	/** スコープの中心位置 左上原点 Float */
	public static final DataEntry<Float> ScopeCenterX = of(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1));
	/** スコープの中心位置 左上原点 Float */
	public static final DataEntry<Float> ScopeCenterY = of(0.5f, new Info().Cate(ScopeInfo).Min(0).Max(1));
	/** スコープのズーム倍率 float型 */
	public static final DataEntry<Float> ScopeZoom = of(2f, new Info().Cate(ScopeInfo).Min(0.6f).Max(8));

	/** 装填数 : int型 **/
	public static final DataEntry<Integer> LoadSize = of(1, new Info().Cate(GunInfo).Min(1));

	/** セカンダリにできるか Boolean */
	public static final DataEntry<Boolean> UseSecondary = of(false, new Info().Cate(GunInfo));
	/** 両手持ちできるか Boolean */
	public static final DataEntry<Boolean> UseDualwield = of(false, new Info().Cate(GunInfo));

	/** 射撃モード : GunFireMode[] **/
	public static final DataEntry<GunFireMode[]> FireMode = of(new GunFireMode[] { GunFireMode.SEMIAUTO }, new Info());

	/** 使用するマガジンの登録名 : String[] */
	public static final DataEntry<String[]> UseMagazine = of(ArrayUtils.EMPTY_STRING_ARRAY, new Info().Cate(0));

}
