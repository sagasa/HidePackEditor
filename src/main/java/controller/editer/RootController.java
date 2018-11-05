package controller.editer;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.HidePack;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;
import types.guns.GunData;

public class RootController implements Initializable {
	private static final Logger log = LoggerFactory.getLogger(RootController.class);
	private static RootController INSTANCE;
	@FXML
	public Pane editer;
	@FXML
	public ListView<ColordList> packList;
	@FXML
	public ListView<ColordList> gunList;
	@FXML
	public ListView<ColordList> magazineList;
	@FXML
	public ListView<ColordList> soundList;
	@FXML
	public ListView<ColordList> iconList;
	@FXML
	public ListView<ColordList> modelList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		INSTANCE = this;
		packList.setCellFactory(ColordList.getCellFactory());
		gunList.setCellFactory(ColordList.getCellFactory());
	}

	/** CurrentPackの内容をリストに反映 */
	public static void writeList() {
		INSTANCE.write();
	}

	/** CurrentPackの内容をリストに反映 */
	private void write() {
		ObservableList<ColordList> list;
		// Pack
		list = FXCollections.observableArrayList();
		for (HidePack pack : HidePack.OpenPacks) {
			list.add(new ColordList(pack.Pack.PACK_NAME, pack.PackColor));
		}
		packList.setItems(list);
		// Gun
		list = FXCollections.observableArrayList();
		for (GunData gun : HidePack.GunList) {
			list.add(new ColordList(gun.ITEM_DISPLAYNAME, HidePack.getPack(gun.PackUID).PackColor));
		}
		gunList.setItems(list.sorted());
		list = FXCollections.observableArrayList();
		// list.addAll(Main.CurrentPack.BulletList.keySet());
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
	public void crick() {
		System.out.println(gunList.getBoundsInLocal());
	}

	@FXML
	public void importGun(DragEvent event) {
		System.out.println("import");
	}

	// ===========追加系============
	private static int packNamePointer = 0;
	private static int gunNamePointer = 0;
	private static int bulletNamePointer = 0;

	@FXML
	public void addMenu() {
		HidePack pack = new HidePack();
		while (HidePack.getPack("New Pack No." + packNamePointer) != null) {
			packNamePointer++;
		}
		pack.Pack.PACK_NAME = "New Pack No." + packNamePointer;
		pack.Pack.PackUID = new Random().nextLong();
		HidePack.OpenPacks.add(pack);
		write();
	}

	@FXML
	public void addGun() {
		log.debug("addGun");
		GunData newGun = new GunData();
		while (HidePack.getGunData("New Gun No." + gunNamePointer) != null) {
			gunNamePointer++;
		}
		newGun.ITEM_SHORTNAME = "gun_" + gunNamePointer;
		newGun.ITEM_DISPLAYNAME = "New Gun No." + gunNamePointer;
		newGun.PackUID = HidePack.DefaultPack.Pack.PackUID;
		HidePack.GunList.add(newGun);
		write();
	}

	@FXML
	public void addMagazine() {
		System.out.println("add");
	}

	/** カラーアイコン付きのリストシェル */
	public static class ColordList {
		public static Callback<ListView<ColordList>, ListCell<ColordList>> getCellFactory() {
			return new Callback<ListView<ColordList>, ListCell<ColordList>>() {
				@Override
				public ListCell<ColordList> call(ListView<ColordList> arg0) {
					return new ColordListCell();
				}
			};
		}

		public ColordList(String str, Color color) {
			String = str;
			Color = color;
		}

		public String String;
		public Color Color;
	}

	/** カラーアイコン付きのリストシェル */
	public static class ColordListCell extends ListCell<ColordList> {
		private Rectangle color = new Rectangle(20, 20);

		@Override
		protected void updateItem(ColordList cl, boolean empty) {
			super.updateItem(cl, empty);
			if (!empty) {
				setText(cl.String);
				color.setFill(cl.Color);
				setGraphic(color);
			}

		}
	}
}
