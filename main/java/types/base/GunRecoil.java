package types.base;


public class GunRecoil {
	public boolean use = false;

	public float yaw_base_max = 0;
	public float yaw_spread_max = 0;
	public float yaw_return_max = 0;

	public float yaw_base_min = 0;
	public float yaw_spread_min = 0;
	public float yaw_return_min = 0;

	public int yaw_recoil_tick = 0;
	public int yaw_return_tick = 0;

	public float pitch_base_max = 0;
	public float pitch_spread_max = 0;
	public float pitch_return_max = 0;

	public float pitch_base_min = 0;
	public float pitch_spread_min = 0;
	public float pitch_return_min = 0;

	public int pitch_recoil_tick = 0;
	public int pitch_return_tick = 0;

	public int recoilPower_tick = 0;
	public int recoilPower_shoot = 0;

	public GunRecoil setUse(boolean use){
		this.use = use;
		return this;
	}
}
