package types.model;

import javax.script.ScriptEngineManager;

/** モデルの原型 */
public abstract class ModelBase {
	String Texture;
	protected static final ScriptEngineManager ScriptManager = new ScriptEngineManager();
	public abstract void doRedner();


}
