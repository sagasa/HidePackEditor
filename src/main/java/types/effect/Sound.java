package types.effect;

import types.base.DataBase;
import types.base.IHideData;
import types.base.Info;
import types.base.Operator;
import types.effect.Sound.SoundData;

public class Sound extends DataBase<SoundData> {

	public Sound() {
		super(SoundData.class);
	}

	public Sound(String name, float range) {
		this();
		put(SoundData.Name, Operator.SET, name);
		put(SoundData.Range, Operator.SET, range);
	}

	public enum SoundData implements IHideData {
		/** 使用可否 String */
		Name("sample", new Info().IsResourceName(true)),
		/** 聞こえる半径 Float */
		Range(50f, new Info().Min(0)),
		/** 音量 Float */
		Volume(1f, new Info().Min(0).Scale("0.1")),
		/** ピッチ Float */
		Pitch(1f, new Info().Min(0).Scale("0.1")),
		/** 減衰の使用 Boolean */
		UseDecay(true),
		/** 遅延の使用 Boolean */
		UseDelay(false),;

		private Object def;
		private Info info;

		private SoundData(Object defValue) {
			this(defValue, null);
		}

		private SoundData(Object defValue, Info info) {
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
			return Sound.class;
		}
	}
}
