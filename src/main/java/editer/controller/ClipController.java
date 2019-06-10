package editer.controller;

import javafx.fxml.Initializable;
import types.items.GunData;

import java.net.URL;
import java.util.ResourceBundle;

import editer.node.EditPanels;

public class ClipController implements Initializable {
	public EditPanels editor;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		editor.setEditValue(new GunData());
		editor.boundsInLocalProperty().addListener((v,ov,nv)->{
			System.out.println(nv);
		});
		System.out.println(editor.getBoundsInLocal());
	}

}
