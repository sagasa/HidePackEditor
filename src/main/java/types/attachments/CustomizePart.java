package types.attachments;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomizePart {
	/** アタッチメントの部位 */
	public String TYPE = "default";
	public List<ValueChange> CHANGE_LIST = new ArrayList<>();
}
