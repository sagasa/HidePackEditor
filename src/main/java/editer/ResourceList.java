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
import io.PackIO;

public class ResourceList extends JTabbedPane
		implements ListSelectionListener, MouseListener, ActionListener, ChangeListener {
	/** 右側のパネル */
	private static final long serialVersionUID = -1038244099915798138L;

	DefaultListModel<String> iconModel;
	JList<String> iconList;
	DefaultListModel<String> soundModel;
	JList<String> soundList;

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
		// リスト
		iconList = new JList<String>();
		iconModel = new DefaultListModel<String>();
		iconList.setModel(iconModel);
		iconList.addMouseListener(this);
		iconList.setTransferHandler(new DropFileHandler(DropFileHandler.ICONS));
		iconList.addListSelectionListener(this);
		JScrollPane iconSp = new JScrollPane();
		iconSp.getViewport().setView(iconList);
		this.addTab("Icons", iconSp);
		// サウンド
		soundList = new JList<String>();
		soundModel = new DefaultListModel<String>();
		soundList.setModel(soundModel);
		soundList.addMouseListener(this);
		soundList.setTransferHandler(new DropFileHandler(DropFileHandler.SOUNDS));
		soundList.addListSelectionListener(this);
		JScrollPane soundSp = new JScrollPane();
		soundSp.getViewport().setView(soundList);
		this.addTab("Sound", soundSp);
		write();
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
