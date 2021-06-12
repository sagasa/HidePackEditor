package resources;

import java.awt.image.BufferedImage;

import editor.HidePack;
import types.PackInfo;

public class HideImage extends Resource {

	public HideImage(String name, BufferedImage bufferedImage) {
		this(name, HidePack.DefaultPack.get(), bufferedImage);
	}

	public HideImage(String name, PackInfo pack, BufferedImage bufferedImage) {
		super(name, pack);
		Image = bufferedImage;
	}

	public BufferedImage Image;

}
