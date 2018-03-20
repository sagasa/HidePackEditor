package valueEditer;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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


	public RecoilEditer(GunData data){
		gundata = data;
		//通常リコイル
		this.addTab("Default", setPanel(1));
		this.addTab("Sneak", setPanel(2));
		this.addTab("ADS", setPanel(3));
		this.addTab("ADS+Sneak", setPanel(4));
		//Color.decode(nm)

	}

	/**状態ごとの設定パネル*/
	JPanel setPanel(int offset){
		JPanel Panel = new JPanel();
		Panel.setLayout(null);
		//罫線
		GraphPanel graph = new GraphPanel(GraphPanel.RECOIL_RULE,null);
		graph.setBounds(5,5,160,160);
		//Panel.add(graph);
		//グラフ
		value_graph = new GraphPanel(GraphPanel.RECOIL_GRAPH,gundata,offset);
		value_graph.setBounds(5,5,160,160);
		Panel.add(value_graph);
		//設定ボタン
		JTabbedPane tab = new JTabbedPane();
		tab.setBounds(170, 0, 325, 165);
		//MAXリコイル設定パネル
		JPanel MAX_tab = new JPanel();
		MAX_tab.setLayout(null);
		valueSetPanel(offset+4,MAX_tab);
		try {
			tab.addTab("MAX",new ImageIcon(ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/max.png"))), MAX_tab);
		} catch (IOException e) {}

		JPanel MIN_tab = new JPanel();
		MIN_tab.setLayout(null);
		valueSetPanel(offset,MIN_tab);
		try {
			tab.addTab("MIN",new ImageIcon(ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/min.png"))), MIN_tab);
		} catch (IOException e) {}

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
				panel.setBounds(5, 5 + p * 24, 310, 20);
				panel.addChangeListener(this);
				Panel.add(panel);
				p++;
			}
		}
	}

	JPanel graph(){
		GraphPanel graph = new GraphPanel(GraphPanel.RECOIL_RULE,null);
		graph.setBounds(5,5,160,160);
		return graph;
	}

	@Override
	public void valueChange() {
		//グラフ再描画
		this.repaint();
	}

}
