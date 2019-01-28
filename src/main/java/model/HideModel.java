package model;

import java.util.List;

public class HideModel {
	public String texture;
	public float[] vertArray;
	public float[] texArray;
	public List<ModelPart> modelParts;

	public HideModel(float[] vert,float[] tex,List<ModelPart> res) {
		vertArray = vert;
		texArray = tex;
		modelParts = res;
	}
}
