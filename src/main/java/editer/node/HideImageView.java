package editer.node;

import editer.HidePack;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.WeakChangeListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import resources.HideImage;

/**自動更新されるImageView*/
public class HideImageView extends ImageView {
	private ObservableList<HideImage> List;
	private ObservableValue<String> Name;

	private ListChangeListener<HideImage> listListener = change -> reflesh();
	private ChangeListener<String> nameListener = (value, oldValue, newValue) -> reflesh();

	public HideImageView(ObservableList<HideImage> list, ObservableValue<String> name) {
		List = list;
		Name = name;
		List.addListener(new WeakListChangeListener<>(listListener));
		Name.addListener(new WeakChangeListener<>(nameListener));
		reflesh();
	}

	public void reflesh() {
		HideImage image = HidePack.getDataByName(List, Name.getValue());
		setImage(image == null ? HidePack.NullImage : SwingFXUtils.toFXImage(image.Image, null));
	}
}
