package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import hideEditer.IconPrint;
import hideEditer.MainWindow;
import hideEditer.ResourcesList;
import types.BulletData;
import types.BulletData.BulletDataList;
import types.GunData;
import types.GunData.GunDataList;
import valueEditer.valueSetPanels.NumberSetPanel;
import valueEditer.valueSetPanels.StringSetPanel;
import types.ImageData;
import types.base.DataBase;

public class EditPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 7606847944591257035L;

	/** エディターのモード */
	PanelList PanelMode;

	//編集先のインスタンス
	DataBase Data;

	LineBorder border = new LineBorder(Color.black, 1, false);

	/** モードを引数にインスタンス */
	public EditPanel(PanelList mode, DataBase data) {
		PanelMode = mode;
		Data = data;
		this.setBounds(PanelMode.size);
		this.setBorder(border);
		this.setLayout(null);
		write();
	}


	void write() {
		removeAll();
		// System.out.println("init");
		switch (PanelMode) {
		case GUN_NAME_PANEL:
			int yPointer = 3;

			StringSetPanel name1 = new StringSetPanel(GunDataList.DISPLAY_NAME, Data);
			name1.setBounds(0, yPointer, 250, 20);
			this.add(name1);
			yPointer += 25;

			StringSetPanel name2 = new StringSetPanel(GunDataList.SHORT_NAME, Data);
			name2.setBounds(0, yPointer, 250, 20);
			this.add(name2);
			break;
		case GUN_ICON_PANEL:
			IconPanel();
			break;
		case GUN_DELETE_PANEL:
			deletePanel();
			break;
		case GUN_INFO_PANEL:
			gunDataPanel(GunDataList.OPTIONS,0,true);
			break;
		case GUN_RECOIL_PANEL:
			this.setOpaque(false);
			this.setBorder(null);
			RecoilEditer editer = new RecoilEditer((GunData)Data);
			editer.setBounds(0,0,this.getWidth(),this.getHeight());
			this.add(editer);
			break;
		case GUN_ATTACHMENTS_PANEL:
			ListChooser attachmentsChooser = new ListChooser(ListChooser.GUN_ATTACHHMENT_LIST,(GunData)Data);
			attachmentsChooser.setBounds(5, 5, this.getWidth()-10, this.getHeight()-10);
			this.add(attachmentsChooser);
			break;
		case GUN_BULLET_PANEL:
			ListChooser magChooser = new ListChooser(ListChooser.GUN_MAGAZINE_LIST,(GunData)Data);
			magChooser.setBounds(5, 5, this.getWidth()-10, this.getHeight()-10);
			this.add(magChooser);
		break;
		case GUN_DAMAGE_DIAMETER_PANEL:
			gunDataPanel(GunDataList.DAMAGE_DIAMETER,0,true);
			break;
		case GUN_FIREMODE_PANEL:
			FireModePanel firemode = new FireModePanel((GunData)Data);
			firemode.setBounds(0,0,this.getWidth(),this.getHeight());
			this.add(firemode);
			break;
		case GUN_SOUND_PANEL:
			SoundSetPanel shoot = new SoundSetPanel(Data, SoundSetPanel.GUN_SHOOT_SOUND);
			shoot.setBounds(0, 0, 250,100);
			this.add(shoot);
			SoundSetPanel reload = new SoundSetPanel(Data, SoundSetPanel.GUN_RELOAD_SOUND);
			reload.setBounds(0, 105, 250,100);
			this.add(reload);
			break;
		case BULLET_DELETE_PANEL:
			deletePanel();
			break;
		case BULLET_ICON_PANEL:
			IconPanel();
			break;
		case BULLET_INFO_PANEL:
			bulletDataPanel(BulletDataList.BULLET_INFO,0,true);
			break;
		case BULLET_DAMAGE_PANEL:
			bulletDataPanel(BulletDataList.BULLET_HIT_DAMAGE,0,true);
			bulletDataPanel(BulletDataList.BULLET_HIT_KNOCKBACK,4,true);
			break;
		case BULLET_EXP_PANEL:
			bulletDataPanel(BulletDataList.BULLET_EXP_DAMAGE,0,true);
			bulletDataPanel(BulletDataList.BULLET_EXP_KNOCKBACK,9,true);
			break;
		case BULLET_NAME_PANEL:
			int yPointer1 = 3;

			StringSetPanel name11 = new StringSetPanel(BulletDataList.DISPLAY_NAME, Data);
			name11.setBounds(0, yPointer1, 250, 20);
			this.add(name11);
			yPointer1 += 25;

			StringSetPanel name21 = new StringSetPanel(BulletDataList.SHORT_NAME, Data);
			name21.setBounds(0, yPointer1, 250, 20);
			this.add(name21);
			break;
		default:
			break;
		}
		repaint();
	}

	// 基本パラメーターパネル
	void gunDataPanel(int cate, int offset, boolean canEdit) {
		int p = offset;
		for (GunDataList settingData : GunDataList.values()) {
			// カテゴリ分け -1以外なら
			if (settingData.getCate() == cate) {
				NumberSetPanel panel = new NumberSetPanel(settingData, Data, canEdit);
				panel.setBounds(5, 5 + p * 24, this.getWidth() - 10, 20);
				this.add(panel);
				p++;
			}
		}
		// 高さだけ上書き
		Rectangle size = this.getBounds();
		size.height = p * 24 + 6;
		this.setBounds(size);
	}
	// 基本パラメーターパネル
		void bulletDataPanel(int cate, int offset, boolean canEdit) {
			int p = offset;
			for (BulletDataList settingData : BulletDataList.values()) {
				// カテゴリ分け -1以外なら
				if (settingData.getCate() == cate) {
					NumberSetPanel panel = new NumberSetPanel(settingData, Data, canEdit);
					panel.setBounds(5, 5 + p * 24, this.getWidth() - 10, 20);
					this.add(panel);
					p++;
				}
			}
			// 高さだけ上書き
			Rectangle size = this.getBounds();
			size.height = p * 24 + 6;
			this.setBounds(size);
		}

	void IconPanel(){
		ImageData image;

		// 見つかれば設定された画像見つからなければnullImage
		String nowData;
		if (Data instanceof GunData){
			nowData = Data.getDataString(GunDataList.ICON);
		}else{
			nowData = Data.getDataString(BulletDataList.ICON);
		}
		if (MainWindow.iconMap.containsKey(nowData)) {
			image = MainWindow.iconMap.get(nowData);
		} else {
			image = ResourcesList.nullImage;
		}

		IconPrint icon1 = new IconPrint(image);
		icon1.setBorder(border);
		icon1.setBounds(5, 5, 50, 50);
		this.add(icon1);

		JLabel IconLore = new JLabel("IconInfo");
		IconLore.setBounds(60, 5, 110, 18);
		IconLore.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(IconLore);

		JLabel IconSize = new JLabel("Size: " + image.getWidth() + "x" + image.getHeight() + " Name:");
		IconSize.setBounds(60, 38, 110, 18);
		IconSize.setFont(new Font("BOLD", Font.BOLD, 12));
		this.add(IconSize);

		JComboBox<String> IconList = new JComboBox<String>();
		IconList.addActionListener(this);
		IconList.addItem("");
		for (ImageData data : MainWindow.iconMap.values()) {
			IconList.addItem(data.ImageName);
		}
		IconList.setBounds(170, 38, 75, 18);
		IconList.setSelectedItem(Data.getDataString(GunDataList.ICON));
		IconList.setActionCommand("iconSet");
		this.add(IconList);
	}
	// 削除パネル
	void deletePanel() {
		// コピーボタン
		JButton copy = new JButton("copy");
		copy.setBounds(5, 10, 80, 30);
		copy.setBorder(border);
		copy.addActionListener(this);
		copy.setActionCommand("copy");
		copy.setFont(new Font("BOLD", Font.BOLD, 14));
		copy.setBackground(Color.CYAN);
		this.add(copy);

		// 貼り付けボタン
		JButton paste = new JButton("paste");
		paste.setBounds(90, 10, 80, 30);
		paste.setBorder(border);
		paste.addActionListener(this);
		paste.setActionCommand("paste");
		paste.setFont(new Font("BOLD", Font.BOLD, 14));
		paste.setBackground(Color.CYAN);
		this.add(paste);

		// 削除ボタン
		JButton delete = new JButton("delete");
		delete.setBounds(190, 10, 50, 30);
		delete.setBorder(border);
		delete.addActionListener(this);
		delete.setActionCommand("delete");
		delete.setFont(new Font("BOLD", Font.BOLD, 14));
		delete.setBackground(Color.RED);
		this.add(delete);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println(e.getActionCommand());
		// アイコン設定
		if (e.getActionCommand() == "iconSet") {
			String name = Pattern.compile("]$")
					.matcher(Pattern.compile("^(.*)selectedItemReminder=").matcher(e.toString()).replaceAll(""))
					.replaceAll("");
			Data.setData(GunDataList.ICON, name);
			//System.out.println(GunDataList.ICON.getData(gunData));
			write();
		}
	}
	enum PanelList{
		/** 名前設定用定数 */
		GUN_NAME_PANEL(new Rectangle(5, 5, 250, 50),0),
		/** その他数値パラメーター設定用定数 */
		GUN_INFO_PANEL(new Rectangle(5, 60, 250, 0),0),
		/** アイコン設定用定数 */
		GUN_ICON_PANEL(new Rectangle(260, 60, 250, 60),0),
		/** 銃のリコイル設定用定数 */
		GUN_RECOIL_PANEL(new Rectangle(5,315, 505, 240),0),
		/** 銃の使用する弾設定用定数 */
		GUN_BULLET_PANEL(new Rectangle(260, 125, 250, 100),0),
		/** 銃の使用するアタッチメント設定用定数 */
		GUN_ATTACHMENTS_PANEL(new Rectangle(260, 230, 250, 100),0),
		/** 削除+コピペ */
		GUN_DELETE_PANEL(new Rectangle(260, 5, 250, 50),0),
		/** ダメージ倍率設定パネル*/
		GUN_DAMAGE_DIAMETER_PANEL(new Rectangle(515, 5, 250, 0),0),
		/** サウンド設定パネル*/
		GUN_SOUND_PANEL(new Rectangle(515, 318, 250, 205),0),
		/** 射撃モード設定パネル*/
		GUN_FIREMODE_PANEL(new Rectangle(515, 210, 250, 100),0),

		/** 名前設定用定数 */
		BULLET_NAME_PANEL(new Rectangle(5, 5, 250, 50),1),
		/** その他数値パラメーター設定用定数 */
		BULLET_INFO_PANEL(new Rectangle(5, 60, 250, 0),1),
		/** ダメージ設定用定数 */
		BULLET_DAMAGE_PANEL(new Rectangle(5, 167, 250, 0),1),
		/** 爆発設定用定数 */
		BULLET_EXP_PANEL(new Rectangle(260, 125, 250, 0),1),
		/** アイコン設定用定数 */
		BULLET_ICON_PANEL(new Rectangle(260, 60, 250, 60),1),
		/** 削除+コピペ */
		BULLET_DELETE_PANEL(new Rectangle(260, 5, 250, 50),1),
		;
		public static final int GUN_PANELS = 0;
		public static final int BULLET_PANELS = 1;
		Rectangle size;
		int mode;
		PanelList(Rectangle Bounds,int m){
			size = Bounds;
			mode = m;
		}
	}
}