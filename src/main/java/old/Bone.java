package old;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import types.base.DataBase;
import types.model.AnimationType;
import types.model.HideModel;
import types.model.ModelSelector;

/** モデルのアニメーション用 */
public class Bone extends DataBase {
	/** プロパティの取得元 このプロパティが優先される */
	transient private IRenderProperty Propertis = null;

	public List<Bone> children = new ArrayList<>();
	public List<ModelSelector> models = new ArrayList<>();

	public EnumMap<AnimationType, List<AnimationKey>> animation = new EnumMap<>(AnimationType.class);

	transient HideModel rootModel;

	/** Gson用コンストラクタ 何もしない */
	public Bone() {
		for (AnimationType type : AnimationType.values()) {
			if (!animation.containsKey(type))
				animation.put(type, new ArrayList<>());
			if (!transforms.containsKey(type))
				transforms.put(type, new ModelTransforms());
		}
	}

	public Bone(Set<String> keySet) {
		this();
		keySet.forEach(name -> this.models.add(new ModelSelector(name)));
	}

	void init(HideModel model) {
		rootModel = model;
		children.forEach(c -> c.init(model));
	}

	// エディタサイドでの描画用
	transient public Map<AnimationType, ModelTransforms> transforms = new EnumMap<>(AnimationType.class);
	transient public BooleanProperty visible = new SimpleBooleanProperty(false);
	/** 付与されているトランスフォーム */
	transient public List<Transform> moves = new ArrayList<>();

	public void init(List<Transform> move, IRenderProperty property) {
		this.Propertis = property;
		transforms.values().forEach(tr -> {
			tr.addAll(move);
		});
		moves = move;
		for (Bone bone : children)
			bone.init(new ArrayList<>(move), property);
	}

	/** アニメーションリストのトランスフォームを登録 */
	public void applyTransforms(IRenderProperty property) {
		Map<AnimationType, Float> renderProp = Propertis != null && Propertis.getRenderPropery() != null
				? Propertis.getRenderPropery()
				: property.getRenderPropery();
		Map<String, List<String>> parts = Propertis != null && Propertis.getPartPropery() != null
				? Propertis.getPartPropery()
				: property.getPartPropery();
		for (AnimationType type : animation.keySet()) {
			AnimationKey.applyAnimation(animation.get(type), renderProp.get(type), transforms.get(type));
		}
	}

	/** JavaFXのトランスフォーム */
	public static class ModelTransforms {
		public Rotate rotateX = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
		public Rotate rotateY = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
		public Rotate rotateZ = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS);
		public Translate translate = new Translate(0, 0, 0);
		public Scale scale = new Scale(1, 1, 1);

		public void addAll(List<Transform> move) {
			move.add(translate);
			move.add(rotateX);
			move.add(rotateY);
			move.add(rotateZ);
			move.add(scale);
		}
	}
}