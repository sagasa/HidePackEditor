package editor.controller;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import editor.Editor;
import editor.HidePack;
import editor.IDataEntity;
import editor.node.EditPanels;
import helper.ArrayEditor;
import io.PackCash;
import io.PackIO;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.WeakListChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
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
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import localize.LocalizeHandler;
import localize.LocalizeHandler.Lang;
import types.PackInfo;
import types.base.DataBase;
import types.base.NamedData;
import types.items.GunData;
import types.items.MagazineData;
import types.model.HideModel;
import types.value.Operator;

public class RootController implements Initializable {
	private static final Logger log = LogManager.getLogger();
	public static RootController INSTANCE;
	public static Stage STAGE;
	@FXML
	private EditPanels editor;
	public Pane curveeditor;
	@FXML
	private TextField packSearch;
	@FXML
	private ListView<PackInfo> packList;
	@FXML
	private TextField itemSearch;
	@FXML
	private TabPane itemTab;
	@FXML
	private ChoiceBox<PackInfo> importTarget;
	@FXML
	private ListView<GunData> gunList;
	@FXML
	private ListView<MagazineData> magazineList;
	@FXML
	private ListView<IDataEntity> soundList;
	@FXML
	private ListView<IDataEntity> iconList;
	@FXML
	private ListView<IDataEntity> modelList;
	@FXML
	private ListView<HideModel> modelInfoList;

	/** writeのリスナー */
	private ListChangeListener<IDataEntity> writeListener = change -> {
		write();
		while (change.next()) {
			change.getRemoved().forEach(remove -> cancelEdit(remove));
		}
	};

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		INSTANCE = this;
		packList.setCellFactory(ColordListCell.getCellFactory(HidePack.OpenPacks, data -> false));
		gunList.setCellFactory(ColordListCell.getCellFactory(HidePack.GunList));
		magazineList.setCellFactory(ColordListCell.getCellFactory(HidePack.MagazineList));
		soundList.setCellFactory(ColordListCell.getCellFactory(HidePack.SoundList));
		iconList.setCellFactory(ColordListCell.getCellFactory(HidePack.IconList));
		modelList.setCellFactory(ColordListCell.getCellFactory(HidePack.ModelList));
		modelInfoList.setCellFactory(ColordListCell.getCellFactory(HidePack.ModelInfoList));
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
		HidePack.ModelInfoList.addListener(new WeakListChangeListener<>(writeListener));
		HidePack.ModelList.addListener(new WeakListChangeListener<>(writeListener));

		bindEditor(packList);
		bindEditor(gunList);
		bindEditor(magazineList);
		bindEditor(iconList);
		bindEditor(soundList);
		bindEditor(modelList);
		bindEditor(modelInfoList);

//	//	HideModel hm = ModelIO.read();
//		hm.rootBone.animation.get(AnimationType.Reload).add(new AnimationKey());
//		hm.rootBone.animation.get(AnimationType.Reload).add(new AnimationKey());
//		HidePack.ModelInfoList.add(hm);

		itemTab.getSelectionModel().selectedItemProperty().addListener((v, n, o) -> itemTabChange());

		importTarget.setItems(HidePack.OpenPacks);
		importTarget.getSelectionModel().select(HidePack.DefaultPack.get());
		importTarget.setConverter(new StringConverter<PackInfo>() {
			@Override
			public String toString(PackInfo object) {
				return object.getDisplayName();
			}

			@Override
			public PackInfo fromString(String string) {
				return null;
			}
		});
		HidePack.DefaultPack.addListener((v, ov, nv) -> {
			System.out.println(ov + " " + nv + " " + importTarget.getItems());
			if (importTarget.getSelectionModel().getSelectedItem() == ov)
				importTarget.getSelectionModel().select(nv);
		});
		// TODO
		/*
		 * Pane modelV = new Pane(); Stage modelView = new Stage(StageStyle.UTILITY);
		 * ModelView mv = new ModelView(modelV); modelView = new
		 * Stage(StageStyle.UTILITY); modelView.setScene(new Scene(modelV));
		 * modelView.initOwner(STAGE); modelView.initModality(Modality.NONE); //
		 * clipEditor.setResizable(false); modelView.setTitle("ModelView");
		 * modelView.show();//
		 */

		curveeditor.getChildren().add(editor.curveEditPane);

		write();
	}

	/** 選択されたら実行 */
	private void bindEditor(ListView<?> list) {
		// フォーカスが切れたら選択解除
		list.focusedProperty().addListener((v, ov, nv) -> {
			if (!nv)
				list.getSelectionModel().clearSelection();
		});
		list.getSelectionModel().selectedItemProperty().addListener((v, ov, nv) -> {
			if (nv != null)
				editData(nv);
		});
	}

	/** パックから要素が削除されたとき編集中なら編集を中止する */
	private void cancelEdit(IDataEntity obj) {
		if (obj instanceof DataBase)
			editor.removeEditValue(obj);
	}

	/** 親子関係の解決 */
	public static void resolveList() {
		INSTANCE.resolve();
	}

	/** リストをリフレッシュ */
	public void resolve() {
		NamedData.resolvParent(gunList.getItems());
		NamedData.resolvParent(magazineList.getItems());
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
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.OpenPacks, packSearch.getText())));
		// Gun
		gunList.setItems(FXCollections.observableArrayList(ArrayEditor.Search(HidePack.GunList, itemSearch.getText())));
		// Magazine
		magazineList.setItems(
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.MagazineList, itemSearch.getText())));
		// Icon
		iconList.setItems(
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.IconList, itemSearch.getText())));
		// Sound
		soundList.setItems(
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.SoundList, itemSearch.getText())));
		modelInfoList.setItems(
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.ModelInfoList, itemSearch.getText())));
		modelList.setItems(
				FXCollections.observableArrayList(ArrayEditor.Search(HidePack.ModelList, itemSearch.getText())));

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

	// ========メニュー操作========
	private boolean openFromFile = false;

	private void updateEditDir(String path) {
		if (path == null)
			STAGE.setTitle(Editor.Title);
		else
			STAGE.setTitle(Editor.Title + "  *" + path);
	}

	private void openPack(File file) {
		updateEditDir(Editor.config.editDir);
		PackCash pack = PackIO.readPack(file);
		HidePack.addPack(pack);
		write();
		openFromFile = true;
	}

	public boolean newPack() {
		// 確認
		if (!HidePack.isEmpty()) {
			Alert alert = new Alert(AlertType.CONFIRMATION, LocalizeHandler.getLocalizedName(Lang.ClearPack),
					ButtonType.YES, ButtonType.NO);
			alert.setHeaderText(null);
			ButtonType button = alert.showAndWait().orElse(ButtonType.CANCEL);
			if (button != ButtonType.YES) {
				return false;
			}
		}

		openFromFile = false;
		HidePack.clear();
		bulletNamePointer = 0;
		gunNamePointer = 0;
		packNamePointer = 0;
		modelNamePointer = 0;
		write();
		updateEditDir(null);
		return true;
	}

	public void openNewPackDir() {
		if (!newPack())
			return;
		DirectoryChooser chooser = new DirectoryChooser();
		File dir = new File(Editor.config.editDir);
		if (!dir.exists() || !dir.isDirectory())
			dir = new File("./export/");
		chooser.setInitialDirectory(dir);
		File file = chooser.showDialog(STAGE);
		if (file != null) {
			Editor.config.editDir = file.toString();
			for (File f : file.listFiles())
				openPack(f);
		}
	}

	public void openNewPack() {
		if (!newPack())
			return;
		openPack();
	}

	public void openPack() {
		FileChooser fxtest = new FileChooser();
		File dir = new File(Editor.config.editDir);
		if (!dir.exists() || !dir.isDirectory())
			dir = new File("./export/");
		fxtest.setInitialDirectory(dir);

		fxtest.getExtensionFilters().add(new ExtensionFilter("zip", "*.zip"));
		List<File> file = fxtest.showOpenMultipleDialog(STAGE);
		if (file != null) {
			Editor.config.editDir = file.get(0).getParent();
			for (File f : file)
				openPack(f);
			// インポートダイアログを開く
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/import.fxml"));
//			try {
//				loader.load();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			Parent root = loader.getRoot();
//			ImportController controller = loader.getController();
//			controller.setPack(pack);
//			Scene scene = new Scene(root);
//			Stage confirmDialog = new Stage(StageStyle.UTILITY);
//			confirmDialog.setScene(scene);
//			confirmDialog.initOwner(STAGE);
//			confirmDialog.initModality(Modality.WINDOW_MODAL);
//			confirmDialog.setResizable(false);
//			confirmDialog.setTitle("Select an Option");
//			confirmDialog.show();
		}
	}

	public void save() {
		if (!openFromFile)
			saveas();
		File file = new File(Editor.config.editDir);
		PackIO.export(file);
		updateEditDir(file.toString());
	}

	public void saveas() {
		DirectoryChooser fxtest = new DirectoryChooser();
		File dir = new File(Editor.config.editDir);
		if (!dir.exists() || !dir.isDirectory())
			dir = new File("./export/");
		fxtest.setInitialDirectory(dir);
		File file = fxtest.showDialog(STAGE);
		if (file != null) {
			Editor.config.editDir = file.toString();
			openFromFile = true;
			save();
		}
	}

	// FXCollections.observableArrayList(HidePack.OpenPacks.stream().filter(data ->
	// Search(data.getDisplayName(),
	// packSearch.getText())).sorted().collect(Collectors.toList()))
	// ========編集========

	public void editClear() {
		editor.setEditValue(null);
	}

	public void editData(Object item) {
		if (item != null) {
			editor.setEditValue(item);
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
	private static int modelNamePointer = 0;

	public void addPack() {
		log.debug("addPack");
		PackInfo pack = new PackInfo();
		if (HidePack.getPack("New Pack No." + packNamePointer) == null) {
			packNamePointer++;
		}
		while (HidePack.getPack("New Pack No." + packNamePointer) != null) {
			packNamePointer++;
		}
		pack.put(PackInfo.PackName, Operator.SET, "New Pack No." + packNamePointer);
		HidePack.OpenPacks.add(pack);
		write();
	}

	public void addGun() {
		log.debug("addGun");
		if (HidePack.getGunData("New Gun No." + gunNamePointer) == null) {
			gunNamePointer++;
		}
		while (HidePack.getGunData("New Gun No." + gunNamePointer) != null) {
			gunNamePointer++;
		}
		GunData newGun = new GunData();
		newGun.put(newGun.systemName(), Operator.SET, "gun_" + gunNamePointer);
		newGun.put(newGun.displayName(), Operator.SET, "New Gun No." + gunNamePointer);
		newGun.getRootPack().set(getImportTarget());
		// ProjectileDataは初期設定
		newGun.put(GunData.Data);
		HidePack.GunList.add(newGun);
		write();
	}

	public void addMagazine() {
		log.debug("addBullet");
		if (HidePack.getGunData("New Magazine No." + bulletNamePointer) == null) {
			bulletNamePointer++;
		}
		while (HidePack.getGunData("New Magazine No." + bulletNamePointer) != null) {
			bulletNamePointer++;
		}
		MagazineData magazine = new MagazineData();
		magazine.put(magazine.systemName(), Operator.SET, "magazine_" + bulletNamePointer);
		magazine.put(magazine.displayName(), Operator.SET, "New Magazine No." + bulletNamePointer);
		magazine.getRootPack().set(getImportTarget());
		// ProjectileDataは初期設定
		magazine.put(MagazineData.Data);
		HidePack.MagazineList.add(magazine);
		write();
	}

	public void addModelInfo() {
		log.debug("addBullet");
		if (HidePack.getModelInfo("Model No." + modelNamePointer) == null) {
			modelNamePointer++;
		}
		while (HidePack.getModelInfo("Model No." + modelNamePointer) != null) {
			modelNamePointer++;
		}
		HideModel modelinfo = new HideModel();
		modelinfo.put(modelinfo.systemName(), Operator.SET, "Model No." + modelNamePointer);
		modelinfo.getRootPack().set(getImportTarget());
		HidePack.ModelInfoList.add(modelinfo);
		write();
	}

	private PackInfo getImportTarget() {
		return importTarget.getSelectionModel().getSelectedItem();
	}

	public void importIcon() {
		PackIO.importIcon(getImportTarget());
	}

	public void importSound() {
		PackIO.importSound(getImportTarget());
	}

	public void importModel() {
		PackIO.importModel(getImportTarget());
	}

	// ===========リストセル============
	/** カラーアイコン付きのリストシェル */
	public static class ColordListCell<T extends IDataEntity> extends ListCell<T> {

		public static <T extends IDataEntity> Callback<ListView<T>, ListCell<T>> getCellFactory(
				Collection<? extends IDataEntity> fromList) {
			return getCellFactory(fromList, null);
		}

		/**
		 * ファクトリー
		 *
		 * @param fromList  削除元になるリスト Null許容
		 * @param candelete 削除ボタンの表示判定 Null許容
		 */
		public static <T extends IDataEntity> Callback<ListView<T>, ListCell<T>> getCellFactory(
				Collection<? extends IDataEntity> fromList, Function<IDataEntity, Boolean> candelete) {
			return arg0 -> new ColordListCell<>(fromList, candelete);
		}

		/** 削除ボタンを出すかどうかの判定 */
		private Function<IDataEntity, Boolean> canDelete = null;
		private Label delete = new Label();
		private Rectangle color = new Rectangle(20, 20);
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public ColordListCell(Collection<? extends IDataEntity> fromList, Function<IDataEntity, Boolean> candelete) {

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
		protected void updateItem(T data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				setMaxSize(40, 24);
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
				if (data.getRootPack() != null) {
					color.fillProperty().bind((data.getRootPack().get().PackColor));
				}
				setStyle("-fx-border-color: orange; -fx-border-width: 0 4 0 4; -fx-padding: 3 3 1 3");
				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
				setStyle(null);
			}
		}
	}
}
