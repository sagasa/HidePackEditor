package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import types.model.ModelInfo;

public class HideModel {
	// エディタサイドのみ
	transient public float[] vertArray;
	transient public float[] texArray;
	transient public Map<String, int[]> modelParts;

	// 共通
	public String texture;
	public Bone rootBone = new Bone();

	public HideModel(float[] vert, float[] tex, Map<String, int[]> faces) {
		vertArray = vert;
		texArray = tex;
		modelParts = faces;
	}

	private static final ScriptEngineManager EngineManager = new ScriptEngineManager();
	protected ScriptEngine scriptEngine = EngineManager.getEngineByName("JavaScript");

	private CompiledScript RenderScript;

	protected void scriptInit(String script) throws ScriptException {
		/*
		 * scriptEngine.put("Body", Body); scriptEngine.put("Magazine", Magazine);
		 * scriptEngine.put("Barrel", Barrel); scriptEngine.put("Leaver", Leaver);
		 * scriptEngine.put("reload", 0f); scriptEngine.put("shoot", 0f);
		 * scriptEngine.put("eqip", 0f); //
		 */
		Compilable compilingEngine = (Compilable) scriptEngine;
		RenderScript = compilingEngine.compile(script);
	}

	/** モデルを描画 */
	public void render(double x, double y, double z, float yaw, float pitch, float scale) {
		// スクリプト実行
		try {
			RenderScript.eval();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		// GlStateManager.enableCull();
	}
}
