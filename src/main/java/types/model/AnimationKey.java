package types.model;

import java.util.List;

import types.base.DataBase;
import types.model.Bone.ModelTransforms;

/** アニメーション用 */
public class AnimationKey extends DataBase implements Comparable<AnimationKey> {

	public float key = 0;

	/** GL命令でアニメーションを適応する */
	public static void applyAnimation(List<AnimationKey> list, float value, ModelTransforms transforms) {

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
