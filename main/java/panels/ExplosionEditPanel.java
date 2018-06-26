package panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import types.BulletData;
import types.BulletData.BulletDataList;
import types.Explosion;
import types.Explosion.ExplosionDataList;
import types.base.DataBase;
import types.base.EnumDataList;

public class ExplosionEditPanel extends JTabbedPane{
	/**爆発編集*/
	private static final long serialVersionUID = 9086347299026944347L;

	DataBase Data;

	public ExplosionEditPanel(BulletData data) {
		Data = data;
		this.addTab("Hit to Ground", makePanel((Explosion) Data.getDataObject(BulletDataList.EXP_ON_HIT_GROUND)));
		this.addTab("Hit to Entity", makePanel((Explosion) Data.getDataObject(BulletDataList.EXP_ON_HIT_ENTITY)));
		this.addTab("Timeout", makePanel((Explosion) Data.getDataObject(BulletDataList.EXP_ON_TIMEOUT)));
	}

	private JPanel makePanel(Explosion exp) {
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);

		int yOffset = 3;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.RANGE));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_BASE_PLAYER));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_COE_PLAYER));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_BASE_LIVING));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_COE_LIVING));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_BASE_TANK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_COE_TANK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_BASE_AIR));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.DAMAGE_COE_AIR));
		yOffset += 22;

		yOffset += 6;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_BASE_PLAYER));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_COE_PLAYER));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_BASE_LIVING));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_COE_LIVING));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_BASE_TANK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_COE_TANK));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_BASE_AIR));
		yOffset += 22;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.KNOCKBACK_COE_AIR));
		yOffset += 22;
		return infoPanel;
	}


	private NumberSetPanel makeNumPanel(int yOffset, DataBase data, EnumDataList type) {
		NumberSetPanel panel = new NumberSetPanel(data, type, true);
		panel.setTextBoxWidth(30);
		panel.setBounds(0, yOffset, 200, 20);
		return panel;
	}
}
