package editer.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import editer.HidePack;
import io.ModelIO;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Translate;
import model.HideModel;
import model.ModelPart;
import resources.HideImage;

public class ModelView extends SubScene {
	public ModelPart part;

	private DoubleProperty rotateX = new SimpleDoubleProperty();
	private DoubleProperty rotateY = new SimpleDoubleProperty();
	private DoubleProperty rotateZ = new SimpleDoubleProperty();

	private ObjectProperty<Point3D> rotationAxis = new SimpleObjectProperty<>(new Point3D(0, 0, 0));
	private DoubleProperty rotationValue = new SimpleDoubleProperty();

	public static void showModelView(Pane editer, HideModel read) {
		// テスト
		try {
			HidePack.TextureList.add(new HideImage("test", ImageIO.read(new File("./[AR1]StG44/SkinStG44.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		read.texture = "test";

		ModelView mv = new ModelView(read, editer);

		// 回転
		VBox rotate = new VBox();
		Slider rx = new Slider(-1, 1, 0);
		mv.rotateX.bindBidirectional(rx.valueProperty());
		Slider ry = new Slider(-1, 1, 0);
		mv.rotateY.bindBidirectional(ry.valueProperty());
		Slider rz = new Slider(-1, 1, 0);
		mv.rotateZ.bindBidirectional(rz.valueProperty());

		rotate.getChildren().addAll(rx, ry, rz);

		ChangeListener<Number> toQ = (v, ov, nv) -> {
			double cosRoll = Math.cos(mv.rotateX.get() * Math.PI);
			double sinRoll = Math.sin(mv.rotateX.get() * Math.PI);
			double cosPitch = Math.cos(mv.rotateY.get() * Math.PI);
			double sinPitch = Math.sin(mv.rotateY.get() * Math.PI);
			double cosYaw = Math.cos(mv.rotateZ.get() * Math.PI);
			double sinYaw = Math.sin(mv.rotateZ.get() * Math.PI);

			double q0 = cosRoll * cosPitch * cosYaw + sinRoll * sinPitch * sinYaw;
			double q1 = sinRoll * cosPitch * cosYaw - cosRoll * sinPitch * sinYaw;
			double q2 = cosRoll * sinPitch * cosYaw + sinRoll * cosPitch * sinYaw;
			double q3 = cosRoll * cosPitch * sinYaw - sinRoll * sinPitch * cosYaw;

			System.out.println(q0 + " " + q1 + " " + q2 + " " + q3);
			mv.rotationAxis.set(new Point3D(q1, q2, q3));
			mv.rotationValue.set(q0 * 180);
			// mv.rotationAxis.set(new Point3D(mv.rotateX.get(), mv.rotateY.get(),
			// mv.rotateZ.get()));
		};
		rx.valueProperty().addListener(toQ);
		mv.rotateX.addListener(toQ);
		mv.rotateY.addListener(toQ);
		mv.rotateZ.addListener(toQ);

		editer.getChildren().addAll(mv, rotate);
	}

	public ModelView(HideModel model, Pane editer) {
		super(new Group(), editer.getWidth(), editer.getHeight(), true, SceneAntialiasing.BALANCED);
		widthProperty().bind(editer.widthProperty());
		heightProperty().bind(editer.heightProperty());
		final PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setFieldOfView(70.0);
		camera.getTransforms().addAll(new Translate(0, 0, -0));

	//	camera.gettr

	//	camera.rotateProperty().bind(rotationValue);
	//	camera.rotationAxisProperty().bind(rotationAxis);
	//	camera.layoutXProperty().bind(widthProperty().divide(-2));
	//	camera.layoutYProperty().bind(heightProperty().divide(-2));

		for (String str : model.modelParts.keySet()) {
			addPart(model, str);
		}
		setCamera(camera);
	}

	private void addPart(HideModel model, String name) {
		MeshView meshv = new MeshView();
		TriangleMesh mesh = new TriangleMesh();
		mesh.getPoints().addAll(model.vertArray);
		mesh.getTexCoords().addAll(model.texArray);
		mesh.getFaces().addAll(model.modelParts.get(name).faces);

		// テクスチャがあるなら
		if (model.texture != null && HidePack.getTexture(model.texture) != null) {
			PhongMaterial mat = new PhongMaterial();
			mat.setDiffuseMap(SwingFXUtils.toFXImage(HidePack.getTexture(model.texture).Image, null));
			meshv.setMaterial(mat);
		} else {
			meshv.setMaterial(new PhongMaterial(Color.GRAY));
		}
		meshv.rotateProperty().bind(rotationValue);
		meshv.rotationAxisProperty().bind(rotationAxis);

		// meshv.setCullFace(CullFace.FRONT);
		meshv.translateXProperty().bind(widthProperty().divide(2));
		meshv.translateYProperty().bind(heightProperty().divide(2));

		meshv.setScaleX(6);
		meshv.setScaleY(6);
		meshv.setScaleZ(6);

		// TODO
		meshv.setMesh(mesh);
		((Group) getRoot()).getChildren().add(meshv);
	}
}
