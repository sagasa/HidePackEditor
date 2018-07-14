package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/** オブジェモデルを読むパーサー */
public class ObjWrapper {
	private static final Pattern WHITE_SPACE = Pattern.compile("\\s+");

	public ObjWrapper(BufferedReader reader) {
		try {
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				// コメントはスキップ
				if (currentLine.isEmpty() || currentLine.startsWith("#"))
					continue;
				System.out.println(currentLine);
				String[] fields = WHITE_SPACE.split(currentLine, 2);
				String key = fields[0];
				String data = fields[1];

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
