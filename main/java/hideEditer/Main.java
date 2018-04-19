package hideEditer;

import valueEditer.EditWindow;

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

		main = new MainWindow();
		main.openWindow();
	}
}