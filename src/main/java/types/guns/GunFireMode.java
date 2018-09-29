package types.guns;

public enum GunFireMode{
	SEMIAUTO, FULLAUTO, MINIGUN, BURST;
	public static GunFireMode getFireMode(String s){
		switch(s){
		case "fullauto":
			return FULLAUTO;
		case "semiauto":
			return SEMIAUTO;
		case "minigun":
			return MINIGUN;
		case "burst":
			return BURST;
		}
		return SEMIAUTO;
	}
	public static String getFireMode(GunFireMode mode){
		switch(mode){
		case BURST:
			return "burst";
		case FULLAUTO:
			return "fullauto";
		case MINIGUN:
			return "minigun";
		case SEMIAUTO:
			return "semiauto";
		}
		return "semiauto";
	}
	@Override
	public String toString() {
		return getFireMode(this);
	}
}