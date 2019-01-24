package editer.node;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.ModelIO;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.shape.Mesh;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Translate;
import model.ModelPart;

public class ModelView extends Group{
	public ModelPart part;
	public ModelView() {
        final PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setFieldOfView(45.0);
        camera.getTransforms().addAll(
            new Translate(0, 0, -180)
        );
        Map<String ,List<HidePolygon>> model = ModelIO.read();
        for(String str:model.keySet()) {
        	addPart(model.get(str));
        }

        Polygon poly = new Polygon(100,0,100,100,0,100);

        getChildren().addAll(camera,poly);

	}
	private void addPart(List<HidePolygon> part) {
		MeshView meshv = new MeshView();
		TriangleMesh mesh =new TriangleMesh();
		mesh.getTexCoords();
		for(HidePolygon poly :part) {
		//	for(ver)
		}
	//	getChildren().add();
	}
}
