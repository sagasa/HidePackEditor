package editer.node;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.controlsfx.control.PropertySheet.Item;

import editer.DataEntityInterface;
import editer.HidePack;
import editer.controller.RootController;
import editer.controller.RootController.ColordListCell;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import model.Bone;
import model.HideModel;
import model.ModelPart;
import resources.HideImage;

public class ModelView extends TabPane {
	private SubScene modelView = new SubScene(new Group(), 400, 400, true, SceneAntialiasing.BALANCED);;
	private Pane editPane;
	public ListView<String> list;

	public HideModel model;

	private double mouseX;
	private double mouseY;
	private Rotate viewRotateX = new Rotate(0, Rotate.X_AXIS);
	private Rotate viewRotateY = new Rotate(0, Rotate.Y_AXIS);
	private Translate viewPoint = new Translate(0, 0, 0);
	private DoubleProperty scale = new SimpleDoubleProperty(1);

	private static final Color COLOR_TRANSIENT = Color.color(1, 1, 1, 0.2);
	private static final Color COLOR_ENABLE = Color.color(1, 1, 1, 1);

	public static void showModelView(Pane editer, HideModel read) {
		// テスト
		try {
			HidePack.TextureList.add(new HideImage("test", ImageIO.read(new File("./[AR1]StG44/SkinStG44.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		read.texture = "test";

		ModelView mv = new ModelView(read, editer);
		editer.getChildren().addAll(mv);
	}

	public ModelView(HideModel model, Pane editer) {
		// this.root = editer;
		this.model = model;
		prefWidthProperty().bind(editer.widthProperty());
		prefHeightProperty().bind(editer.heightProperty());
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setFieldOfView(70.0);

		// 支点操作インターフェース
		modelView.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});
		modelView.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
			double nowX = e.getSceneX();
			double nowY = e.getSceneY();
			double dx = mouseX - nowX;
			double dy = mouseY - nowY;
			if (e.getButton() == MouseButton.SECONDARY) {
				viewRotateX.setAngle(viewRotateX.getAngle() + dy);
				viewRotateY.setAngle(viewRotateY.getAngle() + dx);
			} else if (e.getButton() == MouseButton.PRIMARY) {
				viewPoint.setX(viewPoint.getX() - dx / scale.get());
				viewPoint.setY(viewPoint.getY() + dy / scale.get());
			}
			mouseX = nowX;
			mouseY = nowY;
		});
		modelView.addEventHandler(ScrollEvent.SCROLL, e -> {
			if (e.getDeltaX() + e.getDeltaY() < 0) {
				scale.set(scale.get() - 0.2);
			} else {
				scale.set(scale.get() + 0.2);
			}
		});
		modelView.widthProperty().bind(widthProperty());
		modelView.heightProperty().bind(heightProperty());
		modelView.setCamera(camera);

		// モデルチェック
		ListView<String> list = new ListView<>();
		list.setPrefSize(160, 200);
		list.setItems(FXCollections.observableArrayList(model.modelParts.keySet()));
		list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		ToggleButton toggle = new ToggleButton("AnimetionCheck");

		this.getTabs().add(new Tab("ModelCheck", new Pane(new VBox(toggle, list), modelView)));

		Map<String, MeshView> viewModels = new HashMap<>();
		for (String part : model.modelParts.keySet()) {
			viewModels.put(part, addPart(part));
		}
		list.getSelectionModel().getSelectedItems().addListener((ListChangeListener<String>) c -> {
			viewModels.entrySet().forEach(e -> {
				if (c.getList().contains(e.getKey()))
					((PhongMaterial) e.getValue().getMaterial()).setDiffuseColor(COLOR_ENABLE);
				else
					((PhongMaterial) e.getValue().getMaterial()).setDiffuseColor(COLOR_TRANSIENT);
			});
		});
		// ボーン
		TreeView<Bone> bones = new TreeView<>(new BoneModelItem(model.rootBone));
		bones.setCellFactory(new BoneCellFactory());
		this.getTabs().add(new Tab("Bone", new Pane(new VBox(bones))));
	}

	public void clearParts() {
		((Group) modelView.getRoot()).getChildren().clear();
	}

	public MeshView addPart(String partName, Transform... move) {
		MeshView meshv = new MeshView();
		TriangleMesh mesh = new TriangleMesh();
		mesh.getPoints().addAll(model.vertArray);
		mesh.getTexCoords().addAll(model.texArray);
		mesh.getFaces().addAll(model.modelParts.get(partName));

		PhongMaterial mat = new PhongMaterial();
		// テクスチャがあるなら
		if (model.texture != null && HidePack.getTexture(model.texture) != null) {
			mat.setDiffuseMap(SwingFXUtils.toFXImage(HidePack.getTexture(model.texture).Image, null));
		} else {
			mat.setDiffuseColor(Color.GRAY);
		}
		meshv.setMaterial(mat);
		// スケール
		meshv.scaleXProperty().bind(scale);
		meshv.scaleYProperty().bind(scale.multiply(-1));
		meshv.scaleZProperty().bind(scale);
		// 移動
		meshv.getTransforms().add(viewPoint);
		// 回転
		meshv.getTransforms().addAll(viewRotateX, viewRotateY);
		meshv.getTransforms().addAll(move);

		// mat.setDiffuseColor();

		// meshv.setCullFace(CullFace.FRONT);
		meshv.translateXProperty().bind(modelView.widthProperty().divide(2));
		meshv.translateYProperty().bind(modelView.heightProperty().divide(2));

		// TODO
		meshv.setMesh(mesh);
		((Group) modelView.getRoot()).getChildren().add(meshv);
		return meshv;
	}

	/** モデル用 用途と表示の切り替え */
	public static class ModelListCell extends ListCell<ModelPart> {

		/**
		 * ファクトリー
		 */
		public static Callback<ListView<ModelPart>, ListCell<ModelPart>> getCellFactory() {
			return new Callback<ListView<ModelPart>, ListCell<ModelPart>>() {
				@Override
				public ListCell<ModelPart> call(ListView<ModelPart> arg0) {
					return new ModelListCell();
				}
			};
		}

		/** 削除ボタンを*出すかどうかの判定 */
		private Rectangle color = new Rectangle(20, 20);
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public ModelListCell() {
			root.getChildren().addAll(color, text);
		}

		@Override
		protected void updateItem(ModelPart data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));
				color.widthProperty().bind(root.heightProperty());
				color.heightProperty().bind(root.heightProperty());
				text.translateXProperty().bind(root.heightProperty().add(5));
				isBind = true;
			}
			if (!empty) {
				text.setText(data.name);
				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}

	private static class BoneModelItem extends TreeItem<Bone> {

		String model = null;

		public BoneModelItem(String model) {
			this.model = model;
		}

		public BoneModelItem(Bone root) {
			super(root);
			root.models.forEach(name -> getChildren().add(new BoneModelItem(name)));
			root.children.forEach(bone -> getChildren().add(new BoneModelItem(bone)));
			ListChangeListener<? super TreeItem<Bone>> listener = e -> {
				while (e.next()) {
					if (e.wasAdded()) {
						e.getAddedSubList().forEach(i -> {
							BoneModelItem item = (BoneModelItem) i;
							if (item.model == null) {
								this.getValue().children.add(item.getValue());
							}
						});
					} else if (e.wasRemoved()) {
						e.getRemoved().forEach(i -> {
							BoneModelItem item = (BoneModelItem) i;
							if (item.model == null) {
								this.getValue().children.remove(item.getValue());
							}
						});
					}
				}
			};
			getChildren().addListener(listener);
		}
	}

	private static class BoneCellFactory implements Callback<TreeView<Bone>, TreeCell<Bone>> {
		private static final DataFormat JAVA_FORMAT = new DataFormat("application/x-java-serialized-object");
		private static final String DROP_HINT_STYLE = "-fx-border-color: #eea82f; -fx-border-width: 2 0 2 0; -fx-padding: 3 3 1 3";
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
						setText(null);
					} else {
						if (treeitem.model == null)
							setText("Bone " + item.name);
						else {
							setText("Model " + treeitem.model);
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
					cell.getTreeItem().getChildren().add(new BoneModelItem(""));
					cell.getTreeItem().setExpanded(true);
				}
			});
			MenuItem removeModel = new MenuItem("Remove Model");
			removeModel.setOnAction(e -> {
				if (cell.getTreeItem().getParent() != null)
					cell.getTreeItem().getParent().getChildren().remove(cell.getTreeItem());
			});
			cell.setContextMenu(new ContextMenu(addBone, removeBone, addModel, removeModel));
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
			// ignore if this is the root
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
