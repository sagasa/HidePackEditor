package com.flansmod.client.tmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.flansmod.client.model.EnumAnimationType;

import net.minecraft.client.model.ModelBase;

/**
 * An extension to the ModelRenderer class. It basically is a copy to
 * ModelRenderer, however, it contains various new methods to make your models.
 * <br />
 * <br />
 * Since the ModelRendererTurbo class gets loaded during startup, the models
 * made can be very complex. This is why I can afford to add, for example,
 * Wavefont OBJ support or have the addSprite method, methods that add a lot of
 * vertices and polygons.
 *
 * @author GaryCXJk
 *
 */
public class ModelRendererTurbo {
	/**
	 * Creates a new ModelRenderTurbo object. It requires the coordinates of the
	 * position of the texture, but also allows you to specify the width and
	 * height of the texture, allowing you to use bigger textures instead.
	 *
	 * @param modelbase
	 * @param textureX
	 * @param textureY
	 * @param textureU
	 * @param textureV
	 */
	public ModelRendererTurbo(ModelBase modelbase, int textureX, int textureY, int textureU, int textureV) {
		textureOffsetX = textureX;
		textureOffsetY = textureY;
		textureWidth = textureU;
		textureHeight = textureV;
	}



	public void func_78793_a(float arg0,float arg1,float arg2){
		for(TexturedPolygon poly:Poly){
			poly.translate(arg0/3, arg1/3, arg2/3);
		}
	}


	private TexturedPolygon addPolygonReturn(PositionTextureVertex[] verts, int u1, int v1, int u2, int v2, float q1, float q2, float q3, float q4)
	{
		if(verts.length < 3)
			return null;
		float uOffs = 1.0F / (textureWidth * 10.0F);
		float vOffs = 1.0F / (textureHeight * 10.0F);
		if(verts.length < 4)
		{
			float xMin = -1;
			float yMin = -1;
			float xMax = 0;
			float yMax = 0;

			for (PositionTextureVertex vert : verts) {
				float xPos = vert.texturePositionX;
				float yPos = vert.texturePositionY;
				xMax = Math.max(xMax, xPos);
				xMin = (xMin < -1 ? xPos : Math.min(xMin, xPos));
				yMax = Math.max(yMax, yPos);
				yMin = (yMin < -1 ? yPos : Math.min(yMin, yPos));
			}
			float uMin = u1 / textureWidth + uOffs;
			float vMin = v1 / textureHeight + vOffs;
			float uSize = (u2 - u1) / textureWidth - uOffs * 2;
			float vSize = (v2 - v1) / textureHeight - vOffs * 2;

			float xSize = xMax - xMin;
			float ySize = yMax - yMin;
			for(int i = 0; i < verts.length; i++)
			{
				float xPos = verts[i].texturePositionX;
				float yPos = verts[i].texturePositionY;
				xPos = (xPos - xMin) / xSize;
				yPos = (yPos - yMin) / ySize;
				verts[i] = verts[i].setTexturePosition(uMin + (xPos * uSize), vMin + (yPos * vSize));
			}
		}
		else
		{
			verts[0] = verts[0].setTexturePosition((u2 / textureWidth - uOffs)*q1, (v1 / textureHeight + vOffs)*q1, q1);
			verts[1] = verts[1].setTexturePosition((u1 / textureWidth + uOffs)*q2, (v1 / textureHeight + vOffs)*q2, q2);
			verts[2] = verts[2].setTexturePosition((u1 / textureWidth + uOffs)*q3, (v2 / textureHeight - vOffs)*q3, q3);
			verts[3] = verts[3].setTexturePosition((u2 / textureWidth - uOffs)*q4, (v2 / textureHeight - vOffs)*q4, q4);
		}
		return new TexturedPolygon(verts);
	}



	/**
	 * Adds a rectangular shape. Basically, you can make any eight-pointed shape
	 * you want, as the method requires eight vector coordinates.
	 *
	 * @param v
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v1
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v2
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v3
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v4
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v5
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v6
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v7
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param w
	 *            the width of the shape, used in determining the texture
	 * @param h
	 *            the height of the shape, used in determining the texture
	 * @param d
	 *            the depth of the shape, used in determining the texture
	 */
	public void addRectShape(float[] v, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6,
			float[] v7, int w, int h, int d) {
		float[] var1 = new float[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d, var1);
	}

	/**
	 * Adds a rectangular shape. Basically, you can make any eight-pointed shape
	 * you want, as the method requires eight vector coordinates. Also does some
	 * special texture mapping.
	 *
	 * @param v
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v1
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v2
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v3
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v4
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v5
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v6
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param v7
	 *            a float array with three values, the x, y and z coordinates of
	 *            the vertex
	 * @param w
	 *            the width of the shape, used in determining the texture
	 * @param h
	 *            the height of the shape, used in determining the texture
	 * @param d
	 *            the depth of the shape, used in determining the texture
	 * @param qParam
	 *            Array containing the q parameters in the order xBack, xBottom,
	 *            xFront, xTop, yBack, yFront, yLeft, yRight, zBottom, zLeft,
	 *            zRight, zTop
	 */
	public void addRectShape(float[] v, float[] v1, float[] v2, float[] v3, float[] v4, float[] v5, float[] v6,
			float[] v7, int w, int h, int d, float[] qParam) {


		//*
		PositionTextureVertex[] verts = new PositionTextureVertex[8];
		TexturedPolygon[] poly = new TexturedPolygon[6];
		PositionTextureVertex positionTexturevertex = new PositionTextureVertex(v[0], v[1], v[2], 0.0F, 0.0F);
		PositionTextureVertex positionTexturevertex1 = new PositionTextureVertex(v1[0], v1[1], v1[2], 0.0F, 8F);
		PositionTextureVertex positionTexturevertex2 = new PositionTextureVertex(v2[0], v2[1], v2[2], 8F, 8F);
		PositionTextureVertex positionTexturevertex3 = new PositionTextureVertex(v3[0], v3[1], v3[2], 8F, 0.0F);
		PositionTextureVertex positionTexturevertex4 = new PositionTextureVertex(v4[0], v4[1], v4[2], 0.0F, 0.0F);
		PositionTextureVertex positionTexturevertex5 = new PositionTextureVertex(v5[0], v5[1], v5[2], 0.0F, 8F);
		PositionTextureVertex positionTexturevertex6 = new PositionTextureVertex(v6[0], v6[1], v6[2], 8F, 8F);
		PositionTextureVertex positionTexturevertex7 = new PositionTextureVertex(v7[0], v7[1], v7[2], 8F, 0.0F);
		verts[0] = positionTexturevertex;
		verts[1] = positionTexturevertex1;
		verts[2] = positionTexturevertex2;
		verts[3] = positionTexturevertex3;
		verts[4] = positionTexturevertex4;
		verts[5] = positionTexturevertex5;
		verts[6] = positionTexturevertex6;
		verts[7] = positionTexturevertex7;
		poly[0] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex5, positionTexturevertex1, positionTexturevertex2,
						positionTexturevertex6 },
				textureOffsetX + d + w, textureOffsetY + d, textureOffsetX + d + w + d, textureOffsetY + d + h, 1F,
				qParam[7], qParam[10] * qParam[7], qParam[10]);
		poly[1] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex, positionTexturevertex4, positionTexturevertex7,
						positionTexturevertex3 },
				textureOffsetX, textureOffsetY + d, textureOffsetX + d, textureOffsetY + d + h, qParam[9] * qParam[6],
				qParam[9], 1F, qParam[6]);
		poly[2] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex5, positionTexturevertex4, positionTexturevertex,
						positionTexturevertex1 },
				textureOffsetX + d, textureOffsetY, textureOffsetX + d + w, textureOffsetY + d, 1F, qParam[8],
				qParam[1] * qParam[8], qParam[1]);
		poly[3] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex2, positionTexturevertex3, positionTexturevertex7,
						positionTexturevertex6 },
				textureOffsetX + d + w, textureOffsetY, textureOffsetX + d + w + w, textureOffsetY + d, qParam[3],
				qParam[3] * qParam[11], qParam[11], 1F);
		poly[4] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex1, positionTexturevertex, positionTexturevertex3,
						positionTexturevertex2 },
				textureOffsetX + d, textureOffsetY + d, textureOffsetX + d + w, textureOffsetY + d + h, qParam[0],
				qParam[0] * qParam[4], qParam[4], 1F);
		poly[5] = addPolygonReturn(
				new PositionTextureVertex[] { positionTexturevertex4, positionTexturevertex5, positionTexturevertex6,
						positionTexturevertex7 },
				textureOffsetX + d + w + d, textureOffsetY + d, textureOffsetX + d + w + d + w, textureOffsetY + d + h,
				qParam[2] * qParam[5], qParam[2], 1F, qParam[5]);

		Poly.addAll(Arrays.asList(poly));
		//*/
	}



	/**
	 * Adds a trapezoid-like shape. It's achieved by expanding the shape on one
	 * side. You can use the static variables <code>MR_RIGHT</code>,
	 * <code>MR_LEFT</code>, <code>MR_FRONT</code>, <code>MR_BACK</code>,
	 * <code>MR_TOP</code> and <code>MR_BOTTOM</code>.
	 *
	 * @param x
	 *            the starting x-position
	 * @param y
	 *            the starting y-position
	 * @param z
	 *            the starting z-position
	 * @param w
	 *            the width (over the x-direction)
	 * @param h
	 *            the height (over the y-direction)
	 * @param d
	 *            the depth (over the z-direction)
	 * @param scale
	 *            the "scale" of the box. It only increases the size in each
	 *            direction by that many.
	 * @param x0,y0,z0
	 *            - x7,y7,z7 the modifiers of the box corners. each corner can
	 *            changed seperat by x/y/z values
	 */
	public void addShapeBox(float x, float y, float z, int w, int h, int d, float scale, float x0, float y0, float z0,
			float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4,
			float y4, float z4, float x5, float y5, float z5, float x6, float y6, float z6, float x7, float y7,
			float z7) {
		float f4 = x + w;
		float f5 = y + h;
		float f6 = z + d;
		x -= scale;
		y -= scale;
		z -= scale;
		f4 += scale;
		f5 += scale;
		f6 += scale;

		float[] v = { x - x0, y - y0, z - z0 };
		float[] v1 = { f4 + x1, y - y1, z - z1 };
		float[] v2 = { f4 + x5, f5 + y5, z - z5 };
		float[] v3 = { x - x4, f5 + y4, z - z4 };
		float[] v4 = { x - x3, y - y3, f6 + z3 };
		float[] v5 = { f4 + x2, y - y2, f6 + z2 };
		float[] v6 = { f4 + x6, f5 + y6, f6 + z6 };
		float[] v7 = { x - x7, f5 + y7, f6 + z7 };


		addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d);
	}



	/**
	 * Sets the position of the shape, relative to the model's origins. Note
	 * that changing the offsets will not change the pivot of the model.
	 *
	 * @param x
	 *            the x-position of the shape
	 * @param y
	 *            the y-position of the shape
	 * @param z
	 *            the z-position of the shape
	 */
	public void setPosition(float x, float y, float z) {
		rotationPointX = x;
		rotationPointY = y;
		rotationPointZ = z;
	}

	/**
	 * Copies an array of vertices and polygons to the current shape. This
	 * mainly is used to copy each shape to the main class, but you can just use
	 * it to copy your own shapes, for example from other classes, into the
	 * current class.
	 *
	 * @param verts
	 *            the array of vertices you want to copy
	 * @param poly
	 *            the array of polygons you want to copy
	 */

	/*
	public void copyTo(PositionTextureVertex[] verts, TexturedPolygon[] poly) {
		copyTo(verts, poly, true);
	}

	public void copyTo(PositionTextureVertex[] verts, TexturedPolygon[] poly, boolean copyGroup) {
		vertices = Arrays.copyOf(vertices, vertices.length + verts.length);
		faces = Arrays.copyOf(faces, faces.length + poly.length);

		for (int idx = 0; idx < verts.length; idx++) {
			vertices[vertices.length - verts.length + idx] = verts[idx];
			if (copyGroup && verts[idx] instanceof PositionTransformVertex)
				((PositionTransformVertex) verts[idx]).addGroup(currentGroup);
		}

		for (int idx = 0; idx < poly.length; idx++) {
			faces[faces.length - poly.length + idx] = poly[idx];
			if (copyGroup)
				currentTextureGroup.addPoly(poly[idx]);
		}
	}
//*/
	/**
	 * Copies an array of vertices and quads to the current shape. This method
	 * converts quads to polygons and then calls the main copyTo method.
	 *
	 * @param verts
	 *            the array of vertices you want to copy
	 * @param quad
	 *            the array of quads you want to copy
	 */
	/*
	public void copyTo(PositionTextureVertex[] verts, TexturedQuad[] quad) {
		TexturedPolygon[] poly = new TexturedPolygon[quad.length];
		for (int idx = 0; idx < quad.length; idx++) {
			poly[idx] = new TexturedPolygon((PositionTextureVertex[]) quad[idx].vertexPositions);
		}

		copyTo(verts, poly);
	}
	//*/

	/**
	 * Sets the default texture. When left as an empty string, it will use the
	 * texture that has been set previously. Note that this will also move on to
	 * other rendered models of the same entity.
	 *
	 * @param s
	 *            the filename
	 */
	public void setDefaultTexture(String s) {
		defaultTexture = s;
	}

	/**
	 * Renders the shape.
	 *
	 * @param worldScale
	 *            the scale of the shape. Usually is 0.0625.
	 */

	int textureWidth;
	int textureHeight;

	float rotationPointX;
	float rotationPointY;
	float rotationPointZ;

	/**UV付きのポリゴン*/
	public ArrayList<TexturedPolygon> Poly = new ArrayList<>();

	private int textureOffsetX;
	private int textureOffsetY;

	public boolean flip;
	public boolean showModel;
	public boolean field_1402_i;
	public boolean forcedRecompile;
	public boolean useLegacyCompiler;

	private String defaultTexture;

	public float field_78808_h;

	public static final int MR_FRONT = 0;
	public static final int MR_BACK = 1;
	public static final int MR_LEFT = 2;
	public static final int MR_RIGHT = 3;
	public static final int MR_TOP = 4;
	public static final int MR_BOTTOM = 5;

}