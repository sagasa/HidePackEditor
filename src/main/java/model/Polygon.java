package model;

/** 3角と4角しか描画できない */
public class Polygon {
	public Polygon() {

	}

	public Polygon(VertexUV[] vert) {
		Vertex = vert;
	}

	public VertexUV[] Vertex;
}
