package types.model;

public class Polygon {
	public Polygon() {

	}

	public VertexUV[] Vertex;

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[vertexCount = "+Vertex.length+",");
		for(VertexUV vert:Vertex){
			str.append(vert.toString());
		}
		str.append("]");
		return super.toString()+str.toString();
	}
}
