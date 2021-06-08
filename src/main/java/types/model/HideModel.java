package types.model;

import sagasa.gltf.GltfLoader.GLBInfo;
import types.base.NamedData;

/** Modelはパックから名前で参照する */
public class HideModel extends NamedData {
	// 出力時のファイル名
	transient public String name = "";

	// 共通
	public String modelName;

	public String handPos;

	public String sightPos;

	public float scale;

	public HideModel() {

	}

	public HideModel(GLBInfo info) {

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
