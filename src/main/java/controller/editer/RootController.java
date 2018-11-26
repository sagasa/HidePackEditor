package controller.editer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import editer.DataEntityInterface;
import editer.HidePack;
import io.PackCash;
import io.PackIO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import types.guns.BulletData;
import types.guns.GunData;

public class RootController implements Initializable {
	private static final Logger log = LoggerFactory.getLogger(RootController.class);
	public static RootController INSTANCE;
	public static Stage STAGE;

	public Pane editer;

	public TextField packSearch;
	public ListView<ColordList> packList;

	public TextField itemSearch;
	public ListView<ColordList> gunList;
	public ListView<ColordList> magazineList;
	public ListView<ColordList> soundList;
	public ListView<ColordList> iconList;
	public ListView<ColordList> modelList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		INSTANCE = this;
		packList.setCellFactory(ColordList.getCellFactory());
		gunList.setCellFactory(ColordList.getCellFactory());
		magazineList.setCellFactory(ColordList.getCellFactory());
		soundList.setCellFactory(ColordList.getCellFactory());
		iconList.setCellFactory(ColordList.getCellFactory());
		modelList.setCellFactory(ColordList.getCellFactory());
		// Serch用フック
		itemSearch.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				write();
			}
		});
		write();
	}

	/** CurrentPackの内容をリストに反映 */
	public static void writeList() {
		INSTANCE.write();
	}

	/** Packの内容をリストに反映 */
	public void write() {
		ObservableList<ColordList> list;
		// Pack
		list = FXCollections.observableArrayList();
		for (HidePack pack : HidePack.OpenPacks) {

			list.add(new ColordList(pack.Pack, pack.PackColor));
		}
		packList.setItems(list.sorted());
		// Gun
		list = FXCollections.observableArrayList();
		for (GunData gun : HidePack.GunList) {
			if (Search(gun.ITEM_DISPLAYNAME, itemSearch.getText()))
				list.add(new ColordList(gun, HidePack.getPack(gun.PackUID).PackColor));
		}
		gunList.setItems(list.sorted());
		// Magazine
		list = FXCollections.observableArrayList();
		for (BulletData magazine : HidePack.BulletList) {
			list.add(new ColordList(magazine, HidePack.getPack(magazine.PackUID).PackColor));
		}
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

	// ========メニュー操作========
	public void openPack() {
		FileChooser fxtest = new FileChooser();
		fxtest.setInitialDirectory(new File("./"));
		fxtest.getExtensionFilters().add(new ExtensionFilter("zip", "*.zip"));
		File file = fxtest.showOpenDialog(STAGE);
		if (file != null) {
			PackCash pack = PackIO.readPack(file);
			//パックが1つなら
			if(HidePack.isNewPack) {
				HidePack.isNewPack = false;
				pack.setPack(false);
				HidePack.addPack(pack);
				write();
			}else {
				//インポートダイアログを開く
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/import.fxml"));
	            try {
					loader.load();
				} catch (IOException e) {
					e.printStackTrace();
				}
	            Parent root = loader.getRoot();
	            ImportController controller = loader.getController();
	            controller.setPack(pack);
	            Scene scene = new Scene(root);
	            Stage confirmDialog = new Stage(StageStyle.UTILITY);
	            confirmDialog.setScene(scene);
	            confirmDialog.initOwner(STAGE);
	            confirmDialog.initModality(Modality.WINDOW_MODAL);
	            confirmDialog.setResizable(false);
	            confirmDialog.setTitle("Select an Option");
	            confirmDialog.show();

			}
		}
	}

	public void savePack() {
		PackIO.export();
	}

	// ========編集========
	public void editPack() {
		ColordList item = packList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getPack(item.Name.getDisplayName()).toString());
		}
	}

	public void editGun() {
		ColordList item = gunList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getGunData(item.Name.getDisplayName()).toString());
			EditerComponent.writeGunEditer(editer, HidePack.getGunData(item.Name.getDisplayName()));
		}
	}

	public void editMagazine() {
		ColordList item = magazineList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getBulletData(item.Name.getDisplayName()).toString());
		}
	}

	@FXML
	public void importGun(DragEvent event) {
		System.out.println(packList.getFocusModel().getFocusedItem());
	}

	// ===========追加系============
	private static int packNamePointer = 0;
	private static int gunNamePointer = 0;
	private static int bulletNamePointer = 0;

	@FXML
	public void addPack() {
		log.debug("addPack");
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
		log.debug("addBullet");
		BulletData bullet = new BulletData();
		while (HidePack.getGunData("New Magazine No." + bulletNamePointer) != null) {
			gunNamePointer++;
		}
		bullet.ITEM_SHORTNAME = "magazine_" + gunNamePointer;
		bullet.ITEM_DISPLAYNAME = "New Magazine No." + gunNamePointer;
		bullet.PackUID = HidePack.DefaultPack.Pack.PackUID;
		HidePack.BulletList.add(bullet);
		write();
	}

	// ===========検索============
	private static final String space = " ";// TODO

	/**
	 * 検索一致判定処理 スペースで区切ってそれぞれ判定、すべて含んでいたらtrue
	 */
	public static boolean Search(String value, String key) {
		value = value.trim();
		String[] keys = key.split(space);
		for (String str : keys) {
			if (!value.contains(str)) {
				return false;
			}
		}
		return true;
	}

	// ===========リストセル============
	/** カラーアイコン付きのリストシェル */
	public static class ColordList implements Comparable<ColordList> {
		public static Callback<ListView<ColordList>, ListCell<ColordList>> getCellFactory() {
			return new Callback<ListView<ColordList>, ListCell<ColordList>>() {
				@Override
				public ListCell<ColordList> call(ListView<ColordList> arg0) {
					return new ColordListCell();
				}
			};
		}

		public ColordList(DataEntityInterface name, Color color) {
			Name = name;
			Color = color;
		}

		public DataEntityInterface Name;
		public Color Color;

		@Override
		public int compareTo(ColordList value) {
			return Name.getDisplayName().compareTo(value.Name.getDisplayName());
		}
	}

	/** カラーアイコン付きのリストシェル */
	public static class ColordListCell extends ListCell<ColordList> {
		private Rectangle color = new Rectangle(20, 20);
		private static final Color DisableColor = Color.rgb(0, 0, 0, 0);

		@Override
		protected void updateItem(ColordList cl, boolean empty) {
			super.updateItem(cl, empty);
			if (!empty) {
				setText(cl.Name.getDisplayName());
				color.setFill(cl.Color);
				setGraphic(color);
			} else {
				setText("");
				color.setFill(DisableColor);
			}

		}
	}
}
