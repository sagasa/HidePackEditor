package valueEditer;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import hideEditer.IconPrint;
import hideEditer.MainWindow;
import hideEditer.ResourcesList;
import types.GunData;
import types.GunData.GunDataList;
import types.ImageData;

public class EditPanel extends JPanel implements ActionListener {
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
	/** 削除+コピペ */
	static final int DELETE_PANEL = 6;

	/** エディターのモード */
	int PanelMode;

	GunData gunData;

	/** モードを引数にインスタンス */
	public EditPanel(int mode, GunData data) {
		PanelMode = mode;
		gunData = data;
		write();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	void write() {
		//System.out.println("init");
		this.removeAll();

		switch (PanelMode) {
		case GUN_NAME_PANEL:
			gunNamePanel();
		break;
		case GUN_ICON_PANEL:
			gunIconPanel();
		break;
		case DELETE_PANEL:
			 deletePanel();
		break;
		}
	}
	//削除パネル
	void deletePanel(){
		LineBorder border = new LineBorder(Color.black, 1, false);

		this.setBorder(border);
		this.setBounds(260, 5, 250, 50);
		this.setLayout(null);

		//コピーボタン
		JButton copy = new JButton("copy");
		copy.setBounds(5, 10, 80, 30);
		copy.setBorder(border);
		copy.addActionListener(this);
		copy.setActionCommand("copy");
		copy.setFont(new Font("BOLD", Font.BOLD, 14));
		copy.setBackground(Color.CYAN);
		this.add(copy);

		//貼り付けボタン
		JButton paste = new JButton("paste");
		paste.setBounds(90, 10, 80, 30);
		paste.setBorder(border);
		paste.addActionListener(this);
		paste.setActionCommand("paste");
		paste.setFont(new Font("BOLD", Font.BOLD, 14));
		paste.setBackground(Color.CYAN);
		this.add(paste);

		//削除ボタン
		JButton delete = new JButton("delete");
		delete.setBounds(190, 10, 50, 30);
		delete.setBorder(border);
		delete.addActionListener(this);
		delete.setActionCommand("delete");
		delete.setFont(new Font("BOLD", Font.BOLD, 14));
		delete.setBackground(Color.RED);
		this.add(delete);
	}

	//アイコン設定パネル
	void gunIconPanel(){
		LineBorder border = new LineBorder(Color.black, 1, false);

		this.setBorder(border);
		this.setBounds(260, 60, 250, 60);
		this.setLayout(null);

		ImageData image;

		//見つかれば設定された画像見つからなければnullImage
		if (MainWindow.iconMap.containsKey(GunDataList.ICON.getData(gunData).toString())){
			image = MainWindow.iconMap.get(GunDataList.ICON.getData(gunData).toString());
		}else{
			image = ResourcesList.nullImage;
		}

		IconPrint icon1 = new IconPrint(image);
		icon1.setBorder(border);
		icon1.setBounds(5, 5, 50, 50);
		this.add(icon1);

		JLabel IconSize = new JLabel("Size: x"+image.getWidth()+", y"+image.getHeight()+" Name: "+image.ImageName);
		IconSize.setBounds(60, 38, 190, 18);
		IconSize.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(IconSize);

		JComboBox<String> IconList = new JComboBox<String>();
		IconList.addActionListener(this);
		IconList.addItem("");
		for (ImageData data:MainWindow.iconMap.values()){
			IconList.addItem(data.ImageName);
		}
		IconList.setBounds(60, 10, 80, 20);
		IconList.setSelectedItem(GunDataList.ICON.getData(gunData).toString());
		IconList.setActionCommand("iconSet");
		this.add(IconList);

	}

	
	// 名前設定パネル
	void gunNamePanel() {
		LineBorder border = new LineBorder(Color.black, 1, false);

		this.setBorder(border);
		this.setBounds(5, 5, 250, 50);
		this.setLayout(null);

		int yPointer = 3;

		StringSetPanel name1 = new StringSetPanel(GunDataList.DISPLAY_NAME, gunData);
		name1.setBounds(0, yPointer, 250, 20);
		this.add(name1);
		yPointer += 25;

		StringSetPanel name2 = new StringSetPanel(GunDataList.SHORT_NAME, gunData);
		name2.setBounds(0, yPointer, 250, 20);
		this.add(name2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(e.getActionCommand());
		//アイコン設定
		if(e.getActionCommand() == "iconSet"){
			GunDataList.ICON.setData(gunData,Pattern.compile("]$").matcher(Pattern.compile("^(.*)selectedItemReminder=").matcher(e.toString()).replaceAll("")).replaceAll(""));
		}
	} 
}