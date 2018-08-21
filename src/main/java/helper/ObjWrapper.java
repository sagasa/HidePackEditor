package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/** オブジェモデルを読むパーサー */
public class ObjWrapper {
	private static final Pattern WHITE_SPACE = Pattern.compile("\\s+");

	private ArrayList<Float> a;

	public ObjWrapper(BufferedReader reader) {
		try {
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				// コメントはスキップ
				if (currentLine.isEmpty() || currentLine.startsWith("#"))
					continue;

				String[] split = WHITE_SPACE.split(currentLine, 2);
				String key = split[0];
				String data = split[1];

				if (key.equals("g")) {

				} else if (key.equals("v")) {

				} else if (key.equals("vt")) {

				} else if (key.equals("vn")) {

				} else if (key.equals("f")) {

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
