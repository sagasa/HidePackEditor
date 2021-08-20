package types.model;

import java.util.HashMap;
import java.util.Map;

import javafx.collections.ObservableList;
import old.WeightEntry;
import resources.Model;
import types.base.DataBase;
import types.base.NamedData;
import types.value.Operator;

/** Modelはパックから名前で参照する */
public class HideModel extends NamedData {
	// 出力時のファイル名
	transient public ObservableList<String> empty;
	transient public ObservableList<String> mesh;

	public static final DataEntry<String> Name = of("sample");

	public static final DataEntry<String> Model = of("sample");

	public static final DataEntry<String> HandPos = of("");
	public static final DataEntry<String> SightPos = of("");
	public static final DataEntry<String> BullelPos = of("");

	@SuppressWarnings("unchecked")
	public static final DataEntry<WeightEntry<String>[]> ReloadAnimation = of(new WeightEntry[0]);
	@SuppressWarnings("unchecked")
	public static final DataEntry<WeightEntry<String>[]> ShootAnimation = of(new WeightEntry[0]);

	/** tag - model */
	public Map<String, String> tag_model = new HashMap<>();

	public static class AnimationEntry extends DataBase {
		/** 利用するAnimationの名前 String */
		public static final DataEntry<String> Name = of("");
		/** 出現率 Integer */
		public static final DataEntry<Integer> Weight = of(1);
	}

	public HideModel() {

	}

	public HideModel(Model model) {
		setModel(model);
	}

	public HideModel setModel(Model model) {
		put(Name, Operator.SET, model.DisplayName);
		put(Model, Operator.SET, model.DisplayName);
		return this;
	}

	@Override
	public DataEntry<String> displayName() {
		return Name;
	}

	@Override
	public DataEntry<String> systemName() {
		return Name;
	}

}
