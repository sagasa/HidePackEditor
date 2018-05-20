package hideEditer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;

import helper.ObjWrapper;
import hideEditer.dataEditer.EditWindow;
import hideEditer.modelEditer.LWJGLTest;

public class Main {


	/**ウィンドウのインスタンス格納*/
	public static MainWindow main;
	/**ウィンドウのインスタンス格納*/
	public static ContentsList contents;
	/**ウィンドウのインスタンス格納*/
	public static EditWindow editer;

	public static void main(String[] args){
		//lang
		Lang.readLang("./lang");
		Lang.setLang("jp");

		new ObjWrapper();

		//LWJGLTest test = new LWJGLTest();
		//test.Test();

		main = new MainWindow();
	//	main.openWindow();

		/*
		try {
			File file = new File("./HiddenFieldPack_Assets/");
			System.out.println(file.getAbsolutePath());
			URLClassLoader load = URLClassLoader.newInstance(new URL[]{file.toURI().toURL()});
			load.loadClass("com.flansmod.client.model.pc12.ModelAVS36Scoped").newInstance();


			//System.out.println(" read ; "+new String(data, Charset.forName("UTF-8")));
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
*/

	}
}