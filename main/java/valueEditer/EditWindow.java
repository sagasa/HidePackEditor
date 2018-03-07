package valueEditer;


import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import hideEditer.MainWindow;
import types.GunData;

/**アクションリスナーのためにstaticにしていない 実質staticクラス インスタンスはMainWindowに格納*/
public class EditWindow{
	/**現在開いている編集ウィンドウ*/
	public static JPanel OpenWindow;

	/**現在のパネルの幅*/
	public static int panelWidth;
	/**パネルの行数*/
	public static int panelNumber;


	/**エディターを開く*/
	public void MakeWindow(JFrame window) {

		OpenWindow = new JPanel();
		LineBorder border = new LineBorder(Color.black, 1, false);
		OpenWindow.setLayout(null);
		OpenWindow.setBorder(border);
		OpenWindow.setBackground(Color.WHITE);
		OpenWindow.setBounds(200, 20, 600, window.getHeight()-85);
		//OpenWindow.setBackground(Color.ORANGE);
		window.add(OpenWindow);

	}

	static JTextField shortName2;
	static JTextField displayName2;
	static GunData data;

	/**チェックボックス*/
	JCheckBox[] canUse = new JCheckBox[3];


	/**Gunエディターを描画*/
	public void wrietGunEditer(GunData d) {
		data = d;
		OpenWindow.removeAll();
		EditPanel test = new EditPanel(EditPanel.GUN_NAME_PANEL,data);
		OpenWindow.add(test);

		EditPanel test2 = new EditPanel(EditPanel.GUN_ICON_PANEL,data);
		OpenWindow.add(test2);

		EditPanel test3 = new EditPanel(EditPanel.DELETE_PANEL,data);
		OpenWindow.add(test3);

		EditPanel test4 = new EditPanel(EditPanel.GUN_INFO_PANEL,data);
		OpenWindow.add(test4);

		EditPanel test5 = new EditPanel(EditPanel.GUN_RECOIL_PANEL_0,data);
		OpenWindow.add(test5);

		EditPanel test6 = new EditPanel(EditPanel.GUN_RECOIL_PANEL_1,data);
		OpenWindow.add(test6);
		
		EditPanel test7 = new EditPanel(EditPanel.GUN_BULLET_PANEL,data);
		OpenWindow.add(test7);
		
		EditPanel test8 = new EditPanel(EditPanel.GUN_ATTACHMENTS_PANEL,data);
		OpenWindow.add(test8);

		OpenWindow.repaint();
	}


	/**リサイズ+パネルサイズを再計算*/
	public static void reSize(){
		OpenWindow.setBounds(200, 20, 515, MainWindow.MainWindow.getHeight()-85);
		panelNumber = 0;
		for(int width = OpenWindow.getWidth();width > 0;width-=300){
			panelNumber ++;
		}
		System.out.println(panelNumber+" "+ OpenWindow.getWidth());
	}

	/**エディターを閉じる*/
	public void clearEditer() {
		OpenWindow.removeAll();
		OpenWindow.repaint();
	}

}
