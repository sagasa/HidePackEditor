package types.model;

import java.util.List;
import java.util.Map;

public interface IRenderProperty {
	abstract public Map<AnimationType, Float> getRenderPropery();

	abstract public Map<String, List<String>> getPartPropery();
}
