package resources;

import editer.HidePack;

public class Model extends Resource{

	public Model(String name) {
		this(name,HidePack.DefaultPack.getPackUID());
	}

	public Model(String name,long uid) {
		super(name,uid);
	}

}
