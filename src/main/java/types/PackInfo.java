package types;

import editer.HidePack;
import editer.IDataEntity;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import types.base.DataBase;
import types.base.Info;

/** 親子関係は利用しない */
public class PackInfo extends DataBase implements IDataEntity {

	transient private ObjectProperty<PackInfo> thisProperty = new ReadOnlyObjectWrapper<>(this);
	/** 参照か */
	transient public boolean isReference = false;
	/** 表示用カラー */
	transient public ObjectProperty<Color> PackColor = new SimpleObjectProperty<>(
			Color.rgb(HidePack.random.nextInt(256), HidePack.random.nextInt(256), HidePack.random.nextInt(256)));

	/** パックの登録名 ファイル名ではない */
	public static final DataEntry<String> PackName = of("sample", new Info().Cate(0));
	/** パックのバージョン */
	public static final DataEntry<String> PackVar = of("", new Info().Cate(0));
	/** 登録時の名称 */
	public static final DataEntry<String> PackDomain = of("default", new Info().Cate(0));

	/** 参照データか確認 */
	@Override
	public boolean isReference() {
		return isReference;
	}

	@Override
	public ObjectProperty<PackInfo> getRootPack() {
		return thisProperty;
	}

	@Override
	public boolean equals(Object arg) {
		if (arg instanceof PackInfo) {
			PackInfo other = (PackInfo) arg;
			return get(PackName, null).equals(other.get(PackName, null))
					&& get(PackVar, null).equals(other.get(PackVar, null))
					&& get(PackDomain, null).equals(other.get(PackDomain, null));
		}

		return super.equals(arg);
	}

	@Override
	public String getDisplayName() {
		return get(PackName, null) + " " + get(PackVar, null);
	}
}
