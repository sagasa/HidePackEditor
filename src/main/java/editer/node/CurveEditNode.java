package editer.node;

import org.apache.commons.lang.ArrayUtils;

import helper.ArrayEditor;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import types.base.DataBase;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;
import types.value.Curve;
import types.value.Curve.CurveKey;

/** Curve編集 */
public class CurveEditNode extends Pane {

	private ListView<CurveKey> listview;
	private String SearchKey = null;

	private SimpleObjectProperty<ValueEntry<Curve>> editerProperty = new SimpleObjectProperty<>();

	private CurveKey[] getArray() {
		if (editerProperty == null)
			return null;
		ValueEntry<Curve> curve = editerProperty.getValue();
		return curve == null ? null : curve.getValue().Keys;
	}

	private void setArray(CurveKey[] value) {
		Curve curve = editerProperty.getValue().getValue().clone();
		curve.Keys = value;
		editerProperty.getValue().ValueProp.set(curve);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setEdit(DataBase data, DataPath path) {
		if (data == null) {
			editerProperty.unbind();
			editerProperty.setValue(null);
		} else
			editerProperty.bind((ObservableObjectValue) data.getEntryProp(path));
	}

	/**
	 * @param fromList 母集団
	 */
	public CurveEditNode() {
		Canvas canvas = new Canvas(200, 200);
		GraphicsContext g = canvas.getGraphicsContext2D();

		editerProperty.addListener((v, ov, nv) -> {
			if (nv != null) {

				g.setStroke(Color.RED);
				CurveKey[] keys = nv.getValue().Keys;
				float minX = keys[0].Key;
				float maxX = keys[keys.length - 1].Key;
				float minY = Float.MAX_VALUE, maxY = -Float.MAX_VALUE;
				for (CurveKey key : keys) {
					minY = Math.min(minY, key.Value);
					maxY = Math.max(maxY, key.Value);
				}
				double[] resX = new double[keys.length];
				double[] resY = new double[keys.length];
				for (int i = 0; i < keys.length; i++) {
					CurveKey key = keys[i];
					resX[i] = (key.Key - minX) / maxX - minX;
				}
				g.strokePolyline(new double[] { 50, 100, 350 }, new double[] { 150, 200, 150 }, 3);
			}

		});

		listview = new ListView<>();

		this.setPrefHeight(200);
		this.setPrefWidth(200);

		Label label = new Label("TestName");
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
		this.getChildren().addAll(label, listview, text, canvas);
		writeList();
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
