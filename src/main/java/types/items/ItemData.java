package types.items;

import types.base.Info;
import types.base.NamedData;

public class ItemData extends NamedData {

	/** 表示名 String */
	public static final DataEntry<String> DisplayName = of("sample");
	/** 短縮名 String */
	public static final DataEntry<String> ShortName = of("sample", new Info().IsName(true));
	/** アイコン名 String */
	public static final DataEntry<String> IconName = of("sample", new Info().IsResourceName(true));
	/** モデル名 String */
	public static final DataEntry<String> ModelName = of("", new Info().IsResourceName(true));

	@Override
	public DataEntry<String> displayName() {
		return DisplayName;
	}

	@Override
	public DataEntry<String> systemName() {
		return ShortName;
	}

}
