package hideEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import types.BulletData;
import types.BulletData.BulletDataList;
import types.GunData;
import types.GunData.GunDataList;

/**アクションリスナーのためにstaticにしていない 実質staticクラス インスタンスはMainWindowに格納*/
public class ContentsList extends JTabbedPane implements MouseListener , ActionListener ,ListSelectionListener ,ChangeListener{

	/**	 */
	private static final long serialVersionUID = -4625596695254651493L;

	JPopupMenu popup = new JPopupMenu();

	/**銃の表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> gunModel;
	static JList<String> guns;

	/**弾の表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> bulletModel;
	static JList<String> bullets;

	static public JTabbedPane ContentsTab;

	/**ID用ポインタ*/
	static int gunNum = 0;
	static int bulletNum = 0;

	public void MakeWindow (JFrame Window){
		ContentsTab = this;
		//コンテンツリスト
		//ホップアップの追加
	    JMenuItem updateMenuItem = new JMenuItem("add new contents");
	    JMenuItem propertyMenuItem = new JMenuItem("refresh");
	    updateMenuItem.addActionListener(this);
	    propertyMenuItem.addActionListener(this);
	    popup.add(updateMenuItem);
	    popup.add(propertyMenuItem);

		//銃のリスト
		guns = new JList<String>();
	    gunModel = new DefaultListModel<String>();
	    guns.setModel(gunModel);
	    guns.addMouseListener(this);
	    guns.addListSelectionListener(this);
	    JScrollPane gunSP = new JScrollPane();
	    gunSP.getViewport().setView(guns);

	    //弾のリスト
	    bullets = new JList<String>();
	    bulletModel = new DefaultListModel<String>();
	    bullets.setModel(bulletModel);
	    bullets.addMouseListener(this);
	    JScrollPane bulletSP = new JScrollPane();
	    bulletSP.getViewport().setView(bullets);

	    this.addTab("GunList", gunSP);
	    this.addTab("BulletList", bulletSP);
	    this.addChangeListener(this);
	    Window.add(this);
	    reSize();

	    Window.validate();

	}


	/**リストを再描画*/
	public static void write() {
		gunModel.clear();
		for (GunData data:MainWindow.gunMap.values()){
			System.out.println(data.getDataString(GunDataList.DISPLAY_NAME));
			gunModel.addElement(data.getDataString(GunDataList.DISPLAY_NAME));
		}
		bulletModel.clear();
		for (BulletData data:MainWindow.bulletMap.values()){
			System.out.println(BulletDataList.DISPLAY_NAME.getData(data));
			bulletModel.addElement((String) BulletDataList.DISPLAY_NAME.getData(data));
		}

	}
	/**銃を追加*/
	public void addgun() {
		gunNum ++;
		//名前が重複しないように
		while (MainWindow.gunMap.containsKey("new gun No."+gunNum)){
			gunNum ++;
		}
		GunData newGun = new GunData();
		GunDataList.DISPLAY_NAME.setData(newGun,"new gun No."+gunNum);
		GunDataList.SHORT_NAME.setData(newGun,"gun_"+gunNum);
		MainWindow.gunMap.put(newGun.getDataString(GunDataList.DISPLAY_NAME), newGun);
		//System.out.println("ok");
		write();
	}

	/**弾を追加*/
	public void addbullet() {
		bulletNum ++;
		//名前が重複しないように
		while (MainWindow.gunMap.containsKey("new bullet "+bulletNum)){
			gunNum ++;
		}
		BulletData newGun = new BulletData();
		BulletDataList.DISPLAY_NAME.setData(newGun,"new bullet "+bulletNum);
		MainWindow.bulletMap.put((String) BulletDataList.DISPLAY_NAME.getData(newGun), newGun);
		//System.out.println("ok");
		write();
	}

	/** タブから判断してエディタを開く */
	public void OpenEditer() {
		// 編集画面を開く
		switch (this.getSelectedIndex()) {
		case 0:
			// 銃のエディタ
			if(!guns.isSelectionEmpty()){
				MainWindow.Editer.wrietGunEditer(MainWindow.gunMap.get(guns.getSelectedValue()));
			}
			break;
		case 1:

			break;
		}

	}

	/**リサイズ
	 * @return */
	public static void reSize(){
		ContentsTab.setBounds(0, 80, 200, MainWindow.MainWindow.getHeight()-145);
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
	//	System.out.println(e.getSource());

		if (e.isPopupTrigger()){
			popup.show(e.getComponent(), e.getX(), e.getY());
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//パックが開かれているなら
		if (MainWindow.Pack != null){
			if (e.isPopupTrigger()){
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("add new contents")){
	//		System.out.println(ContentsTab.getSelectedIndex());
			switch (this.getSelectedIndex()){
				case 0:
					addgun();
				break;
				case 1:
					addbullet();
				break;
			}
		}
		if (e.getActionCommand().equals("refresh")){
			write();
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		//決定したところで
		if (!e.getValueIsAdjusting()&&!guns.isSelectionEmpty()){
			OpenEditer();
		}
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		//タブが変わったらエディットウィンドウをクリア
		MainWindow.Editer.clearEditer();
		OpenEditer();

	}



}
