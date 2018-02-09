package types;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**Image格納用*/
public class ImageData {
	public String ImageName;
	public BufferedImage Image;
	
	
	public ImageData(byte[] input,String name){
		try {
			Image = ImageIO.read(new ByteArrayInputStream(input));
		} catch (IOException e) {
			
		}
		ImageName = name;
	}
	
	public boolean isSet(){
		
		return false;
	}
}
