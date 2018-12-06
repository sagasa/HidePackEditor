package resources;

import java.awt.image.BufferedImage;

public class HideImage extends Resource {

	public HideImage(String name, BufferedImage bufferedImage) {
		super(name);
		Image = bufferedImage;
	}

	public BufferedImage Image;

}
