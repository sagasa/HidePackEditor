package types.effect;

import types.base.DataBase;

public class Sound extends DataBase {

	public String NAME = "sample";
	public float RANGE = 50f;
	public float VOL = 1f;
	public float PITCH = 1f;
	public boolean USE_DECAY = true;
	public boolean USE_DELAY = true;

	public Sound(String name, float range) {
		NAME = name;
		RANGE = range;
	}

}
