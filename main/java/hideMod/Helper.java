package hideMod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import types.ContentsPack;

public class Helper {

	/**Jsonファイルのパスから内容を読む 読めなければ空ファイルを返す
	 * @param class1 */
	public static Object ReadJson(String path, Class class1){
		try {
			File file = new File(path);
			if (file.exists()&&file.isFile()){

				FileReader inStream = new FileReader(path);

				JsonReader jsr = new JsonReader(inStream);

				Gson mygson =new Gson();
				JsonObject data = mygson.fromJson(jsr,class1);
	            inStream.close();

	            return data;

			}else{
				JsonObject dammy = new JsonObject();;
				return dammy;
			}
		} catch (FileNotFoundException e) {
			JsonObject dammy = new JsonObject();;
			return dammy;
		} catch (IOException e) {
			JsonObject dammy = new JsonObject();;
			return dammy;
		}
	}




}
