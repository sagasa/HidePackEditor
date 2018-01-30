package hideEditer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LangReader {

	//ファイルを読んでLangリストを作る
	public static String[] loadLangList(){
		Pattern lang = Pattern.compile("(.+).lang$");

		//ファイルのリストを制作
		List<File> FileList = new ArrayList<File>();
		File langDir = new File("./lang");
		if (!langDir.exists()){
			langDir.mkdirs();
		}
		System.out.println(langDir.getAbsolutePath());
		for (File file : langDir.listFiles()){
			//Load folders and valid zip files
			if (file.isFile() || lang.matcher(file.getName()).matches())
			{
				//Add the directory to the content pack list
				System.out.println("Loaded content pack : " + file.getName());
				FileList.add(file);
			}

		}
		return null;
	}

}
