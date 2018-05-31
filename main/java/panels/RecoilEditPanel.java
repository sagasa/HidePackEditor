package panels;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import types.GunData;
import types.GunData.GunDataList;
import types.base.ChangeListener;
import types.base.GunRecoil;

public class RecoilEditPanel extends JPanel implements ChangeListener{

	/**パネル外に配置するためのフック*/
	public static GraphPanel Graph = new GraphPanel(120);
	
	/**リコイルエディタ*/
	private static final long serialVersionUID = -845508199461026943L;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	public RecoilEditPanel(GunData data) {
		this.setLayout(null);
		this.setBorder(blackBorder);
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("DEFAULT", makePanel((GunRecoil) data.getDataObject(GunDataList.RECOIL_DEFAULT),ChangeListener.GUN_RECOIL_DEFAULT));
		tab.setBounds(5, 5, 240, 490);
		this.add(tab);
	}

	private JPanel makePanel(GunRecoil recoil,int cate){
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);

		int yOffset = 3;
		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalBase",recoil.pitch_base_max+"",true,ChangeListener.RECOIL_PITCH_MAX_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalSpread",recoil.pitch_spread_max+"",true,ChangeListener.RECOIL_PITCH_MAX_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxVerticalShake",recoil.pitch_shake_max+"",true,ChangeListener.RECOIL_PITCH_MAX_SHAKE | cate));
		yOffset += 22;
		
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalBase",recoil.yaw_base_max+"",true,ChangeListener.RECOIL_YAW_MAX_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalSpread",recoil.yaw_spread_max+"",true,ChangeListener.RECOIL_YAW_MAX_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MaxHorizontalShake",recoil.yaw_shake_max+"",true,ChangeListener.RECOIL_YAW_MAX_SHAKE | cate));
		yOffset += 28;
	
		infoPanel.add(makeNumPanel(yOffset,"MinVerticalBase",recoil.pitch_base_min+"",true,ChangeListener.RECOIL_PITCH_MIN_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinVerticalSpread",recoil.pitch_spread_min+"",true,ChangeListener.RECOIL_PITCH_MIN_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinVerticalShake",recoil.pitch_shake_min+"",true,ChangeListener.RECOIL_PITCH_MIN_SHAKE | cate));
		yOffset += 22;
		
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalBase",recoil.yaw_base_min+"",true,ChangeListener.RECOIL_YAW_MIN_BASE | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalSpread",recoil.yaw_spread_min+"",true,ChangeListener.RECOIL_YAW_MIN_SPREAD | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"MinHorizontalShake",recoil.yaw_shake_min+"",true,ChangeListener.RECOIL_YAW_MIN_SHAKE | cate));
		yOffset += 28;
		
		infoPanel.add(makeNumPanel(yOffset,"VerticalRecoilTick",recoil.pitch_recoil_tick+"",true,ChangeListener.RECOIL_PITCH_TICK | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"VerticalReturnTick",recoil.pitch_return_tick+"",true,ChangeListener.RECOIL_PITCH_TICK_RETURN | cate));
		yOffset += 28;
		
		infoPanel.add(makeNumPanel(yOffset,"HorizontalRecoilTick",recoil.yaw_recoil_tick+"",true,ChangeListener.RECOIL_YAW_TICK | cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"HorizontalReturnTick",recoil.yaw_return_tick+"",true,ChangeListener.RECOIL_YAW_TICK_RETURN | cate));
		yOffset += 28;
		
		infoPanel.add(makeNumPanel(yOffset,"RecoilPower/Shoot",recoil.recoilPower_shoot+"",true,ChangeListener.RECOIL_POWER_SHOOT| cate));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,"RecoilPower/Tick",recoil.recoilPower_tick+"",true,ChangeListener.RECOIL_POWER_TICK | cate));
		yOffset += 28;
		return infoPanel;
	}

	private NumberSetPanel makeNumPanel(int yOffset,String lore,String value,boolean isFloat,int cate){
		NumberSetPanel panel = new NumberSetPanel(lore, value , true, isFloat);
		panel.setTextBoxWidth(40);
		panel.setLimit(null, 0f);
		panel.addChangeListener(this, cate);
		panel.setBounds(0, yOffset, 230, 20);
		return panel;
	}
	
	@Override
	public void ValueChange(int cate, Object value) {

	}

}
