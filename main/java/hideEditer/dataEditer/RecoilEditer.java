package hideEditer.dataEditer;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import hideEditer.dataEditer.base.NumberSetPanel;
import types.GunData;
import types.GunData.GunDataList;

/**リコイル編集 タブでプレイヤーの状態を選択 グラフィカルで分かりやすく*/
public class RecoilEditer extends JTabbedPane implements ChangeListener {
	private static final long serialVersionUID = 2025133888410996321L;

	//格納用
	GunData gundata;

	GraphPanel value_graph;

	static DefaultListModel<String> recoilListModel;
	static JList<String> recoilList;

	//変更用NumberSetPanelリスト
	ArrayList<NumberSetPanel> sneakPanels = new ArrayList<NumberSetPanel>();
	ArrayList<NumberSetPanel> ADSPanels = new ArrayList<NumberSetPanel>();
	ArrayList<NumberSetPanel> sneakADSPanels = new ArrayList<NumberSetPanel>();


	public RecoilEditer(GunData data){
		gundata = data;
		//通常リコイル
		this.addTab("Default", setPanel(GunDataList.MIN_DEFAULT_RECOIL));
		this.addTab("Sneak", setPanel(GunDataList.MIN_SNEAK_RECOIL));
		this.addTab("ADS", setPanel(GunDataList.MIN_ADS_RECOIL));
		this.addTab("ADS+Sneak", setPanel(GunDataList.MIN_ADS_SNEAK_RECOIL));
		setEnable();
	}

	/**状態ごとの設定パネル*/
	JPanel setPanel(int cate){
		JPanel Panel = new JPanel();
		Panel.setLayout(null);
		//グラフ 罫線
		value_graph = new GraphPanel(gundata,cate);
		value_graph.setBounds(5,5,200,200);
		Panel.add(value_graph);
		//使用の可否
		CheckBoxPanel check;
		switch(cate){
		case GunDataList.MIN_SNEAK_RECOIL:
			check = new CheckBoxPanel("UseSneakRecoil", CheckBoxPanel.USE_SNEAK_RECOIL, gundata);
			check.addChangeListener(this);
			check.setBounds(210, 5, 180, 20);
			Panel.add(check);
			break;
		case GunDataList.MIN_ADS_RECOIL:
			check = new CheckBoxPanel("UseSneakRecoil", CheckBoxPanel.USE_ADS_RECOIL, gundata);
			check.addChangeListener(this);
			check.setBounds(210, 5, 180, 20);
			Panel.add(check);
			break;
		case GunDataList.MIN_ADS_SNEAK_RECOIL:
			check = new CheckBoxPanel("UseSneakRecoil", CheckBoxPanel.USE_ADSSNEAK_RECOIL, gundata);
			check.addChangeListener(this);
			check.setBounds(210, 5, 180, 20);
			Panel.add(check);
			break;
		}
		//設定ボタン
		JTabbedPane tab = new JTabbedPane();
		tab.setBounds(210, 30, 285, 175);
		//MAXリコイル設定パネル
		JPanel MAX_tab = new JPanel();
		MAX_tab.setLayout(null);
		valueSetPanel(cate+4,MAX_tab);
		try {
			tab.addTab("MAX",new ImageIcon(ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/max.png"))), MAX_tab);
		} catch (IOException e) {}

		JPanel MIN_tab = new JPanel();
		MIN_tab.setLayout(null);
		valueSetPanel(cate,MIN_tab);
		try {
			tab.addTab("MIN",new ImageIcon(ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/min.png"))), MIN_tab);
		} catch (IOException e) {}

		// ｲﾝﾌｫ
		JPanel info_tab = new JPanel();
		info_tab.setLayout(null);
		valueSetPanel(cate+8,info_tab);
		tab.addTab("info", info_tab);
		Panel.add(tab);
		return Panel;
	}
	/**数値設定パネル*/
	void valueSetPanel(int cate,JPanel Panel){
		int p = 0;
		for (GunDataList settingData : GunDataList.values()) {
			// カテゴリ分け -1以外なら
			if (settingData.getCate() == cate) {
				NumberSetPanel panel = new NumberSetPanel(settingData, gundata);
				panel.setBounds(5, 5 + p * 24, 270, 20);
				panel.addChangeListener(this);
				Panel.add(panel);
				//変更用にリストに追加
				if(cate == 2 || cate==6||cate==10){
					sneakPanels.add(panel);
				}
				if(cate == 3 || cate==7||cate==11){
					ADSPanels.add(panel);
				}
				if(cate == 4 || cate==8||cate==12){
					sneakADSPanels.add(panel);
				}
				p++;
			}
		}
	}
	/**数値変更パネルの編集可能かどうかを更新*/
	void setEnable(){
		for(NumberSetPanel panel:sneakPanels){
			panel.setEnabled(gundata.UseSneakRecoil);
		}
		for(NumberSetPanel panel:ADSPanels){
			panel.setEnabled(gundata.UseADSRecoil);
		}
		for(NumberSetPanel panel:sneakADSPanels){
			panel.setEnabled(gundata.UseADSSneakRecoil);
		}
	}

	@Override
	public void valueChange(int event) {
		setEnable();
		//グラフ再描画
		this.repaint();
	}

}
