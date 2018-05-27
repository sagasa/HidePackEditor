package panels;

import java.awt.Color;
import java.awt.Font;
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

/**アイテムのデータ編集*/
public class ItemEditer extends JPanel implements ChangeListener, ActionListener{
	/**データ編集*/
	private static final long serialVersionUID = 2597125412794151634L;

	DataBase Data;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	public ItemEditer() {
		this.setBorder(blackBorder);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
	}

	/**GunDataの内容変更全部*/
	public void writeGunEditer(GunData data){
		Data = data;
		writeItemInfo(0,0);
	}

	public void writeMagazineEditer(BulletData data){

	}

	private ItemInfo getItemInfo(){
		if(Data instanceof GunData){
			return (ItemInfo) Data.getDataObject(GunDataList.ITEM_INFO);
		}
		return null;
	}
	private void setItemInfo(ItemInfo info){
		if(Data instanceof GunData){
			Data.setData(GunDataList.ITEM_INFO,info);
		}
	}

	JComboBox<String> IconList;
	public void writeItemInfo(int x,int y){
		//枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x+5, y+5, 240, 98);
		ItemInfo info = getItemInfo();

		int yOffset = 3;
		StringSetPanel display = new StringSetPanel(ChangeListener.ITEMINFO_DISPLAY, "DisplayName", info.displayName, true);
		display.addChangeListener(this);
		display.setOpaque(false);
		display.setBounds(x,y+yOffset,240,20);
		infoPanel.add(display);
		yOffset += 22;

		StringSetPanel shortName = new StringSetPanel(ChangeListener.ITEMINFO_SHORTNAME, "ShortName", info.shortName, true);
		shortName.addChangeListener(this);
		shortName.setOpaque(false);
		shortName.setBounds(x,y+yOffset,240,20);
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
		icon1.setBounds(5, yOffset+5, 40, 40);
		infoPanel.add(icon1);

		JLabel IconLore = new JLabel("Icon");
		IconLore.setBounds(50, yOffset+3, 110, 18);
		IconLore.setFont(new Font("BOLD", Font.BOLD, 13));
		infoPanel.add(IconLore);

		JLabel IconSize = new JLabel("Size: " + image.getWidth() + "x" + image.getHeight() + " Name:");
		IconSize.setBounds(50, yOffset+28, 110, 18);
		IconSize.setFont(new Font("BOLD", Font.BOLD, 12));
		infoPanel.add(IconSize);

		IconList = new JComboBox<String>();
		IconList.addActionListener(this);
		IconList.addItem("");
		for (String data : Window.IconMap.keySet()) {
			IconList.addItem(data);
		}
		IconList.setBounds(150, yOffset+28, 85, 18);
		IconList.setSelectedItem(info.iconName);
		IconList.setActionCommand("iconSet");
		infoPanel.add(IconList);

		this.add(infoPanel);
		this.repaint();
	}

	@Override
	public void ValueChange(int cate, Object value) {
		System.out.println(cate + " "+ value);
		if(cate == ChangeListener.ITEMINFO_SHORTNAME){
			ItemInfo info = getItemInfo();
			info.shortName = (String) value;
			setItemInfo(info);
		}else if(cate == ChangeListener.ITEMINFO_DISPLAY){
			ItemInfo info = getItemInfo();
			info.displayName = (String) value;
			setItemInfo(info);
		}else if(cate == ChangeListener.ITEMINFO_ICON&&!value.equals("")){
			ItemInfo info = getItemInfo();
			info.iconName = (String) value;
			setItemInfo(info);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//アイコン変更
		if(e.getActionCommand().equals("iconSet")){
			this.ValueChange(ChangeListener.ITEMINFO_ICON, IconList.getSelectedItem());
		}
	}
}
