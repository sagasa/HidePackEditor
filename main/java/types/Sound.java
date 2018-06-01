package types;

import types.base.CloneableObj;

public class Sound extends CloneableObj{
	public String name;
	public float range;
	public float vol = 1;
	public float pitch = 1;
	public boolean isDecay = true;
	public boolean isDelay = true;

	public Sound(String name,float range){
		this.name = name;
		this.range = range;
	}
}
