package types.effect;

import types.base.DataBase;
import types.base.Info;
import types.base.Operator;

public class Sound extends DataBase {

	public Sound(String name, float range) {
		put(Name, Operator.SET, name);
		put(Range, Operator.SET, range);
	}

	/** 使用可否 String */
	public static final DataEntry<String> Name = of("sample", new Info().IsResourceName(true));
	/** 聞こえる半径 Float */
	public static final DataEntry<Float> Range = of(50f, new Info().Min(0));
	/** 音量 Float */
	public static final DataEntry<Float> Volume = of(1f, new Info().Min(0).Scale("0.1"));
	/** ピッチ Float */
	public static final DataEntry<Float> Pitch = of(1f, new Info().Min(0).Scale("0.1"));
	/** 減衰の使用 Boolean */
	public static final DataEntry<Boolean> UseDecay = of(true);
	/** 遅延の使用 Boolean */
	public static final DataEntry<Boolean> UseDelay = of(false);

}
