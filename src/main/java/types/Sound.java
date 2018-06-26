package types;

import java.util.LinkedHashMap;
import java.util.Map;

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class Sound extends DataBase{
	/**データ格納*/
	Map<String, Object> Sound;

	public Sound(String name,float range){
		setData(SoundDataList.NAME, name);
		setData(SoundDataList.RANGE, range);
	}

	@Override
	protected Map<String, Object> getMap() {
		return Sound;
	}

	@Override
	protected EnumDataList[] getDataList() {
		return SoundDataList.values();
	}
	@Override
	protected void newMap() {
		Sound = new LinkedHashMap<String,Object>();
	}

	public enum SoundDataList implements EnumDataList {
		/** アイテムの名前 : ItemInfo型 */
		NAME(null, null, "sample", DataType.String),
		RANGE(null, 0f, 50f, DataType.Float),
		VOL(null, 0f, 1f, DataType.Float),
		PITCH(null, 0f, 1f, DataType.Float),
		USE_DECAY(null, null, true, DataType.Boolean),
		USE_DELAY(null, null, true, DataType.Boolean),
		;

		private SoundDataList(Float min, Float max, Object defaultValue, DataType type) {
			Max = max;
			Min = min;
			Default = defaultValue;
			Type = type;
		}

		Float Max;
		Float Min;
		Object Default;
		DataType Type;

		@Override
		public Float getMin() {
			return Min;
		}

		@Override
		public Float getMax() {
			return Max;
		}

		@Override
		public String getName() {
			return this.toString();
		}

		@Override
		public DataType getType() {
			return Type;
		}

		@Override
		public Object getDefaultValue() {
			return Default;
		}

		@Override
		public int getCate() {
			return -1;
		}
	}
}
