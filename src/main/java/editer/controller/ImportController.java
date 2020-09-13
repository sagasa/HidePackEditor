package editer.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import editer.HidePack;
import editer.IDataEntity;
import io.PackCash;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import types.PackInfo;

public class ImportController implements Initializable {

	public ListView<ImportEntry> gunList;
	public ListView<ImportEntry> magazineList;

	public ListView<ImportEntry> iconList;
	public ListView<ImportEntry> scopeList;
	public ListView<ImportEntry> soundList;

	public CheckBox toDefault;
	public CheckBox isReference;

	private PackInfo Pack;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		gunList.setCellFactory(arg0 -> new ImportListCell());
	}

	public void setPack(PackCash pack) {
		Pack = pack.Pack;
		pack.GunList.forEach(data -> {
			gunList.getItems().add(new ImportEntry(data, (packinfo) -> {
				HidePack.GunList.add(data);
				System.out.println(data);
			}));
		});

	}

	private List<ImportEntry> getSelected() {
		System.out.println(gunList.getSelectionModel().getSelectedItems());

		System.out.println(magazineList.getSelectionModel().getSelectedItems());
		return gunList.getSelectionModel().getSelectedItems();
	}

	private List<ImportEntry> getAll() {
		List<ImportEntry> allEntris = new ArrayList<>();
		allEntris.addAll(gunList.getSelectionModel().getSelectedItems());
		return allEntris;
	}

	private void refresh() {
		gunList.refresh();
		magazineList.refresh();
		iconList.refresh();
		scopeList.refresh();
		soundList.refresh();
	}

	public void add() {
		getSelected().forEach(entry -> entry.isImport = true);
		refresh();
	}

	public void remove() {
		getSelected().forEach(entry -> entry.isImport = false);
		refresh();
	}

	public void addAll() {
		getAll().forEach(entry -> entry.isImport = true);
		refresh();
	}

	public void removeAll() {
		getAll().forEach(entry -> entry.isImport = false);
		refresh();
	}

	public void Import() {
		if (!toDefault.isCache()) {
			Pack.isReference = isReference.isCache();
			Pack = HidePack.addPack(Pack);
		}
		PackInfo packinfo = toDefault.isSelected() ? HidePack.DefaultPack : Pack;
		getAll().forEach(entry -> entry.doImport(packinfo));

		gunList.getScene().getWindow().hide();
		RootController.writeList();
	}

	private static class ImportEntry {
		Consumer<PackInfo> doImport;
		boolean isImport;
		IDataEntity Data;

		public ImportEntry(IDataEntity name, Consumer<PackInfo> action) {
			doImport = action;
			Data = name;
		}

		/** インポートを実行 useがtrueなら実行 */
		public boolean doImport(PackInfo packinfo) {
			if (isImport) {
				doImport.accept(packinfo);
			}
			return isImport;
		}
	}

	/** インポートエントリ用リスト表示 */
	public static class ImportListCell extends ListCell<ImportEntry> {
		private static final Color DisableColor = Color.rgb(0, 0, 0, 0);
		private static final Color ImportColor = Color.web("#ffc91f");
		private Rectangle importrect = new Rectangle(20, 20);
		private Text text;
		private HBox root;
		private boolean bound = false;

		public ImportListCell() {
			root = new HBox(2);
			text = new Text();
			HBox.setHgrow(text, Priority.NEVER);
			root.getChildren().addAll(text, importrect);
		}

		@Override
		protected void updateItem(ImportEntry in, boolean empty) {
			super.updateItem(in, empty);
			if (!bound) {
				text.wrappingWidthProperty().bind(getListView().widthProperty().subtract(40));
				bound = true;
			}
			if (empty) {
				setGraphic(null);
				text.setText(null);
			} else {
				text.setText(in.Data.getDisplayName());
				if (in.isImport)
					importrect.setFill(ImportColor);
				else
					importrect.setFill(DisableColor);
				setGraphic(root);
			}

		}
	}
}
