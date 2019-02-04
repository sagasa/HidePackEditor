package model;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/** モデルの原型 */
public abstract class ModelBase {
	String Texture;

	public float[] vertCoord;
	public float[] texCoord;

	float ScaleX = 1;
	float ScaleY = 1;
	float ScaleZ = 1;

	/**スクリプトのイニシャライズ
	 * @throws ScriptException */
	abstract protected void scriptInit(String name) throws ScriptException;

	/**最終的な描画処理*/
	abstract public void render(double x,double y,double z,float yaw,float pitch,float scale);
}
