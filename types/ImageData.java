package types;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/**Image格納用*/
public class ImageData {
	public String ImageName;
	public BufferedImage Image;
	
	
	public ImageData(byte[] input,String name) throws IOException{
		Image = ImageIO.read(new ByteArrayInputStream(input));
		ImageName = name;
	}
}
