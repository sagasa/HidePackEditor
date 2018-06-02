package io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import editer.Window;
import types.BulletData;
import types.ContentsPack;
import types.guns.GunData;

public class PackIO {
	/**新しいパックを作る*/
	public static void makePack(){
		Window.Pack = new ContentsPack();
		Window.BulletList = new HashMap<String,BulletData>();
		Window.GunList = new HashMap<String,GunData>();
		Window.IconMap = new HashMap<String,BufferedImage>();
		Window.ItemList.write();
		Window.ItemEditer.clearEditer();
	}
	/**今開いているデータを消して新しいパックを開く*/
	public static void openPack(){
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "zip file", "zip");
		filechooser.setFileFilter(filter);
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY );

	    int selected = filechooser.showOpenDialog(Window.INSTANCE);
	    //System.out.println(selected);
	    //パックを読む
	    if(selected == 0){
	    	System.out.println("REED"+filechooser.getSelectedFile());
	    	Window.Pack = null;
			Window.BulletList = new HashMap<String,BulletData>();
			Window.GunList = new HashMap<String,GunData>();
			Window.IconMap = new HashMap<String,BufferedImage>();
			Window.ItemList.write();
			Window.ItemEditer.clearEditer();
	    }
	}
	/**パックの中身だけ追加する*/
	public static void inportPack(){

	}
	/**パッキングして出力する*/
	public static void exportPack(){

	}
}
