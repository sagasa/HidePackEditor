package helper;

import java.io.File;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.COLLADA;
import org.collada._2005._11.colladaschema.Geometry;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.InstanceGeometry;
import org.collada._2005._11.colladaschema.LibraryGeometries;
import org.collada._2005._11.colladaschema.LibraryVisualScenes;
import org.collada._2005._11.colladaschema.Mesh;
import org.collada._2005._11.colladaschema.Node;
import org.collada._2005._11.colladaschema.Param;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Triangles;
import org.collada._2005._11.colladaschema.VisualScene;

public class ModelLoader {

	public void run() {
		// ファイルから読み込み
		try {
			// 読込パッケージを決定
			String packageName = "org.collada._2005._11.colladaschema";

			// XMLパーサを作成
			JAXBContext jc = JAXBContext.newInstance(packageName);
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			// JAXBを利用して、ファイルからCOLLADAインスタンスを作成
			File f = new File("test.dae");
			COLLADA collada = (COLLADA) unmarshaller.unmarshal(f);

			Map<String, String> map = new HashMap<>();

			// Collada直下Library_Visual_Sceneを取得
			for (Object o : collada.getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras()) {
				// System.out.println(o.getClass());

				// LibraryGeometriesノードであれば、処理を実行
				if ((o instanceof LibraryGeometries)) {
					// 型変換
					LibraryGeometries libraryGeometries = (LibraryGeometries) o;

					// Library_Visual_Scenes直下のVisualSceneを取得
					for (Geometry geometry : libraryGeometries.getGeometries()) {
						// VisualScene直下のNodeを取得

						// NodeノードのIDを出力
						// map.put(geometry.getId(), geometry.getMesh().getVertices());
						System.out.println("node " + geometry.getId());
						mesh2Model(geometry.getMesh());
					}
				}
				// Visual_Sceneノードであれば、処理を実行
				if ((o instanceof LibraryVisualScenes)) {
					// 型変換
					LibraryVisualScenes libraryVisualScenes = (LibraryVisualScenes) o;

					// Library_Visual_Scenes直下のVisualSceneを取得
					for (VisualScene visualScene : libraryVisualScenes.getVisualScenes()) {
						// VisualScene直下のNodeを取得
						for (Node node : visualScene.getNodes()) {
							// NodeノードのIDを出力
							System.out.println("node " + node.getClass());

							System.out.println("get " + node.getInstanceGeometries());
							for (InstanceGeometry geo : node.getInstanceGeometries()) {
								System.out.println(geo.getUrl());

							}
						}
					}
				}

			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void mesh2Model(Mesh mesh) {
		Map<String, Source> sourceMap = new HashMap<>();
		for (Source src : mesh.getSources()) {
			sourceMap.put(src.getId(), src);
			src.getTechniqueCommon().getAccessor();
		}
		// 頂点作成
		readPosArray(sourceMap.get(mesh.getVertices().getInputs().get(0).getSource().replace("#", "")));

		// トライアングルだけ処理作成
		for (Object obj : mesh.getLinesAndLinestripsAndPolygons()) {
			if (obj instanceof Triangles) {
				Triangles triangles = (Triangles) obj;

				int count = triangles.getCount().intValueExact();
				// 前提データの構築
				for (InputLocalOffset input : triangles.getInputs()) {
					switch (input.getSemantic()) {
					case "VERTEX":

						break;
					case "NORMAL":

						break;
					case "TEXCOORD":

						break;
					case "COLOR":

						break;
					default:
						break;
					}
				}
				triangles.getInputs();

				for (int i = 0; i < count; i++) {

				}

				System.out.println(obj.getClass());
			}

		}
	}

	class Pos {
		float X = 0;
		float Y = 0;
		float Z = 0;

		@Override
		public String toString() {
			return "[x=" + X + ",y=" + Y + ",z=" + Z + "]";
		}
	}

	private Pos[] readPosArray(Source src) {
		Accessor accessor = src.getTechniqueCommon().getAccessor();

		final int stride = accessor.getStride().intValue();
		final int size = accessor.getCount().intValue();

		Pos[] res = new Pos[size];
		// 頂点ループ
		for (int i = 0; i < size; i++) {
			Pos pos = new Pos();
			res[i] = pos;
			// パラメータループ
			for (int j = 0; j < accessor.getParams().size(); j++) {
				float value = src.getFloatArray().getValues().get(i * stride + j).floatValue();
				switch (accessor.getParams().get(j).getName()) {
				case "X":
					pos.X = value;
					break;
				case "Y":
					pos.Y = value;
					break;
				case "Z":
					pos.Z = value;
					break;
				default:
					break;
				}
			}
			System.out.println(pos);
		}
		return res;
	}

}
