package resources;

import editer.HidePack;
import types.PackInfo;

public class Model extends Resource{

	public Model(String name) {
		this(name,HidePack.DefaultPack);
	}

	public Model(String name,PackInfo pack) {
		super(name,pack);
	}

}
