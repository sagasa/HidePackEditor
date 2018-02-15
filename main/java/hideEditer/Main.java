package hideEditer;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import types.ContentsPack;
import types.ContentsPack.PackDataList;
import types.GunData;
import valueEditer.EditWindow;

public class Main {


	/**ウィンドウのインスタンス格納*/
	public static MainWindow main;
	/**ウィンドウのインスタンス格納*/
	public static ContentsList contents;
	/**ウィンドウのインスタンス格納*/
	public static EditWindow editer;

	public static void main(String[] args){
		init();

		//lang
		Lang.readLang("./lang");
		Lang.setLang("jp");



		main = new MainWindow();
		main.openWindow();
	}
	/**初期化*/
	static void init(){
		try {
			BufferedImage Image = ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/notSet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}