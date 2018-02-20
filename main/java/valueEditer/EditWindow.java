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
		/*
		if (d != null){
			LineBorder border = new LineBorder(Color.black, 1, false);


			//名前設定パネル
			JPanel namePanel = new JPanel();
			namePanel.setBorder(border);
			namePanel.setBounds(5, 5, OpenWindow.getWidth()/2-5, 65);
			namePanel.setLayout(null);
			OpenWindow.add(namePanel);

			//ラベル
			JLabel shortName = new JLabel("ShortName :");
			shortName.setBounds(6, 4, 85, 24);
			shortName.setFont(new Font("BOLD", Font.BOLD, 13));
		//	shortName.setBorder(border);
			namePanel.add(shortName);

			//テキストボックス
			shortName2 = new JTextField((String) GunDataList.SHORT_NAME.getData(data));
			shortName2.setBounds(88, 5, namePanel.getWidth()-128, 24);
			shortName2.setBorder(border);
			namePanel.add(shortName2);

			//決定ボタン
			JButton shortName3 = new JButton("set");
			shortName3.setBounds(namePanel.getWidth()-36, 5, 30, 24);
			shortName3.setBorder(border);
			shortName3.addActionListener(this);
			shortName3.setActionCommand("setShortName");
			namePanel.add(shortName3);

			//ラベル
			JLabel displayName = new JLabel("DisplayName :");
			displayName.setBounds(6, 35, 85, 24);
			displayName.setFont(new Font("BOLD", Font.BOLD, 12));
		//	shortName.setBorder(border);
			namePanel.add(displayName);

			//テキストボックス
			displayName2 = new JTextField((String) GunDataList.DISPLAY_NAME.getData(data));
			displayName2.setBounds(88, 35, namePanel.getWidth()-128, 24);
			displayName2.setBorder(border);
			namePanel.add(displayName2);

			//決定ボタン
			JButton displayName3 = new JButton("set");
			displayName3.setBounds(namePanel.getWidth()-36, 35, 30, 24);
			displayName3.setBorder(border);
			displayName3.addActionListener(this);
			displayName3.setActionCommand("setDisplayName");
			namePanel.add(displayName3);

			//削除用パネル
			JPanel deletePanel = new JPanel();
			deletePanel.setBorder(border);
			deletePanel.setBounds(OpenWindow.getWidth()-70, 5, 65, 65);
			deletePanel.setLayout(null);
			OpenWindow.add(deletePanel);

			//決定ボタン
			JButton delete = new JButton("delete");
			delete.setBounds(5, 15, 55, 35);
			delete.setBorder(border);
			delete.addActionListener(this);
			delete.setActionCommand("delete");
			delete.setFont(new Font("BOLD", Font.BOLD, 14));
			delete.setBackground(Color.RED);
			deletePanel.add(delete);

			//アイコン設定パネル
			JPanel iconPanel = new JPanel();
			iconPanel.setBorder(border);
			iconPanel.setBounds(OpenWindow.getWidth()/2+5, 5, OpenWindow.getWidth()/2-80, 65);
			iconPanel.setLayout(null);
			OpenWindow.add(iconPanel);

			//アイコンの画像
			IconPrint icon1 = new IconPrint(MainWindow.iconMap.get(GunDataList.ICON.getData(data)));
			icon1.setBorder(border);
			icon1.setBounds(5, 5, 55, 55);
			iconPanel.add(icon1);
			//サイズを表示
			ImageIcon icon2 = new ImageIcon("./test.png");
			JLabel IconSize = new JLabel("Size: "+icon2.getIconWidth()+"x"+icon2.getIconHeight());
			IconSize.setBounds(65, 40, 85, 24);
			IconSize.setFont(new Font("BOLD", Font.BOLD, 14));
			iconPanel.add(IconSize);
			//アイコン選択
			Vector<String> combodata = new Vector<String>();
		    combodata.add("Swing");
		    combodata.add("Java2D");
		    combodata.add("Java3D");
		    combodata.add("JavaMail");

		    JComboBox combo = new JComboBox(combodata);


		    //パラメータ設定パネルの数
		    final int panelNumber = 6;
			//パラメータ設定パネル
		    JPanel[] settingPanel = new JPanel[panelNumber];
		    for (int i = 0;i < panelNumber;i++){
		    	settingPanel[i] = new JPanel();
				settingPanel[i].setBorder(border);
				settingPanel[i].setLayout(null);
				OpenWindow.add(settingPanel[i]);
		    }


		    //ポインタ
			int[] p = {0,0,1,1,1,0};
			//テキストボックス
			for(GunDataList settingData:GunDataList.values()){
				SetPanel panel;
				//カテゴリを取得
				int n = settingData.getCate();
				//カテゴリ分け -1以外なら
				if(n!= -1){
					//仕様の可否の設定がいるもののみ
					if (2<=n&&n<=4){
						panel = new SetPanel(settingData,data,data.UseRecoil[n-2]);
						//System.out.println(data.UseRecoil[n-2]+" "+(n-2));
					}else{
						panel = new SetPanel(settingData,data);
						//System.out.println("add");
					}
					panel.setBounds(5, 5+p[n]*24, OpenWindow.getWidth()/2-15, 20);
					//System.out.println(settingPanel[n].getWidth());
					settingPanel[n].add(panel);
					p[n]++;
				}
				//System.out.println(settingData.getName()+" "+settingData.getData(data));
			}
			//仕様の可否を設定するパネル
			int[] setting2 = {2,3,4};
			int i2 = 0;
			for (int i :setting2){
				canUse[i2] = new JCheckBox(settingCommand[i2]);
				canUse[i2].setBounds(OpenWindow.getWidth()/2-15-160, 5, 150, 20);
				canUse[i2].setActionCommand(settingCommand[i2]);
				canUse[i2].addActionListener(this);
				canUse[i2].setSelected(data.UseRecoil[i2]);
				settingPanel[i].add(canUse[i2]);

				i2++;
			}
			//サイズを決定
			//1行目
			int[] line1 = {0,5};
			int hight1 = 75;
			for (int i :line1){
				settingPanel[i].setBounds(5, hight1, OpenWindow.getWidth()/2-5, p[i]*24+6);
				hight1 += settingPanel[i].getHeight()+5;
				//System.out.println(settingPanel[i].getComponentCount());

			}

			//2行目
			int[] line2 = {1,2,3,4};
			int hight2 = 75;
			for (int i :line2){
				settingPanel[i].setBounds(OpenWindow.getWidth()/2+5, hight2, OpenWindow.getWidth()/2-10,p[i]*24+6);
				hight2 += settingPanel[i].getHeight()+5;
			}


		}
*/

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
