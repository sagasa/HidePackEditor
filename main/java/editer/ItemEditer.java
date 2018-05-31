package editer;

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

import panels.GraphPanel;
import panels.IconPrint;
import panels.NumberSetPanel;
import panels.RecoilEditPanel;
import panels.ResourceList;
import panels.StringComboPanel;
import panels.StringSetPanel;
import types.BulletData;
import types.GunData;
import types.GunData.GunDataList;
import types.base.ChangeListener;
import types.base.DataBase;
import types.base.EnumDataList;
import types.base.GunRecoil;
import types.base.ItemInfo;
import types.base.Sound;

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
		infoPanel.setBounds(5, 196, 245, 0);
		writeGunNumberValue(infoPanel, 1);
		this.add(infoPanel);
		// ダメージ倍率系
		JPanel damageChange = new JPanel();
		damageChange.setLayout(null);
		damageChange.setBorder(blackBorder);
		damageChange.setBounds(255, 240, 245, 0);
		writeGunNumberValue(damageChange, 2);
		this.add(damageChange);
		// サウンドエディタ
		writeSoundEditer(250, 0, GunDataList.SOUND_SHOOT, ChangeListener.GUN_SOUND_SHOOT);
		writeSoundEditer(250, 103, GunDataList.SOUND_RELOAD, ChangeListener.GUN_SOUND_RELOAD);
		//量が多すぎたので別クラス
		RecoilEditPanel recoilEditer = new RecoilEditPanel((GunData) Data);
		recoilEditer.setBounds(505,5,250,650);
		this.add(recoilEditer);

	}

	private void writeGunNumberValue(JPanel root, int cate) {
		int yOffset = 3;
		for (GunDataList type : GunDataList.values()) {
			if (type.getCate() == cate) {
				NumberSetPanel panel = new NumberSetPanel(Data, type, true);
				panel.setBounds(0, 0 + yOffset, 245, 20);
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

	JComboBox<String> SoundList;

	/** Soundをと通知用カテゴリを渡す */
	private void writeSoundEditer(int x, int y, EnumDataList type, int cate) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 245, 98);

		Sound sound = (Sound) Data.getDataObject(type);

		StringComboPanel combo = new StringComboPanel(type.getName(),
				Window.IconMap.keySet().toArray(new String[Window.IconMap.keySet().size()]), true);
		combo.setBounds(0, 5, 245, 20);
		combo.addChangeListener(this, SOUND_NAME | cate);
		combo.setTextBoxWidth(100);
		combo.setItem(sound.name);
		infoPanel.add(combo);

		int yOffset = 30;
		NumberSetPanel range = new NumberSetPanel(type.getName() + "_Range", sound.range + "", true, true);
		range.setTextBoxWidth(40);
		range.setLimit(null, 0f);
		range.addChangeListener(this, ChangeListener.SOUND_RANGE | cate);
		range.setBounds(0, yOffset, 245, 20);
		infoPanel.add(range);
		yOffset += 22;
		NumberSetPanel vol = new NumberSetPanel(type.getName() + "_Volume", sound.vol + "", true, true);
		vol.setTextBoxWidth(40);
		vol.setLimit(null, 0f);
		vol.addChangeListener(this, ChangeListener.SOUND_VOL | cate);
		vol.setBounds(0, yOffset, 245, 20);
		infoPanel.add(vol);
		yOffset += 22;
		NumberSetPanel pitch = new NumberSetPanel(type.getName() + "_Pitch", sound.pitch + "", true, true);
		pitch.setTextBoxWidth(40);
		pitch.setLimit(null, 0f);
		pitch.addChangeListener(this, ChangeListener.SOUND_PITCH | cate);
		pitch.setBounds(0, yOffset, 245, 20);
		infoPanel.add(pitch);
		yOffset += 22;

		this.add(infoPanel);
		this.repaint();
	}

	JComboBox<String> IconList;

	/** ItemInfo用 */
	private void writeItemInfo(int x, int y) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 245, 185);
		ItemInfo info = getItemInfo();

		int yOffset = 3;
		StringSetPanel display = new StringSetPanel("DisplayName", info.displayName, true);
		display.addChangeListener(this, ChangeListener.ITEMINFO_DISPLAY);
		display.setBounds(0, yOffset, 245, 20);
		infoPanel.add(display);
		yOffset += 22;

		StringSetPanel shortName = new StringSetPanel("ShortName", info.shortName, true);
		shortName.addChangeListener(this, ChangeListener.ITEMINFO_SHORTNAME);
		shortName.setBounds(0, yOffset, 245, 20);
		infoPanel.add(shortName);
		yOffset += 22;

		NumberSetPanel attack = new NumberSetPanel("AttackDamageAdd", info.attackDamage+"", true,true);
		attack.addChangeListener(this, ChangeListener.ITEMINFO_ATTACK);
		attack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(attack);
		yOffset += 22;

		NumberSetPanel speed = new NumberSetPanel("MoveSpeedDiameter", info.movementSpeed+"", true,true);
		speed.addChangeListener(this, ChangeListener.ITEMINFO_ATTACK);
		speed.setLimit(null, 0f);
		speed.setBounds(0, yOffset, 245, 20);
		infoPanel.add(speed);
		yOffset += 22;

		NumberSetPanel health = new NumberSetPanel("MaxHealthAdd", info.maxHealth+"", true,true);
		health.addChangeListener(this, ChangeListener.ITEMINFO_ATTACK);
		health.setBounds(0, yOffset, 245, 20);
		infoPanel.add(health);
		yOffset += 22;

		NumberSetPanel knockBack = new NumberSetPanel("KnockbackResistanceAdd", info.knockbackResistance+"", true,true);
		knockBack.setLimit(1f, -1f);
		knockBack.addChangeListener(this, ChangeListener.ITEMINFO_ATTACK);
		knockBack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(knockBack);
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
		IconList.setBounds(150, yOffset + 28, 90, 18);
		IconList.setSelectedItem(info.iconName);
		IconList.setActionCommand("iconSet");
		infoPanel.add(IconList);

		this.add(infoPanel);
		this.repaint();
	}

	@Override
	public void ValueChange(int cate, Object value) {
		//System.out.println(Integer.toHexString(cate) + " " + value);
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
		} else if (cate == ChangeListener.ITEMINFO_ATTACK && !value.equals("")) {
			ItemInfo info = getItemInfo();
			info.attackDamage = (Float) value;
			setItemInfo(info);
		} else if (cate == ChangeListener.ITEMINFO_MAXHEALTH && !value.equals("")) {
			ItemInfo info = getItemInfo();
			info.maxHealth = (Float) value;
			setItemInfo(info);
		} else if (cate == ChangeListener.ITEMINFO_KNOCKBACKRESISTANCE && !value.equals("")) {
			ItemInfo info = getItemInfo();
			info.knockbackResistance = (Float) value;
			setItemInfo(info);
		} else if (cate == ChangeListener.ITEMINFO_SPEED && !value.equals("")) {
			ItemInfo info = getItemInfo();
			info.movementSpeed = (Float) value;
			setItemInfo(info);
		} else if ((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT ||(cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_RELOAD) {
			Sound sound;
			if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT){
				sound = (Sound) Data.getDataObject(GunDataList.SOUND_SHOOT);
			}else{
				sound = (Sound) Data.getDataObject(GunDataList.SOUND_RELOAD);
			}
			if((cate&ChangeListener.DOMAIN_MASK)==ChangeListener.SOUND_NAME){
				sound.name = (String) value;
			}else if((cate&ChangeListener.DOMAIN_MASK)==ChangeListener.SOUND_RANGE){
				sound.range = (Float) value;
			}else if((cate&ChangeListener.DOMAIN_MASK)==ChangeListener.SOUND_VOL){
				sound.vol = (Float) value;
			}else if((cate&ChangeListener.DOMAIN_MASK)==ChangeListener.SOUND_PITCH){
				sound.pitch = (Float) value;
			}
			if((cate&ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT){
				Data.setData(GunDataList.SOUND_SHOOT, sound);
			}else{
				Data.setData(GunDataList.SOUND_RELOAD, sound);
			}
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
