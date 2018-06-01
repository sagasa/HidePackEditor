package panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

import types.base.ChangeListener;
import types.guns.GunData;
import types.guns.GunRecoil;
import types.guns.GunData.GunDataList;

public class RecoilEditPanel extends JTabbedPane implements ChangeListener, javax.swing.event.ChangeListener{

	/**パネル外に配置するためのフック*/
	public static GraphPanel Graph = new GraphPanel(120);

	/**リコイルエディタ*/
	private static final long serialVersionUID = -845508199461026943L;

	GunData Data;

	public RecoilEditPanel(GunData data) {
		Data = data;
		this.addChangeListener(this);
		this.addTab("DEFAULT", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_DEFAULT),ChangeListener.GUN_RECOIL_DEFAULT));
		this.addTab("SNEAK", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK),ChangeListener.GUN_RECOIL_SNEAK));
		this.addTab("ADS", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_ADS),ChangeListener.GUN_RECOIL_ADS));
		this.addTab("SBEAK+ADS", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK_ADS),ChangeListener.GUN_RECOIL_SNEAKADS));
		updateGraph();
	}

	private JPanel makePanel(GunRecoil recoil,int cate){
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);

		int yOffset = 3;
		BooleanSetPanel use = new BooleanSetPanel("Use This Statas", recoil.use, true);
		use.setBounds(50, yOffset, 200, 20);
		use.addChangeListener(this,ChangeListener.RECOIL_USE | cate);
		infoPanel.add(use);
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalBase",recoil.yaw_base_max+"",true,ChangeListener.RECOIL_YAW_MAX_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalBase",recoil.pitch_base_max+"",true,ChangeListener.RECOIL_PITCH_MAX_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalSpread",recoil.yaw_spread_max+"",true,ChangeListener.RECOIL_YAW_MAX_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalSpread",recoil.pitch_spread_max+"",true,ChangeListener.RECOIL_PITCH_MAX_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalShake",recoil.yaw_shake_max+"",true,ChangeListener.RECOIL_YAW_MAX_SHAKE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalShake",recoil.pitch_shake_max+"",true,ChangeListener.RECOIL_PITCH_MAX_SHAKE | cate));
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,"MinVerticalBase",recoil.yaw_base_min+"",true,ChangeListener.RECOIL_YAW_MIN_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalBase",recoil.pitch_base_min+"",true,ChangeListener.RECOIL_PITCH_MIN_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinVerticalSpread",recoil.yaw_spread_min+"",true,ChangeListener.RECOIL_YAW_MIN_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalSpread",recoil.pitch_spread_min+"",true,ChangeListener.RECOIL_PITCH_MIN_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinVerticalShake",recoil.yaw_shake_min+"",true,ChangeListener.RECOIL_YAW_MIN_SHAKE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalShake",recoil.pitch_shake_min+"",true,ChangeListener.RECOIL_PITCH_MIN_SHAKE | cate));
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,"VerticalRecoilTick",recoil.yaw_recoil_tick+"",false,ChangeListener.RECOIL_YAW_TICK | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"HorizontalReturnTick",recoil.pitch_return_tick+"",false,ChangeListener.RECOIL_PITCH_TICK_RETURN | cate));
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,"VerticalReturnTick",recoil.yaw_return_tick+"",false,ChangeListener.RECOIL_YAW_TICK_RETURN | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"HorizontalRecoilTick",recoil.pitch_recoil_tick+"",false,ChangeListener.RECOIL_PITCH_TICK | cate));
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,"RecoilPower/Shoot",recoil.recoilPower_shoot+"",false,ChangeListener.RECOIL_POWER_SHOOT| cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"RecoilPower/Tick",recoil.recoilPower_tick+"",false,ChangeListener.RECOIL_POWER_TICK | cate));
		yOffset += 28;
		return infoPanel;
	}

	private void updateGraph(){
		switch (this.getSelectedIndex()) {
		case 0:
			Graph.setRecoilData((GunRecoil) Data.getDataObject(GunDataList.RECOIL_DEFAULT));
			break;
		case 1:
			Graph.setRecoilData((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK));
			break;
		case 2:
			Graph.setRecoilData((GunRecoil) Data.getDataObject(GunDataList.RECOIL_ADS));
			break;
		case 3:
			Graph.setRecoilData((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK_ADS));
			break;
		}
	}

	private NumberSetPanel makeNumPanel(int yOffset,String lore,String value,boolean isFloat,int cate){
		NumberSetPanel panel = new NumberSetPanel(lore, value , true, isFloat);
		panel.setTextBoxWidth(40);
		panel.setLimit(null, 0f);
		panel.addChangeListener(this, cate);
		panel.setBounds(0, yOffset, 180, 20);
		return panel;
	}

	@Override
	public void ValueChange(int cate, Object value) {
		GunRecoil data = null;
		if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_RECOIL_DEFAULT){
			data = (GunRecoil) Data.getDataObject(GunDataList.RECOIL_DEFAULT);
		}else if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_RECOIL_ADS){
			data = (GunRecoil) Data.getDataObject(GunDataList.RECOIL_ADS);
		}else if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_RECOIL_SNEAK){
			data = (GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK);
		}else if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_RECOIL_SNEAKADS){
			data = (GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK_ADS);
		}
		if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MAX_BASE){
			data.pitch_base_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MAX_SPREAD){
			data.pitch_spread_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MAX_SHAKE){
			data.pitch_shake_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MAX_BASE){
			data.yaw_base_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MAX_SPREAD){
			data.yaw_spread_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MAX_SHAKE){
			data.yaw_shake_max = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MIN_BASE){
			data.pitch_base_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MIN_SPREAD){
			data.pitch_spread_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_PITCH_MIN_SHAKE){
			data.pitch_shake_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MIN_BASE){
			data.yaw_base_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MIN_SPREAD){
			data.yaw_spread_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_YAW_MIN_SHAKE){
			data.yaw_shake_min = (Float) value;
		}else if((cate&ChangeListener.DOMAIN_MASK) == ChangeListener.RECOIL_USE){
			data.use = (Boolean) value;
		}
		updateGraph();
	}

	//タブの変更を検知
	@Override
	public void stateChanged(ChangeEvent e) {
		updateGraph();
	}

}
