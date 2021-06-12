package resources;

import java.util.List;

import editor.HidePack;
import types.PackInfo;

public class Model extends Resource {

	public List<String> emptyList;

	public List<String> modelList;

	public Model(String name) {
		this(name, HidePack.DefaultPack.get());
	}

	public Model(String name, PackInfo pack) {
		super(name, pack);
	}

}
