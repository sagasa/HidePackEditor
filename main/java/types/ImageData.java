package types;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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
	/**パスから取得*/
	public ImageData(String path,String name){
		try {
			Image = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.err.println("can't find file : "+path);
		}
		ImageName = name;
	}
	/**パスから取得*/
	public ImageData(InputStream in,String name){
		try {
			Image = ImageIO.read(in);
		} catch (IOException e) {
			System.err.println("error at reading image");
		}
		ImageName = name;
	}

	/**幅取得*/
	public int getWidth(){
		return Image.getWidth();
	}

	/**高さ取得*/
	public int getHeight(){
		return Image.getHeight();
	}
}
