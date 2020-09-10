package types.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import resources.Model;
import types.base.NamedData;

/** Modelはパックから名前で参照する */
public class HideModel extends NamedData {

	public static class Vec3f {
		public float X = 0, Y = 0, Z = 0;
	}

	public ObjectProperty<Model> getModel() {
		return modelProperty;
	}

	// エディタサイドのみ
	transient private ObjectProperty<Model> modelProperty = new SimpleObjectProperty<>();
	// 出力時のファイル名
	transient public String name = "";

	// 共通
	public String modelName;
	public String textureName;
	public Bone rootBone;

	public Vec3f offsetFirstPerson = new Vec3f();

	public float scaleX;// TODO

	public HideModel() {

	}

	public HideModel(Model m) {
		modelProperty.set(m);
		// rootBone = new Bone(m.modelParts.keySet());
	}

	@Override
	public DataEntry<String> displayName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public DataEntry<String> systemName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
