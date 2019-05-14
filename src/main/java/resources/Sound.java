package resources;

import editer.HidePack;
import types.PackInfo;

public class Sound extends Resource {

	public Sound(String name, byte[] data) {
		this(name, HidePack.DefaultPack, data);
	}

	public Sound(String name, PackInfo pack, byte[] data) {
		super(name, pack);
		Sound = data;
	}


	public byte[] Sound;
}