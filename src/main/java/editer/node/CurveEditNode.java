package editer.node;

import org.apache.commons.lang.ArrayUtils;

import editer.node.EditPanels.EditType;
import helper.ArrayEditor;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import types.base.DataBase;
import types.base.DataPath;
import types.value.Curve;
import types.value.Curve.CurveKey;

/** Curve編集 */
public class CurveEditNode extends Pane {

	private ListView<CurveKey> listview;
	private String SearchKey = null;

	private SimpleObjectProperty editerProperty;

	@SuppressWarnings("unchecked")
	private CurveKey[] getArray() {
		return ((Curve) editerProperty.getValue()).Keys;
	}

	@SuppressWarnings("unchecked")
	private void setArray(CurveKey[] value) {
		((Property<CurveKey[]>) editerProperty).setValue(value);
		;
	}

	/**
	 * @param fromList 母集団
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <F> CurveEditNode(ObservableObjectValue<? extends DataBase> editValue, EditType edit, DataPath path) {
		editerProperty = new SimpleObjectProperty<>();

		listview = new ListView<>();

		this.setPrefHeight(200);

		Label label = new Label(Name);
		label.setAlignment(Pos.CENTER);
		TextField text = new TextField();
		text.textProperty().addListener((value, oldvalue, newvalue) -> setSearch(newvalue));
		label.translateXProperty().set(20);
		label.setLayoutY(2);
		label.setPrefHeight(20);
		// label.prefWidthProperty().bind(this.widthProperty().subtract(editBottonWidth.multiply(2)));
		listview.setLayoutX(5);
		listview.setLayoutY(24);
		listview.prefWidthProperty().bind(this.widthProperty().subtract(10));
		listview.prefHeightProperty().bind(this.heightProperty().subtract(56));
		listview.setCellFactory(arg0 -> new EditListCell());
		text.prefWidthProperty().bind(this.widthProperty().subtract(10));
		text.setPrefHeight(24);
		text.setLayoutX(5);
		text.translateYProperty().bind(heightProperty().subtract(29));
		this.getChildren().addAll(label, listview, text);
		writeList();
	}

	public CurveEditNode() {

	}

	/** フィルターをセット */
	public void setSearch(String key) {
		SearchKey = key;
		writeList();
	}

	/** リストを読み取って値をセット */
	private void writeList() {
		listview.getItems().clear();
		if (getArray() == null)
			return;
		listview.getItems().addAll(getArray());
	}

	/** 上下ボタンと削除ボタン付きのリストシェル */
	private class EditListCell extends ListCell<CurveKey> {

		private ImageView up = new ImageView("/icon/up.png");
		private ImageView down = new ImageView("/icon/down.png");
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
				if (ArrayUtils.contains(getArray(), getItem())) {
					setArray(ArrayEditor.removeFromArray(getArray(), getItem()));
				} else {
					setArray(ArrayEditor.addToArray(getArray(), getItem()));
				}
				writeList();
			});
		}

		private void rep(int index0, int index1) {
			setArray(ArrayEditor.makeSwapArray(getArray(), index0, index1));
			writeList();
		}

		@Override
		protected void updateItem(CurveKey data, boolean empty) {
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

				text.setText(data.toString());

				// 選択済みなら
				if (ArrayUtils.contains(getArray(), data)) {
					setlabel.setStyle("-fx-background-image : url('/icon/remove.png');");
					// 1番上以外なら
					up.setVisible(0 < getIndex());
					// 1番下以外なら
					down.setVisible(getArray().length - 1 > getIndex());
				} else {
					up.setVisible(false);
					down.setVisible(false);
					setlabel.setStyle("-fx-background-image : url('/icon/add.png');");
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
