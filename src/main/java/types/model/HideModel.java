package types.model;

import java.util.HashMap;
import java.util.Map;

import sagasa.gltf.GltfLoader.GLBInfo;
import types.base.NamedData;

/** Modelはパックから名前で参照する */
public class HideModel extends NamedData {
	// 出力時のファイル名
	transient public String name = "";

	// 共通
	public String modelName;

	public DataEntry<String> handPos;
	public String sightPos;
	public String bullelPos;

	public String reloadAnim;
	public String shootAnim;

	public String[] reload;
	public String[] shoot;

	/** tag - model */
	public Map<String, String> tag_model = new HashMap<>();

	public float scale;

	public static class A{

	}

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
