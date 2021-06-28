package editor.node.model;

import java.util.List;
import java.util.function.BiConsumer;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.WeakChangeListener;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import resources.Model;
import types.model.Bone;
import types.model.HideModel;
import types.model.ModelSelector;

public class ModelView extends Pane {

	private Group rootGroup = new Group();

	/** 編集中のオブジェクト */
	ObjectProperty<HideModel> editValue;

	// ビュー設定
	private BooleanProperty showLine = new SimpleBooleanProperty(true);
	// 視点移動用
	private double mouseX;
	private double mouseY;
	private Rotate viewRotateX = new Rotate(0, Rotate.X_AXIS);
	private Rotate viewRotateY = new Rotate(0, Rotate.Y_AXIS);
	private Translate viewPoint = new Translate(0, 0, 0);
	private DoubleProperty zoom = new SimpleDoubleProperty(1);

	/** チェック無いよ！！ */
	public HideModel getModel() {
		return (HideModel) editValue.get();
	}

	public ModelView(ObjectProperty<HideModel> editvalue) {
		this.editValue = editvalue;
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setFieldOfView(70.0);

		camera.setScaleY(-1);
		camera.getTransforms().addAll(viewRotateY, viewRotateX, viewPoint);

		Scale cameraZoom = new Scale(1, 1);

		cameraZoom.xProperty().bind(zoom);
		cameraZoom.yProperty().bind(zoom);

		Translate cameraCenter = new Translate();
		cameraCenter.xProperty().bind(this.widthProperty().divide(-2));
		cameraCenter.yProperty().bind(this.heightProperty().divide(-2));

		camera.getTransforms().addAll(cameraZoom, cameraCenter);

		SubScene modelView = new SubScene(rootGroup, 400, 400, true, SceneAntialiasing.BALANCED);
		modelView.widthProperty().bind(widthProperty());
		modelView.heightProperty().bind(heightProperty());
		modelView.setCamera(camera);

		// 支点操作インターフェース
		this.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});
		this.addEventHandler(MouseEvent.MOUSE_DRAGGED, e -> {
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
		this.addEventHandler(ScrollEvent.SCROLL, e -> {
			if (e.getDeltaX() + e.getDeltaY() < 0) {
				zoom.set(zoom.get() * 1.1);
			} else {
				zoom.set(zoom.get() * 0.9);
			}
		});
		this.getChildren().addAll(modelView);
	}

	/**
	 * @param moves ボーンの始点を決定
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

		// front.scaleXProperty().bind(scale.divide(25));
		// front.scaleZProperty().bind(scale.divide(25));

		PhongMaterial mat = new PhongMaterial(Color.color(0, 0, 1));
		front.setMaterial(mat);
		back.setMaterial(mat);

		front.setCullFace(CullFace.FRONT);
		front.setDrawMode(DrawMode.LINE);
		back.setDrawMode(DrawMode.LINE);
		rootGroup.getChildren().addAll(front, back);
	}

	private static final Color clearColor = Color.color(1, 1, 1, 0.0);
	private static final Color enableColor = Color.color(1, 1, 1, 0.9);
	private static final Color disableColor = Color.color(1, 1, 1, 0.2);

	/** セレクター全てのモデルを登録 */
	public void addPartView(ModelSelector model, List<Transform> moves, BooleanProperty select) {
		addPartView(model.defaultModel, model.nowViewModel, moves, select);
		model.item_model.values().forEach(name -> addPartView(name, model.nowViewModel, moves, select));
		{

		}
	}

	/** セレクターの選択から表示を切り替える */
	private boolean addPartView(String partName, StringProperty nowselect, List<Transform> moves,
			BooleanProperty listselect) {
		Model model = null;// getModel().getModel().get();

//		if (!model.modelParts.containsKey(partName))
//			return false;
		TriangleMesh mesh = new TriangleMesh();
//		mesh.getPoints().addAll(model.vertArray);
//		mesh.getTexCoords().addAll(model.texArray);
//		mesh.getFaces().addAll(model.modelParts.get(partName));

		Image texture = null;
		// SwingFXUtils.toFXImage(HidePack.getTexture(getModel().textureName).Image,null);

		PhongMaterial mat = new PhongMaterial(enableColor);
		// テクスチャがあるなら
//		if (getModel().textureName != null && HidePack.getTexture(getModel().textureName) != null) {
//			mat.setDiffuseMap(texture);
//		}
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
		nowselect.addListener(
				new WeakChangeListener<>((v, ov, nv) -> viewChange.accept(listselect.get(), nv.equals(partName))));// TODO

		rootGroup.getChildren().addAll(linev, linev2, facev);
		return true;
	}

	public void clearView() {
		rootGroup.getChildren().clear();
	}
}
