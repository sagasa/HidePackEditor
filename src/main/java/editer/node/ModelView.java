package editer.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import editer.HidePack;
import io.ModelIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Translate;
import model.HideModel;
import model.ModelPart;

public class ModelView extends Group {
	public ModelPart part;

	public ModelView(HideModel model) {
		final PerspectiveCamera camera = new PerspectiveCamera(true);
		camera.setFieldOfView(45.0);
		camera.getTransforms().addAll(new Translate(0, 0, -180));
		for (String str : model.modelParts.keySet()) {
			addPart(model, str);
		}
		getChildren().addAll(camera);
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
		}else {
			meshv.setMaterial(new PhongMaterial(Color.GRAY));
		}
		meshv.setRotate(180);
//TODO
		meshv.setMesh(mesh);
		getChildren().add(meshv);
	}
}
