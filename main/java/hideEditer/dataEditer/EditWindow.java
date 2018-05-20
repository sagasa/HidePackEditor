package hideEditer.dataEditer;


import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import hideEditer.MainWindow;
import hideEditer.dataEditer.EditPanel.PanelList;
import types.BulletData;
import types.GunData;
import types.base.DataBase;

/**アクションリスナーのためにstaticにしていない 実質staticクラス インスタンスはMainWindowに格納*/
public class EditWindow{
	/**現在開いている編集ウィンドウ*/
	public static JPanel OpenWindow;
	
	/**エディターを開く*/
	public void MakeWindow(JFrame window) {
		OpenWindow = new JPanel();
		LineBorder border = new LineBorder(Color.black, 1, false);
		OpenWindow.setLayout(null);
		OpenWindow.setBorder(border);
		OpenWindow.setBackground(Color.WHITE);
		//OpenWindow.setBackground(Color.ORANGE);
		window.add(OpenWindow);

	}

	static JTextField shortName2;
	static JTextField displayName2;
	static DataBase data;

	/**チェックボックス*/
	JCheckBox[] canUse = new JCheckBox[3];


	/**Gunエディターを描画*/
	public void wrietGunEditer(GunData d) {
		data = d;
		OpenWindow.removeAll();
		for(PanelList p :PanelList.values()){
			if (p.mode == PanelList.GUN_PANELS){
				EditPanel panel = new EditPanel(p,data);
				OpenWindow.add(panel);
			}
		}
		OpenWindow.repaint();
	}
	
	/**Bulletエディターを描画*/
	public void wrietBulletEditer(BulletData d) {
		data = d;
		OpenWindow.removeAll();
		for(PanelList p :PanelList.values()){
			if (p.mode == PanelList.BULLET_PANELS){
				EditPanel panel = new EditPanel(p,data);
				OpenWindow.add(panel);
			}
		}
		OpenWindow.repaint();
	}


	/**リサイズ+パネルサイズを再計算*/
	public static void reSize(){
		OpenWindow.setBounds(200, 0, 770, MainWindow.MainWindow.getHeight()-65);
	}

	/**エディターを閉じる*/
	public void clearEditer() {
		OpenWindow.removeAll();
		OpenWindow.repaint();
	}

}
