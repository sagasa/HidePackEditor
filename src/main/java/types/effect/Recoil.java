package types.effect;

import types.base.DataBase;

public class Recoil extends DataBase {

	public float MAX_YAW_BASE = 0f;
	public float MAX_YAW_SPREAD = 0f;
	public float MAX_YAW_RETURN = 0f;
	public float MIN_YAW_BASE = 0f;
	public float MIN_YAW_SPREAD = 0f;
	public float MIN_YAW_RETURN = 0f;

	public int YAW_RECOIL_TICK = 0;
	public int YAW_RETURN_TICK = 0;

	public float MAX_PITCH_BASE = 0f;
	public float MAX_PITCH_SPREAD = 0f;
	public float MAX_PITCH_RETURN = 0f;
	public float MIN_PITCH_BASE = 0f;
	public float MIN_PITCH_SPREAD = 0f;
	public float MIN_PITCH_RETURN = 0f;

	public int PITCH_RECOIL_TICK = 0;
	public int PITCH_RETURN_TICK = 0;

	public int POWER_TICK = 0;
	public int POWER_SHOOT = 0;

	public boolean USE = true;

	public Recoil setUse(boolean b) {
		USE =  b;
		return this;
	}
}
