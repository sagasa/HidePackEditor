package hideEditer.dataEditer;

import java.util.Arrays;

import javax.swing.JPanel;

import hideEditer.dataEditer.base.NumberSetPanel;
import types.GunData;
import types.GunData.GunDataList;
/**射撃モード+バースト時のレート 発射数など*/
public class FireModePanel extends JPanel implements ChangeListener{
	private static final long serialVersionUID = 7448329275013860416L;
	
	GunData Data;
	
	NumberSetPanel rate;
	NumberSetPanel number;
	
	public FireModePanel(GunData data) {
		Data = data;
		this.setLayout(null);
		this.setOpaque(false);
		CheckBoxPanel fullauto = new CheckBoxPanel("FullAuto",CheckBoxPanel.FIREMODE_FULLAUTO,Data);
		fullauto.setBounds(5,5, 100, 18);
		this.add(fullauto);
		CheckBoxPanel semiauto = new CheckBoxPanel("SemiAuto",CheckBoxPanel.FIREMODE_SEMIAUTO,Data);
		semiauto.setBounds(130,5, 100, 18);
		this.add(semiauto);
		CheckBoxPanel minigun = new CheckBoxPanel("MINIGUN",CheckBoxPanel.FIREMODE_MINIGUN,Data);
		minigun.setBounds(5,28, 100, 18);
		this.add(minigun);
		CheckBoxPanel burst = new CheckBoxPanel("Burst",CheckBoxPanel.FIREMODE_BURST,Data);
		burst.setBounds(130,28, 100, 18);
		burst.addChangeListener(this);
		this.add(burst);
		rate = new NumberSetPanel(GunDataList.BURST_INTERVAL, Data);
		rate.setBounds(5,50, 240, 18);
		this.add(rate);
		number = new NumberSetPanel(GunDataList.BURST_NUMBER, Data);
		number.setBounds(5,74, 240, 18);
		this.add(number);
		setBurstEnable();
	}

	void setBurstEnable(){
		boolean enable = Arrays.asList(Data.getDataStringArray(GunDataList.FIRE_MODE)).contains("burst");
		rate.setEnable(enable);
		number.setEnable(enable);
	}
	
	@Override
	public void valueChange(int event) {
		setBurstEnable();
	}
}
