package editer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import helper.DropFileHandler;
import types.BulletData;
import types.BulletData.BulletDataList;
import types.ItemInfo.ItemDataList;
import types.ItemInfo;
import types.guns.GunData;
import types.guns.GunData.GunDataList;

public class ItemList extends JTabbedPane
		implements ListSelectionListener, MouseListener, ActionListener, ChangeListener {
	/** 左側のパネル */
	private static final long serialVersionUID = 4651249716543985388L;

	DefaultListModel<String> gunModel;
	JList<String> gunList;

	DefaultListModel<String> magazineModel;
	JList<String> magazineList;

	DefaultListModel<String> armorModel;
	JList<String> armorList;

	DefaultListModel<String> attachmentModel;
	JList<String> attachmentList;

	JPopupMenu popup = new JPopupMenu();

	static int gunNum = 0;
	static int bulletNum = 0;

	public ItemList() {
		this.addChangeListener(this);
		// ホップアップの追加
		JMenuItem updateMenuItem = new JMenuItem("add new contents");
		JMenuItem propertyMenuItem = new JMenuItem("refresh");
		updateMenuItem.setActionCommand("add");
		updateMenuItem.addActionListener(this);
		propertyMenuItem.setActionCommand("refresh");
		propertyMenuItem.addActionListener(this);
		popup.add(updateMenuItem);
		popup.add(propertyMenuItem);
		// リスト
		gunList = new JList<String>();
		gunModel = new DefaultListModel<String>();
		gunList.setModel(gunModel);
		gunList.addMouseListener(this);
		gunList.setTransferHandler(new DropFileHandler(DropFileHandler.GUNS));
		gunList.addListSelectionListener(this);
		JScrollPane gunSp = new JScrollPane();
		gunSp.getViewport().setView(gunList);
		this.addTab("Guns", gunSp);
		magazineList = new JList<String>();
		magazineModel = new DefaultListModel<String>();
		magazineList.setModel(magazineModel);
		magazineList.addMouseListener(this);
		magazineList.setTransferHandler(new DropFileHandler(DropFileHandler.MAGAZINES));
		magazineList.addListSelectionListener(this);
		JScrollPane magazineSp = new JScrollPane();
		magazineSp.getViewport().setView(magazineList);
		this.addTab("Magazines", magazineSp);
		armorList = new JList<String>();
		armorModel = new DefaultListModel<String>();
		armorList.setModel(armorModel);
		armorList.addMouseListener(this);
		armorList.addListSelectionListener(this);
		JScrollPane armorSp = new JScrollPane();
		armorSp.getViewport().setView(armorList);
		this.addTab("Armors", armorSp);
		attachmentList = new JList<String>();
		attachmentModel = new DefaultListModel<String>();
		attachmentList.setModel(attachmentModel);
		attachmentList.addMouseListener(this);
		attachmentList.addListSelectionListener(this);
		JScrollPane attachmentSp = new JScrollPane();
		attachmentSp.getViewport().setView(attachmentList);
		this.addTab("Attachments", attachmentSp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("add")) {
			switch (this.getSelectedIndex()) {
			case 0:
				// gun
				GunData newGun = new GunData();
				while (Window.GunList.containsKey("New Gun No." + gunNum)) {
					gunNum++;
				}
				String displayName = "New Gun No." + gunNum;
				newGun.setData(GunDataList.ITEM_INFO, new ItemInfo("gun_" + gunNum, displayName, "sample"));
				Window.GunList.put(displayName, newGun);
				write();
				break;
			case 1:
				// magazine
				BulletData newBullet = new BulletData();
				while (Window.BulletList.containsKey("New Bullet No." + bulletNum)) {
					bulletNum++;
				}
				String bulletName = "New Bullet No." + bulletNum;
				newBullet.setData(BulletDataList.ITEM_INFO, new ItemInfo("bullet_" + bulletNum, bulletName, "sample"));
				Window.BulletList.put(bulletName, newBullet);
				write();
				break;
			case 2:
				// armor
				break;
			case 3:
				// attachment
				break;
			}
		} else if (e.getActionCommand().equals("refresh")) {
			write();
		}
	}

	public void write() {
		gunModel.removeAllElements();
		String[] keySet = Window.GunList.keySet().toArray(new String[Window.GunList.keySet().size()]);
		Arrays.sort(keySet);
		for (String name : keySet) {
			gunModel.addElement(((ItemInfo) Window.GunList.get(name).getDataObject(GunDataList.ITEM_INFO)).getDataString(ItemDataList.NAME_DISPLAY));
		}

		magazineModel.removeAllElements();
		keySet = Window.BulletList.keySet().toArray(new String[Window.BulletList.keySet().size()]);
		Arrays.sort(keySet);
		for (String name : keySet) {
			magazineModel.addElement(
					((ItemInfo) Window.BulletList.get(name).getDataObject(BulletDataList.ITEM_INFO)).getDataString(ItemDataList.NAME_DISPLAY));
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// エディタ表示
		if (!e.getValueIsAdjusting()) {
			showEditer();
		}
	}

	/** エディタを表示 */
	public void showEditer() {
		switch (this.getSelectedIndex()) {
		case 0:
			// gun
			if (!gunList.isSelectionEmpty()) {
				Window.ItemEditer.writeGunEditer(Window.GunList.get(gunList.getSelectedValue()));
			}
			break;
		case 1:
			// magazine
			if (!magazineList.isSelectionEmpty()) {
				Window.ItemEditer.writeMagazineEditer(Window.BulletList.get(magazineList.getSelectedValue()));
			}
			break;
		case 2:
			// armor
			break;
		case 3:
			// attachment
			break;
		}
	}

	/** マウスイベントを集約 */
	private void popupMenu(MouseEvent e) {
		// if (e.isPopupTrigger()&&Window.Pack!=null) {
		if (e.isPopupTrigger()) {
			popup.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		popupMenu(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		popupMenu(e);
	}

	/** タブが変わったら */
	@Override
	public void stateChanged(ChangeEvent e) {
		Window.ItemEditer.clearEditer();
		showEditer();
	}
}
