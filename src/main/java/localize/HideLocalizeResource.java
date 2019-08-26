package localize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import sun.util.ResourceBundleEnumeration;

public class HideLocalizeResource extends ResourceBundle {

	private Map<String, String> localize = new HashMap<>();

	public HideLocalizeResource(Reader reader, ResourceBundle parent) throws IOException {
		this(reader);
		this.parent = parent;
	}

	public HideLocalizeResource(Reader reader) throws IOException {
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] split = line.split("=", 2);
			if (split.length == 2)
				localize.put(split[0].trim(), split[1].trim());
		}
	}

	public HideLocalizeResource(Map<String, String> map) {
		localize = map;
	}

	@Override
	protected Object handleGetObject(String key) {
		return localize.get(key);
	}

	@Override
	public Enumeration<String> getKeys() {
		return new ResourceBundleEnumeration(localize.keySet(), (parent != null) ? parent.getKeys() : null);
	}

}
