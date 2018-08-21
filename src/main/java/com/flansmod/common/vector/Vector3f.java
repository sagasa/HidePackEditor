package com.flansmod.common.vector;

public class Vector3f {
	public float x, y, z;

	public Vector3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3f(double x, double y, double z)
	{
		this((float)x, (float)y, (float)z);
	}

	public Vector3f() {

	}
	public void add(float x,float y,float z){
		this.x += x;
		this.y += y;
		this.z += z;
	}
}