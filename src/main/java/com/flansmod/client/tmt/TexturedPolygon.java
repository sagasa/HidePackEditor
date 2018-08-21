package com.flansmod.client.tmt;

public class TexturedPolygon {
	public TexturedPolygon(PositionTextureVertex[] apositionTexturevertex){
		this.vertexPositions = apositionTexturevertex;
	}

	public PositionTextureVertex[] vertexPositions;

	public void translate(float x,float y,float z){
		for (PositionTextureVertex ver : vertexPositions) {
			ver.vector3D.add(x, y, z);
		}
	}
}
