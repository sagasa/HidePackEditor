package editer.node;

import java.util.EnumMap;

import editer.node.EditNode.EditNodeType;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.layout.AnchorPane;
import types.base.DataBase;
import types.items.GunData;
import types.items.MagazineData;

/**編集パネルのルート*/
public class EditPanels extends AnchorPane {

	/**編集パネルの対象*/
	public enum EditType {
	Gun(GunData.class), Magazine(MagazineData.class);

		/**判別用の型*/
		public Class<? extends DataBase> Clazz;

		private EditType(Class<? extends DataBase> clazz) {
			Clazz = clazz;
		}

		/**型からエディタを選択*/
		public static EditType getType(DataBase data) {
			for (EditType type : values()) {
				if (type.Clazz.equals(data.getClass()))
					return type;
			}
			return null;
		}
	}

	/**編集対象	*/
	private ObjectProperty<DataBase> editValue = new SimpleObjectProperty<>();

	private EnumMap<EditType, BooleanProperty> editers = new EnumMap<>(EditType.class);

	public EditPanels() {
		editValue.addListener(new EditNode(EditType.Gun,"RECOIL_DEFAULT.MAX_YAW_SPREAD",EditNodeType.Number));
	}

	/**エディタの内容設定*/
	public void setEditValue(DataBase data) {
		editValue.set(data);
	}
}
