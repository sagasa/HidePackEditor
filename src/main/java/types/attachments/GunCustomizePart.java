package types.attachments;

import java.util.ArrayList;
import java.util.List;

import types.items.ItemData;

public class GunCustomizePart extends ItemData {
	/** アタッチメントの部位 */
	public String TYPE = "default";

	public List<ValueChange> change = new ArrayList<>();

}
