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

	/**リコイルエディタ*/
	private static final long serialVersionUID = -845508199461026943L;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	public RecoilEditPanel(GunData data) {
		this.setLayout(null);
		this.setBorder(blackBorder);
		GraphPanel graph = new GraphPanel(120);
		graph.setBounds(5,5, 240, 240);
		this.add(graph);
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("DEFAULT", makePanel((GunRecoil) data.getDataObject(GunDataList.RECOIL_DEFAULT),"DEFAULT",ChangeListener.GUN_RECOIL_DEFAULT));
		tab.setBounds(5, 250, 240, 300);
		this.add(tab);
	}

	private JPanel makePanel(GunRecoil recoil,String lore,int cate){
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);

		int yOffset = 3;
		NumberSetPanel range = new NumberSetPanel(lore + "_MaxPitchBase", recoil.pitch_base_max + "", true, true);
		range.setTextBoxWidth(40);
		range.setLimit(null, 0f);
		range.addChangeListener(this, ChangeListener.RECOIL_PITCH_MAX_BASE | cate);
		range.setBounds(0, yOffset, 230, 20);
		infoPanel.add(range);
		yOffset += 22;

		return infoPanel;
	}

	@Override
	public void ValueChange(int cate, Object value) {

	}

}
