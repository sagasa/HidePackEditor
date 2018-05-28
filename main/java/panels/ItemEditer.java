package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import editer.Window;
import types.BulletData;
import types.GunData;
import types.GunData.GunDataList;
import types.base.ChangeListener;
import types.base.DataBase;
import types.base.ItemInfo;

/** アイテムのデータ編集 */
public class ItemEditer extends JPanel implements ChangeListener, ActionListener {
	/** データ編集 */
	private static final long serialVersionUID = 2597125412794151634L;

	DataBase Data;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	public ItemEditer() {
		this.setBorder(blackBorder);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
	}

	/** GunDataの内容変更全部 */
	public void writeGunEditer(GunData data) {
		this.removeAll();
		Data = data;
		writeItemInfo(0, 0);
		// 細かいパラメータ描画
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(5, 110, 240, 0);
		writeGunNumberValue(infoPanel,1);
		this.add(infoPanel);
		//ダメージ倍率系
		JPanel damageChange = new JPanel();
		damageChange.setLayout(null);
		damageChange.setBorder(blackBorder);
		damageChange.setBounds(255, 120, 240, 0);
		writeGunNumberValue(damageChange,2);
		this.add(damageChange);
		//リコイルエディタ
		
	}
	private void writeGunNumberValue(JPanel root,int cate){
		int yOffset = 3;
		for (GunDataList type : GunDataList.values()) {
			if (type.getCate() == cate) {
				NumberSetPanel panel = new NumberSetPanel(Data,type,true);
				panel.setBounds(0, 0 + yOffset, 240, 20);
				root.add(panel);
				yOffset += 22;
			}
		}
		Rectangle bounds = root.getBounds();
		bounds.height = yOffset + 2;
		root.setBounds(bounds);
	}

	public void writeMagazineEditer(BulletData data) {

	}

	JComboBox<String> IconList;

	private void writeItemInfo(int x, int y) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 240, 98);
		ItemInfo info = getItemInfo();

		int yOffset = 3;
		StringSetPanel display = new StringSetPanel("DisplayName", info.displayName, true);
		display.addChangeListener(this, ChangeListener.ITEMINFO_DISPLAY);
		display.setBounds(x, y + yOffset, 240, 20);
		infoPanel.add(display);
		yOffset += 22;

		StringSetPanel shortName = new StringSetPanel("ShortName", info.shortName, true);
		shortName.addChangeListener(this, ChangeListener.ITEMINFO_SHORTNAME);
		shortName.setBounds(x, y + yOffset, 240, 20);
		infoPanel.add(shortName);
		yOffset += 22;

		BufferedImage image;

		// 見つかれば設定された画像見つからなければnullImage
		if (Window.IconMap.containsKey(info.iconName)) {
			image = Window.IconMap.get(info.iconName);
		} else {
			image = ResourceList.nullImage;
		}

		IconPrint icon1 = new IconPrint(image);
		icon1.setBorder(blackBorder);
		icon1.setBounds(5, yOffset + 5, 40, 40);
		infoPanel.add(icon1);

		JLabel IconLore = new JLabel("Icon");
		IconLore.setBounds(50, yOffset + 3, 110, 18);
		IconLore.setFont(new Font("BOLD", Font.BOLD, 13));
		infoPanel.add(IconLore);

		JLabel IconSize = new JLabel("Size: " + image.getWidth() + "x" + image.getHeight() + " Name:");
		IconSize.setBounds(50, yOffset + 28, 110, 18);
		IconSize.setFont(new Font("BOLD", Font.BOLD, 12));
		infoPanel.add(IconSize);

		IconList = new JComboBox<String>();
		IconList.addActionListener(this);
		IconList.addItem("");
		for (String data : Window.IconMap.keySet()) {
			IconList.addItem(data);
		}
		IconList.setBounds(150, yOffset + 28, 85, 18);
		IconList.setSelectedItem(info.iconName);
		IconList.setActionCommand("iconSet");
		infoPanel.add(IconList);

		this.add(infoPanel);
		this.repaint();
	}

	@Override
	public void ValueChange(int cate, Object value) {
		System.out.println(cate + " " + value);
		if (cate == ChangeListener.ITEMINFO_SHORTNAME) {
			ItemInfo info = getItemInfo();
			info.shortName = (String) value;
			setItemInfo(info);
		} else if (cate == ChangeListener.ITEMINFO_DISPLAY) {
			ItemInfo info = getItemInfo();
			Window.GunList.remove(info.displayName);
			Window.GunList.put((String) value, (GunData) Data);
			info.displayName = (String) value;
			setItemInfo(info);
			Window.ItemList.write();
		} else if (cate == ChangeListener.ITEMINFO_ICON && !value.equals("")) {
			ItemInfo info = getItemInfo();
			info.iconName = (String) value;
			setItemInfo(info);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// アイコン変更
		if (e.getActionCommand().equals("iconSet")) {
			this.ValueChange(ChangeListener.ITEMINFO_ICON, IconList.getSelectedItem());
		}
	}

	private ItemInfo getItemInfo() {
		if (Data instanceof GunData) {
			return (ItemInfo) Data.getDataObject(GunDataList.ITEM_INFO);
		}
		return null;
	}

	private void setItemInfo(ItemInfo info) {
		if (Data instanceof GunData) {
			Data.setData(GunDataList.ITEM_INFO, info);
		}
	}
}
