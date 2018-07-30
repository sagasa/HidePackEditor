package editer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
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
import io.PackIO;

public class ResourceList extends JTabbedPane
		implements ListSelectionListener, MouseListener, ActionListener, ChangeListener {
	/** 右側のパネル */
	private static final long serialVersionUID = -1038244099915798138L;

	DefaultListModel<String> iconModel;
	DefaultListModel<String> soundModel;
	DefaultListModel<String> scopeModel;

	JPopupMenu popup = new JPopupMenu();

	public static BufferedImage nullImage;

	public ResourceList() {
		try {
			nullImage = ImageIO.read(ClassLoader.getSystemResourceAsStream("icon/notSet.png"));
			Window.IconMap.put("sample", nullImage);
		} catch (IOException e) {
		}

		this.addChangeListener(this);
		// ホップアップの追加
		JMenuItem updateMenuItem = new JMenuItem("inport new Resource");
		JMenuItem propertyMenuItem = new JMenuItem("refresh");
		updateMenuItem.setActionCommand("add");
		updateMenuItem.addActionListener(this);
		propertyMenuItem.setActionCommand("refresh");
		propertyMenuItem.addActionListener(this);
		popup.add(updateMenuItem);
		popup.add(propertyMenuItem);
		// タブ追加 順番が重要
		iconModel = addTab(LocalizeHandler.getLocalizedName(Lang.Icon),DropFileHandler.ICONS);
		soundModel = addTab(LocalizeHandler.getLocalizedName(Lang.Sound),DropFileHandler.SOUNDS);
		scopeModel = addTab(LocalizeHandler.getLocalizedName(Lang.Scope),DropFileHandler.SCOPE);
		write();
	}

	/**タブ追加*/
	private DefaultListModel<String> addTab(String name,int mode){
		JList<String> list = new JList<String>();
		DefaultListModel<String> model = new DefaultListModel<String>();
		list.setModel(model);
		list.addMouseListener(this);
		list.setTransferHandler(new DropFileHandler(mode));
		list.addListSelectionListener(this);
		JScrollPane soundSp = new JScrollPane();
		soundSp.getViewport().setView(list);
		this.addTab(name, soundSp);
		return model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("add")) {
			switch (this.getSelectedIndex()) {
			case 0:
				// icon
				PackIO.inportIcon();
				write();
				break;
			case 1:
				// icon
				PackIO.inportSound();
				write();
				break;
			}
		} else if (e.getActionCommand().equals("refresh")) {
			write();
		}
	}

	//リスト更新
	public void write() {
		iconModel.removeAllElements();
		String[] keySet = Window.IconMap.keySet().toArray(new String[Window.IconMap.keySet().size()]);
		Arrays.sort(keySet);
		for (String name : keySet) {
			iconModel.addElement(name);
		}
		soundModel.removeAllElements();
		keySet = Window.SoundMap.keySet().toArray(new String[Window.SoundMap.keySet().size()]);
		Arrays.sort(keySet);
		for (String name : keySet) {
			soundModel.addElement(name);
		}
		scopeModel.removeAllElements();
		keySet = Window.ScopeMap.keySet().toArray(new String[Window.ScopeMap.keySet().size()]);
		System.out.println(keySet.length);
		Arrays.sort(keySet);
		for (String name : keySet) {
			scopeModel.addElement(name);
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
			// icon
			break;
		case 1:
			// sound
			break;
		case 2:
			// scope
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
		showEditer();
	}

}
