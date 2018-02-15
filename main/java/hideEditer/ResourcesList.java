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

import types.GunData;
import types.GunData.GunDataList;
import types.ImageData;

/**アクションリスナーのためにstaticにしていない 実質staticクラス インスタンスはMainWindowに格納*/
public class ResourcesList extends JTabbedPane implements MouseListener , ActionListener ,ListSelectionListener ,ChangeListener{

	private static final long serialVersionUID = 7809388458362178109L;

	JPopupMenu popup = new JPopupMenu();

	/**iconの表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> iconModel;

	/**音の表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> soundModel;
	
	/**modelの表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> modelModel;
	
	/**textureの表示リスト 名前のテキストリスト*/
	static DefaultListModel<String> textureModel;
	
	static public JTabbedPane ContentsTab;

	/**ID用ポインタ*/
	static int gunNum = 0;

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

		//iconのリスト
	    JList<String> icon = new JList<String>();
	    iconModel = new DefaultListModel<String>();
	    icon.setModel(iconModel);
	    icon.addMouseListener(this);
	    icon.addListSelectionListener(this);
	    JScrollPane iconSP = new JScrollPane();
	    iconSP.getViewport().setView(icon);
	    
	    //modelのリスト
	    JList<String> model = new JList<String>();
	    modelModel = new DefaultListModel<String>();
	    model.setModel(modelModel);
	    model.addMouseListener(this);
	    JScrollPane modelSP = new JScrollPane();
	    modelSP.getViewport().setView(model);
	    
	    //textureのリスト
	    JList<String> texture = new JList<String>();
	    textureModel = new DefaultListModel<String>();
	    texture.setModel(textureModel);
	    texture.addMouseListener(this);
	    JScrollPane textureSP = new JScrollPane();
	    textureSP.getViewport().setView(texture);
	    
	    //soundsのリスト
	    JList<String> sounds = new JList<String>();
	    soundModel = new DefaultListModel<String>();
	    sounds.setModel(soundModel);
	    sounds.addMouseListener(this);
	    JScrollPane soundsSP = new JScrollPane();
	    soundsSP.getViewport().setView(sounds);

	    this.addTab("IconList", iconSP);
	    this.addTab("ModelList", modelSP);
	    this.addTab("TextureList", textureSP);
	    this.addTab("SoundsList", soundsSP);
	    this.addChangeListener(this);
	    Window.add(this);
	    reSize();

	    Window.validate();

	}


	/**リストを再描画*/
	public static void write() {
		iconModel.clear();
		for (ImageData data:MainWindow.iconMap.values()){
			System.out.println(data.ImageName);
			iconModel.addElement(data.ImageName);
		}
	}

	/**タブから判断してエディタを開く*/
	public void OpenEditer() {
		//編集画面を開く
		switch (this.getSelectedIndex()){
		case 0:
			
		break;
		case 1:
			
		break;
		}
	}

	/**リサイズ
	 * @return */
	public static void reSize(){
		ContentsTab.setBounds(MainWindow.MainWindow.getWidth()-215, 80, 200, MainWindow.MainWindow.getHeight()-145);
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
					
				break;
				case 1:
					
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
		if (!e.getValueIsAdjusting()){
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
