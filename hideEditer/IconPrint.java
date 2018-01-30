package hideEditer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**サイズを合わせてアイコンを描画 アイコンの画像パスを指定*/
public class IconPrint extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**画像のパス*/
	String path;
	public IconPrint(String p) {
		path = p;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;

		g2.setBackground(Color.white);
		g2.clearRect(1, 1, this.getWidth(), this.getHeight());

	    BufferedImage readImage = null;
	    try {
	      readImage = ImageIO.read(new File(path));
	    } catch (Exception e) {

	      readImage = null;
	    }

	    if (readImage != null){
	      g2.drawImage(readImage, 0, 0,this.getWidth() ,this.getHeight() , this);
	    }
	}
}
