package helper;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import types.base.DataBase;

public class ClipBoard {
	static class ClipObject {
		private ObservableMap<String, ClipBoard> data = FXCollections.observableHashMap();
		private Class<? extends DataBase> clazz = null;

		/**同じクラスならデータを上書き追加 */
		public void addClip(DataBase obj, List<String> path) {
			if (obj.getClass().equals(clazz)) {
				path.forEach(str -> {

				});
			}
		}
	}

	private ObservableMap<String, ClipObject> clipMap = FXCollections.observableHashMap();
	private static final String DEFAULT = "default";

	/**保存する型をチェック*/
	public boolean checkClass(DataBase data) {
		return false;
	//	return clazz.equals(data.getClass());
	}

	/**クリップに追加*/
	public void addclip(DataBase data, List<String> path) {
		ClipObject clip = clipMap.get(DEFAULT);
	//	path.forEach(str -> clip.data.put(str, data.getValue(str)));
	}
}