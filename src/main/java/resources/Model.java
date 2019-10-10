package resources;

import java.util.Map;

import editer.HidePack;
import types.PackInfo;

public class Model extends Resource {
	public float[] vertArray;
	public float[] texArray;
	public Map<String, int[]> modelParts;

	public Model(String name) {
		this(name, HidePack.DefaultPack);
	}

	public Model(String name, PackInfo pack) {
		super(name, pack);
	}

}
