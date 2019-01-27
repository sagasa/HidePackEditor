package helper;

import javafx.geometry.Point3D;

public class Quaternion {
	private double x;
	private double y;
	private double z;
	private double w;

	public Quaternion() {

	}

	public AngleAxis toAngleAxis() {
	//	   if (w > 1) q1.normalise(); // if w>1 acos and sqrt will produce errors, this cant happen if quaternion is normalised
		   double angle = 2 * Math.acos(w);
		   double ax;
		   double ay;
		   double az;

		   double s = Math.sqrt(1-w*w); // assuming quaternion normalised then w is less than 1, so term always positive.
		   if (s < 0.001) { // test to avoid divide by zero, s is always positive due to sqrt
		     // if s close to zero then direction of axis not important
		     ax = x; // if it is important that axis is normalised then replace with x=1; y=z=0;
		     ay = y;
		     az = z;
		   } else {
		     ax = x / s; // normalise axis
		     ay = y / s;
		     az = z / s;
		   }
		return new AngleAxis(new Point3D(ax, ay, az), angle);
	}

	public static class AngleAxis {
		public AngleAxis(Point3D axis, double angle) {
			Axis = axis;
			Angle = angle;
		}

		public Point3D Axis;
		public double Angle;
	}
}
