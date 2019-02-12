package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import editer.node.ModelView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import types.base.DataBase;

public class Bone extends DataBase implements IBone, Serializable {

	private static final long serialVersionUID = 1512250564942897392L;
	transient public static final List<String> autoFill;
	static {
		autoFill = Arrays.asList("bone.setPivot(,,);", "bone.setRotate(,);", "bone.setTranslate(,,);",
				"bone.setScale(,,);");
	}
	transient private static final ScriptEngineManager EngineManager = new ScriptEngineManager();
	transient protected ScriptEngine scriptEngine = EngineManager.getEngineByName("JavaScript");
	transient protected CompiledScript animation;
	transient private Map<String, Supplier<Float>> Propertis = new HashMap<>();

	public String name = "default";

	public List<Bone> children = new ArrayList<>();
	public List<String> models = new ArrayList<>();

	public String script = "";

	public IRenderProperty rootProperty;

	public Bone() {
		scriptEngine.put("bone", this);
	}

	public Bone(Set<String> models) {
		this();
		this.models.addAll(models);
	}

	@Override
	public void loadIdentity() {
		setPivot(0, 0, 0);
		setRotate(0, 0);
		setScale(1, 1, 1);
		setTranslate(0, 0, 0);
	}

	public void setScript(String script) {
		try {
			animation = ((Compilable) scriptEngine).compile(script);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		this.script = script;
	}

	@Override
	public void setPivot(float x, float y, float z) {
		yaw.setPivotX(x);
		yaw.setPivotY(y);
		yaw.setPivotZ(z);
		pitch.setPivotX(x);
		pitch.setPivotY(y);
		pitch.setPivotZ(z);
		scale.setPivotX(x);
		scale.setPivotY(y);
		scale.setPivotZ(z);
	}

	@Override
	public void setRotate(float yaw, float pitch) {
		this.yaw.setAngle(yaw);
		this.pitch.setAngle(pitch);
	}

	@Override
	public void setTranslate(float x, float y, float z) {
		translate.setX(x);
		translate.setY(y);
		translate.setZ(z);
	}

	@Override
	public void setScale(float x, float y, float z) {
		scale.setX(x);
		scale.setY(y);
		scale.setZ(z);
	}

	@Override
	public void update() {
		try {
			animation.eval();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

	// エディタサイドでの描画用
	transient private Rotate yaw = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
	transient private Rotate pitch = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
	transient private Translate translate = new Translate(0, 0, 0);
	transient private Scale scale = new Scale(1, 1, 1);

	public void init(List<Transform> move, ModelView modelView, IRenderProperty property) {
		this.rootProperty = property;
		loadIdentity();
		setScript(script);
		scriptEngine.put("model", modelView.model);
		update();

		move.add(yaw);
		move.add(pitch);
		move.add(translate);
		move.add(scale);
		for (String name : models) {
			modelView.addPart(name, move.toArray(new Transform[move.size()]));
		}
		for (Bone bone : children)
			bone.init(new ArrayList<>(move), modelView, this);
	}

	@Override
	public float getRenderPropery(String name) {
		if (Propertis.containsKey(name))
			return Propertis.get(name).get();
		return rootProperty.getRenderPropery(name);
	}
}