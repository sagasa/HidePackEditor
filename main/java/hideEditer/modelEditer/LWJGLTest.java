package hideEditer.modelEditer;

import java.awt.Canvas;

import javax.swing.JFrame;

import static org.lwjgl.opengl.GL11.GL_ALPHA_TEST;
import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_GREATER;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glAlphaFunc;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glGetInteger;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex3f;
import static org.lwjgl.opengl.GL13.GL_MULTISAMPLE;
import static org.lwjgl.opengl.GL13.GL_SAMPLES;
import static org.lwjgl.opengl.GL13.GL_SAMPLE_ALPHA_TO_COVERAGE;
import static org.lwjgl.opengl.GL13.GL_SAMPLE_BUFFERS;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class LWJGLTest {

	private int width = 300;
	private int height = 200;
	private int depth = 300;

	public void Test() {
		try {
			JFrame window = new JFrame();

			Canvas c = new Canvas();
			window.add(c);
			window.setSize(600, 600);
			window.setVisible(true);
			Display.setParent(c);
			Display.setTitle("test");
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create(new PixelFormat(0, 8, 0, 4));

			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

			// set the color of the quad (R,G,B,A)
			GL11.glColor3f(0.5f, 0.5f, 1.0f);

			// オフスクリーンを初期化する際の背景色を指定する
			glClearColor(1f, 1f, 1f, 1f);

			// テクスチャーを有効化する
			glEnable(GL_TEXTURE_2D);

			// アルファブレンドを有効化する
			glEnable(GL_BLEND);

			// カメラ用の設定変更を宣言する
			glMatrixMode(GL_PROJECTION);
			// 設定を初期化する
			glLoadIdentity();
			// 視体積（目に見える範囲）を定義する
			glOrtho(0, width, 0, height, -depth / 2, depth / 2);

			// 物体モデル用の設定変更を宣言する
			glMatrixMode(GL_MODELVIEW);

			glEnable(GL_DEPTH_TEST);

			if ((1 <= glGetInteger(GL_SAMPLE_BUFFERS)) && (2 <= glGetInteger(GL_SAMPLES))) {
				// マルチサンプリングを有効にする
				glEnable(GL_MULTISAMPLE);
				// Alpha to coverage を有効にする
				glEnable(GL_SAMPLE_ALPHA_TO_COVERAGE);
			} else {
				// アルファテストを有効にする
				glEnable(GL_ALPHA_TEST);
				// アルファテストの条件を設定する
				glAlphaFunc(GL_GREATER, 0.7f);
			}

			while (!Display.isCloseRequested()) {
				// オフスクリーンを初期化する
				glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
				Display.sync(60);

				glBegin(GL_QUADS);
				glVertex3f(100, 100, 0);
				glVertex3f(200, 100,0);
				glVertex3f(250, 200, 0);
				glVertex3f(100, 200, 0);

				glEnd();


				// オフスクリーンをスクリーンに反映する
				Display.update();
			}
			// Display.set

		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
}
