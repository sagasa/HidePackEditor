package panels;

import java.awt.Canvas;
import java.awt.Rectangle;

import javax.swing.JFrame;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import types.model.ModelGun;
import types.model.Polygon;
import types.model.VertexUV;

public class LWJGLPanel {
	public ModelGun model;

	/** 表示するモデル */

	public LWJGLPanel() {
		JFrame frame = new JFrame();

		Canvas c = new Canvas();
		frame.add(c);
		frame.setSize(800, 800);

		frame.setVisible(true);

		// ディスプレイのアップデート
		GlThread glThread = new GlThread(c);
		glThread.start();

	}

	static private final float offset = 8;

	class GlThread extends Thread {
		Canvas Pearent;

		public GlThread(Canvas c) {
			Pearent = c;
		}

		@Override
		public void run() {
			try {
				Display.setParent(Pearent);
				Display.create();
				GL11.glEnable(GL11.GL_TEXTURE_2D);
	            GL11.glMatrixMode(GL11.GL_MODELVIEW);

			} catch (LWJGLException e) {
				e.printStackTrace();
			}

			boolean needUpdateViewport = true;
			while (true) {
				GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

				// set the color of the quad (R,G,B,A)
				GL11.glColor3f(0.5f, 0.5f, 1.0f);

				//*
				// draw quad
				if(model!=null){
					for(Polygon poly:model.Body.Polygon){
						if(poly.Vertex.length==4){
							GL11.glBegin(GL11.GL_LINE_LOOP);
							for(VertexUV vert:poly.Vertex){
							//	System.out.println(vert);
								GL11.glVertex2f((vert.X+offset)*20, (vert.Y+offset)*20);
							}
							GL11.glEnd();
						}
					}
				}

				//*/

				/*
				GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2f(0+offset, 100+offset);
				GL11.glVertex2f(100+offset, 100+offset);
				GL11.glVertex2f(100+offset, 0+offset);
				GL11.glVertex2f(0+offset, 0+offset);
				GL11.glEnd();
				//*/

				int error = GL11.glGetError();
				if (error != GL11.GL_NO_ERROR) {
					String msg = "Unknown Error";
					switch (error) {
					case GL11.GL_INVALID_OPERATION:
						msg = "Invalid Operation"; break;
					case GL11.GL_INVALID_VALUE:
						msg = "Invalid Value"; break;
					case GL11.GL_INVALID_ENUM:
						msg = "Invalid Enum"; break;
					case GL11.GL_STACK_OVERFLOW:
						msg = "Stack Overflow"; break;
					case GL11.GL_STACK_UNDERFLOW:
						msg = "Stack Underflow"; break;
					case GL11.GL_OUT_OF_MEMORY:
						msg = "Out of memory"; break;
					}
					throw new RuntimeException(msg);
				}

				Display.update();
				Display.sync(60);

				if (needUpdateViewport) {
					needUpdateViewport = false;

					Rectangle rect = Pearent.getBounds();
					int w = (int) rect.getWidth();
					int h = (int) rect.getHeight();

					GL11.glMatrixMode(GL11.GL_PROJECTION);
					GL11.glLoadIdentity();
					GL11.glOrtho(0, w, h, 0, -1, 1);
					GL11.glViewport(0, 0, w, h);
				}
			}
		}
	}



}
