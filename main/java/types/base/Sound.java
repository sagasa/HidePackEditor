package types.base;

public class Sound {
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
