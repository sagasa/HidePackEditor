package editer.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editer.DataEntityInterface;
import editer.HidePack;
import editer.node.EditerComponent;
import editer.node.ModelView;
import helper.ArrayEditer;
import io.ModelIO;
import io.PackCash;
import io.PackIO;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import types.PackInfo;
import types.items.GunData;
import types.items.MagazineData;

public class RootController implements Initializable {
	private static final Logger log = LogManager.getLogger();
	public static RootController INSTANCE;
	public static Stage STAGE;

	public Pane editer;

	public TextField packSearch;
	public ListView<DataEntityInterface> packList;

	public TextField itemSearch;
	public TabPane itemTab;
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
		packList.setCellFactory(
				ColordListCell.getCellFactory(HidePack.OpenPacks, data -> !HidePack.DefaultPack.equals(data)));
		gunList.setCellFactory(ColordListCell.getCellFactory(HidePack.GunList));
		magazineList.setCellFactory(ColordListCell.getCellFactory(HidePack.MagazineList));
		soundList.setCellFactory(ColordListCell.getCellFactory(HidePack.SoundList));
		iconList.setCellFactory(ColordListCell.getCellFactory(HidePack.IconList));
		// modelList.setCellFactory(ColordListCell.getCellFactory(HidePack.));TODO
		// Serch用フック
		itemSearch.textProperty().addListener(change -> write());
		packSearch.textProperty().addListener(change -> write());
		// リスト通知用フック
		HidePack.GunList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.MagazineList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.IconList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.ScopeList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.SoundList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.OpenPacks.addListener(new WeakListChangeListener<>(writeListener));

		packList.getSelectionModel().getSelectedItems().addListener(makeListListener((item) -> editPack(item)));
		gunList.getSelectionModel().getSelectedItems().addListener(makeListListener((item) -> editGun(item)));
		magazineList.getSelectionModel().getSelectedItems().addListener(makeListListener((item) -> editMagazine(item)));

		itemTab.getSelectionModel().selectedItemProperty().addListener((v, n, o) -> itemTabChange());

		// TODO
		ModelView.showModelView(editer, ModelIO.read());
		write();
	}

	private static ListChangeListener<DataEntityInterface> makeListListener(Consumer<DataEntityInterface> run) {
		return c -> {
			while (c.next())
				if (c.getList().size() > 0)
					run.accept(c.getList().get(0));
		};
	}

	/** リストをリフレッシュ */
	public static void refreshList() {
		INSTANCE.refresh();
	}

	/** リストをリフレッシュ */
	public void refresh() {
		packList.refresh();
		gunList.refresh();
		magazineList.refresh();
		soundList.refresh();
		iconList.refresh();
		modelList.refresh();
	}

	/** CurrentPackの内容をリストに反映 */
	public static void writeList() {
		INSTANCE.write();
	}

	/** Packの内容をリストに反映 */
	public void write() {
		// Pack
		packList.setItems(
				FXCollections.observableArrayList(ArrayEditer.Search(HidePack.OpenPacks, packSearch.getText())));
		// Gun
		gunList.setItems(FXCollections.observableArrayList(ArrayEditer.Search(HidePack.GunList, itemSearch.getText())));
		// Magazine
		magazineList.setItems(
				FXCollections.observableArrayList(ArrayEditer.Search(HidePack.MagazineList, itemSearch.getText())));
		// Icon
		iconList.setItems(
				FXCollections.observableArrayList(ArrayEditer.Search(HidePack.IconList, itemSearch.getText())));
		// Sound
		soundList.setItems(
				FXCollections.observableArrayList(ArrayEditer.Search(HidePack.SoundList, itemSearch.getText())));
	}

	/** タブ切り替え時にアイテムエディタを描画 */
	public void itemTabChange() {
		int id = itemTab.getSelectionModel().getSelectedIndex();
		if (id != 0) {
			gunList.getSelectionModel().clearSelection();
		}
		if (id != 1) {
			magazineList.getSelectionModel().clearSelection();
		}
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

	private FlowPane setUpFlowEditer() {
		FlowPane flow = new FlowPane();
		flow.setVgap(5);
		flow.setHgap(5);
		flow.setOrientation(Orientation.VERTICAL);
		flow.prefWrapLengthProperty().bind(editer.widthProperty());
		flow.maxHeightProperty().bind(editer.heightProperty());
		editer.getChildren().add(flow);
		return flow;
	}

	public void editClear() {
		editer.getChildren().clear();
		nowEditItem = null;
	}

	private DataEntityInterface nowEditItem = null;

	public void editPack(DataEntityInterface item) {
		if (item != null && !item.equals(nowEditItem)) {
			editClear();
			nowEditItem = item;
			log.debug(HidePack.getPack(item.getDisplayName()).toString());
		}
	}

	public void editGun(DataEntityInterface item) {
		if (item != null && !item.equals(nowEditItem)) {
			editClear();
			nowEditItem = item;
			log.debug(HidePack.getGunData(item.getDisplayName()).toString());
			EditerComponent.writeGunEditer(setUpFlowEditer(), HidePack.getGunData(item.getDisplayName()));
		}
	}

	public void editMagazine(DataEntityInterface item) {
		if (item != null && !item.equals(nowEditItem)) {
			editClear();
			nowEditItem = item;
			log.debug(HidePack.getMagazineData(item.getDisplayName()).toString());
			EditerComponent.writeMagazineEditer(setUpFlowEditer(), HidePack.getMagazineData(item.getDisplayName()));
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
		if (HidePack.getPack("New Pack No." + packNamePointer) == null) {
			packNamePointer++;
		}
		while (HidePack.getPack("New Pack No." + packNamePointer) != null) {
			packNamePointer++;
		}
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
		MagazineData magazine = new MagazineData();
		if (HidePack.getGunData("New Magazine No." + bulletNamePointer) == null) {
			bulletNamePointer++;
		}
		while (HidePack.getGunData("New Magazine No." + bulletNamePointer) != null) {
			bulletNamePointer++;
		}
		magazine.ITEM_SHORTNAME = "magazine_" + bulletNamePointer;
		magazine.ITEM_DISPLAYNAME = "New Magazine No." + bulletNamePointer;
		magazine.PackUID = HidePack.DefaultPack.PackUID;
		HidePack.MagazineList.add(magazine);
		write();
	}

	public void importIcon() {
		PackIO.importIcon();
	}

	public void importSound() {
		PackIO.importSound();
	}

	// ===========リストセル============
	/** カラーアイコン付きのリストシェル */
	public static class ColordListCell extends ListCell<DataEntityInterface> {

		public static Callback<ListView<DataEntityInterface>, ListCell<DataEntityInterface>> getCellFactory(
				ObservableList<? extends DataEntityInterface> fromList) {
			return getCellFactory(fromList, null);
		}

		/**
		 * ファクトリー
		 *
		 * @param fromList
		 *            削除元になるリスト Null許容
		 * @param candelete
		 *            削除ボタンの表示判定 Null許容
		 */
		public static Callback<ListView<DataEntityInterface>, ListCell<DataEntityInterface>> getCellFactory(
				ObservableList<? extends DataEntityInterface> fromList,
				Function<DataEntityInterface, Boolean> candelete) {
			return new Callback<ListView<DataEntityInterface>, ListCell<DataEntityInterface>>() {
				@Override
				public ListCell<DataEntityInterface> call(ListView<DataEntityInterface> arg0) {
					return new ColordListCell(fromList, candelete);
				}
			};
		}

		/** 削除ボタンを*出すかどうかの判定 */
		private Function<DataEntityInterface, Boolean> canDelete = null;
		private Label delete = new Label();
		private Rectangle color = new Rectangle(20, 20);
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public ColordListCell(ObservableList<? extends DataEntityInterface> fromList,
				Function<DataEntityInterface, Boolean> candelete) {

			root.getChildren().addAll(color, delete, text);
			// 削除元がない場合は無視
			delete.setDisable(fromList == null);
			if (fromList != null) {
				canDelete = candelete;
				delete.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
					fromList.remove(getItem());
				});
			}
			delete.setStyle("-fx-background-image : url('/icon/delete.png');");
		}

		@Override
		protected void updateItem(DataEntityInterface data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));
				delete.prefWidthProperty().bind(root.heightProperty());
				delete.prefHeightProperty().bind(root.heightProperty());
				delete.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(1.1)));
				color.widthProperty().bind(root.heightProperty());
				color.heightProperty().bind(root.heightProperty());
				text.translateXProperty().bind(root.heightProperty().add(5));
				isBind = true;
			}
			if (!empty) {
				delete.setVisible(canDelete == null || canDelete.apply(data));
				text.setText(data.getDisplayName());
				color.setFill(HidePack.getPack(data.getPackUID()).PackColor);
				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}
}
