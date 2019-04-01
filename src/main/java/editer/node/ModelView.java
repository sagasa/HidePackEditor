package editer.node;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

import javax.imageio.ImageIO;

import editer.HidePack;
import helper.AutoCompletionTextAreaBinding;
import helper.EditHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ListChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import model.Bone;
import model.HideModel;
import model.ModelSelector;
import resources.HideImage;

public class ModelView extends Pane {
	private SubScene modelView = new SubScene(new Group(), 400, 400, true, SceneAntialiasing.BALANCED);;
	public TreeView<Bone> bonetree;

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
	private DoubleProperty zoom = new SimpleDoubleProperty(1);
	/** モデルの最大サイズ */
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
		// モデルのスケール
		for (float vert : model.vertArray)
			if (scale.get() < vert)
				scale.set(vert);

		System.out.println(scale.get());

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
		cameraZoom.xProperty().bind(zoom);
		cameraZoom.yProperty().bind(zoom);

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

		// 光源
		// ((Group) modelView.getRoot()).getChildren().add(new AmbientLight());

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
				viewPoint.setX(viewPoint.getX() + dx * zoom.get());
				viewPoint.setY(viewPoint.getY() + dy * zoom.get());
			}
			mouseX = nowX;
			mouseY = nowY;
		});
		modelPane.addEventHandler(ScrollEvent.SCROLL, e -> {
			if (e.getDeltaX() + e.getDeltaY() < 0) {
				zoom.set(zoom.get() * 1.1);
			} else {
				zoom.set(zoom.get() * 0.9);
			}
		});

		// プロパティ編集
		// ボタン
		Button reload = new Button("reload");
		reload.setPrefSize(250, 25);
		reload.setOnAction(e -> loadBone());
		// ボーン
		bonetree = new TreeView<>(new BoneModelItem(model.rootBone));
		bonetree.setLayoutY(25);
		bonetree.setPrefHeight(250);
		bonetree.setCellFactory(new BoneCellFactory());
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
		// モデルセレクタ編集
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.setEditable(true);
		comboBox.setLayoutY(275);

		AutoCompletionTextAreaBinding.bindAutoCompletion(text, Bone.autoFill);
		this.getChildren().addAll(reload, bonetree, text, modelPane, comboBox);
	}

	public void loadBone() {
		clearParts();
		model.rootBone.init(new ArrayList<Transform>(), name -> {
			if (renderPropertyMap.containsKey(name)) {
				return renderPropertyMap.get(name).get();
			}
			return 0;
		});
		// リスト上からのリンク更新
		((BoneModelItem) bonetree.getRoot()).imageWrite();
	}

	public void clearParts() {
		((Group) modelView.getRoot()).getChildren().clear();
	}

	/**
	 * @param moves
	 *            ボーンの始点を決定
	 */
	public void addBoneView(Bone bone, List<Transform> moves) {
		TriangleMesh mesh = new TriangleMesh();

		mesh.getTexCoords().addAll(0, 0);
		mesh.getPoints().addAll(0f, 0f, 0f, 0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f,
				0f, 1f, 0f);
		mesh.getFaces().addAll(0, 0, 1, 0, 2, 0, 0, 0, 2, 0, 3, 0, 0, 0, 3, 0, 4, 0, 0, 0, 4, 0, 1, 0, 2, 0, 1, 0, 5, 0,
				3, 0, 2, 0, 5, 0, 4, 0, 3, 0, 5, 0, 1, 0, 4, 0, 5, 0);

		MeshView front = new MeshView();
		front.getTransforms().addAll(moves);
		MeshView back = new MeshView();
		back.getTransforms().addAll(moves);

		front.setMesh(mesh);
		front.setScaleY(10);

		back.setMesh(mesh);
		back.setScaleY(10);

		bone.translate.xProperty();

		front.scaleXProperty().bind(scale.divide(25));
		front.scaleZProperty().bind(scale.divide(25));

		PhongMaterial mat = new PhongMaterial(Color.color(0, 0, 1));
		front.setMaterial(mat);
		back.setMaterial(mat);

		front.setCullFace(CullFace.FRONT);
		front.setDrawMode(DrawMode.LINE);
		back.setDrawMode(DrawMode.LINE);
		((Group) modelView.getRoot()).getChildren().addAll(front, back);
	}

	private static final Color clearColor = Color.color(1, 1, 1, 0.0);
	private static final Color enableColor = Color.color(1, 1, 1, 0.9);
	private static final Color disableColor = Color.color(1, 1, 1, 0.2);

	private void addPartView(ModelSelector model, List<Transform> moves, BooleanProperty select) {
		addPartView(model.defaultModel, model.nowViewModel, moves, select);
		model.item_model.values().forEach(name -> addPartView(name, model.nowViewModel, moves, select));
	}

	private MeshView addPartView(String partName, StringProperty nowselect, List<Transform> moves,
			BooleanProperty listselect) {
		TriangleMesh mesh = new TriangleMesh();
		mesh.getPoints().addAll(model.vertArray);
		mesh.getTexCoords().addAll(model.texArray);
		mesh.getFaces().addAll(model.modelParts.get(partName));

		Image texture = SwingFXUtils.toFXImage(HidePack.getTexture(model.texture).Image, null);

		PhongMaterial mat = new PhongMaterial(enableColor);
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

		// Matの色で表示切替
		BiConsumer<Boolean, Boolean> viewChange = (select, enable) -> {
			if (enable)
				if (select)
					mat.setDiffuseColor(enableColor);
				else
					mat.setDiffuseColor(disableColor);
			else
				mat.setDiffuseColor(clearColor);
		};
		// list選択時の見た目変更
		listselect.addListener((v, ov, nv) -> {
			viewChange.accept(nv, nowselect.get().equals(partName));
		});
		// セレクターの反映
		nowselect.addListener((v, ov, nv) -> viewChange.accept(listselect.get(), nv.equals(partName)));

		((Group) modelView.getRoot()).getChildren().addAll(linev, linev2, facev);
		return linev;
	}

	/** ボーンとモデル両方に対応したツリーアイテム */
	private class BoneModelItem extends TreeItem<Bone> {

		ModelSelector model = null;
		BooleanProperty select = new SimpleBooleanProperty(false);

		/** ビューにメッシュを追加する */
		public void imageWrite() {
			if (isBone()) {
				addBoneView(getValue(), getValue().moves);
			} else {
				addPartView(model, getParent().getValue().moves, select);
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
						setText(null);
					} else {
						if (treeitem.model == null)
							setText("Bone");
						else {
							setText("Model " + treeitem.model.nowViewModel.get());
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
