package resources;

import java.awt.image.BufferedImage;

public class Image extends Resource {

	public Image(String name, BufferedImage bufferedImage) {
		super(name);
		Image = bufferedImage;
	}

	public BufferedImage Image;

}
