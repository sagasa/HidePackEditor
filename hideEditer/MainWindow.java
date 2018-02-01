package hideEditer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import types.BulletData;
import types.ContentsPack;
import types.GunData;
import valueEditer.EditWindow;

public class MainWindow extends JFrame implements ActionListener, ComponentListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 7564989620356225023L;

	static public JFrame MainWindow;

	/*データの宣言*/
	/**開いてるパック*/
	public static File PackDir;
	/**開いてるパック*/
	public static ContentsPack Pack = null;

	/**銃のMAP*/
	public static HashMap<String,GunData> gunMap = new HashMap<String,GunData>();

	/**弾のMAP*/
	public static HashMap<String,BulletData> bulletMap = new HashMap<String,BulletData>();

	/**マガジンのMAP*/
	public static HashMap<String,BulletData> magazineMap = new HashMap<String,BulletData>();

	/*インスタンスの格納*/
	/**パックインフォのインスタンス*/
	PackInfoEditer PackInfo;
	/**コンテンツウインドウのインスタンス*/
	public static ContentsList Contents;
	/**エディタウインドウのインスタンス*/
	public static EditWindow Editer;

	/**初期画面を開く*/
	public void openWindow(){
		MainWindow = new JFrame("HidePackEditer");
		//画面の中央に適当なサイズで出現
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width;
		int h = screenSize.height;
		MainWindow.setSize(w/4*3, h/4*3);
		MainWindow.setLocation(w/8, h/8);
		MainWindow.addComponentListener(this);

	    //メニューバー
		JMenuBar menubar = new JMenuBar();
	    JMenu file = new JMenu("File");
	    JMenu edit = new JMenu("Edit");

	    menubar.add(file);
	    menubar.add(Box.createRigidArea(new Dimension(5, 1)));
	    menubar.add(edit);

	    JMenuItem fileItem1 = new JMenuItem("New");
	    fileItem1.setActionCommand("New");
	    JMenuItem fileItem2 = new JMenuItem("Open");
	    fileItem2.setActionCommand("Open");
	    JMenuItem fileItem3 = new JMenuItem("Save");
	    fileItem3.setActionCommand("Save");
	    JMenuItem fileItem4 = new JMenuItem("Save As...");
	    fileItem4.setActionCommand("Save As...");
	    JMenuItem fileItem5 = new JMenuItem("Exit");
	    fileItem5.setActionCommand("Exit");

	    fileItem1.addActionListener(this);
	    fileItem2.addActionListener(this);
	    fileItem3.addActionListener(this);
	    fileItem4.addActionListener(this);
	    fileItem5.addActionListener(this);

	    file.add(fileItem1);
	    file.add(fileItem2);
	    file.add(fileItem3);
	    file.add(fileItem4);
	    file.add(fileItem5);



	    MainWindow.setJMenuBar(menubar);

	    //レイアウトマネージャーをぬっころす
	    MainWindow.setLayout(null);


	    PackInfo = new PackInfoEditer();

	    Contents = new ContentsList();
	    Contents.MakeWindow(MainWindow);
	    ContentsList.reSize();
	    Editer = new EditWindow();
	    Editer.MakeWindow(MainWindow);


	    LineBorder border = new LineBorder(Color.black, 1, false);
	    IconPrint iconTest = new IconPrint("./test.png");
	    iconTest.setBounds(1000, 5, 100, 100);
	    iconTest.setBorder(border);
	    MainWindow.add(iconTest);
	    MainWindow.setVisible(true);
	    MainWindow.repaint();
	    System.out.println(Pack);
	}



	@Override
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Open")){
			JFileChooser filechooser = new JFileChooser();
			filechooser.setCurrentDirectory(new File("."));
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "zip file", "zip");
			filechooser.setFileFilter(filter);
			filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY );

		    int selected = filechooser.showOpenDialog(this);
		    //System.out.println(selected);
		    //パックを読む
		    if(selected == 0){
		    	Pack = PackReader.Read(filechooser.getSelectedFile());
		    	PackInfoEditer.write();
		    	ContentsList.write();
		    }
		}

		//パックを制作する
		if (e.getActionCommand().equals("New")){
			Pack = PackReader.NewPack();
			PackInfoEditer.write();
		}

		//パックを保存
		if (e.getActionCommand().equals("Save")){
			PackWriter.exportPack();
		}

	  }
	@Override
	public void componentHidden(ComponentEvent arg0) {

	}
	@Override
	public void componentMoved(ComponentEvent arg0) {

	}
	@Override
	public void componentResized(ComponentEvent e) {
		ContentsList.reSize();
		EditWindow.OpenWindow.setBounds(200, 20, 600, MainWindow.getHeight()-85);
	}
	@Override
	public void componentShown(ComponentEvent arg0) {

	}
}
