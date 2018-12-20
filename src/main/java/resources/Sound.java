package resources;

import editer.HidePack;

public class Sound extends Resource{

	public Sound(String name,byte[] data) {
		this(name,HidePack.DefaultPack.getPackUID(),data);
	}

	public Sound(String name,long uid, byte[] data) {
		super(name,uid);
		Sound = data;
	}

	public byte[] Sound;
}
