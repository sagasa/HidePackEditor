package hideEditer;

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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import hideEditer.dataEditer.EditWindow;
import hideEditer.io.PackReader;
import hideEditer.io.PackWriter;
import types.BulletData;
import types.ContentsPack;
import types.GunData;
import types.ImageData;

public class MainWindow extends JFrame implements ActionListener, ComponentListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 7564989620356225023L;

	static public JFrame MainWindow;

	/*データの宣言*/
	/**開いてるパック*/
	public static File PackDir = null;
	/**開いてるパック*/
	public static ContentsPack Pack = null;

	/**銃のMAP*/
	public static HashMap<String,GunData> gunMap = new HashMap<String,GunData>();

	/**弾のMAP*/
	public static HashMap<String,BulletData> bulletMap = new HashMap<String,BulletData>();

	/**マガジンのMAP*/
	public static HashMap<String,BulletData> magazineMap = new HashMap<String,BulletData>();

	/**iconのList*/
	public static HashMap<String,ImageData> iconMap = new HashMap<String,ImageData>();

	/**soundのList*/
	public static HashMap<String,byte[]> soundMap = new HashMap<String,byte[]>();

	/*インスタンスの格納*/
	/**パックインフォのインスタンス*/
	PackInfoEditer PackInfo;
	/**コンテンツウインドウのインスタンス*/
	public static ContentsList Contents;
	/**リソースリストのインスタンス*/
	public static ResourcesList Resources;
	/**エディタウインドウのインスタンス*/
	public static EditWindow Editer;

	/**初期画面を開く*/
	public void openWindow(){
		MainWindow = new JFrame("HidePackEditer");
		//画面の中央に適当なサイズで出現
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width/4*3<1190? 1190:screenSize.width/4*3;
		int h = screenSize.height/4*3<625?625:screenSize.height/4*3;
		MainWindow.setSize(w, h);
		MainWindow.setLocation((screenSize.width-w)/2, (screenSize.height-h)/2);
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
	    fileItem4.setActionCommand("SaveAs");
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

	    Resources = new ResourcesList();
	    Resources.MakeWindow(MainWindow);
	    ResourcesList.reSize();

	    Editer = new EditWindow();
	    Editer.MakeWindow(MainWindow);

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
			//上書きするか聞く
			boolean Overwrite=true;
			if (Pack!=null){
				if (JOptionPane.showConfirmDialog(this, "Overwrite?","Warning",2,2)==2){
					Overwrite = false;
				}
			}
			if(Overwrite==true){
				Pack = PackReader.NewPack();
				//初期化
				gunMap.clear();
				magazineMap.clear();
				bulletMap.clear();
				PackDir = null;
				ContentsList.gunNum = 0;
				PackInfoEditer.write();
				ContentsList.write();
			}
		}

		//パックを保存
		if (e.getActionCommand().equals("Save")){
			if (PackDir!=null){
				PackWriter.exportPack(PackDir);
			}else{
				save();
			}
		}
		//名前を付けてパックを保存
		if (e.getActionCommand().equals("SaveAs")){
			save();
		}

	  }
	/**名前を付けて保存*/
	void save(){
		JFileChooser filechooser = new JFileChooser();
		filechooser.setCurrentDirectory(new File("."));
		filechooser.setSelectedFile(new File("hoge.zip"));
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "zip file", "zip");
		filechooser.setFileFilter(filter);
		//filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

	    int selected = filechooser.showSaveDialog(this);
	    //System.out.println(selected);
	    //パックを書く
	    if(selected == 0){
	    	PackWriter.exportPack(filechooser.getSelectedFile());
	    	PackDir = filechooser.getSelectedFile();
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
		ResourcesList.reSize();
		EditWindow.reSize();
	}
	@Override
	public void componentShown(ComponentEvent arg0) {

	}
}
