package old;

import java.util.List;
import java.util.Map;

import types.model.AnimationType;

public interface IRenderProperty {
	abstract public Map<AnimationType, Float> getRenderPropery();

	abstract public Map<String, List<String>> getPartPropery();
}
