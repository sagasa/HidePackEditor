package model;

import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptException;

import org.lwjgl.opengl.GL11;

public class ModelGun extends ModelBase {

	public ModelPart ModelBody;
	public ModelPart ModelLeaver;
	public ModelPart ModelDefaultBarrel;
	public ModelPart ModelDefaultScope;
	public ModelPart ModelDefaultMagazine;

	public ModelGroup Body;
	public ModelGroup Leaver;
	public ModelGroup Barrel;
	public ModelGroup Magazine;

	private static final String BodyName = "Body";
	private static final String MagazineName = "Magazine";
	private static final String BarrelName = "Barrel";
	private static final String LeaverName = "Leaver";

	private CompiledScript RenderScript;

	public ModelGun(Map<String,ModelPart> model) {
		if(model.containsKey(BodyName)){
			ModelBody = (DisplayPart) model.get(BodyName);
		}else if(model.containsKey(MagazineName)){
			ModelDefaultMagazine = (DisplayPart) model.get(MagazineName);
		}else if(model.containsKey(BarrelName)){
			ModelDefaultBarrel = (DisplayPart) model.get(BarrelName);
		}else if(model.containsKey(LeaverName)){
			ModelLeaver = (DisplayPart) model.get(LeaverName);
		}
	}

	/**
	 * モデル内容 本体 マガジン スライド バレル 弾
	 */

	@Override
	public void render(double x, double y, double z, float yaw, float pitch, float scale) {

	}

	@Override
	protected void scriptInit(String script) throws ScriptException {
		scriptEngine.put("Body", Body);
		scriptEngine.put("Magazine", Magazine);
		scriptEngine.put("Barrel", Barrel);
		scriptEngine.put("Leaver", Leaver);
		scriptEngine.put("reload", 0f);
		scriptEngine.put("shoot", 0f);
		scriptEngine.put("eqip", 0f);
		Compilable compilingEngine = (Compilable) scriptEngine;
		RenderScript = compilingEngine.compile(script);
	}
}
