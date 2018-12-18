package controller.editer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.DataEntityInterface;
import editer.HidePack;
import helper.ArrayEditer;
import io.PackCash;
import io.PackIO;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.WeakListChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import types.PackInfo;
import types.guns.BulletData;
import types.guns.GunData;

public class RootController implements Initializable {
	private static final Logger log = LogManager.getLogger();
	public static RootController INSTANCE;
	public static Stage STAGE;

	public Pane editer;

	public TextField packSearch;
	public ListView<DataEntityInterface> packList;

	public TextField itemSearch;
	public ListView<DataEntityInterface> gunList;
	public ListView<DataEntityInterface> magazineList;
	public ListView<DataEntityInterface> soundList;
	public ListView<DataEntityInterface> iconList;
	public ListView<DataEntityInterface> modelList;

	/** writeのリスナー */
	private ListChangeListener<DataEntityInterface> writeListener = change -> write();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		INSTANCE = this;
		packList.setCellFactory(ColordListCell.getCellFactory());
		gunList.setCellFactory(ColordListCell.getCellFactory());
		magazineList.setCellFactory(ColordListCell.getCellFactory());
		soundList.setCellFactory(ColordListCell.getCellFactory());
		iconList.setCellFactory(ColordListCell.getCellFactory());
		modelList.setCellFactory(ColordListCell.getCellFactory());
		// Serch用フック
		itemSearch.textProperty().addListener(change -> write());
		packSearch.textProperty().addListener(change -> write());
		// リスト通知用フック
		HidePack.GunList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.BulletList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.IconList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.ScopeList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.SoundList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.OpenPacks.addListener(new WeakListChangeListener<>(writeListener));
		write();
	}

	/** CurrentPackの内容をリストに反映 */
	public static void writeList() {
		INSTANCE.write();
	}

	/** Packの内容をリストに反映 */
	public void write() {
		// Pack
		packList.setItems(FXCollections.observableArrayList(ArrayEditer.Search(HidePack.OpenPacks, itemSearch.getText())));
		// Gun
		gunList.setItems(FXCollections.observableArrayList(ArrayEditer.Search(HidePack.GunList, itemSearch.getText())));
		// Magazine
		magazineList.setItems(FXCollections.observableArrayList(ArrayEditer.Search(HidePack.BulletList, itemSearch.getText())));

		packList.refresh();
		gunList.refresh();
		magazineList.refresh();
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

	}

	// ========メニュー操作========
	public void openPack() {
		FileChooser fxtest = new FileChooser();
		fxtest.setInitialDirectory(new File("./"));
		fxtest.getExtensionFilters().add(new ExtensionFilter("zip", "*.zip"));
		File file = fxtest.showOpenDialog(STAGE);
		if (file != null) {
			PackCash pack = PackIO.readPack(file);
			// パックが1つなら
			if (HidePack.isNewPack) {
				HidePack.isNewPack = false;
				pack.setPack(false);
				HidePack.addPack(pack);
				write();
			} else {
				// インポートダイアログを開く
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

	// FXCollections.observableArrayList(HidePack.OpenPacks.stream().filter(data ->
	// Search(data.getDisplayName(),
	// packSearch.getText())).sorted().collect(Collectors.toList()))
	// ========編集========
	public void editClear() {
		editer.getChildren().clear();
	}

	public void editPack() {
		DataEntityInterface item = packList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getPack(item.getDisplayName()).toString());
		}
	}

	public void editGun() {
		editClear();
		DataEntityInterface item = gunList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getGunData(item.getDisplayName()).toString());
			EditerComponent.writeGunEditer(editer, HidePack.getGunData(item.getDisplayName()));
		}
	}

	public void editMagazine() {
		DataEntityInterface item = magazineList.getSelectionModel().getSelectedItem();
		if (item != null) {
			log.debug(HidePack.getBulletData(item.getDisplayName()).toString());
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

	public void addPack() {
		log.debug("addPack");
		PackInfo pack = new PackInfo();
		while (HidePack.getPack("New Pack No." + packNamePointer) != null) {
			packNamePointer++;
		}
		packNamePointer++;
		pack.PACK_NAME = "New Pack No." + packNamePointer;
		pack.PackUID = new Random().nextLong();
		HidePack.OpenPacks.add(pack);
		write();
	}

	public void addGun() {
		log.debug("addGun");
		GunData newGun = new GunData();
		if (HidePack.getGunData("New Gun No." + gunNamePointer) == null) {
			gunNamePointer++;
		}
		while (HidePack.getGunData("New Gun No." + gunNamePointer) != null) {
			gunNamePointer++;
		}
		newGun.ITEM_SHORTNAME = "gun_" + gunNamePointer;
		newGun.ITEM_DISPLAYNAME = "New Gun No." + gunNamePointer;
		newGun.PackUID = HidePack.DefaultPack.PackUID;
		HidePack.GunList.add(newGun);
		write();
	}

	public void addMagazine() {
		log.debug("addBullet");
		BulletData bullet = new BulletData();
		while (HidePack.getGunData("New Magazine No." + bulletNamePointer) != null) {
			bulletNamePointer++;
		}
		bulletNamePointer++;
		bullet.ITEM_SHORTNAME = "magazine_" + bulletNamePointer;
		bullet.ITEM_DISPLAYNAME = "New Magazine No." + bulletNamePointer;
		bullet.PackUID = HidePack.DefaultPack.PackUID;
		HidePack.BulletList.add(bullet);
		write();
	}

	public void importIcon() {
		PackIO.importIcon();
	}

	public void importSound() {
		PackIO.importSound();
		;
	}

	// ===========リストセル============
	/** カラーアイコン付きのリストシェル */
	public static class ColordListCell extends ListCell<DataEntityInterface> {
		/** ファクトリー */
		public static Callback<ListView<DataEntityInterface>, ListCell<DataEntityInterface>> getCellFactory() {
			return new Callback<ListView<DataEntityInterface>, ListCell<DataEntityInterface>>() {
				@Override
				public ListCell<DataEntityInterface> call(ListView<DataEntityInterface> arg0) {
					return new ColordListCell();
				}
			};
		}

		private Rectangle color = new Rectangle(20, 20);
		private static final Color DisableColor = Color.rgb(0, 0, 0, 0);

		@Override
		protected void updateItem(DataEntityInterface data, boolean empty) {
			super.updateItem(data, empty);
			if (!empty) {
				setText(data.getDisplayName());
				color.setFill(HidePack.getPack(data.getPackUID()).PackColor);
				setGraphic(color);
			} else {
				setText("");
				color.setFill(DisableColor);
			}
		}
	}
}
