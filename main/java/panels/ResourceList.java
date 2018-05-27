package panels;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JTabbedPane;

public class ResourceList extends JTabbedPane{
	/**右側のパネル*/
	private static final long serialVersionUID = -1038244099915798138L;

	public static BufferedImage nullImage;
	public ResourceList() {
		try {
			nullImage = ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/notSet.png"));

		} catch (IOException e) {
		}
	}

}
