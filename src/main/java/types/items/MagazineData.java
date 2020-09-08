package types.items;

import types.base.DataBase;
import types.base.IHideData;
import types.base.Info;
import types.base.NamedData;
import types.effect.Explosion;
import types.items.MagazineData.MagDataEnum;

public class MagazineData extends NamedData<MagDataEnum> implements ItemData<MagDataEnum> {

	public MagazineData() {
		super(MagDataEnum.class);
	}

	public enum MagDataEnum implements IHideData {
		/** 親の登録名 String */
		ParentName("", new Info().IsName(true)),
		/** 表示名 String */
		DisplayName("sample"),
		/** 短縮名 String */
		ShortName("sample", new Info().IsName(true)),
		/** アイコン名 String */
		IconName("sample", new Info().IsResourceName(true)),
		/** モデル名 String */
		ModelName("", new Info().IsResourceName(true)),
		/** 装弾数 : int型 **/
		MagazineSize(30, new Info().Min(0)),
		/** リロード時にマガジンが破棄されるか : boolean型 **/
		MagazineBreak(true),
		/** 弾の情報 */
		Data(GunData.DEFAULT),;

		private Object def;
		private Info info;

		private MagDataEnum(Object defValue) {
			this(defValue, null);
		}

		private MagDataEnum(Object defValue, Info info) {
			def = defValue;
			this.info = info;
		}

		@Override
		public Object getDefault() {
			return def;
		}

		@Override
		public Info getInfo() {
			return info;
		}

		@Override
		public Class<? extends DataBase<?>> getContainer() {
			return Explosion.class;
		}
	}

	@Override
	public MagDataEnum displayName() {
		return MagDataEnum.DisplayName;
	}

	@Override
	public MagDataEnum systemName() {
		return MagDataEnum.ShortName;
	}

	@Override
	public MagDataEnum parentName() {
		return MagDataEnum.ParentName;
	}

	@Override
	public MagDataEnum iconName() {
		return MagDataEnum.IconName;
	}
}
