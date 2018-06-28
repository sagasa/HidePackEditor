package types.guns;

import java.util.LinkedHashMap;
import java.util.Map;

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class GunRecoil extends DataBase{
	/**データ格納*/
	Map<String, Object> Recoil;

	public GunRecoil setUse(boolean use){
		setData(RecoilDataList.USE, use);
		return this;
	}

	@Override
	protected void newMap() {
		Recoil = new LinkedHashMap<String,Object>();
	}

	@Override
	protected Map<String, Object> getMap() {
		return Recoil;
	}

	@Override
	protected EnumDataList[] getDataList() {
		return RecoilDataList.values();
	}

	public enum RecoilDataList implements EnumDataList {

		MAX_YAW_BASE(null, null, 0f, DataType.Float),
		MAX_YAW_SPREAD(null, null, 0f, DataType.Float),
		MAX_YAW_RETURN(1f, 0f, 0f, DataType.Float),
		MIN_YAW_BASE(null, null, 0f, DataType.Float),
		MIN_YAW_SPREAD(null, null, 0f, DataType.Float),
		MIN_YAW_RETURN(1f, 0f, 0f, DataType.Float),

		YAW_RECOIL_TICK(null, 0f, 0, DataType.Int),
		YAW_RETURN_TICK(null, 0f, 0, DataType.Int),


		MAX_PITCH_BASE(null, null, 0f, DataType.Float),
		MAX_PITCH_SPREAD(null, null, 0f, DataType.Float),
		MAX_PITCH_RETURN(1f, 0f, 0f, DataType.Float),
		MIN_PITCH_BASE(null, null, 0f, DataType.Float),
		MIN_PITCH_SPREAD(null, null, 0f, DataType.Float),
		MIN_PITCH_RETURN(1f, 0f, 0f, DataType.Float),

		PITCH_RECOIL_TICK(null, 0f, 0, DataType.Int),
		PITCH_RETURN_TICK(null, 0f, 0, DataType.Int),

		POWER_TICK(null, 0f, 0, DataType.Int),
		POWER_SHOOT(null, 0f, 0, DataType.Int),

		USE(null, null, true, DataType.Boolean),
		;

		private RecoilDataList(Float max, Float min, Object defaultValue, DataType type) {
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
