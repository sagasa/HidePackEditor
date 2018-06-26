package types;

import java.util.LinkedHashMap;
import java.util.Map;

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class Explosion extends DataBase{
	/**データ格納*/
	Map<String, Object> Explosion;

	@Override
	protected Map<String, Object> getMap() {
		return Explosion;
	}

	@Override
	protected EnumDataList[] getDataList() {
		return ExplosionDataList.values();
	}
	@Override
	protected void newMap() {
		Explosion = new LinkedHashMap<String,Object>();
	}

	public enum ExplosionDataList implements EnumDataList {
		/**爆風範囲 :int型**/
		RANGE(0f,null,0,DataType.Int),

		/**爆風の対人ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		DAMAGE_BASE_PLAYER(null,null,0F,DataType.Float),
		/**爆風の対人ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		DAMAGE_COE_PLAYER(null,null,0F,DataType.Float),
		/**爆風のMOBダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		DAMAGE_BASE_LIVING(null,null,0F,DataType.Float),
		/**爆風のMOBダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : float型**/
		DAMAGE_COE_LIVING(null,null,0,DataType.Float),
		/**爆風の対地上兵器ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		DAMAGE_BASE_TANK(null,null,0,DataType.Int),
		/**爆風の対地上兵器ダメージ係数:爆風ダメージ=底値-距離(m)*係数 : int型**/
		DAMAGE_COE_TANK(null,null,0,DataType.Int),
		/**爆風の対航空機ダメージ底値 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		DAMAGE_BASE_AIR(null,null,0,DataType.Int),
		/**爆風の対航空機ダメージ係数 : 爆風ダメージ=底値-距離(m)*係数 : int型**/
		DAMAGE_COE_AIR(null,null,0,DataType.Int),

		/**爆風の対人ノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		KNOCKBACK_BASE_PLAYER(null,null,0F,DataType.Float),
		/**爆風の対人ノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		KNOCKBACK_COE_PLAYER(null,null,0F,DataType.Float),
		/**爆風のMOBノックバック底値 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		KNOCKBACK_BASE_LIVING(null,null,0F,DataType.Float),
		/**爆風のMOBノックバック係数 : ノックバック距離(m)=底値-距離(m)*係数 : float型**/
		KNOCKBACK_COE_LIVING(null,null,0F,DataType.Float),
		/**爆風の対地上兵器ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		KNOCKBACK_BASE_TANK(null,null,0F,DataType.Float),
		/**爆風の対地上兵器ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		KNOCKBACK_COE_TANK(null,null,0F,DataType.Float),
		/**爆風の対航空機ノックバック底値 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		KNOCKBACK_BASE_AIR(null,null,0F,DataType.Float),
		/**爆風の対航空機ノックバック係数 : ノックバック距離(m)=(底値-距離(m)*係数)/重量 : float型**/
		KNOCKBACK_COE_AIR(null,null,0F,DataType.Float),

		/**使用する音 : Sound型**/
		SOUND(null,null,new Sound("minecraft:random.explode",50f),DataType.Sound),
		;

		private ExplosionDataList(Float min, Float max, Object defaultValue, DataType type) {
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

