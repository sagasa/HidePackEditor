package panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

import types.base.ChangeListener;
import types.base.DataBase;
import types.base.EnumDataList;
import types.guns.GunData;
import types.guns.GunRecoil;
import types.guns.GunRecoil.RecoilDataList;
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
		this.addTab("DEFAULT", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_DEFAULT)));
		this.addTab("SNEAK", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK)));
		this.addTab("ADS", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_ADS)));
		this.addTab("SBEAK+ADS", makePanel((GunRecoil) Data.getDataObject(GunDataList.RECOIL_SNEAK_ADS)));
		updateGraph();
	}

	private JPanel makePanel(GunRecoil recoil){
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);

		int yOffset = 3;
		BooleanSetPanel use = new BooleanSetPanel(recoil,RecoilDataList.USE, true);
		use.setBounds(50, yOffset, 200, 20);
		infoPanel.add(use);
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_YAW_BASE));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_YAW_SPREAD));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_PITCH_BASE));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_PITCH_SPREAD));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_YAW_RETURN));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MAX_PITCH_RETURN));		
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_YAW_BASE));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_YAW_SPREAD));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_PITCH_BASE));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_PITCH_SPREAD));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_YAW_RETURN));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.MIN_PITCH_RETURN));		
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.YAW_RECOIL_TICK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.PITCH_RECOIL_TICK));		
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.YAW_RETURN_TICK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.PITCH_RETURN_TICK));		
		yOffset += 28;

		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.POWER_SHOOT));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset,recoil,RecoilDataList.POWER_TICK));		
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

	private NumberSetPanel makeNumPanel(int yOffset,DataBase data,EnumDataList type){
		NumberSetPanel panel = new NumberSetPanel(data, type , true);
		panel.addChangeListener(this, ChangeListener.GRAPH_UPDATE);
		panel.setTextBoxWidth(40);
		panel.setBounds(0, yOffset, 180, 20);
		return panel;
	}

	@Override
	public void ValueChange(int cate, Object value) {
		updateGraph();
	}

	//タブの変更を検知
	@Override
	public void stateChanged(ChangeEvent e) {
		updateGraph();
	}

}
