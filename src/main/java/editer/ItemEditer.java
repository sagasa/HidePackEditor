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
import panels.ExplosionEditPanel;
import panels.IconPrint;
import panels.ListChooser;
import panels.NumberSetPanel;
import panels.RecoilEditPanel;
import panels.StringComboPanel;
import panels.StringSetPanel;
import types.BulletData;
import editer.ValueInfo.BulletDataList;
import editer.ValueInfo.SoundDataList;
import types.ItemInfo;
import editer.ValueInfo.ItemDataList;
import types.Sound;
import types.base.ChangeListener;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataInfo;
import types.base.ValueSetPanel;
import types.guns.GunData;
import editer.ValueInfo.GunDataList;

/** アイテムのデータ編集 */
public class ItemEditer extends JPanel implements ActionListener, ChangeListener {
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
		writeItemInfo(0, 0, ChangeListener.DOMAIN_GUN);
		// 細かいパラメータ描画
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(5, 195, 245, 0);
		writeNumberValue(infoPanel, GunDataList.values(), 1);
		this.add(infoPanel);
		// ダメージ倍率系
		JPanel damageChange = new JPanel();
		damageChange.setLayout(null);
		damageChange.setBorder(blackBorder);
		damageChange.setBounds(255, 255, 245, 0);
		writeNumberValue(damageChange, GunDataList.values(), 2);
		this.add(damageChange);
		// サウンドエディタ
		writeSoundEditer(690, 240, GunDataList.SOUND_SHOOT, Data, this);
		writeSoundEditer(690, 360, GunDataList.SOUND_RELOAD, Data, this);
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

	private void writeNumberValue(JPanel root, EnumDataInfo[] infoes, int cate) {
		int yOffset = 3;
		for (EnumDataInfo info : infoes) {
			if (info.getCate() == cate) {
				ValueSetPanel panel = null;
				DataType type = DataType.getType(Data, info);
				if (type == DataType.Int || type == DataType.Float) {
					panel = new NumberSetPanel(Data, info, true);
					panel.setBounds(0, 0 + yOffset, root.getWidth(), 20);
				} else if (type == DataType.Boolean) {
					panel = new BooleanSetPanel(Data, info, true);
					panel.setBounds(60, 0 + yOffset, root.getWidth()-60, 20);
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
		writeItemInfo(0, 0, ChangeListener.DOMAIN_MAGAZINE);
		// こまごまとした設定項目
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(255, 235, 215, 0);
		writeNumberValue(infoPanel, BulletDataList.values(), BulletDataList.BULLET_INFO);
		this.add(infoPanel);
		// 直撃間連
		JPanel hit = new JPanel();
		hit.setLayout(null);
		hit.setBorder(blackBorder);
		hit.setBounds(255, 5, 215, 0);
		writeNumberValue(hit, BulletDataList.values(), BulletDataList.BULLET_HIT);
		this.add(hit);
		// 爆発関連
		ExplosionEditPanel expentity = new ExplosionEditPanel(data);
		expentity.setBounds(475, 5, 215, 600);
		this.add(expentity);
		// 減衰関連
		JPanel decay = new JPanel();
		decay.setLayout(null);
		decay.setBorder(blackBorder);
		decay.setBounds(5, 195, 245, 0);
		writeNumberValue(decay, BulletDataList.values(), BulletDataList.BULLET_DECAY);
		this.add(decay);
		// サウンド関連
		writeSoundEditer(690, 0, BulletDataList.SOUND_HIT_ENTITY, Data, this);
		writeSoundEditer(690, 120, BulletDataList.SOUND_HIT_GROUND, Data, this);
		writeSoundEditer(690, 240, BulletDataList.SOUND_PASSING_USE, Data, this);
	}

	JComboBox<String> SoundList;

	/** Soundをと通知用カテゴリを渡す */
	public static void writeSoundEditer(int x, int y, EnumDataInfo type, DataBase data, JPanel root) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 200, 114);

		JLabel label = new JLabel(type.getUnlocalizedName(), JLabel.CENTER);
		label.setBounds(15, 3, 170, 20);
		label.setFont(new Font("BOLD", Font.BOLD, 13));
		infoPanel.add(label);

		Sound sound = (Sound) ValueInfo.getData(data, type);

		String[] keySet = Window.SoundMap.keySet().toArray(new String[Window.SoundMap.keySet().size()]);
		Arrays.sort(keySet);
		StringComboPanel combo = new StringComboPanel(sound, SoundDataList.NAME, keySet, true);
		combo.setBounds(0, 26, 200, 18);
		combo.setTextBoxWidth(150);
		infoPanel.add(combo);

		int yOffset = 48;
		NumberSetPanel range = new NumberSetPanel(sound, SoundDataList.RANGE, true);
		range.setBounds(0, yOffset, 200, 20);
		infoPanel.add(range);
		NumberSetPanel vol = new NumberSetPanel(sound, SoundDataList.VOL, true);
		vol.setBounds(0, yOffset, 100, 20);
		infoPanel.add(vol);
		yOffset += 22;
		NumberSetPanel pitch = new NumberSetPanel(sound, SoundDataList.PITCH, true);
		pitch.setBounds(0, yOffset, 100, 20);
		infoPanel.add(pitch);
		yOffset += 22;
		BooleanSetPanel delay = new BooleanSetPanel(sound, SoundDataList.USE_DELAY, true);
		delay.setBounds(0, yOffset, 100, 20);
		infoPanel.add(delay);
		BooleanSetPanel decay = new BooleanSetPanel(sound, SoundDataList.USE_DECAY, true);
		decay.setBounds(100, yOffset, 100, 20);
		infoPanel.add(decay);
		root.add(infoPanel);
		root.repaint();
	}

	/** アイテムアイコン */
	IconPrint icon1;

	/** ItemInfo用 */
	private void writeItemInfo(int x, int y, int domain) {
		// 枠
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBorder(blackBorder);
		infoPanel.setBounds(x + 5, y + 5, 245, 185);
		ItemInfo info = getItemInfo();

		int yOffset = 3;
		StringSetPanel display = new StringSetPanel(ValueInfo.getLocalizedName(ItemDataList.NAME_DISPLAY),info.NAME_DISPLAY, true);
		display.addChangeListener(this, ChangeListener.ITEMINFO_DISPLAY | domain);
		display.setBounds(0, yOffset, 245, 20);
		infoPanel.add(display);
		yOffset += 22;

		StringSetPanel shortName = new StringSetPanel(info, ItemDataList.NAME_SHORT, true);
		shortName.setBounds(0, yOffset, 245, 20);
		infoPanel.add(shortName);
		yOffset += 22;

		NumberSetPanel attack = new NumberSetPanel(info, ItemDataList.ATTACK_DAMAGE, true);
		attack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(attack);
		yOffset += 22;

		NumberSetPanel speed = new NumberSetPanel(info, ItemDataList.KNOCKBACK_RESISTANCE, true);
		speed.setLimit(null, 0f);
		speed.setBounds(0, yOffset, 245, 20);
		infoPanel.add(speed);
		yOffset += 22;

		NumberSetPanel health = new NumberSetPanel(info, ItemDataList.MAX_HEALTH, true);
		health.setBounds(0, yOffset, 245, 20);
		infoPanel.add(health);
		yOffset += 22;

		NumberSetPanel knockBack = new NumberSetPanel(info, ItemDataList.MOVE_SPEED, true);
		knockBack.setLimit(1f, -1f);
		knockBack.setBounds(0, yOffset, 245, 20);
		infoPanel.add(knockBack);
		yOffset += 22;

		BufferedImage image;

		// 見つかれば設定された画像見つからなければnullImage
		if (Window.IconMap.containsKey(info.NAME_ICON)) {
			image = Window.IconMap.get(info.NAME_ICON);
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
		IconList.setSelectedItem(info.NAME_ICON);
		IconList.setActionCommand("iconSet");
		infoPanel.add(IconList);

		this.add(infoPanel);
		this.repaint();
	}

	@Override
	public void ValueChange(int cate, Object value) {
		// 表示名が変わっていたなら
		if ((cate & ChangeListener.DATA_MASK) == ChangeListener.ITEMINFO_DISPLAY) {
			ItemInfo info = getItemInfo();
			if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.DOMAIN_GUN) {
				Window.GunList.remove(info.NAME_DISPLAY);
				Window.GunList.put((String) value, (GunData) Data);
			} else if ((cate & ChangeListener.DOMAIN_MASK) == ChangeListener.DOMAIN_MAGAZINE) {
				Window.BulletList.remove(info.NAME_DISPLAY);
				Window.BulletList.put((String) value, (BulletData) Data);
			}
			info.NAME_DISPLAY = (String) value;
			Window.ItemList.write();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		// アイコン変更
		if (e.getActionCommand().equals("iconSet")) {
			ItemInfo info = getItemInfo();
			String value = (String) ((JComboBox<String>) e.getSource()).getSelectedItem();
			info.NAME_ICON=value;
			setItemInfo(info);
			icon1.setImage(Window.IconMap.get(value));
		} else if (e.getActionCommand().equals("gunDelete")) {
			Window.GunList.remove(getItemInfo().NAME_DISPLAY);
			clearEditer();
			Window.ItemList.write();
		}
	}

	private ItemInfo getItemInfo() {
		if (Data instanceof GunData) {
			return (ItemInfo) ValueInfo.getData(Data, GunDataList.ITEM_INFO);
		} else if (Data instanceof BulletData) {
			return (ItemInfo) ValueInfo.getData(Data, BulletDataList.ITEM_INFO);
		}
		return null;
	}

	private void setItemInfo(ItemInfo info) {
		if (Data instanceof GunData) {
			ValueInfo.setData(Data, GunDataList.ITEM_INFO,info);
		} else if (Data instanceof BulletData) {
			ValueInfo.setData(Data, BulletDataList.ITEM_INFO,info);
		}
	}
}
