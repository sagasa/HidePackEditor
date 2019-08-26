package editer.node;

import editer.HidePack;
import editer.node.EditPanels.EditType;
import helper.DataPath;
import helper.EditHelper;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import resources.HideImage;
import types.base.IEditData;

/** 自動更新されるImageView */
public class HideImageView extends ImageView implements ChangeListener<IEditData> {
	private ObservableList<HideImage> List;
	private final DataPath Path;
	private EditType Type;

	private IEditData now;

	private ListChangeListener<HideImage> listListener = change -> reflesh(null);
	private ChangeListener<String> nameListener = (value, oldValue, newValue) -> reflesh(newValue);

	public HideImageView(EditType type, DataPath dataPath, ObservableList<HideImage> list) {
		List = list;
		Type = type;
		Path = dataPath;
		List.addListener(new WeakListChangeListener<>(listListener));
	}

	public void reflesh(String name) {
		if (now == null)
			return;
		HideImage image;
		if (name != null)
			image = HidePack.getDataByName(List, name);
		else
			image = HidePack.getDataByName(List, (String) EditHelper.getData(now, Path));
		setImage(image == null ? HidePack.NullImage : SwingFXUtils.toFXImage(image.Image, null));
	}

	@SuppressWarnings("unchecked")
	@Override
	public void changed(ObservableValue<? extends IEditData> observable, IEditData oldValue, IEditData newValue) {
		if (oldValue != null && Type.isType(oldValue)) {
			((Property<String>) EditHelper.getProperty(oldValue, Path)).removeListener(nameListener);
		}
		if (newValue != null && Type.isType(newValue)) {
			((Property<String>) EditHelper.getProperty(newValue, Path)).addListener(nameListener);
			now = newValue;
			reflesh(null);
		}
	}
}
