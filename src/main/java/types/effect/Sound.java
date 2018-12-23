package types.effect;

import types.Info;
import types.base.DataBase;

public class Sound extends DataBase {

	@Info(Cate = 0)
	public String NAME = "sample";
	@Info(Min=0)
	public float RANGE = 50f;
	@Info(Min=0)
	public float VOL = 1f;
	@Info(Min=0)
	public float PITCH = 1f;
	public boolean USE_DECAY = true;
	public boolean USE_DELAY = true;

	public Sound(String name, float range) {
		NAME = name;
		RANGE = range;
	}
}
