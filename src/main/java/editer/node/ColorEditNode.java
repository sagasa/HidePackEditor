package editer.node;

import editer.node.EditPanels.EditType;
import helper.DataPath;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ColorPicker;
import types.base.DataBase;

public class ColorEditNode extends EditNode {

	public ColorEditNode(ObservableValue<DataBase> observable, EditType edit, DataPath path, EditNodeType type) {
		super(observable, edit, path, type);
		ColorPicker cp = new ColorPicker();
		editerProperty=cp.valueProperty();
		this.getChildren().add(cp);
	}

}
