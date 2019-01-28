package editer.node;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

import javax.imageio.ImageIO;

import editer.DataEntityInterface;
import editer.HidePack;
import editer.controller.RootController.ColordListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import model.HideModel;
import model.ModelPart;
import resources.HideImage;

public class ModelView extends SubScene {
	public ModelPart part;

	private double mouseX;
	private double mouseY;
	private Rotate viewRotateX = new Rotate(0,Rotate.X_AXIS);
	private Rotate viewRotateY = new Rotate(0,Rotate.Y_AXIS);
	private Rotate viewRotateZ = new Rotate(0,Rotate.Z_AXIS);

	public static void showModelView(Pane editer, HideModel read) {
		// テスト
		try {
			HidePack.TextureList.add(new HideImage("test", ImageIO.read(new File("./[AR1]StG44/SkinStG44.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		read.texture = "test";

		ListView<ModelPart> list = new ListView<>();
		list.setItems(FXCollections.observableArrayList(read.modelParts));

		ModelView mv = new ModelView(read, editer);
		editer.getChildren().addAll(mv,list);
	}

	public ModelView(HideModel model, Pane editer) {
		super(new Group(), editer.getWidth(), editer.getHeight(), true, SceneAntialiasing.BALANCED);
		widthProperty().bind(editer.widthProperty());
		heightProperty().bind(editer.heightProperty());
		final PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setFieldOfView(70.0);
		camera.getTransforms().addAll(new Translate(0, 0, -0));


		//回転
		addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});
		addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
			double nowX = e.getSceneX();
			double nowY = e.getSceneY();
			double dx = mouseX - nowX;
			double dy = mouseY - nowY;
			viewRotateX.setAngle(viewRotateX.getAngle()+dy);
			viewRotateY.setAngle(viewRotateY.getAngle()+dx);
			mouseX = nowX;
			mouseY = nowY;
		});

		// camera.gettr

		// camera.rotateProperty().bind(rotationValue);
		// camera.rotationAxisProperty().bind(rotationAxis);
		// camera.layoutXProperty().bind(widthProperty().divide(-2));
		// camera.layoutYProperty().bind(heightProperty().divide(-2));

		for (ModelPart part : model.modelParts) {
			addPart(model, part);
		}
		setCamera(camera);
	}

	private void addPart(HideModel model, ModelPart part) {
		MeshView meshv = new MeshView();
		TriangleMesh mesh = new TriangleMesh();
		mesh.getPoints().addAll(model.vertArray);
		mesh.getTexCoords().addAll(model.texArray);
		mesh.getFaces().addAll(part.faces);

		PhongMaterial mat = new PhongMaterial();
		// テクスチャがあるなら
		if (model.texture != null && HidePack.getTexture(model.texture) != null) {
			mat.setDiffuseMap(SwingFXUtils.toFXImage(HidePack.getTexture(model.texture).Image, null));
		} else {
			mat.setDiffuseColor(Color.GRAY);
		}
		meshv.setMaterial(mat);
		//回転
		mat.setDiffuseColor(Color.color(1, 1, 1, 0.2));
		meshv.getTransforms().addAll(viewRotateX,viewRotateY,viewRotateZ);


		// meshv.setCullFace(CullFace.FRONT);
		meshv.translateXProperty().bind(widthProperty().divide(2));
		meshv.translateYProperty().bind(heightProperty().divide(2));

		meshv.setScaleX(3);
		meshv.setScaleY(-3);
		meshv.setScaleZ(3);

		// TODO
		meshv.setMesh(mesh);
		((Group) getRoot()).getChildren().add(meshv);
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
		private Function<DataEntityInterface, Boolean> canDelete = null;
		private Label delete = new Label();
		private Rectangle color = new Rectangle(20, 20);
		private Label text = new Label();
		private AnchorPane root = new AnchorPane();
		private boolean isBind = false;

		public ModelListCell() {

			root.getChildren().addAll(color, delete, text);
			delete.setStyle("-fx-background-image : url('./icon/delete.png');");
		}

		@Override
		protected void updateItem(ModelPart data, boolean empty) {
			super.updateItem(data, empty);
			// 初期化
			if (!isBind) {
				root.prefWidthProperty().bind(widthProperty().subtract(14));
				root.prefHeightProperty().bind(heightProperty().subtract(6));
				delete.prefWidthProperty().bind(root.heightProperty());
				delete.prefHeightProperty().bind(root.heightProperty());
				delete.translateXProperty().bind(root.widthProperty().subtract(root.heightProperty().multiply(1.1)));
				color.widthProperty().bind(root.heightProperty());
				color.heightProperty().bind(root.heightProperty());
				text.translateXProperty().bind(root.heightProperty().add(5));
				isBind = true;
			}
			if (!empty) {
				delete.setVisible(canDelete == null);
				text.setText(data.name);
				setGraphic(root);
				getIndex();
				getListView().getItems().size();
			} else {
				setGraphic(null);
			}
		}
	}
}
