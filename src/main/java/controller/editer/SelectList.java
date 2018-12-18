package controller.editer;

import editer.DataEntityInterface;
import helper.ArrayEditer;
import javafx.beans.property.ListProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

/** 母集団のリストから任意に選択するListView */
public class SelectList extends ListView<String> {

	private ObservableList<? extends DataEntityInterface> motherList;
	private ListProperty<String> setList;
	private String SearchKey = null;
//TODO 要素の最大、最小数の指定を
	/**
	 * @param fromList
	 *            母集団
	 * @param list
	 *            選択先
	 */
	public SelectList(ObservableList<? extends DataEntityInterface> fromList, ListProperty<String> list) {
		motherList = fromList;
		setList = list;
		setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
			@Override
			public ListCell<String> call(ListView<String> arg0) {
				return new EditListCell();
			}
		});
		writeList();
	}

	/**フィルターをセット*/
	public void setSearch(String key) {
		SearchKey = key;
		writeList();
	}

	/** リストを読み取って値をセット */
	private void writeList() {
		getItems().clear();
		getItems().addAll(setList);
		motherList.stream().map(data -> data.getDisplayName()).filter(str->(!setList.contains(str)&&ArrayEditer.Search(str, SearchKey))).forEach(str->getItems().add(str));
	}

	/** 上下ボタンと削除ボタン付きのリストシェル */
	public class EditListCell extends ListCell<String> {

		private ImageView up = new ImageView("./icon/up.png");
		private ImageView down = new ImageView("./icon/down.png");
		private Label setlabel = new Label();

		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public EditListCell() {
			root.getChildren().addAll(up, down, setlabel, text);

			up.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
				rep(getIndex(), getIndex() - 1);
			});
			down.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
				rep(getIndex(), getIndex() + 1);
			});
			setlabel.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
				if (setList.contains(getItem())) {
					setList.remove(getItem());
				} else {
					setList.add(getItem());
				}
				writeList();
			});
		}

		private void rep(int index0, int index1) {
			ObservableList<String> list = getListView().getItems();
			String cash = list.get(index0);
			list.set(index0, list.get(index1));
			list.set(index1, cash);
		}

		@Override
		protected void updateItem(String data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));
				up.fitWidthProperty().bind(root.heightProperty());
				up.fitHeightProperty().bind(root.heightProperty().divide(2.3));
				up.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(2.2)));
				down.fitWidthProperty().bind(root.heightProperty());
				down.fitHeightProperty().bind(root.heightProperty().divide(2.3));
				down.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(2.2)));

				down.translateYProperty().bind(root.heightProperty().subtract(down.fitHeightProperty()));
				setlabel.prefWidthProperty().bind(root.heightProperty());
				setlabel.prefHeightProperty().bind(root.heightProperty());
				setlabel.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(1.1)));

				isBind = true;
			}
			if (!empty) {

				text.setText(data);

				// 選択済みなら
				if (setList.contains(data)) {
					setlabel.setStyle("-fx-background-image : url('./icon/remove.png');");;
					// 1番上以外なら
					up.setVisible(0 < getIndex());
					// 1番下以外なら
					down.setVisible(setList.size() - 1 > getIndex());
				} else {
					up.setVisible(false);
					down.setVisible(false);
					setlabel.setStyle("-fx-background-image : url('./icon/add.png');");
				}
				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}
}
