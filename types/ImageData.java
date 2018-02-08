package types;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageData {
	public String IconName;
	public BufferedImage Icon;
	
	
	public ImageData(byte[] input,String name) throws IOException{
		Icon = ImageIO.read(new ByteArrayInputStream(input));
		
	}
}
