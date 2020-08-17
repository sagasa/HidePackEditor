package editer.controller;

import java.net.URL;
import java.util.ResourceBundle;

import editer.node.EditPanels;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import types.IEditData;
import types.base.DataPath;
import types.items.GunData;
import types.wrapper.ClipData;

public class ClipController implements Initializable {
	@FXML
	private EditPanels editor;
	@FXML
	private ListView<IEditData> list;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ClipData data = new ClipData(GunData.class);
		data.addProperty(new DataPath("SCOPE_SIZE"));
		editor.setEditValue(data);

		list.getItems().add(data);
	}



}
