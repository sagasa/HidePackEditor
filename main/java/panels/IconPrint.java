package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/** サイズを合わせてアイコンを描画 アイコンの画像パスを指定 */
public class IconPrint extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** 画像のパス */
	BufferedImage Image;

	/**pathから作成*/
	public IconPrint(String p) {
		try {
			Image = ImageIO.read(new File(p));
		} catch (Exception e) {
			Image = null;
		}
	}
	/**BufferedImageから作成*/
	public IconPrint(BufferedImage i){
		Image = i;
	}

	public void setImage(BufferedImage image){
		Image = image;
		repaint();
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		g2.setBackground(Color.white);
		g2.clearRect(1, 1, this.getWidth(), this.getHeight());

		if (Image != null) {
			g2.drawImage(Image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}
