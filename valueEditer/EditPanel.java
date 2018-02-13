package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import types.GunData;
import types.GunData.GunDataList;

public class EditPanel extends JPanel {
	private static final long serialVersionUID = 7606847944591257035L;

	/** 中身なしパネル用定数 */
	static final int BLANK_PANEL = 0;
	/** 名前設定用定数 */
	static final int GUN_NAME_PANEL = 1;
	/** 名前その他設定用定数 */
	static final int GUN_INFO_PANEL = 2;
	/** アイコン設定用定数 */
	static final int GUN_ICON_PANEL = 3;
	/** 銃のリコイル設定用定数 */
	static final int GUN_RECOIL_PANEL = 4;
	/** 銃の使用する弾設定用定数 */
	static final int GUN_BULLET_PANEL = 5;

	/** エディターのモード */
	int PanelMode;

	GunData gunData;

	/** モードを引数にインスタンス */
	public EditPanel(int mode, GunData data) {
		PanelMode = mode;
		gunData = data;
		init();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	void init() {
		System.out.println("init");
		switch (PanelMode) {
		case GUN_NAME_PANEL:
			gunNamePanel();
			break;
		}
	}

	void gunNamePanel() {
		LineBorder border = new LineBorder(Color.black, 1, false);
		// 名前設定パネル
		this.setBorder(border);
		this.setBounds(5, 5, 250, 50);
		this.setLayout(null);

		int yPointer = 3;

		StringSetPanel name1 = new StringSetPanel(GunDataList.DISPLAY_NAME, gunData);
		name1.setBounds(0, yPointer, 250, 20);
		this.add(name1);
		yPointer += 20;

		StringSetPanel name2 = new StringSetPanel(GunDataList.SHORT_NAME, gunData);
		name2.setBounds(0, 28, 250, 20);
		this.add(name2);
		/*
		// ラベル
		JLabel shortName = new JLabel("ShortName :");
		shortName.setBounds(6, 4, 85, 24);
		shortName.setFont(new Font("BOLD", Font.BOLD, 13));
		// shortName.setBorder(border);
		this.add(shortName);

		// テキストボックス
		JTextField shortName2 = new JTextField((String) GunDataList.SHORT_NAME.getData(gunData));
		shortName2.setBounds(90, 5, this.getWidth() - 95, 24);
		shortName2.setBorder(border);
		this.add(shortName2);

		// ラベル
		JLabel displayName = new JLabel("DisplayName :");
		displayName.setBounds(6, 35, 85, 24);
		displayName.setFont(new Font("BOLD", Font.BOLD, 12));
		// shortName.setBorder(border);
		this.add(displayName);

		// テキストボックス
		JTextField displayName2 = new JTextField((String) GunDataList.DISPLAY_NAME.getData(gunData));
		displayName2.setBounds(90, 35, this.getWidth() - 95, 24);
		displayName2.setBorder(border);
		this.add(displayName2);
		*/
	}
}