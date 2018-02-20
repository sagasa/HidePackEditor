package valueEditer;

import javax.swing.JPanel;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import types.GunData;

public class CheckBoxPanel extends JPanel{
	private static final long serialVersionUID = 2176910712522625069L;

	public final int USE_SNEAK_RECOIL = 0;
	public final int USE_ADS_RECOIL = 1;
	public final int USE_ADSSNEAK_RECOIL = 2;
	
	/**データ名*/
	int dataname;
	/**データ*/
	Object data;

	//データ書き込み
	void setData (int name,boolean value){
		switch(name){
			case USE_SNEAK_RECOIL:
				((GunData)data).UseSneakRecoil=value;
			break;
			case USE_ADS_RECOIL:
				((GunData)data).UseADSRecoil=value;
			break;
			case USE_ADSSNEAK_RECOIL:
				((GunData)data).UseADSSneakRecoil=value;
			break;
		}
	}
	//データ取得用
	boolean getData(int name){
		switch(name){
			case USE_SNEAK_RECOIL:
				return ((GunData)data).UseSneakRecoil;
			case USE_ADS_RECOIL:
				return ((GunData)data).UseADSRecoil;
			case USE_ADSSNEAK_RECOIL:
				return ((GunData)data).UseADSSneakRecoil;
		}
		return false;
	}
}
