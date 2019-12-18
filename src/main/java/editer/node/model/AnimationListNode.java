package editer.node.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import editer.node.EditNode;
import editer.node.EditPanels;
import editer.node.EditPanels.EditType;
import helper.DataPath;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.util.Callback;
import types.base.IEditData;
import types.model.AnimationKey;
import types.model.AnimationType;

/** Boneのアニメーション編集ノード */
public class AnimationListNode extends EditNode {

	private Map<AnimationType,ListView<AnimationKey>> editMap = new EnumMap<>(AnimationType.class);

	public AnimationListNode(Property<IEditData> editValue, DataPath path) {
		super(editValue, EditType.Bone, path, EditNodeType.Other);

		TabPane tabPane = new TabPane();
		tabPane.setLayoutY(1);
		tabPane.prefHeightProperty().bind(heightProperty().subtract(2));
		tabPane.setLayoutX(1);
		tabPane.prefWidthProperty().bind(widthProperty().subtract(2));
		tabPane.setStyle("-fx-background-color: red;");
		for(AnimationType type:AnimationType.values()) {
			ListView<AnimationKey> list = new ListView<>();
			editMap.put(type, list);
			list.setPrefWidth(180);
			list.setCellFactory(getCellFactory());
			Tab tab = new Tab(type.toString(),list);
			tab.setClosable(false);
			tabPane.getTabs().add(tab);
		}
		getChildren().add(tabPane);
		editerProperty = new SimpleMapProperty<>();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void bind(IEditData data) {
		super.bind(data);
		for (AnimationType type : AnimationType.values()) {
			editMap.get(type).setItems(FXCollections.observableArrayList(((ObservableMap<AnimationType,List<AnimationKey>>)editerProperty).get(type)));
		}
	}

	public Callback<ListView<AnimationKey>,ListCell<AnimationKey>> getCellFactory(){
		return (list)->new KeyEditCell();
	}

	public class KeyEditCell extends ListCell<AnimationKey> {
		private Pane root = new Pane();
		private boolean isBind = false;
		private ObjectProperty<IEditData> prop = new SimpleObjectProperty<>();

		public KeyEditCell() {
			prop.bind(itemProperty());
			Region translate =  EditPanels.makePos3Editer(prop, EditType.AnimationKey, new DataPath("translate"));

			root.getChildren().addAll(translate);

		}

		@Override
			public void updateSelected(boolean selected) {
				super.updateSelected(selected);
				if(selected) {
					setHeight(40);
				}else {
					setHeight(20);
				}
			}

		@Override
		protected void updateItem(AnimationKey data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.setLayoutX(-15);
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));
				isBind = true;
			}
			if (!empty) {

				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}
}
