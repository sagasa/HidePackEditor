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
import types.GunData;
import types.GunData.GunDataList;
import valueEditer.valueSetPanels.NumberSetPanel;
import valueEditer.valueSetPanels.StringSetPanel;
import types.ImageData;

public class EditPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 7606847944591257035L;

	/** 中身なしパネル用定数 */
	static final int BLANK_PANEL = 0;
	/** 名前設定用定数 */
	static final int GUN_NAME_PANEL = 1;
	/** その他数値パラメーター設定用定数 */
	static final int GUN_INFO_PANEL = 2;
	/** アイコン設定用定数 */
	static final int GUN_ICON_PANEL = 3;
	/** 銃のリコイル設定用定数 */
	static final int GUN_RECOIL_PANEL = 4;
	/** 銃の使用する弾設定用定数 */
	static final int GUN_BULLET_PANEL = 6;
	/** 銃の使用するアタッチメント設定用定数 */
	static final int GUN_ATTACHMENTS_PANEL = 7;
	/** 削除+コピペ */
	static final int DELETE_PANEL = 8;

	/** 名前設定用定数 */
	static final int BULLET_NAME_PANEL = 11;

	/** エディターのモード */
	int PanelMode;

	//編集先のインスタンス
	GunData gunData;
	BulletData bulletdata;

	LineBorder border = new LineBorder(Color.black, 1, false);

	/** モードを引数にインスタンス */
	public EditPanel(int mode, GunData data) {
		PanelMode = mode;
		gunData = data;
		write();
	}

	/** モードを引数にインスタンス */
	public EditPanel(int mode, BulletData data) {
		PanelMode = mode;
		bulletdata = data;
		write();
	}

	void write() {
		removeAll();
		// System.out.println("init");
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
		case GUN_INFO_PANEL:
			this.setBorder(border);
			this.setBounds(5, 60, 250, 0);
			this.setLayout(null);
			gunDataPanel(0);
			break;
		case GUN_RECOIL_PANEL:
			this.setOpaque(false);
			this.setBounds(5, 264, 505, 240);
			this.setLayout(null);
			RecoilEditer editer = new RecoilEditer(gunData);
			editer.setBounds(0,0,this.getWidth(),this.getHeight());
			this.add(editer);
			break;
		case GUN_ATTACHMENTS_PANEL:
			gunAttachmentPanel();
			break;
		case GUN_BULLET_PANEL:
			gunMagazinePanel();
		break;
		case BULLET_NAME_PANEL:
		}
		repaint();
	}
	//===========================================
	//                弾用パネル
	//===========================================


	//===========================================
	//                銃用パネル
	//===========================================
	//アタッチメント選択パネル
	void gunAttachmentPanel() {
		this.setBorder(border);
		this.setBounds(390, 125, 120, 110);
		this.setLayout(null);

		ListChooser attachmentsChooser = new ListChooser(ListChooser.GUN_ATTACHHMENT_LIST,gunData);
		attachmentsChooser.setBounds(5, 5, this.getWidth()-10, this.getHeight()-10);
		this.add(attachmentsChooser);
	}

	//弾選択パネル
	void gunMagazinePanel(){
		this.setBorder(border);
		this.setBounds(260, 125, 120, 110);
		this.setLayout(null);

		ListChooser magChooser = new ListChooser(ListChooser.GUN_MAGAZINE_LIST,gunData);
		magChooser.setBounds(5, 5, this.getWidth()-10, this.getHeight()-10);
		this.add(magChooser);
	}

	// 基本パラメーターパネル オフセットはデフォルト0
	void gunDataPanel(int cate) {
		gunDataPanel(cate, 0, true);
	}

	// 基本パラメーターパネル
	void gunDataPanel(int cate, int offset) {
		gunDataPanel(cate, offset, true);
	}

	// 基本パラメーターパネル
	void gunDataPanel(int cate, int offset, boolean canEdit) {
		int p = offset;
		for (GunDataList settingData : GunDataList.values()) {
			// カテゴリ分け -1以外なら
			if (settingData.getCate() == cate) {
				NumberSetPanel panel = new NumberSetPanel(settingData, gunData, canEdit);
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

	// 削除パネル
	void deletePanel() {
		this.setBorder(border);
		this.setBounds(260, 5, 250, 50);
		this.setLayout(null);

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

	// アイコン設定パネル
	void gunIconPanel() {
		this.setBorder(border);
		this.setBounds(260, 60, 250, 60);
		this.setLayout(null);

		ImageData image;

		// 見つかれば設定された画像見つからなければnullImage
		if (MainWindow.iconMap.containsKey(gunData.getDataString(GunDataList.ICON))) {
			image = MainWindow.iconMap.get(gunData.getDataString(GunDataList.ICON));
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
		IconList.setSelectedItem(gunData.getDataString(GunDataList.ICON));
		IconList.setActionCommand("iconSet");
		this.add(IconList);

	}

	// 名前設定パネル
	void gunNamePanel() {
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
		// System.out.println(e.getActionCommand());
		// アイコン設定
		if (e.getActionCommand() == "iconSet") {
			String name = Pattern.compile("]$")
					.matcher(Pattern.compile("^(.*)selectedItemReminder=").matcher(e.toString()).replaceAll(""))
					.replaceAll("");
			GunDataList.ICON.setData(gunData, name);
			//System.out.println(GunDataList.ICON.getData(gunData));
			write();
		}
	}
}