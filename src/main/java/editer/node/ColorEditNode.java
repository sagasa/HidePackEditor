package editer.node;

import editer.node.EditPanels.EditType;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.ColorPicker;
import types.base.DataPath;
import types.base.NamedData;

public class ColorEditNode extends EditNode {

	public ColorEditNode(ObjectProperty<NamedData> editValue, EditType edit, DataPath path) {
		super(editValue, edit, path);
		ColorPicker cp = new ColorPicker();
		editerProperty=cp.valueProperty();
		this.getChildren().add(cp);
	}

}
