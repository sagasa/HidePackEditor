package types.model;

import java.util.Collections;
import java.util.List;

import types.Info;
import types.base.DataBase;
import types.model.Bone.ModelTransforms;
import types.model.HideModel.Vec3f;

/** アニメーション用 */
public class AnimationKey extends DataBase implements Comparable<AnimationKey> {
	@Info(Min=0f,Max=1f,Scale="0.05")
	public float key = 0;

	public Vec3f translate = new Vec3f();
	public Vec3f scale = new Vec3f();
	public Vec3f rotate = new Vec3f();

	/** GL命令でアニメーションを適応する */
	public static void applyAnimation(List<AnimationKey> list, float value, ModelTransforms transforms) {
		if (list.size() < 1)
			return;
		// 降順でソート
		Collections.sort(list);// TODO 最適化!!
		/** keyの値が低いほう */
		AnimationKey keyStart = null;
		/** keyの値が高いほう */
		AnimationKey keyEnd = null;
		for (AnimationKey animationKey : list) {
			if (value < animationKey.key) {
				keyEnd = animationKey;
			}
			keyStart = animationKey;
		}
		if (keyEnd == null)
			keyEnd = keyStart;
		/** 0除算防止 */
		float slide = keyEnd.key == keyStart.key ? 0 : (value - keyStart.key) / (keyEnd.key - keyStart.key);
		transforms.translate.setX(calcScale(keyStart.translate.X, keyEnd.translate.X, slide));
		transforms.translate.setY(calcScale(keyStart.translate.Y, keyEnd.translate.Y, slide));
		transforms.translate.setZ(calcScale(keyStart.translate.Z, keyEnd.translate.Z, slide));
		transforms.rotateX.setAngle(calcScale(keyStart.rotate.X, keyEnd.rotate.X, slide));
		transforms.rotateY.setAngle(calcScale(keyStart.rotate.Y, keyEnd.rotate.Y, slide));
		transforms.rotateZ.setAngle(calcScale(keyStart.rotate.Z, keyEnd.rotate.Z, slide));
		transforms.scale.setX(calcScale(keyStart.scale.X, keyEnd.scale.X, slide));
		transforms.scale.setY(calcScale(keyStart.scale.Y, keyEnd.scale.Y, slide));
		transforms.scale.setZ(calcScale(keyStart.scale.Z, keyEnd.scale.Z, slide));
	}

	public static float calcScale(float lowerBnd, float upperBnd, float slide) {
		if (slide < 0.0D)
			return lowerBnd;
		return slide > 1.0D ? upperBnd : lowerBnd + (upperBnd - lowerBnd) * slide;
	}

	@Override
	public int compareTo(AnimationKey o) {
		return Float.compare(this.key, o.key);
	}

}
