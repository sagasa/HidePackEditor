package types.model;

public class VertexUV {
	public VertexUV(float x, float y, float z, float u, float v) {
		X = x;
		Y = y;
		Z = z;
		U = u;
		V = v;
	}

	public VertexUV(float[] pos, float u, float v) {
		X = pos[0];
		Y = pos[1];
		Z = pos[2];
		U = u;
		V = v;
	}

	public float U;
	public float V;

	public float X;
	public float Y;
	public float Z;

	@Override
	public String toString() {
		return super.toString()+"[X = "+X+",Y = "+Y+",Z = "+Z+",U = "+U+",V = "+V+"]";
	}
}