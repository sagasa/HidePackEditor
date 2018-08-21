package helper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;

import types.model.DisplayPart;
import types.model.Polygon;
import types.model.VertexUV;

public class FlanModelLoader {
	public static types.model.ModelGun loadFlanModel(String name){
		ModelGun flanmodel;
		try {
			File file = new File("./Flan/");

			URLClassLoader load = URLClassLoader.newInstance(new URL[]{file.toURI().toURL()});
			flanmodel = (ModelGun) load.loadClass("com.flansmod.client.model."+name).newInstance();
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			return null;
		}

		types.model.ModelGun hidemodel = new types.model.ModelGun();
		hidemodel.Body = new DisplayPart(toPolygon(flanmodel.gunModel));


		return hidemodel;
	}

	/**RenderTurbo[] to DisplayPart*/
	private static Polygon[] toPolygon(ModelRendererTurbo[] modeles){
		ArrayList<Polygon> polyList = new ArrayList<>();
		for(ModelRendererTurbo model:modeles){
			for (TexturedPolygon poly : model.Poly) {
				Polygon hidepoly = new Polygon();
				hidepoly.Vertex = new VertexUV[poly.vertexPositions.length];
				for (int i = 0; i < poly.vertexPositions.length; i++) {
					PositionTextureVertex vertex = poly.vertexPositions[i];
					hidepoly.Vertex[i] = new VertexUV(vertex.vector3D.x, vertex.vector3D.y, vertex.vector3D.z, vertex.texturePositionX, vertex.texturePositionY);;
				}
				polyList.add(hidepoly);

			}
		}
		return polyList.toArray(new Polygon[polyList.size()]);
	}
}
