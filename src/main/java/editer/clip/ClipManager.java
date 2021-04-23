package editer.clip;

import java.util.List;

import org.apache.logging.log4j.core.util.ReflectionUtil;

import helper.EditHelper;
import types.base.DataBase;
import types.base.DataPath;

public class ClipManager {

	DataBase clipData;
	Class<?> scope;
	List<DataPath> pathList;


	public ClipManager() {

	}


	public void add(DataBase data, DataPath path) {
		// 代入不能ならエラー
		if (clipData != null && !clipData.getClass().equals(data.getClass())) {
			System.err.println("Fuck cant add other database");
			return;
		}
		if (clipData == null) {
			clipData = ReflectionUtil.instantiate(data.getClass());
		}
		EditHelper.getValueEntry(clipData, path);

		EditHelper.getType(data.getClass(), path);
	}
}
