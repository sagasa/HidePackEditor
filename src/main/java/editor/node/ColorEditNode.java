package editor.node;

import editor.node.EditPanels.EditType;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.ColorPicker;
import types.base.DataPath;
import types.base.NamedData;

public class ColorEditNode extends EditNode {

	public ColorEditNode(ObjectProperty<NamedData> editValue, EditType edit, DataPath path) {
		super(editValue, edit, path);
		ColorPicker cp = new ColorPicker();
		editorProperty=cp.valueProperty();
		this.getChildren().add(cp);
	}

}
