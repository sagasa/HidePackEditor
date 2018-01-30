package hideEditer;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


	//	GunData newGun = new GunData();
	//	System.out.println(newGun);

		/*ContentsPack pack = new ContentsPack();
		PackDataList.PACK_NAME.setData(pack, "TEST");
		PackDataList.NEW_CREATIVE_TAB.setData(pack, new String[]{"TEST1","TEST2"});
		System.out.println(pack.MakeJsonData());

		ContentsPack pack2 = new ContentsPack(pack.MakeJsonData());
		System.out.println(PackDataList.PACK_NAME.getData(pack2));
		System.out.println(pack2.MakeJsonData());
		//System.out.println("test: " + gson.toJson(new TestData()));
*/
		PackWriter.exportPack();
		//PackReader.Read(new File("./test.zip"));


		//lang
		LangReader.loadLangList();

		main = new MainWindow();
		//main.openWindow();


	}



}