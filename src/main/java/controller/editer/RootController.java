package controller.editer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import types.guns.GunData;

public class RootController implements Initializable {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private static RootController INSTANCE;
	@FXML
	public Pane editer;
	@FXML
	public ListView<String> gunList;
	@FXML
	public ListView<String> magazineList;
	@FXML
	public ListView<String> soundList;
	@FXML
	public ListView<String> iconList;
	@FXML
	public ListView<String> modelList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		INSTANCE = this;
	}

	/** CurrentPackの内容をリストに反映 */
	public static void writeList() {
		INSTANCE.write();
	}

	/** CurrentPackの内容をリストに反映 */
	private void write() {
		ObservableList<String> list = FXCollections.observableArrayList();
		list.addAll(Main.CurrentPack.GunList.keySet());
		gunList.setItems(list.sorted());
		list = FXCollections.observableArrayList();
		list.addAll(Main.CurrentPack.BulletList.keySet());
		magazineList.setItems(list.sorted());
	}

	@FXML
	public void isGun(DragEvent e) {
		System.out.println("drag");
		// ドラッグボードを取得
		Dragboard board = e.getDragboard();
		for (File file : board.getFiles()) {
			System.out.println(file.getName());
		}
		e.acceptTransferModes(TransferMode.COPY);
		e.consume();
	}

	@FXML
	public void importGun(DragEvent event) {
		System.out.println("import");
	}

	//===========追加系============
	private static int gunNamePointer = 0;
	private static int bulletNamePointer = 0;
	@FXML
	public void addGun() {
		log.debug("addGun");
		GunData newGun = new GunData();
		while (Main.CurrentPack.GunList.containsKey("New Gun No." + gunNamePointer)) {
			gunNamePointer++;
		}
		String displayName = "New Gun No." + gunNamePointer;
		newGun.ITEM_SHORTNAME = "gun_" + gunNamePointer;
		newGun.ITEM_DISPLAYNAME = displayName;
		Main.CurrentPack.GunList.put(displayName, newGun);
		write();
	}

	@FXML
	public void addMagazine() {
		System.out.println("add");
	}
}
