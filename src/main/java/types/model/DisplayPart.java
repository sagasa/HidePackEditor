package types.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayPart {
	public Polygon[] Polygon;

	/** 回転の基準 */
	public float X;
	/** 回転の基準 */
	public float Y;
	/** 回転の基準 */
	public float Z;

	public int displayList;
	public boolean compiled;

	public DisplayPart() {
		Polygon = new Polygon[0];
	}

	public DisplayPart(Polygon... poly) {
		this.Polygon = poly;
	}

	/**ポリゴンを追加*/
	public void addPolygon(Polygon... poly){
		List<Polygon> list = new ArrayList<Polygon>(Arrays.asList(Polygon));
		list.addAll(Arrays.asList(poly));
		Polygon = list.toArray(new Polygon[list.size()]);
	}

	/**回転の基準を*/
	void setPoint(float x, float y, float z) {
		X = x;
		Y = y;
		Z = z;
	}

	void setRotate(float yaw, float pitch) {

	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[polyCount = "+Polygon.length+",");
		for(Polygon poly:Polygon){
			str.append(poly.toString());
		}
		str.append("]");
		return super.toString()+str.toString();
	}
}