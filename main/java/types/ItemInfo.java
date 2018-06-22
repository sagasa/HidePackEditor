package types;

import java.util.LinkedHashMap;
import java.util.Map;

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public class ItemInfo extends DataBase{

	public ItemInfo(String shortname,String displayname,String iconname) {
		setData(ItemDataList.NAME_SHORT, shortname);
		setData(ItemDataList.NAME_DISPLAY, displayname);
		setData(ItemDataList.NAME_ICON, iconname);
	}
	/**データ格納*/
	Map<String, Object> ItemInfo;

	@Override
	protected Map<String, Object> getMap() {
		return ItemInfo;
	}

	@Override
	protected EnumDataList[] getDataList() {
		return ItemDataList.values();
	}
	@Override
	protected void newMap() {
		ItemInfo = new LinkedHashMap<String,Object>();
	}

	public enum ItemDataList implements EnumDataList {
		/** アイテムの名前 : ItemInfo型 */
		NAME_SHORT(null, null, "sample", DataType.String),
		NAME_DISPLAY(null, null, "sample", DataType.String),
		NAME_ICON(null, null, "sample", DataType.String),
		MAX_HEALTH(null, null, 0f, DataType.Float),
		MOVE_SPEED(null, null, 0f, DataType.Float),
		KNOCKBACK_RESISTANCE(null, null, 0f, DataType.Float),
		ATTACK_DAMAGE(null, null, 0f, DataType.Float),
		;

		private ItemDataList(Float min, Float max, Object defaultValue, DataType type) {
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
