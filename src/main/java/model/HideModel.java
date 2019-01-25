package model;

import java.util.Map;

public class HideModel {
	public String texture;
	public float[] vertArray;
	public float[] texArray;
	public Map<String, ModelPart> modelParts;

	public HideModel(float[] vert,float[] tex,Map<String, ModelPart> model) {
		vertArray = vert;
		texArray = tex;
		modelParts = model;
	}
}
