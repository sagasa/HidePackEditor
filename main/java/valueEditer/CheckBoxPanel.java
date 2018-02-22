package valueEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import types.GunData;

public class CheckBoxPanel extends JCheckBox implements ActionListener{
	private static final long serialVersionUID = 2176910712522625069L;

	public static final int USE_SNEAK_RECOIL = 0;
	public static final int USE_ADS_RECOIL = 1;
	public static final int USE_ADSSNEAK_RECOIL = 2;
	
	/**表示名*/
	String name;
	/**データ名*/
	int dataname;
	/**データ*/
	Object data;
	/**更新の対象*/
	EditPanel panel;
	
	/**表示名,カテゴリID,データ,更新するJPanel*/
	public CheckBoxPanel(String name,int cate, Object data,EditPanel panel){
		this.setText(name);
		this.data=data;
		this.dataname = cate;
		this.panel = panel;
		this.addActionListener(this);
		this.setSelected(getData());
	}
	//データ書き込み
	void setData (boolean value){
		//System.out.println("set"+value);
		switch(dataname){
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
	boolean getData(){
		switch(dataname){
			case USE_SNEAK_RECOIL:
				return ((GunData)data).UseSneakRecoil;
			case USE_ADS_RECOIL:
				return ((GunData)data).UseADSRecoil;
			case USE_ADSSNEAK_RECOIL:
				return ((GunData)data).UseADSSneakRecoil;
		}
		return false;
	}
	//更新
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.getSelectedObjects()==null){
			setData(false);
			panel.gunDataset(dataname);
		}else{
			setData(true);
		}
		panel.write();		
	}
}