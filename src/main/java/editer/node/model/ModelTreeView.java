package editer.node.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.function.BiConsumer;

import javax.imageio.ImageIO;

import editer.HidePack;
import editer.node.EditNode;
import editer.node.EditNode.EditNodeType;
import editer.node.EditPanels.EditType;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import resources.HideImage;
import resources.Model;
import types.IEditData;
import types.base.DataBase;
import types.base.DataPath;
import types.model.AnimationKey;
import types.model.AnimationType;
import types.model.Bone;
import types.model.HideModel;
import types.model.IRenderProperty;
import types.model.ModelSelector;

public class ModelTreeView extends EditNode {
	public TreeView<Bone> bonetree;

	//表示
	private ModelView modelView;
	// プロパティMap
	private static Map<AnimationType, Float> renderPropertyMap = new HashMap<>();
	private static Map<String, String> partsPropertyMap = new HashMap<>();


	public ModelTreeView(Property<IEditData> editValue,ModelView view) {
		super(editValue, EditType.Model, new DataPath("rootBone"), EditNodeType.Other);
		modelView = view;
		// プロパティ編集
		editerProperty = new SimpleObjectProperty<>();
		// ボタン
		Button reload = new Button("reload");
		reload.setPrefSize(200, 25);
		reload.setOnAction(e -> write());
		// ボーン
		bonetree = new TreeView<>();
		bonetree.setLayoutY(25);
		bonetree.setPrefWidth(200);
		bonetree.setPrefHeight(220);
		bonetree.setCellFactory(new BoneCellFactory());
		// スクリプト

		selectItem = bonetree.getSelectionModel().selectedItemProperty();

		// モデルセレクタ編集
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setEditable(true);
		comboBox.setLayoutY(275);
		ListView<Entry<String, String>> model_itemMap = new ListView<>();

		this.getChildren().addAll(reload, bonetree);

		selectItem.addListener((v, ov, nv) -> {
			if (nv != null) {
				currentItem.setValue( ((BoneModelItem)nv).getEditValue());
				currentItemIsBone.set(((BoneModelItem)nv).isBone());
			}
		});
		this.setPrefHeight(246);
	}

	/** ボーンツリー上で現在選択されているアイテム */
	protected ReadOnlyObjectProperty<TreeItem<Bone>> selectItem;
	public Property<IEditData> currentItem = new SimpleObjectProperty<>();
	public BooleanProperty currentItemIsBone = new SimpleBooleanProperty();

	private void writeMSEditer() {
		EditNode defaultModel = new EditNode(currentItem, EditType.ModelSelector, new DataPath("defaultModel"),
				EditNodeType.StringFromList);
		defaultModel.translateYProperty().set(350);
		this.getChildren().addAll(defaultModel);
	}

	@Override
	protected void bind(IEditData data) {
		super.bind(data);
		BoneModelItem root = new BoneModelItem(getRootBone());
		bonetree.setRoot(root);
		write();
		bonetree.getSelectionModel().select(root);
	}

	/**チェックしてないから注意*/
	private Bone getRootBone() {
		return ((Bone)editerProperty.getValue());
	}

	/** 現在の状態を反映 */
	public void write() {
		modelView.clearView();
		getRootBone().init(new ArrayList<Transform>(), new IRenderProperty() {

			@Override
			public Map<AnimationType, Float> getRenderPropery() {
				return renderPropertyMap;
			}

			@Override
			public Map<String, List<String>> getPartPropery() {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}
		});
		// リスト上からのリンク更新
		((BoneModelItem) bonetree.getRoot()).imageWrite();
	}

	/** ボーンとモデル両方に対応したツリーアイテム */
	private class BoneModelItem extends TreeItem<Bone> {

		ModelSelector model = null;
		BooleanProperty select = new SimpleBooleanProperty(false);

		/** ビューにメッシュを追加する */
		public void imageWrite() {
			if (isBone()) {
				modelView.addBoneView(getValue(), getValue().moves);
			} else {
				modelView.addPartView(model, getParent().getValue().moves, select);
			}
			getChildren().forEach(item -> ((BoneModelItem) item).imageWrite());
		}

		public void setSelected(boolean select) {
			if (select == this.select.get())
				return;
			this.select.set(select);
			if (isBone()) {
				getChildren().forEach(item -> ((BoneModelItem) item).setSelected(select));
			}
		}

		public boolean isBone() {
			return model == null;
		}

		/**BoneかMSかを判断して返す*/
		public DataBase getEditValue() {
			return isBone() ? getValue() : model;
		}

		public BoneModelItem(ModelSelector model) {
			this.model = model;
		}

		public BoneModelItem(Bone bone) {
			super(bone);
			bone.models.forEach(name -> getChildren().add(new BoneModelItem(name)));
			bone.children.forEach(child -> getChildren().add(new BoneModelItem(child)));
			ListChangeListener<? super TreeItem<Bone>> listener = e -> {
				while (e.next()) {
					if (e.wasAdded()) {
						e.getAddedSubList().forEach(i -> {
							BoneModelItem item = (BoneModelItem) i;
							if (item.model == null) {
								this.getValue().children.add(item.getValue());
							} else {
								this.getValue().models.add(item.model);
							}
						});
					} else if (e.wasRemoved()) {
						e.getRemoved().forEach(i -> {
							BoneModelItem item = (BoneModelItem) i;
							if (item.model == null) {
								this.getValue().children.remove(item.getValue());
							} else {
								this.getValue().models.remove(item.model);
							}
						});
					}
				}
			};
			getChildren().addListener(listener);
		}
	}

	private static final DataFormat JAVA_FORMAT = new DataFormat("application/x-java-serialized-object");
	private static final String DROP_HINT_STYLE = "-fx-border-color: #eea82f; -fx-border-width: 2 0 2 0; -fx-padding: 3 3 1 3";
	private static final ReadOnlyStringProperty Model = new SimpleStringProperty("Model ");

	private class BoneCellFactory implements Callback<TreeView<Bone>, TreeCell<Bone>> {
		private TreeCell<Bone> dropZone;
		private TreeItem<Bone> draggedItem;

		@Override
		public TreeCell<Bone> call(TreeView<Bone> treeView) {
			TreeCell<Bone> cell = new TreeCell<Bone>() {
				@Override
				protected void updateItem(Bone item, boolean empty) {
					super.updateItem(item, empty);
					BoneModelItem treeitem = (BoneModelItem) getTreeItem();
					if (empty) {
						textProperty().unbind();
						setText(null);
					} else {
						if (treeitem.model == null) {
							textProperty().unbind();
							setText("Bone");
						} else {
							textProperty().bind(Model.concat(treeitem.model.nowViewModel));
						}
					}
				}
			};
			cell.setOnDragDetected((MouseEvent event) -> dragDetected(event, cell, treeView));
			cell.setOnDragOver((DragEvent event) -> dragOver(event, cell, treeView));
			cell.setOnDragDropped((DragEvent event) -> drop(event, cell, treeView));
			cell.setOnDragDone((DragEvent event) -> clearDropLocation());
			MenuItem addBone = new MenuItem("Add Bone");
			addBone.setOnAction(e -> {
				if (cell.getItem() != null) {
					cell.getTreeItem().getChildren().add(new BoneModelItem(new Bone()));
					cell.getTreeItem().setExpanded(true);
				}
			});
			MenuItem removeBone = new MenuItem("Remove Bone");
			removeBone.setOnAction(e -> {
				if (cell.getTreeItem().getParent() != null)
					cell.getTreeItem().getParent().getChildren().remove(cell.getTreeItem());
			});
			MenuItem addModel = new MenuItem("Add Model");
			addModel.setOnAction(e -> {
				if (cell.getItem() != null) {
					cell.getTreeItem().getChildren().add(new BoneModelItem(new ModelSelector()));
					cell.getTreeItem().setExpanded(true);
				}
			});
			MenuItem removeModel = new MenuItem("Remove Model");
			removeModel.setOnAction(e -> {
				if (cell.getTreeItem().getParent() != null)
					cell.getTreeItem().getParent().getChildren().remove(cell.getTreeItem());
			});
			cell.setOnMousePressed(e -> {
				if (e.getButton() == MouseButton.SECONDARY && !cell.isEmpty()) {
					ContextMenu menu = new ContextMenu();
					// メニューの内容条件分岐
					if (((BoneModelItem) cell.getTreeItem()).model == null) {
						menu.getItems().add(addBone);
						menu.getItems().add(addModel);
						if (cell.getTreeItem().getParent() != null)
							menu.getItems().add(removeBone);
					} else {
						menu.getItems().add(removeModel);
					}
					menu.show(cell, e.getScreenX(), e.getScreenY());
				}
			});
			// 選択状態を下に伝達
			ReadOnlyObjectProperty<TreeItem<Bone>> selectModel = treeView.getSelectionModel().selectedItemProperty();
			selectModel.addListener((v, ov, nv) -> {
				if (cell.getTreeItem() != null && nv == cell.getTreeItem()) {
					// 選択対象変更前に前の選択対象をもとに戻す
					if (ov != null)
						((BoneModelItem) ov).setSelected(false);
					((BoneModelItem) nv).setSelected(true);
				}
			});
			return cell;
		}

		private void dragDetected(MouseEvent event, TreeCell<Bone> treeCell, TreeView<Bone> treeView) {
			draggedItem = treeCell.getTreeItem();

			// root can't be dragged
			if (draggedItem == null || draggedItem.getParent() == null)
				return;
			Dragboard db = treeCell.startDragAndDrop(TransferMode.MOVE);

			ClipboardContent content = new ClipboardContent();
			content.put(JAVA_FORMAT, "dummy");
			db.setContent(content);
			db.setDragView(treeCell.snapshot(null, null));
			event.consume();
		}

		private void dragOver(DragEvent event, TreeCell<Bone> treeCell, TreeView<Bone> treeView) {
			if (!event.getDragboard().hasContent(JAVA_FORMAT))
				return;
			TreeItem<Bone> thisItem = treeCell.getTreeItem();

			// can't drop on itself
			if (draggedItem == null || thisItem == null || thisItem == draggedItem)
				return;
			// ignore if this is not pearent
			if (draggedItem.getParent() == null || ((BoneModelItem) treeCell.getTreeItem()).model != null) {
				clearDropLocation();
				return;
			}

			event.acceptTransferModes(TransferMode.MOVE);
			if (!Objects.equals(dropZone, treeCell)) {
				clearDropLocation();
				this.dropZone = treeCell;
				dropZone.setStyle(DROP_HINT_STYLE);
			}
		}

		private void drop(DragEvent event, TreeCell<Bone> treeCell, TreeView<Bone> treeView) {
			Dragboard db = event.getDragboard();
			boolean success = false;
			if (!db.hasContent(JAVA_FORMAT))
				return;

			TreeItem<Bone> thisItem = treeCell.getTreeItem();
			TreeItem<Bone> droppedItemParent = draggedItem.getParent();

			// remove from previous location
			droppedItemParent.getChildren().remove(draggedItem);

			// dropping on parent node makes it the first child
			thisItem.getChildren().add(0, draggedItem);
			treeView.getSelectionModel().select(draggedItem);
			event.setDropCompleted(success);
		}

		private void clearDropLocation() {
			if (dropZone != null)
				dropZone.setStyle("");
		}
	}
}
