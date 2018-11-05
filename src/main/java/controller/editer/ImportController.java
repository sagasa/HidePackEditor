package controller.editer;

import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;

public class ImportController {
	@FXML
	public ListView<String> up;
	@FXML
	public ListView<String> down;
	@FXML
	public SplitPane base;
	public void crick() {
		System.out.println(up.getBoundsInLocal().getWidth()+" "+up.getBoundsInLocal().getHeight()+" : "+down.getBoundsInLocal().getWidth()+" "+down.getBoundsInLocal().getHeight()+" : "+Arrays.toString(base.getDividerPositions())+" "+base.getDividers());
	}
}
