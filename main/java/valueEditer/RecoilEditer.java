package valueEditer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**リコイル編集 タブでプレイヤーの状態を選択 グラフィカルで分かりやすく*/
public class RecoilEditer extends JTabbedPane{
	private static final long serialVersionUID = 2025133888410996321L;
	
	/**デフォルトのパネル*/
	JPanel defaultPanel;
	
	public RecoilEditer(){
		defaultPanel = new JPanel();
		defaultPanel.setLayout(null);
		defaultPanel.add(graph());
		this.addTab("Default", defaultPanel);
		
		
	}
	
	JPanel graph(){
		GraphPanel graph = new GraphPanel(GraphPanel.RECOIL_GRAPH,null);
		graph.setBounds(5,5,160,160);
		return graph;
	}
	
}
