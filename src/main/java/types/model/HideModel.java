package types.model;

import editer.DataEntityInterface;
import editer.HidePack;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import resources.Model;
import types.base.DataBase;

/** Modelはパックから名前で参照する */
public class HideModel extends DataBase implements DataEntityInterface {

	public static class Vec3f extends DataBase {
		public float X = 0, Y = 0, Z = 0;
	}

	@Override
	public void init() {
		super.init();
		// 名称が変わったら参照も変える
		getProperty("modelName").addListener((v, ov, nv) -> modelProperty.set(HidePack.getModel((String) nv)));
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
		rootBone = new Bone(m.modelParts.keySet());
	}

	@Override
	public String getDisplayName() {
		return name;
	}
}
