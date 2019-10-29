package types.model;

import java.util.Collections;
import java.util.List;

import types.base.DataBase;
import types.model.Bone.ModelTransforms;

/**アニメーション用*/
public class AnimationKey extends DataBase implements Comparable<AnimationKey> {
	public float Key = 0;

	public float translateX = 0, translateY = 0, translateZ = 0;
	public float scaleX = 0, scaleY = 0, scaleZ = 0;
	public float rotateX = 0, rotateY = 0, rotateZ = 0;

	/**GL命令でアニメーションを適応する*/
	public static void applyAnimation(List<AnimationKey> list, float value,ModelTransforms transforms) {
		if (list.size() < 1)
			return;
		//降順でソート
		Collections.sort(list);//TODO 最適化!!
		/**keyの値が低いほう*/
		AnimationKey keyStart = null;
		/**keyの値が高いほう*/
		AnimationKey keyEnd = null;
		for (AnimationKey animationKey : list) {
			if (value < animationKey.Key) {
				keyEnd = animationKey;
			}
			keyStart = animationKey;
		}
		if (keyEnd == null)
			keyEnd = keyStart;
		/**0除算防止*/
		float slide = keyEnd.Key == keyStart.Key ? 0 : (value - keyStart.Key) / (keyEnd.Key - keyStart.Key);
		transforms.translate.setX(calcScale(keyStart.translateX, keyEnd.translateX, slide));
		transforms.translate.setY(calcScale(keyStart.translateY, keyEnd.translateY, slide));
		transforms.translate.setZ(calcScale(keyStart.translateZ, keyEnd.translateZ, slide));
		transforms.rotateX.setAngle(calcScale(keyStart.rotateX, keyEnd.rotateX, slide));
		transforms.rotateY.setAngle(calcScale(keyStart.rotateY, keyEnd.rotateY, slide));
		transforms.rotateZ.setAngle(calcScale(keyStart.rotateZ, keyEnd.rotateZ, slide));
		transforms.scale.setX(calcScale(keyStart.scaleX, keyEnd.scaleX, slide));
		transforms.scale.setY(calcScale(keyStart.scaleY, keyEnd.scaleY, slide));
		transforms.scale.setZ(calcScale(keyStart.scaleZ, keyEnd.scaleZ, slide));
	}

	public static float calcScale(float lowerBnd, float upperBnd, float slide) {
		if (slide < 0.0D)
			return lowerBnd;
		return slide > 1.0D ? upperBnd : lowerBnd + (upperBnd - lowerBnd) * slide;
	}

	@Override
	public int compareTo(AnimationKey o) {
		return Float.compare(this.Key, o.Key);
	}

}
