package helper;

import javafx.geometry.Point3D;

public class Quaternion {
	private final double x;
	private final double y;
	private final double z;
	private final double w;

	public Quaternion(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public Quaternion(AngleAxis angleaxis) {
		double ax = angleaxis.Axis.getX();
		double ay = angleaxis.Axis.getY();
		double az = angleaxis.Axis.getZ();
		double ccc, sss;
		double norm = ax * ax + ay * ay + az * az;

		if (norm <= 0) {
			x = y = z = w = 0;
			return;
		}

		norm = 1d / Math.sqrt(norm);
		ax *= norm;
		ay *= norm;
		az *= norm;
		double rad = Math.toRadians(angleaxis.Angle);
		ccc = Math.cos(0.5d * rad);
		sss = Math.sin(0.5d * rad);
		x = sss * ax;
		y = sss * ay;
		z = sss * az;
		w = ccc;
	}

	public Quaternion multiply(Quaternion value) {
		double rx, ry, rz, rw;
		double d0, d1, d2, d3;
		d0 = this.w * value.w;
		d1 = -this.x * value.x;
		d2 = -this.y * value.y;
		d3 = -this.z * value.z;
		rw = d0 + d1 + d2 + d3;
		d0 = this.w * value.x;
		d1 = this.x * value.w;
		d2 = this.y * value.z;
		d3 = -this.z * value.y;
		rx = d0 + d1 + d2 + d3;
		d0 = this.w * value.y;
		d1 = this.y * value.w;
		d2 = this.z * value.x;
		d3 = -this.x * value.z;
		ry = d0 + d1 + d2 + d3;
		d0 = this.w * value.z;
		d1 = this.z * value.w;
		d2 = this.x * value.y;
		d3 = -this.y * value.x;
		rz = d0 + d1 + d2 + d3;
		return new Quaternion(rx, ry, rz, rw);
	}

	public AngleAxis toAngleAxis() {
		// if (w > 1) q1.normalise(); // if w>1 acos and sqrt will produce errors, this
		// cant happen if quaternion is normalised
		double angle = 2 * Math.acos(w);
		double ax;
		double ay;
		double az;

		double s = Math.sqrt(1 - w * w); // assuming quaternion normalised then w is less than 1, so term always
											// positive.
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
