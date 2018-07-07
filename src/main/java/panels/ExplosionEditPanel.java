package panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import editer.ItemEditer;
import editer.ValueInfo;
import editer.ValueInfo.BulletDataList;
import editer.ValueInfo.ExplosionDataList;
import types.BulletData;
import types.Explosion;
import types.base.DataBase;
import types.base.EnumDataInfo;

public class ExplosionEditPanel extends JTabbedPane {
	/** 爆発編集 */
	private static final long serialVersionUID = 9086347299026944347L;

	DataBase Data;

	public ExplosionEditPanel(BulletData data) {
		Data = data;
		this.addTab("Hit to Ground", makePanel((Explosion) ValueInfo.getData(Data, BulletDataList.EXP_ON_HIT_GROUND)));
		this.addTab("Hit to Entity", makePanel((Explosion) ValueInfo.getData(Data, BulletDataList.EXP_ON_HIT_ENTITY)));
		this.addTab("Timeout", makePanel((Explosion) ValueInfo.getData(Data, BulletDataList.EXP_ON_TIMEOUT)));
	}

	private JPanel makePanel(Explosion exp) {
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);

		int yOffset = 3;
		infoPanel.add(makeNumPanel(yOffset, exp, ExplosionDataList.RANGE));
		yOffset += 22;
		// ダメージ関連
		for (EnumDataInfo type : ExplosionDataList.values()) {
			if (type.getCate() == ExplosionDataList.DAMAGE) {
				infoPanel.add(makeNumPanel(yOffset, exp, type));
				yOffset += 22;
			}
		}
		yOffset += 6;
		// ノックバック関連
		for (EnumDataInfo type : ExplosionDataList.values()) {
			if (type.getCate() == ExplosionDataList.KNOCKBACK) {
				infoPanel.add(makeNumPanel(yOffset, exp, type));
				yOffset += 22;
			}
		}
		ItemEditer.writeSoundEditer(0, yOffset, ExplosionDataList.SOUND, exp, infoPanel);
		return infoPanel;
	}

	private NumberSetPanel makeNumPanel(int yOffset, DataBase data, EnumDataInfo type) {
		NumberSetPanel panel = new NumberSetPanel(data, type, true);
		panel.setTextBoxWidth(30);
		panel.setBounds(0, yOffset, 210, 20);
		return panel;
	}
}
