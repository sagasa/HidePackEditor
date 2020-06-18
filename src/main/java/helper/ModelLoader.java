package helper;

import java.io.File;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.COLLADA;
import org.collada._2005._11.colladaschema.Geometry;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.InstanceGeometry;
import org.collada._2005._11.colladaschema.LibraryAnimations;
import org.collada._2005._11.colladaschema.LibraryGeometries;
import org.collada._2005._11.colladaschema.LibraryVisualScenes;
import org.collada._2005._11.colladaschema.Mesh;
import org.collada._2005._11.colladaschema.Node;
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
				 System.out.println(o.getClass());

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

				if ((o instanceof LibraryAnimations)) {
					// 型変換
					LibraryAnimations libraryAnimations = (LibraryAnimations) o;
					libraryAnimations.getAnimations();
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

		Pos[] pos = readDataArray(sourceMap.get(mesh.getVertices().getInputs().get(0).getSource().replace("#", "")),
				Pos::new, Pos[]::new);

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
						readDataArray(sourceMap.get(input.getSource().replace("#", "")), Pos::new, Pos[]::new);
						break;
					case "TEXCOORD":
						readDataArray(sourceMap.get(input.getSource().replace("#", "")), Tex::new, Tex[]::new);
						break;
					case "COLOR":
						readDataArray(sourceMap.get(input.getSource().replace("#", "")), Color::new, Color[]::new);
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



	interface VertexData {
		public void setData(String key, float value);
	}

	class Pos implements VertexData {
		float X = 0;
		float Y = 0;
		float Z = 0;

		@Override
		public String toString() {
			return "[x=" + X + ",y=" + Y + ",z=" + Z + "]";
		}

		@Override
		public void setData(String key, float value) {
			switch (key) {

			case "X":
				X = value;
				break;
			case "Y":
				Y = value;
				break;
			case "Z":
				Z = value;
				break;
			default:
				break;
			}
		}
	}

	class Tex implements VertexData {
		float U = 0;
		float V = 0;

		@Override
		public String toString() {
			return "[u=" + U + ",v=" + V + "]";
		}

		@Override
		public void setData(String key, float value) {
			switch (key) {

			case "S":
				U = value;
				break;
			case "T":
				V = value;
				break;
			default:
				break;
			}
		}
	}

	class Color implements VertexData {
		float R = 0;
		float G = 0;
		float B = 0;
		float A = 0;

		@Override
		public String toString() {
			return "[r=" + R + ",g=" + G + ",B=" + B + ",A=" + A + "]";
		}

		@Override
		public void setData(String key, float value) {
			switch (key) {
			case "R":
				R = value;
				break;
			case "G":
				G = value;
				break;
			case "B":
				B = value;
				break;
			case "A":
				A = value;
				break;
			default:
				break;
			}
		}
	}

	@SuppressWarnings("unchecked")
	private <T extends VertexData> T[] readDataArray(Source src, Supplier<T> sup, Function<Integer, T[]> arraySup) {
		Accessor accessor = src.getTechniqueCommon().getAccessor();

		final int stride = accessor.getStride().intValue();
		final int size = accessor.getCount().intValue();

		T[] res = (T[]) Array.newInstance(sup.get().getClass(), size);
		// 頂点ループ
		for (int i = 0; i < size; i++) {
			T data = sup.get();
			res[i] = data;
			// パラメータループ
			for (int j = 0; j < accessor.getParams().size(); j++) {
				float value = src.getFloatArray().getValues().get(i * stride + j).floatValue();
				data.setData(accessor.getParams().get(j).getName(), value);

			}
			System.out.println(data);
		}
		return res;
	}

}
