package editer.mainWindow;

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
import helper.LocalizeHandler;
import helper.LocalizeHandler.Lang;
import types.BulletData;
import types.ItemInfo;
import types.guns.GunData;

public class ItemList extends JTabbedPane
		implements ListSelectionListener, MouseListener, ActionListener, ChangeListener {
	/** 左側のパネル */
	private static final long serialVersionUID = 4651249716543985388L;

	DefaultListModel<String> gunModel;

	DefaultListModel<String> magazineModel;

	DefaultListModel<String> armorModel;

	DefaultListModel<String> attachmentModel;

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
		gunModel = addTab(LocalizeHandler.getLocalizedName(Lang.Gun), DropFileHandler.GUNS);
		magazineModel = addTab(LocalizeHandler.getLocalizedName(Lang.Magazine), DropFileHandler.MAGAZINES);
		armorModel = addTab(LocalizeHandler.getLocalizedName(Lang.Armor), DropFileHandler.ARMOR);
		attachmentModel = addTab(LocalizeHandler.getLocalizedName(Lang.Attachment), DropFileHandler.ATTACHMENT);
	}

	/**タブ追加*/
	private DefaultListModel<String> addTab(String name,int mode){
		JList<String> list = new JList<String>();
		DefaultListModel<String> model = new DefaultListModel<String>();
		list.setModel(model);
		list.addMouseListener(this);
		list.setTransferHandler(new DropFileHandler(mode));
		list.addListSelectionListener(this);
		JScrollPane sp = new JScrollPane();
		sp.getViewport().setView(list);
		this.addTab(name, sp);
		return model;
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
				newGun.ITEM_INFO = new ItemInfo("gun_" + gunNum, displayName, "sample");
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
				newBullet.ITEM_INFO = new ItemInfo("bullet_" + bulletNum, bulletName, "sample");
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
			gunModel.addElement(Window.GunList.get(name).ITEM_INFO.NAME_DISPLAY);
		}

		magazineModel.removeAllElements();
		keySet = Window.BulletList.keySet().toArray(new String[Window.BulletList.keySet().size()]);
		Arrays.sort(keySet);
		for (String name : keySet) {
			magazineModel.addElement(Window.BulletList.get(name).ITEM_INFO.NAME_DISPLAY);
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
		@SuppressWarnings("unchecked")
		JList<String> source = (JList<String>) ((JScrollPane)getSelectedComponent()).getViewport().getView();
		if (!source.isSelectionEmpty()) {
			String value = source.getSelectedValue();
			switch (this.getSelectedIndex()) {
			case 0:
				// gun
				if (Window.GunList.containsKey(value)) {
					Window.ItemEditer.writeGunEditer(Window.GunList.get(value));
				}
				break;
			case 1:
				// magazine
				if (Window.BulletList.containsKey(value)) {
					Window.ItemEditer.writeMagazineEditer(Window.BulletList.get(value));
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
