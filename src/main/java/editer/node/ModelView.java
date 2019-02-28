package editer.node;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.imageio.ImageIO;

import org.apache.commons.lang.ArrayUtils;

import editer.HidePack;
import helper.AutoCompletionTextAreaBinding;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ListChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.TransformChangedEvent;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import model.Bone;
import model.HideModel;
import model.ModelPart;
import resources.HideImage;

public class ModelView extends Pane {
	private SubScene modelView = new SubScene(new Group(), 400, 400, true, SceneAntialiasing.BALANCED);;
	public ListView<String> list;

	public HideModel model;
	// プロパティMap
	private static Map<String, FloatProperty> renderPropertyMap = new HashMap<>();

	// ビュー設定
	private BooleanProperty showLine = new SimpleBooleanProperty(true);
	// 視点移動用
	private double mouseX;
	private double mouseY;
	private Rotate viewRotateX = new Rotate(0, Rotate.X_AXIS);
	private Rotate viewRotateY = new Rotate(0, Rotate.Y_AXIS);
	private Translate viewPoint = new Translate(0, 0, 0);
	private DoubleProperty scale = new SimpleDoubleProperty(1);

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
		/*
		 * camera.scaleXProperty().bind(scale);
		 * camera.scaleYProperty().bind(scale.multiply(-1));
		 * camera.scaleZProperty().bind(scale);//
		 */
		camera.setScaleY(-1);
		camera.getTransforms().addAll(viewRotateY, viewRotateX, viewPoint);

		Pane modelPane = new Pane(modelView);
		Scale cameraZoom = new Scale(1, 1);
		// cameraZoom.pivotXProperty()
		// cameraZoom.pivotYProperty()
		cameraZoom.xProperty().bind(scale);
		cameraZoom.yProperty().bind(scale);

		Translate cameraCenter = new Translate();
		cameraCenter.xProperty().bind(modelPane.widthProperty().divide(-2));
		cameraCenter.yProperty().bind(modelPane.heightProperty().divide(-2));

		camera.getTransforms().addAll(cameraZoom, cameraCenter);

		modelPane.setLayoutX(250);
		modelPane.prefWidthProperty().bind(widthProperty().subtract(250));
		modelPane.prefHeightProperty().bind(heightProperty());
		modelView.widthProperty().bind(widthProperty().subtract(250));
		modelView.heightProperty().bind(heightProperty());
		modelView.setCamera(camera);

		// 支点操作インターフェース
		modelPane.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});
		modelPane.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
			double nowX = e.getSceneX();
			double nowY = e.getSceneY();
			double dx = mouseX - nowX;
			double dy = mouseY - nowY;
			if (e.getButton() == MouseButton.SECONDARY) {
				viewRotateX.setAngle(viewRotateX.getAngle() + dy / 2);
				viewRotateY.setAngle(viewRotateY.getAngle() - dx / 2);
			} else if (e.getButton() == MouseButton.PRIMARY) {
				viewPoint.setX(viewPoint.getX() + dx * scale.get());
				viewPoint.setY(viewPoint.getY() + dy * scale.get());
			}
			mouseX = nowX;
			mouseY = nowY;
		});
		modelPane.addEventHandler(ScrollEvent.SCROLL, e -> {
			if (e.getDeltaX() + e.getDeltaY() < 0) {
				scale.set(scale.get() * 1.1);
			} else {
				scale.set(scale.get() * 0.9);
			}
		});

		// プロパティ編集
		// ボタン
		Button reload = new Button("reload");
		reload.setPrefSize(250, 25);
		reload.setOnAction(e -> loadBone());
		// ボーン
		TreeView<Bone> bonetree = new TreeView<>(new BoneModelItem(model.rootBone));
		bonetree.setLayoutY(25);
		bonetree.setPrefHeight(250);
		bonetree.setCellFactory(new BoneCellFactory(this));
		// スクリプト
		TextArea text = new TextArea();
		text.setLayoutY(275);
		text.setPrefWidth(250);
		text.prefHeightProperty().bind(this.heightProperty().subtract(275));
		bonetree.getSelectionModel().selectedItemProperty().addListener((v, ov, nv) -> {
			if (ov != null && ov.getValue() != null) {
				ov.getValue().setVisible(false);
				text.textProperty()
						.unbindBidirectional((Property<String>) EditHelper.getProperty(ov.getValue(), "script"));
			}
			if (nv.getValue() != null) {
				nv.getValue().setVisible(true);
				text.setVisible(true);
				text.textProperty()
						.bindBidirectional((Property<String>) EditHelper.getProperty(nv.getValue(), "script"));
			} else {
				text.setVisible(false);
			}
		});
		text.setVisible(false);
		AutoCompletionTextAreaBinding.bindAutoCompletion(text, Bone.autoFill);
		this.getChildren().addAll(reload, bonetree, text, modelPane);
	}

	public void loadBone() {
		clearParts();
		model.rootBone.init(new ArrayList<Transform>(), this, name -> {
			if (renderPropertyMap.containsKey(name)) {
				return renderPropertyMap.get(name).get();
			}
			return 0;
		});
	}

	public void clearParts() {
		((Group) modelView.getRoot()).getChildren().clear();
	}

	/**
	 * @param transforms
	 *            ボーンの始点を決定
	 */
	public void addBoneView(Bone bone, Transform[] transforms) {

		MeshView meshv = new MeshView();
		TriangleMesh mesh = new TriangleMesh();

		mesh.getPoints().addAll();
		mesh.getFaces().addAll();

	}

	private static final Color enableColor = Color.color(1, 1, 1, 1);
	private static final Color disableColor = Color.color(1, 1, 1, 0.2);

	public MeshView addPart(String partName, List<Transform> moves, BooleanProperty select) {
		TriangleMesh mesh = new TriangleMesh();
		mesh.getPoints().addAll(model.vertArray);
		mesh.getTexCoords().addAll(model.texArray);
		mesh.getFaces().addAll(model.modelParts.get(partName));

		Image texture = SwingFXUtils.toFXImage(HidePack.getTexture(model.texture).Image, null);

		PhongMaterial mat = new PhongMaterial();
		// テクスチャがあるなら
		if (model.texture != null && HidePack.getTexture(model.texture) != null) {
			mat.setDiffuseMap(texture);
		}
		PhongMaterial lineMat = new PhongMaterial(Color.WHITE, texture, null, null, null);
		// 辺表示
		MeshView linev = new MeshView();
		linev.visibleProperty().bind(showLine);
		linev.setCullFace(CullFace.FRONT);
		linev.setMaterial(lineMat);
		// スクリプト
		linev.getTransforms().addAll(moves);
		linev.setDrawMode(DrawMode.LINE);
		linev.setMesh(mesh);
		// 裏
		MeshView linev2 = new MeshView();
		linev2.visibleProperty().bind(showLine);
		linev2.setMaterial(lineMat);
		// スクリプト
		linev2.getTransforms().addAll(moves);
		linev2.setDrawMode(DrawMode.LINE);
		linev2.setMesh(mesh);
		// 面表示
		MeshView facev = new MeshView();
		facev.setMaterial(mat);
		facev.setCullFace(CullFace.FRONT);
		// スクリプト
		facev.getTransforms().addAll(moves);
		facev.setMesh(mesh);
		// 選択時の見た目変更
		select.addListener((v, ov, nv) -> {
			if (nv)
				mat.setDiffuseColor(enableColor);
			else
				mat.setDiffuseColor(disableColor);
		});

		((Group) modelView.getRoot()).getChildren().addAll(linev, linev2, facev);
		return linev;
	}

	/** ボーンとモデル両方に対応したツリーアイテム */
	private class BoneModelItem extends TreeItem<Bone> {

		String model = null;
		BooleanProperty select = new SimpleBooleanProperty(false);

		/** ビューにメッシュを追加する */
		public void imageWrite() {
			if (model != null) {
				addPart(model, getParent().getValue().moves, select);
			}
			getChildren().forEach(item -> ((BoneModelItem) item).imageWrite());
		}

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

	private class BoneCellFactory implements Callback<TreeView<Bone>, TreeCell<Bone>> {
		private TreeCell<Bone> dropZone;
		private TreeItem<Bone> draggedItem;
		private ModelView modelview;

		public BoneCellFactory(ModelView view) {
			modelview = view;
		}

		@Override
		public TreeCell<Bone> call(TreeView<Bone> treeView) {
			// 選択状態
			ReadOnlyObjectProperty<TreeItem<Bone>> selectModel = treeView.getSelectionModel().selectedItemProperty();
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
