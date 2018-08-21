package com.flansmod.client.tmt;

import com.flansmod.common.vector.Vector3f;

public class PositionTextureVertex {
	public Vector3f vector3D;
    public float texturePositionX;
    public float texturePositionY;
    public float texturePositionW;

    public PositionTextureVertex(float x, float y, float z, float u,float v,float w)
    {
        this.vector3D = new Vector3f(x, y, z);
        this.texturePositionX = x;
        this.texturePositionY = y;
        this.texturePositionW = w;
    }
    public PositionTextureVertex(float x, float y, float z, float u,float v)
    {
    	this(x, y, z, u, v, 1);
    }
    public PositionTextureVertex setTexturePosition(float x, float y, float w)
	{
    	System.out.println(x+" "+y+" "+w);
    	texturePositionX = x;
    	texturePositionY = y;
    	texturePositionW = w;
		return this;
	}
    public PositionTextureVertex setTexturePosition(float x, float y)
	{
    	texturePositionX = x;
    	texturePositionY = y;
		return this;
	}
}
