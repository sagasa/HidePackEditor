package model;

import org.lwjgl.opengl.GL11;

/** 複数のModelPartをまとめたグループ */
public class ModelGroup {

	/** 回転の基準 */
	public float rotatepointX = 0;
	/** 回転の基準 */
	public float rotatepointY = 0;
	/** 回転の基準 */
	public float rotatepointZ = 0;
	/** 回転の数値 */
	public float rotateYaw = 0;
	/** 回転の数値 */
	public float rotatePitch = 0;
	/** 移動の数値 */
	public float translateX = 0;
	/** 移動の数値 */
	public float translateY = 0;
	/** 移動の数値 */
	public float translateZ = 0;
	/** 縮尺の数値 */
	public float scaleX = 1;
	/** 縮尺の数値 */
	public float scaleY = 1;
	/** 縮尺の数値 */
	public float scaleZ = 1;
	/** 表示の可否 */
	public boolean Visibility = true;

	public void rotatePoint(float x, float y, float z) {
		rotatepointX = x;
		rotatepointY = y;
		rotatepointZ = z;
	}

	public void rotate(float yaw, float pitch) {
		rotateYaw = yaw;
		rotatePitch = pitch;
	}

	public void translate(float x, float y, float z) {
		translateX = x;
		translateY = y;
		translateZ = z;
	}

	public void scale(float x, float y, float z) {
		scaleX = x;
		scaleY = y;
		scaleZ = z;
	}



	/**位置を調整してグループを描画する*/
	public void render() {
		GL11.glPushMatrix();
		GL11.glTranslatef(translateX, translateY, translateZ);

		GL11.glTranslatef(rotatepointX, rotatepointY, rotatepointZ);
		GL11.glRotatef(rotateYaw, 0, 1, 0);
		GL11.glRotatef(rotatePitch, 1, 0, 0);
		GL11.glTranslatef(-rotatepointX, -rotatepointY, -rotatepointZ);



		GL11.glPopMatrix();
	}
}
