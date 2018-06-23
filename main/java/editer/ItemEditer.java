package editer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import panels.BooleanSetPanel;
import panels.IconPrint;
import panels.ListChooser;
import panels.NumberSetPanel;
import panels.RecoilEditPanel;
import panels.StringComboPanel;
import panels.StringSetPanel;
import types.BulletData;
import types.BulletData.BulletDataList;
import types.Sound.SoundDataList;
import types.ItemInfo;
import types.ItemInfo.ItemDataList;
import types.Sound;
import types.base.ChangeListener;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;
import types.base.ValueSetPanel;
import types.guns.GunData;
import types.guns.GunData.GunDataList;

/** アイテムのデータ編集 */
public class ItemEditer extends JPanel implements ChangeListener, ActionListener {
	/** データ編集 */
	private static final long serialVersionUID = 2597125412794151634L;
	/** 射撃モードのリスト */
	public static final String[] allFireMode = new String[] { "semiauto", "fullauto", "burst", "minigun" };

	DataBase Data;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	public ItemEditer() {
		this.setBorder(blackBorder);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
	}

	/** エディタをクリア */
	public void clearEditer() {
		this.removeAll();
		repaint();
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
		infoPanel.setBounds(5, 195, 245, 0);
		writeGunNumberValue(infoPanel, 1);
		this.add(infoPanel);
		// ダメージ倍率系
		JPanel damageChange = new JPanel();
		damageChange.setLayout(null);
		damageChange.setBorder(blackBorder);
		damageChange.setBounds(255, 255, 245, 0);
		writeGunNumberValue(damageChange, 2);
		this.add(damageChange);
		// サウンドエディタ
		writeSoundEditer(690, 240, GunDataList.SOUND_SHOOT, ChangeListener.GUN_SOUND_SHOOT);
		writeSoundEditer(690, 360, GunDataList.SOUND_RELOAD, ChangeListener.GUN_SOUND_RELOAD);
		// 量が多すぎたので別クラス
		// グラフだけパネル外に配置
		RecoilEditPanel.Graph.setBounds(255, 5, 240, 240);
		this.add(RecoilEditPanel.Graph);
		RecoilEditPanel recoilEditer = new RecoilEditPanel((GunData) Data);
		recoilEditer.setBounds(505, 5, 185, 500);
		this.add(recoilEditer);
		// 使用弾薬
		JPanel bulletsPanel = new JPanel();
		bulletsPanel.setLayout(null);
		bulletsPanel.setBorder(blackBorder);
		bulletsPanel.setBounds(695, 5, 200, 110);
		ListChooser useBullets = new ListChooser(ListChooser.GUN_MAGAZINE_LIST, data);
		useBullets.setBounds(5, 5, 190, 100);
		bulletsPanel.add(useBullets);
		this.add(bulletsPanel);
		// 射撃モード
		JPanel fireModePanel = new JPanel();
		fireModePanel.setLayout(null);
		fireModePanel.setBorder(blackBorder);
		fireModePanel.setBounds(695, 120, 200, 110);
		ListChooser fireModechooser = new ListChooser(ListChooser.GUN_FireMode, data);
		fireModechooser.setBounds(5, 5, 190, 100);
		fireModePanel.add(fireModechooser);
		this.add(fireModePanel);
		// 削除ボタン
		JPanel deletePanel = new JPanel();
		deletePanel.setLayout(null);
		deletePanel.setBorder(blackBorder);
		deletePanel.setBounds(505, 510, 185, 35);

		JButton delete = new JButton("delete");
		delete.setBounds(5, 5, 50, 25);
		delete.setBorder(blackBorder);
		delete.addActionListener(this);
		delete.setActionCommand("gunDelete");
		delete.setFont(new Font("BOLD", Font.BOLD, 14));
		delete.setBackground(Color.RED);
		deletePanel.add(delete);
		this.add(deletePanel);
	}

	private void writeGunNumberValue(JPanel root, int cate) {
		int yOffset = 3;
		for (GunDataList type : GunDataList.values()) {
			if (type.getCate() == cate) {
				ValueSetPanel panel = null;
				if (type.getType() == DataType.Int || type.getType() == DataType.Float) {
					panel = new NumberSetPanel(Data, type, true);
					panel.setBounds(0, 0 + yOffset, 245, 20);
				} else if (type.getType() == DataType.Boolean) {
					panel = new BooleanSetPanel(Data, type, true);
					panel.setBounds(60, 0 + yOffset, 180, 20);
				}
				root.add(panel);
				yOffset += 22;
			}
		}
		Rectangle bounds = root.getBounds();
		bounds.height = yOffset + 2;
		root.setBounds(bounds);
	}

	/** BulletDataの内容変更全部 */
	public void writeMagazineEditer(BulletData data) {
		this.removeAll();
		Data = data;
		writeItemInfo(0, 0);
		// こまごまとした設定項目
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(5, 195, 245, 0);
		writeBulletNumberValue(infoPanel, 1);
		this.add(infoPanel);
		// 直撃間連
		JPanel hit = new JPanel();
		hit.setLayout(null);
		hit.setBorder(blackBorder);
		hit.setBounds(255, 0, 245, 0);
		writeBulletNumberValue(hit, 2);
		this.add(hit);
		// 爆発関連
		JPanel exp = new JPanel();
		exp.setLayout(null);
		exp.setBorder(blackBorder);
		exp.setBounds(505, 5, 245, 0);
		writeBulletNumberValue(exp, 3);
		this.add(exp);
		// 減衰関連
		JPanel decay = new JPanel();
		decay.setLayout(null);
		decay.setBorder(blackBorder);
		decay.setBounds(255, 230, 245, 0);
		writeBulletNumberValue(decay, 10);
		this.add(decay);
		// サウンド関連
		writeSoundEditer(0, 350, BulletDataList.SOUND_HIT_ENTITY, ChangeListener.BULLET_HIT_ENTITY);
		writeSoundEditer(0, 453, BulletDataList.SOUND_HIT_GROUND, ChangeListener.BULLET_HIT_GROUND);
		writeSoundEditer(250, 400, BulletDataList.SOUND_PASSING_USE, ChangeListener.BULLET_PASS);
	}

	private void writeBulletNumberValue(JPanel root, int cate) {
		int yOffset = 3;
		for (BulletDataList type : BulletDataList.values()) {
			if (type.getCate() == cate) {
				ValueSetPanel panel = null;
				if (type.getType() == DataType.Int || type.getType() == DataType.Float) {
					panel = new NumberSetPanel(Data, type, true);
					panel.setBounds(0, 0 + yOffset, 245, 20);
				} else if (type.getType() == DataType.Boolean) {
					panel = new BooleanSetPanel(Data, type, true);
					panel.setBounds(60, 0 + yOffset, 180, 20);
				}
				root.add(panel);
				yOffset += 22;
			}
		}
		Rectangle bounds = root.getBounds();
		bounds.height = yOffset + 2;
		root.setBounds(bounds);
	}

	JComboBox<String> SoundList;

	/** Soundをと通知用カテゴリを渡す */
	private void writeSoundEditer(int x, int y, EnumDataList type, int cate) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 200, 120);

		Sound sound = (Sound) Data.getDataObject(type);
		System.out.println(sound+" "+Data);
		
		String[] keySet = Window.SoundMap.keySet().toArray(new String[Window.SoundMap.keySet().size()]);
		Arrays.sort(keySet);
		StringComboPanel combo = new StringComboPanel(sound,SoundDataList.NAME,keySet, true);
		combo.setBounds(0, 5, 200, 20);
		combo.setTextBoxWidth(70);
		infoPanel.add(combo);

		int yOffset = 48;
		NumberSetPanel range = new NumberSetPanel(sound,SoundDataList.RANGE, true);
		range.addChangeListener(this, ChangeListener.SOUND_RANGE | cate);
		range.setBounds(0, yOffset, 200, 20);
		infoPanel.add(range);
		NumberSetPanel vol = new NumberSetPanel(sound,SoundDataList.VOL, true);
		vol.addChangeListener(this, ChangeListener.SOUND_VOL | cate);
		vol.setBounds(0, yOffset, 100, 20);
		infoPanel.add(vol);
		yOffset += 22;
		NumberSetPanel pitch = new NumberSetPanel(sound,SoundDataList.PITCH, true);
		pitch.setBounds(0, yOffset, 100, 20);
		infoPanel.add(pitch);
		yOffset += 22;
		BooleanSetPanel delay = new BooleanSetPanel(sound,SoundDataList.USE_DELAY, true);
		delay.setBounds(0, yOffset, 100, 20);
		infoPanel.add(delay);
		BooleanSetPanel decay = new BooleanSetPanel(sound,SoundDataList.USE_DECAY, true);
		decay.setBounds(100, yOffset, 100, 20);
		infoPanel.add(decay);
		this.add(infoPanel);
		
		this.repaint();
	}

	/** アイテムアイコン */
	IconPrint icon1;

	/** ItemInfo用 */
	private void writeItemInfo(int x, int y) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 245, 185);
		ItemInfo info = getItemInfo();

		int yOffset = 3;
		StringSetPanel display = new StringSetPanel(info,ItemDataList.NAME_DISPLAY, true);
		display.setBounds(0, yOffset, 245, 20);
		infoPanel.add(display);
		yOffset += 22;

		StringSetPanel shortName = new StringSetPanel(info,ItemDataList.NAME_SHORT, true);
		shortName.setBounds(0, yOffset, 245, 20);
		infoPanel.add(shortName);
		yOffset += 22;

		NumberSetPanel attack = new NumberSetPanel(info,ItemDataList.ATTACK_DAMAGE, true);
		attack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(attack);
		yOffset += 22;

		NumberSetPanel speed = new NumberSetPanel(info,ItemDataList.KNOCKBACK_RESISTANCE, true);
		speed.setLimit(null, 0f);
		speed.setBounds(0, yOffset, 245, 20);
		infoPanel.add(speed);
		yOffset += 22;

		NumberSetPanel health = new NumberSetPanel(info,ItemDataList.MAX_HEALTH, true);
		health.setBounds(0, yOffset, 245, 20);
		infoPanel.add(health);
		yOffset += 22;

		NumberSetPanel knockBack = new NumberSetPanel(info,ItemDataList.MOVE_SPEED,true);
		knockBack.setLimit(1f, -1f);
		knockBack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(knockBack);
		yOffset += 22;

		BufferedImage image;

		// 見つかれば設定された画像見つからなければnullImage
		if (Window.IconMap.containsKey(info.getDataString(ItemDataList.NAME_ICON))) {
			image = Window.IconMap.get(info.getDataString(ItemDataList.NAME_ICON));
		} else {
			image = ResourceList.nullImage;
		}

		icon1 = new IconPrint(image);
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

		JComboBox<String> IconList = new JComboBox<String>();
		IconList.addActionListener(this);
		String[] keySet = Window.IconMap.keySet().toArray(new String[Window.IconMap.keySet().size()]);
		Arrays.sort(keySet);
		for (String data : keySet) {
			IconList.addItem(data);
		}
		IconList.setBounds(150, yOffset + 28, 90, 18);
		IconList.setSelectedItem(info.getDataString(ItemDataList.NAME_ICON));
		IconList.setActionCommand("iconSet");
		infoPanel.add(IconList);

		this.add(infoPanel);
		this.repaint();
	}

	@Override
	public void ValueChange(int cate, Object value) {
		// System.out.println(Integer.toHexString(cate) + " " + value);
	/*	if (cate == ChangeListener.ITEMINFO_SHORTNAME) {
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
			icon1.setImage(Window.IconMap.get(value));
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
		} else if ((cate & ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT
				|| (cate & ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_RELOAD) {
			Sound sound;
			if ((cate & ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT) {
				sound = (Sound) Data.getDataObject(GunDataList.SOUND_SHOOT);
			} else {
				sound = (Sound) Data.getDataObject(GunDataList.SOUND_RELOAD);
			}
			if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.SOUND_NAME) {
				sound.name = (String) value;
			} else if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.SOUND_RANGE) {
				sound.range = (Float) value;
			} else if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.SOUND_VOL) {
				sound.vol = (Float) value;
			} else if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.SOUND_PITCH) {
				sound.pitch = (Float) value;
			}
			if ((cate & ChangeListener.DATA_MASK) == ChangeListener.GUN_SOUND_SHOOT) {
				Data.setData(GunDataList.SOUND_SHOOT, sound);
			} else {
				Data.setData(GunDataList.SOUND_RELOAD, sound);
			}
		}*/
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		// アイコン変更
		if (e.getActionCommand().equals("iconSet")) {
			this.ValueChange(ChangeListener.ITEMINFO_ICON, ((JComboBox<String>) e.getSource()).getSelectedItem());
		} else if (e.getActionCommand().equals("gunDelete")) {
			Window.GunList.remove(((GunData) Data).getItemInfo().getDataInt(ItemDataList.NAME_DISPLAY));
			clearEditer();
			Window.ItemList.write();
		}
	}

	private ItemInfo getItemInfo() {
		if (Data instanceof GunData) {
			return (ItemInfo) Data.getDataObject(GunDataList.ITEM_INFO);
		} else if (Data instanceof BulletData) {
			return (ItemInfo) Data.getDataObject(BulletDataList.ITEM_INFO);
		}
		return null;
	}

	private void setItemInfo(ItemInfo info) {
		if (Data instanceof GunData) {
			Data.setData(GunDataList.ITEM_INFO, info);
		}
	}
}
