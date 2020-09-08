package helper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.ArrayUtils;
import org.collada._2005._11.colladaschema.Accessor;
import org.collada._2005._11.colladaschema.Animation;
import org.collada._2005._11.colladaschema.COLLADA;
import org.collada._2005._11.colladaschema.CommonColorOrTextureType;
import org.collada._2005._11.colladaschema.CommonNewparamType;
import org.collada._2005._11.colladaschema.Controller;
import org.collada._2005._11.colladaschema.Effect;
import org.collada._2005._11.colladaschema.FxSampler2DCommon;
import org.collada._2005._11.colladaschema.Geometry;
import org.collada._2005._11.colladaschema.Image;
import org.collada._2005._11.colladaschema.InputLocal;
import org.collada._2005._11.colladaschema.InputLocalOffset;
import org.collada._2005._11.colladaschema.LibraryAnimations;
import org.collada._2005._11.colladaschema.LibraryControllers;
import org.collada._2005._11.colladaschema.LibraryEffects;
import org.collada._2005._11.colladaschema.LibraryGeometries;
import org.collada._2005._11.colladaschema.LibraryImages;
import org.collada._2005._11.colladaschema.LibraryMaterials;
import org.collada._2005._11.colladaschema.LibraryVisualScenes;
import org.collada._2005._11.colladaschema.Material;
import org.collada._2005._11.colladaschema.Mesh;
import org.collada._2005._11.colladaschema.Node;
import org.collada._2005._11.colladaschema.ProfileCOMMON;
import org.collada._2005._11.colladaschema.ProfileCOMMON.Technique;
import org.collada._2005._11.colladaschema.ProfileCOMMON.Technique.Lambert;
import org.collada._2005._11.colladaschema.Skin.Joints;
import org.collada._2005._11.colladaschema.Skin.VertexWeights;
import org.collada._2005._11.colladaschema.Source;
import org.collada._2005._11.colladaschema.Triangles;
import org.collada._2005._11.colladaschema.VisualScene;

public class ModelLoader {

	private static final String ColladaSchema = "org.collada._2005._11.colladaschema";

	public void load(File file) {
		try {
			// 読込パッケージを決定

			// XMLパーサを作成
			JAXBContext jc = JAXBContext.newInstance(ColladaSchema);
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			// JAXBを利用して、ファイルからCOLLADAインスタンスを作成
			COLLADA collada = (COLLADA) unmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			// TODO: handle exception
		}
	}

	static class IDMap {
		Map<String, Object> map = new HashMap<>();

		void put(String key, Object value) {
			map.put(key, value);
		}

		@SuppressWarnings("unchecked")
		<T> T get(String key, Class<T> type) {
			return (T) map.get(key);
		}
	}

	static class DaeImage {
		String fileName;

		public DaeImage(String name) {
			fileName = name;
		}
	}

	static class DaeEffect {
		String texName;

		public DaeEffect(String tex) {
			texName = tex;
		}
	}

	static class DaeMat {
		String effectName;

		public DaeMat(String effect) {
			effectName = effect;
		}
	}

	static class DaeMesh {
		List<HideVertex> vertex;

		public DaeMesh(List<HideVertex> vert) {
			vertex = vert;
		}
	}

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

			// Map<String, String> map = new HashMap<>();
			IDMap idMap = new IDMap();
			Map<String, CommonNewparamType> newparamTagMap = new HashMap<>();

			for (Object obj : collada.getLibraryAnimationsAndLibraryAnimationClipsAndLibraryCameras()) {
				if (obj instanceof LibraryGeometries) {
					LibraryGeometries libraryGeometries = (LibraryGeometries) obj;
					// 子要素ジオメトリを取得
					for (Geometry geometry : libraryGeometries.getGeometries()) {
						// 登録
						idMap.put(geometry.getId(), mesh2Model(geometry.getMesh()));
					}

				} else if (obj instanceof LibraryImages) {
					// 子要素Library_imagesを処理
					// 型変換
					LibraryImages libraryImages = (LibraryImages) obj;
					// 子要素imageを取得(1以上)
					for (Image image : libraryImages.getImages()) {

						// 登録
						idMap.put(image.getId(), new DaeImage(image.getInitFrom()));
						System.out.println(image.getId() + " " + image.getInitFrom());
					}

					// 子要素extraを処理(0以上)

				} else if (obj instanceof LibraryEffects) {
					// 子要素Library_effectsを処理
					// 型変換
					LibraryEffects libraryEffects = (LibraryEffects) obj;

					// idMapにテクスチャURLを登録
					for (Effect effect : libraryEffects.getEffects()) {
						// effectタグを処理
						// 子要素profile_COMMONを処理(?)
						for (JAXBElement<?> o : effect.getFxProfileAbstracts()) {
							// テクスチャ対応
							// profile_COMMONタグを取得
							if (!(o.getValue() instanceof ProfileCOMMON)) {
								continue;
							}
							ProfileCOMMON profileCommon = (ProfileCOMMON) o.getValue();
							// パラメータを取得
							for (Object o2 : profileCommon.getImagesAndNewparams()) {
								// newparamタグのみ対応
								if (!(o2 instanceof CommonNewparamType))
									throw new RuntimeException("対応していません。");
								CommonNewparamType newparamTag = (CommonNewparamType) o2;

								// マップに登録
								newparamTagMap.put(newparamTag.getSid(), newparamTag);
							}

							// マテリアル情報があるか確認
							Technique technique = profileCommon.getTechnique();
							if (technique == null) {
								break;
							}
							Lambert lambert = technique.getLambert();
							if (lambert == null) {
								break;
							}

							// テクスチャ情報を取得
							CommonColorOrTextureType diffuse = lambert.getDiffuse();
							if (diffuse != null) {
								// テクスチャを取得・設定
								if (diffuse.getTexture() != null) {
									String textureSid = getLinkStr(diffuse.getTexture().getTexture());

									// Sampler2Dタグを取得
									FxSampler2DCommon sampler = newparamTagMap.get(textureSid).getSampler2D();
									if (sampler == null) {
										throw new RuntimeException("Sampler2Dが見つかりません");
									}

									// ソースを取得
									String linkStr = getLinkStr(sampler.getSource());
									CommonNewparamType param = newparamTagMap.get(linkStr);

									// 画像を取得
									Image imageTag = (Image) param.getSurface().getInitFroms().get(0).getValue();
									String url = imageTag.getId();
									idMap.put(effect.getId(), new DaeEffect(url));
								}
							}

						}
						// 対応範囲を明示
						if (effect.getFxProfileAbstracts() == null) {
							throw new RuntimeException("対応していません。");
						}

					}

				} else if (obj instanceof LibraryMaterials) {
					// 子要素Library_materialsを処理
					// 型変換
					LibraryMaterials libraryMaterials = (LibraryMaterials) obj;

					// 子要素materialを取得(1以上)
					for (Material material : libraryMaterials.getMaterials()) {
						// Materialタグを処理
						idMap.put(material.getId(), new DaeMat(getLinkStr(material.getInstanceEffect().getUrl())));
					}
				} else if (obj instanceof LibraryControllers) {
					// 子要素Library_controllersを処理
					// 型変換
					LibraryControllers libraryControllers = (LibraryControllers) obj;

					// プロパティidを処理
					// プロパティnameを処理
					// 子要素assetを処理(0or1)
					// 子要素controllerを処理(1以上)
					for (Controller controller : libraryControllers.getControllers()) {
						// コントローラを作成

						// プロパティidを処理
						// プロパティnameを処理
						// 子要素assetを処理(0or1)
						// 子要素skinを処理(?)
						if (controller.getSkin() != null) {
							// 変数取得

							Map<String, Source> sourceMap = new HashMap<>();
							for (Source src : controller.getSkin().getSources()) {
								sourceMap.put(src.getId(), src);
							}
							Joints joint = controller.getSkin().getJoints();
							int count = sourceMap.get(getLinkStr(joint.getInputs().get(0).getSource()))
									.getTechniqueCommon().getAccessor().getCount().intValue();
							for (int i = 0; i < count; i++) {
								Mat4 mat = null;
								String name = null;
								// 前提データの構築
								for (InputLocal input : joint.getInputs()) {
									switch (input.getSemantic()) {
									case "JOINT":
										name = readStringData(sourceMap.get(getLinkStr(input.getSource())), i,
												Joint::new).Name;
										break;
									case "INV_BIND_MATRIX":
										mat = readFloatData(sourceMap.get(getLinkStr(input.getSource())), i, Mat4::new);
										break;
									default:
										break;
									}
								}
								// System.out.println(new HideJoint(mat, name));
							}

							VertexWeights weights = controller.getSkin().getVertexWeights();
							count = weights.getCount().intValue();
							for (int i = 0; i < count; i++) {
								float a = 0;
								String name = null;
								// TODO 飽きた 必要条件が見えてから書く
							}

							// プロパティsourceを処理
							// 子要素bind_shape_matrix(0or1)

							// 子要素source(3以上)
							// 子要素joints(1)
							// 子要素vertex_weights(1)
							// 子要素extre(0以上)

							// ジオメトリを登録
						}

						// 子要素morphを処理(?)
						// 子要素extraを処理

						// コントローラの登録

					}

					// 子要素extraを処理(0以上)

				} else if (obj instanceof LibraryAnimations) {
					// 型変換
					LibraryAnimations libraryAnimations = (LibraryAnimations) obj;

					// プロパティidを処理
					// プロパティnameを処理
					// 子要素Visual_sceneを処理(1以上)
					for (Animation animation : libraryAnimations.getAnimations()) {
						// シーン・オブジェクトを作成
						System.out.println(animation.getId());

						System.out.println(animation.getAnimations());
						// プロパティidを処理

						// プロパティnameを処理
						// 子要素assetを処理(0or1)
						// 子要素nodeを処理(1以上)

						// 子要素evaluate_sceneを処理(0以上)
						// 子要素extraを処理(0以上)

						// VisualSceneを登録

					}

					// 子要素assetを処理(0or1)
					// 子要素extraを処理(0以上)

				} else if (obj instanceof LibraryVisualScenes) {
					// 型変換
					LibraryVisualScenes libraryVisualScenes = (LibraryVisualScenes) obj;

					// プロパティidを処理
					// プロパティnameを処理
					// 子要素Visual_sceneを処理(1以上)
					for (VisualScene visualScene : libraryVisualScenes.getVisualScenes()) {
						// シーン・オブジェクトを作成
						for (Node node : visualScene.getNodes()) {
							System.out.println(node.getType() + node.getName());
						}
						// プロパティidを処理

						// プロパティnameを処理
						// 子要素assetを処理(0or1)
						// 子要素nodeを処理(1以上)

						// 子要素evaluate_sceneを処理(0以上)
						// 子要素extraを処理(0以上)

						// VisualSceneを登録

					}

					// 子要素assetを処理(0or1)
					// 子要素extraを処理(0以上)

				} else {
					// 子要素Library_animation_clipsを処理
					// 子要素Library_animationsを処理
					// 子要素Library_articulated_systemsを処理
					// 子要素Library_camerasを処理
					// 子要素Library_force_fieldsを処理
					// 子要素Library_formulasを処理
					// 子要素Library_jointsを処理
					// 子要素Library_kinematics_modelsを処理
					// 子要素Library_kinematics_scenesを処理
					// 子要素Library_lightsを処理
					// 子要素Library_nodesを処理
					// 子要素Library_physics_materialsを処理
					// 子要素Library_physics_modelsを処理
					// 子要素Library_physice_scenesを処理
				}
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public DaeMesh mesh2Model(Mesh mesh) {
		Map<String, Source> sourceMap = new HashMap<>();
		for (Source src : mesh.getSources()) {
			sourceMap.put(src.getId(), src);
		}
		// 頂点のリンク
		for (InputLocal input : mesh.getVertices().getInputs()) {
			switch (input.getSemantic()) {
			case "POSITION":
				sourceMap.put(mesh.getVertices().getId(), sourceMap.get(input.getSource().replace("#", "")));
				break;
			default:
				break;
			}
		}
		List<HideVertex> vert = new ArrayList<>();
		// トライアングルだけ処理作成
		for (Object obj : mesh.getLinesAndLinestripsAndPolygons()) {
			if (obj instanceof Triangles) {
				Triangles triangles = (Triangles) obj;
				int count = triangles.getCount().intValueExact() * 3;
				triangles.getInputs();
				for (int i = 0; i < count; i++) {
					Vec3 pos = Vec3.ZERO, norm = Vec3.ZERO;
					Tex tex = Tex.ZERO;
					Color color = Color.WHITE;
					int index = i * triangles.getInputs().size();

					// 前提データの構築
					for (InputLocalOffset input : triangles.getInputs()) {
						int j = triangles.getP().get(index + input.getOffset().intValue()).intValue();
						switch (input.getSemantic()) {
						case "VERTEX":
							pos = readFloatData(sourceMap.get(getLinkStr(input.getSource())), j, Vec3::new);
							break;
						case "NORMAL":
							norm = readFloatData(sourceMap.get(getLinkStr(input.getSource())), j, Vec3::new);
							break;
						case "TEXCOORD":
							tex = readFloatData(sourceMap.get(getLinkStr(input.getSource())), j, Tex::new);
							break;
						case "COLOR":
							color = readFloatData(sourceMap.get(getLinkStr(input.getSource())), j, Color::new);
							break;
						default:
							break;
						}
					}

					HideVertex hv = new HideVertex(pos, norm, tex, color);
					vert.add(hv);
				}
			}

		}
		return new DaeMesh(vert);
	}

	interface InputData<T> {
		void setData(String key, int index, T value);

		/** １パラメータで数値をいくつ含むか */
		default int getSize() {
			return 1;
		}
	}

	static class Vec3 implements InputData<Float> {
		static final Vec3 ZERO = new Vec3();

		float X = 0;
		float Y = 0;
		float Z = 0;

		@Override
		public String toString() {
			return "[x=" + X + ",y=" + Y + ",z=" + Z + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
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

	static class Mat4 implements InputData<Float> {
		static final Vec3 ZERO = new Vec3();

		float[][] value = new float[4][4];

		@Override
		public String toString() {
			return ArrayUtils.toString(value);
		}

		@Override
		public int getSize() {
			return 16;
		}

		@Override
		public void setData(String key, int index, Float value) {
			this.value[index % 4][index / 4] = value;
		}
	}

	static class Tex implements InputData<Float> {
		static final Tex ZERO = new Tex();

		float U = 0;
		float V = 0;

		@Override
		public String toString() {
			return "[u=" + U + ",v=" + V + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
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

	static class Color implements InputData<Float> {
		static final Color WHITE = new Color();
		float R = 1;
		float G = 1;
		float B = 1;
		float A = 1;

		@Override
		public String toString() {
			return "[r=" + R + ",g=" + G + ",B=" + B + ",A=" + A + "]";
		}

		@Override
		public void setData(String key, int index, Float value) {
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

	static class Joint implements InputData<String> {
		String Name;

		@Override
		public String toString() {
			return "[Name=" + Name + "]";
		}

		@Override
		public void setData(String key, int index, String value) {
			Name = value;
		}
	}

	private <T extends InputData<String>> T readStringData(Source src, int index, Supplier<T> sup) {
		Accessor accessor = src.getTechniqueCommon().getAccessor();
		final int offset = accessor.getOffset().intValue();
		final int stride = accessor.getStride().intValue();

		T data = sup.get();
		// パラメータループ
		for (int j = 0; j < accessor.getParams().size(); j++) {
			for (int i = 0; i < data.getSize(); i++) {
				String value = src.getNameArray().getValues().get(index * stride + j + offset + i);
				data.setData(accessor.getParams().get(j).getName(), i, value);
			}
		}
		return data;
	}

	private <T extends InputData<Float>> T readFloatData(Source src, int index, Supplier<T> sup) {
		Accessor accessor = src.getTechniqueCommon().getAccessor();
		final int offset = accessor.getOffset().intValue();
		final int stride = accessor.getStride().intValue();

		T data = sup.get();
		// パラメータループ
		for (int j = 0; j < accessor.getParams().size(); j++) {
			for (int i = 0; i < data.getSize(); i++) {
				float value = src.getFloatArray().getValues().get(index * stride + j + offset + i).floatValue();
				data.setData(accessor.getParams().get(j).getName(), i, value);
			}
		}
		return data;
	}

	private static String getLinkStr(String str) {
		return str.substring(0, 1).equalsIgnoreCase("#") ? str.substring(1) : str;

	}

	public static class HideJoint {
		public final Mat4 mat;
		public final String name;

		public HideJoint(Mat4 mat, String name) {
			this.mat = mat;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[" + mat + "," + name + "]";
		}
	}

	public static class HideVertex {
		public final float posX, posY, posZ, normalX, normalY, normalZ, colorR, colorG, colorB, colorA, texU, texV;

		public HideVertex(Vec3 pos, Vec3 norm, Tex tex, Color color) {
			posX = pos.X;
			posY = pos.Y;
			posZ = pos.Z;
			normalX = norm.X;
			normalY = norm.Y;
			normalZ = norm.Z;
			texU = tex.U;
			texV = tex.U;
			colorR = color.R;
			colorG = color.G;
			colorB = color.B;
			colorA = color.A;
		}

		@Override
		public String toString() {
			return "[" + posX + "," + posY + "," + posZ + " : " + texU + "," + texV + "]";
		}
	}

}
