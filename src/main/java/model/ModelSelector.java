package model;

import java.util.HashMap;
import java.util.Map;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import types.base.DataBase;

/** 条件によって表示モデルを変更するためのクラス */
public class ModelSelector extends DataBase {
	/** 対応するカスタムスロット名 */
	public String partName = "";
	/** 指定がない場合のモデル 非表示は空String */
	public String defaultModel = "default";
	/** カスタムスロット内のアイテム名とモデルパーツ名のMap */
	public Map<String, String> item_model = new HashMap<>();

	transient public StringProperty nowViewModel = new SimpleStringProperty("");

	public ModelSelector() {
	}

	public ModelSelector(String model) {
		defaultModel = model;
		nowViewModel.set(model);
	}
}