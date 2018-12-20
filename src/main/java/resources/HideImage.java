package resources;

import java.awt.image.BufferedImage;

import editer.HidePack;

public class HideImage extends Resource {

	public HideImage(String name,BufferedImage bufferedImage) {
		this(name,HidePack.DefaultPack.getPackUID(),bufferedImage);
	}

	public HideImage(String name,long uid ,BufferedImage bufferedImage) {
		super(name,uid);
		Image = bufferedImage;
	}

	public BufferedImage Image;

}
