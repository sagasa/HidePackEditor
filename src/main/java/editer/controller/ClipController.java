package editer.controller;

import java.net.URL;
import java.util.ResourceBundle;

import editer.node.EditPanels;
import javafx.fxml.Initializable;
import types.items.GunData;
import types.wrapper.ClipData;

public class ClipController implements Initializable {
	public EditPanels editor;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ClipData data = new ClipData(GunData.class);
		//data.addProperty(path)
		editor.setEditValue(data);
		editor.boundsInLocalProperty().addListener((v,ov,nv)->{
			System.out.println(nv);
		});
		System.out.println(editor.getBoundsInLocal());
	}

}
