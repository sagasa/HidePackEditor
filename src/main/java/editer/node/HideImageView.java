package editer.node;

import editer.HidePack;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableObjectValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import resources.HideImage;
import types.base.DataPath;
import types.editor.DataView;

/** 自動更新されるImageView */
public class HideImageView extends ImageView {
	private ObservableList<HideImage> List;
	private ObservableObjectValue<String> valueProp = new SimpleObjectProperty<>();

	private ListChangeListener<HideImage> listListener = change -> {
		HideImage img = HidePack.getDataByName(List, valueProp.get());
		setImage(img == null ? HidePack.NullImage : SwingFXUtils.toFXImage(img.Image, null));
	};

	public HideImageView(DataView<?> type, DataPath dataPath, ObservableList<HideImage> list) {
		List = list;
		valueProp = type.get(dataPath);
		List.addListener(new WeakListChangeListener<>(listListener));
		valueProp.addListener((value, oldValue, newValue) -> {
			HideImage img = HidePack.getDataByName(List, newValue);
			setImage(img == null ? HidePack.NullImage : SwingFXUtils.toFXImage(img.Image, null));
		});

	}
}
