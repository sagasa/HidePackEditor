package types.model;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import types.base.DataBase;

/** モデルのアニメーション用 */
public class Bone extends DataBase {
	/** プロパティの取得元 このプロパティが優先される */
	transient private IRenderProperty Propertis = null;

	public List<Bone> children = new ArrayList<>();
	public List<ModelSelector> models = new ArrayList<>();

	public EnumMap<AnimationType, List<AnimationKey>> animation = new EnumMap<>(AnimationType.class);

	HideModel rootModel;

	// Gson変換オプション
	static {
		DataBase.addGsonOption(Bone.class, new JsonSerializer<Bone>() {
			@Override
			public JsonElement serialize(Bone src, Type typeOfSrc, JsonSerializationContext context) {
				return null;
			}
		});
		DataBase.addGsonOption(Bone.class, new TypeAdapter<Bone>() {

			@Override
			public void write(JsonWriter out, Bone value) throws IOException {

			}

			@Override
			public Bone read(JsonReader in) throws IOException {
				return null;
			}

		});
	}

	public Bone() {
		for (AnimationType type : AnimationType.values()) {
			animation.put(type, new ArrayList<>());
		}

	}

	public Bone(Set<String> keySet) {
		keySet.forEach(name -> this.models.add(new ModelSelector(name)));
	}

	void init(HideModel model) {
		rootModel = model;
		children.forEach(c -> c.init(model));
	}

	// エディタサイドでの描画用
	transient public Rotate rotateX = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
	transient public Rotate rotateY = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
	transient public Rotate rotateZ = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS);
	transient public Translate translate = new Translate(0, 0, 0);
	transient public Scale scale = new Scale(1, 1, 1);
	transient public BooleanProperty visible = new SimpleBooleanProperty(false);
	/** 付与されているトランスフォーム */
	transient public List<Transform> moves = new ArrayList<>();

	public void init(List<Transform> move, IRenderProperty property) {
		this.Propertis = property;
		move.add(translate);
		move.add(rotateX);
		move.add(rotateY);
		move.add(rotateZ);
		move.add(scale);
		moves = move;
		for (Bone bone : children)
			bone.init(new ArrayList<>(move), property);
	}

	public void render(IRenderProperty property) {
		Map<AnimationType, Float> renderProp = Propertis != null && Propertis.getRenderPropery() != null
				? Propertis.getRenderPropery()
				: property.getRenderPropery();
		Map<String, List<String>> parts = Propertis != null && Propertis.getPartPropery() != null
				? Propertis.getPartPropery()
				: property.getPartPropery();
		for (AnimationType type : animation.keySet()) {
			AnimationKey.applyAnimation(animation.get(type), renderProp.get(type), this);
		}
	}
}