package types.effect;

import types.Info;
import types.base.DataBase;

public class Recoil extends DataBase {
	@Info(Cate = 0)
	public boolean USE = true;
	@Info(Scale = "0.1")
	public float MAX_YAW_BASE = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MAX_YAW_SPREAD = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MAX_YAW_RETURN = 0f;
	@Info(Scale = "0.1")
	public float MIN_YAW_BASE = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MIN_YAW_SPREAD = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MIN_YAW_RETURN = 0f;

	@Info(Min = 0)
	public int YAW_RECOIL_TICK = 0;
	@Info(Min = 0)
	public int YAW_RETURN_TICK = 0;

	@Info(Scale = "0.1")
	public float MAX_PITCH_BASE = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MAX_PITCH_SPREAD = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MAX_PITCH_RETURN = 0f;
	@Info(Scale = "0.1")
	public float MIN_PITCH_BASE = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MIN_PITCH_SPREAD = 0f;
	@Info(Min = 0, Scale = "0.1")
	public float MIN_PITCH_RETURN = 0f;

	@Info(Min = 0)
	public int PITCH_RECOIL_TICK = 0;
	@Info(Min = 0)
	public int PITCH_RETURN_TICK = 0;

	@Info(Min = 0)
	public int POWER_TICK = 0;
	@Info(Min = 0)
	public int POWER_SHOOT = 0;

	public Recoil setUse(boolean b) {
		USE = b;
		return this;
	}
}
