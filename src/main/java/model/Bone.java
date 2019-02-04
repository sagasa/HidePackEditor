package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

public class Bone implements IBone, Serializable {

	private static final long serialVersionUID = 1512250564942897392L;
	transient private static final ScriptEngineManager EngineManager = new ScriptEngineManager();
	transient protected ScriptEngine scriptEngine = EngineManager.getEngineByName("JavaScript");
	transient protected CompiledScript animation;

	public String name = "default";

	public List<Bone> children = new ArrayList<>();
	public List<String> models = new ArrayList<>();

	public String script = null;

	public HideModel model;

	public Bone() {
		scriptEngine.put("bone", this);
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

	public void init(List<Transform> move, HideModel model) {
		this.model = model;
		scriptEngine.put("model", model);

		move.add(yaw);
		move.add(pitch);
		move.add(translate);
		move.add(scale);
		for(String name:models) {
			model.modelParts.get(name);
		}
		for (Bone bone : children)
			bone.init(new ArrayList<>(move), model);
	}
}