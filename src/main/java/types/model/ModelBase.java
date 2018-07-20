package types.model;

/** モデルの原型 */
public abstract class ModelBase {
	String Texture;
	
	public abstract void doRedner();

	public class Vertex {
		float U;
		float V;

		float X;
		float Y;
		float Z;
	}

	public class Surface {
		Vertex[] Vertex;
	}

	public class Part {
		Surface[] Surface;

		float X;
		float Y;
		float Z;

		void setPoint(float x, float y,float z) {
			X = x;
			Y = y;
			Z = z;
		}

		void setRotate(float yaw, float pitch) {

		}
	}

}
