package editer.node;

import editer.node.EditPanels.EditType;
import helper.DataPath;
import javafx.beans.property.Property;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;
import types.base.IEditData;

/** アニメーション */
public class AnimationListNode extends EditNode {

	public AnimationListNode(Property<IEditData> editValue, DataPath path) {
		super(editValue, EditType.Bone, path, EditNodeType.AnimationList);


	}
	public class KeyEditCell extends ListCell<String> {
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public KeyEditCell() {
			root.getChildren().addAll( text);
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
				isBind = true;
			}
			if (!empty) {

				text.setText(data);


				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}
}
