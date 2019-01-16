package helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import types.base.DataBase;

public class ClipBoard {
	private ObservableMap<String, Object> clip = FXCollections.observableHashMap();
	private Class<? extends DataBase> clazz = null;

	/**保存する型をチェック*/
	public boolean checkClass(DataBase data) {
		return clazz.equals(data.getClass());
	}
	/**クリップに追加*/
	public void addclip(DataBase data, List<String> path) {
		path.forEach(str -> clip.put(str, data.getValue(str)));
	}
}
