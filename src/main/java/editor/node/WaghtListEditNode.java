package editor.node;

import java.util.function.Function;

import org.apache.commons.lang.ArrayUtils;

import editor.node.EditPanels.EditType;
import helper.ArrayEditor;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.value.ObservableObjectValue;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.FloatStringConverter;
import old.WeightEntry;
import types.base.DataBase;
import types.base.DataPath;

public class WaghtListEditNode<T> extends ListEditNode<WeightEntry<T>> {

	public WaghtListEditNode(ObservableObjectValue<? extends DataBase> editValue, EditType edit, DataPath path,
			ObservableList<T> fromList) {
		this(editValue, edit, path, fromList, from -> new WeightEntry<>(from));

	}

	public <F> WaghtListEditNode(ObservableObjectValue<? extends DataBase> editValue, EditType edit, DataPath path,
			ObservableList<F> fromList, Function<F, WeightEntry<T>> func) {
		super(editValue, edit, path, fromList, func);

		listview.setCellFactory(arg0 -> new WeightEditListCell());
	}

	/** 上下ボタンと削除ボタン付きのリストシェル */
	public class WeightEditListCell extends ListCell<WeightEntry<T>> {

		private Label setlabel = new Label();

		private NumberEditField field = new NumberEditField(false, false);
		private FloatProperty weight = new SimpleFloatProperty();
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public WeightEditListCell() {
			field.bind((Property) weight, new FloatStringConverter());

			field.setTranslateX(100);

			root.getChildren().addAll(setlabel, text, field);

			weight.addListener((javafx.beans.value.ChangeListener<? super Number>) (v, ov, nv) -> {
				if (getItem() != null)
					getItem().Weight = nv.floatValue();
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
		protected void updateItem(WeightEntry<T> data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));

				setlabel.prefWidthProperty().bind(root.heightProperty());
				setlabel.prefHeightProperty().bind(root.heightProperty());
				setlabel.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(1.1)));

				isBind = true;
			}
			if (!empty) {

				text.setText(data.getDisplayName());

				// 選択済みなら
				if (ArrayUtils.contains(getArray(), data)) {
					field.setVisible(true);
					weight.set(getItem().Weight);
					setlabel.setStyle("-fx-background-image : url('/icon/remove.png');");
				} else {
					field.setVisible(false);
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
