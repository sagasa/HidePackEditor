package valueEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JCheckBox;

import helper.ArrayEditer;
import types.GunData;
import types.GunData.GunDataList;
import types.base.DataBase;

public class CheckBoxPanel extends JCheckBox implements ActionListener {
	private static final long serialVersionUID = 2176910712522625069L;

	public static final int USE_SNEAK_RECOIL = 0;
	public static final int USE_ADS_RECOIL = 1;
	public static final int USE_ADSSNEAK_RECOIL = 2;
	public static final int FIREMODE_SEMIAUTO = 10;
	public static final int FIREMODE_FULLAUTO = 11;
	public static final int FIREMODE_BURST = 12;
	public static final int FIREMODE_MINIGUN = 13;

	/** 表示名 */
	String name;
	/** データ名 */
	int dataname;
	/** データ */
	DataBase data;

	/** 通知先の保存 */
	ChangeListener target;

	/** 表示名,カテゴリID,データ */
	public CheckBoxPanel(String name, int cate, DataBase data) {
		this.setText(name);
		this.data = data;
		this.dataname = cate;
		this.addActionListener(this);
		this.setSelected(getData());
	}

	/** 変更通知リスナーを追加 */
	public void addChangeListener(ChangeListener l) {
		target = l;
	}

	// データ書き込み
	void setData(boolean value) {
		// System.out.println("set"+value);
		switch (dataname) {
		case USE_SNEAK_RECOIL:
			((GunData) data).UseSneakRecoil = value;
			break;
		case USE_ADS_RECOIL:
			((GunData) data).UseADSRecoil = value;
			break;
		case USE_ADSSNEAK_RECOIL:
			((GunData) data).UseADSSneakRecoil = value;
			break;
		case FIREMODE_BURST:
			if (value) {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.AddToArray(data.getDataStringArray(GunDataList.FIRE_MODE), "burst"));
			} else {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.RemoveFromArray(data.getDataStringArray(GunDataList.FIRE_MODE), "burst"));
			}
			break;
		case FIREMODE_FULLAUTO:
			if (value) {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.AddToArray(data.getDataStringArray(GunDataList.FIRE_MODE), "fullauto"));
			} else {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.RemoveFromArray(data.getDataStringArray(GunDataList.FIRE_MODE), "fullauto"));
			}
			break;
		case FIREMODE_MINIGUN:
			if (value) {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.AddToArray(data.getDataStringArray(GunDataList.FIRE_MODE), "minigun"));
			} else {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.RemoveFromArray(data.getDataStringArray(GunDataList.FIRE_MODE), "minigun"));
			}
			break;
		case FIREMODE_SEMIAUTO:
			if (value) {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.AddToArray(data.getDataStringArray(GunDataList.FIRE_MODE), "semiauto"));
			} else {
				data.setData(GunDataList.FIRE_MODE,
						ArrayEditer.RemoveFromArray(data.getDataStringArray(GunDataList.FIRE_MODE), "semiauto"));
			}
			break;
		}
	}

	// データ取得用
	boolean getData() {
		switch (dataname) {
		case USE_SNEAK_RECOIL:
			return ((GunData) data).UseSneakRecoil;
		case USE_ADS_RECOIL:
			return ((GunData) data).UseADSRecoil;
		case USE_ADSSNEAK_RECOIL:
			return ((GunData) data).UseADSSneakRecoil;
		case FIREMODE_BURST:
			return Arrays.asList(data.getDataStringArray(GunDataList.FIRE_MODE)).contains("burst");
		case FIREMODE_FULLAUTO:
			return Arrays.asList(data.getDataStringArray(GunDataList.FIRE_MODE)).contains("fullauto");
		case FIREMODE_MINIGUN:
			return Arrays.asList(data.getDataStringArray(GunDataList.FIRE_MODE)).contains("minigun");
		case FIREMODE_SEMIAUTO:
			return Arrays.asList(data.getDataStringArray(GunDataList.FIRE_MODE)).contains("semiauto");
		}
		return false;
	}

	// 更新
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.getSelectedObjects() == null) {
			setData(false);
			// panel.gunDataset(dataname);
		} else {
			setData(true);
		}
		if(target!=null){
			target.valueChange(ChangeListener.CHECK_CHANGE);
		}
	}
}