package editer.clip;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.core.util.ReflectionUtil;

import helper.EditHelper;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import types.base.DataBase;
import types.base.DataBase.DataEntry;
import types.base.DataBase.ValueEntry;
import types.base.DataPath;

public class ClipManager {

	DataBase clipData;
	public final ObjectProperty<Class<?>> scope = new SimpleObjectProperty<>();
	DataPath scopePath;
	List<DataPath> pathList = new ArrayList<>();

	public ClipManager() {

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void add(DataBase data, DataPath path) {
		// 代入不能ならエラー
		if (clipData != null && !clipData.getClass().equals(data.getClass())) {
			System.err.println("Fuck cant add other database");
			return;
		}
		if (clipData == null) {
			clipData = ReflectionUtil.instantiate(data.getClass());
		}
		// 子があるなら再起追加
		if (DataBase.class.isAssignableFrom(EditHelper.getType(data.getClass(), path))) {
			for (DataEntry<?> entry : EditHelper.getDataEntries(data.getClass(), path))
				add(data, path.append(entry));
			return;
		}
		ValueEntry baseValue = EditHelper.getValueEntry(data, path);
		if (baseValue != null) {
			pathList.add(path);
			EditHelper.putValueEntry(clipData, path);
			ValueEntry clipValue = EditHelper.getValueEntry(clipData, path);

			clipValue.setOperator(baseValue.getOperator());
			clipValue.setValue(baseValue.getValue());
			updateScope();
		}

	}

	public void remove(DataPath path) {
		if (clipData == null)
			return;
		if (pathList.remove(path))
			EditHelper.removeValueEntry(clipData, path);
		if (pathList.isEmpty()) {
			clipData = null;
		}
		updateScope();
	}

	public void clear() {
		clipData = null;
		pathList.clear();
		updateScope();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void paste(DataBase to, DataPath target) {
		if (clipData == null)
			return;
		if (EditHelper.getType(to.getClass(), target).equals(scope)) {
			for (DataPath path : pathList) {
				DataPath toPath = target.append(path.sub(scopePath));
				if (EditHelper.getValueEntry(to, toPath) != null) {
					continue;
				}
				EditHelper.putValueEntry(to, toPath);
				ValueEntry clipValue = EditHelper.getValueEntry(clipData, path);
				ValueEntry targetValue = EditHelper.getValueEntry(to, toPath);
				System.out.println("paste " + path + " -> " + toPath);
				targetValue.setOperator(clipValue.getOperator());
				targetValue.setValue(clipValue.getValue());
			}
		}
	}

	private void updateScope() {
		// 空ならnull
		if (clipData == null || pathList.size() == 0) {
			scope.set(null);
			scopePath = null;
			return;
		}
		// １つなら自明でスコープ
		if (pathList.size() == 1) {
			scopePath = pathList.get(0);
			scope.set(EditHelper.getType(clipData.getClass(), scopePath));
			return;
		}
		DataPath first = null;
		int depth = Integer.MAX_VALUE;
		// 複数なら最も深度が深い一致を
		for (DataPath path : pathList) {
			if (first == null) {
				first = path;
			} else {
				depth = Math.min(and(first, path), depth);
			}
		}
		scopePath = first.limit(depth);
		scope.set(EditHelper.getType(clipData.getClass(), scopePath));
	}

	private static int and(DataPath a, DataPath b) {
		if (a.fastName.equals(b.fastName)) {
			return and(a.nextPath, b.nextPath) + 1;
		}
		return 0;
	}
}
