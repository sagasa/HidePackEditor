package editer.node;

import editer.node.EditPanels.EditType;
import helper.DataPath;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.ColorPicker;
import types.base.IEditData;

public class ColorEditNode extends EditNode {

	public ColorEditNode(ObjectProperty<IEditData> editValue, EditType edit, DataPath path, EditNodeType type) {
		super(editValue, edit, path, type);
		ColorPicker cp = new ColorPicker();
		editerProperty=cp.valueProperty();
		this.getChildren().add(cp);
	}

}
