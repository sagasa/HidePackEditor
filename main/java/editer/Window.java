package editer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import panels.ItemList;
import panels.ResourceList;
import types.*;
import types.guns.GunData;

/** メインのフレーム この中にすべて描画 */
public class Window extends JFrame implements ActionListener, ComponentListener {
	/** メインWindow */
	private static final long serialVersionUID = -3092968886747656737L;

	/** 銃のMAP GunData */
	public static Map<String,GunData> GunList = new HashMap<String,GunData>();
	/** 弾のMAP BulletData */
	public static Map<String,BulletData> BulletList = new HashMap<String,BulletData>();
	/** IconのMAP BulletData */
	public static Map<String,BufferedImage> IconMap = new HashMap<String,BufferedImage>();

	/**パック*/
	public static ContentsPack Pack;

	public static Window MainWindow;
	public static ItemList ItemList;
	public static ItemEditer ItemEditer;
	public static ResourceList ResourceList;
	public static PackInfoEditer PackInfoEditer;

	/** メニューバーと各パネルを配置 */
	public Window() {
		MainWindow = this;
		this.setTitle("HidePackEditer");
		this.setIconImage(new ImageIcon(ClassLoader.getSystemResource("icon/M14_scope.png")).getImage());
		this.setLayout(null);
		this.addComponentListener(this);
		// 画面の中央に適当なサイズで出現
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int w = screenSize.width / 4 * 3 < 1190 ? 1190 : screenSize.width / 4 * 3;
		int h = screenSize.height / 4 * 3 < 680 ? 680 : screenSize.height / 4 * 3;
		this.setSize(w, h);
		this.setSize(1300, 680);
		this.setLocation((screenSize.width - w) / 2, (screenSize.height - h) / 2);

		// メニューバー
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

		this.setJMenuBar(menubar);

		ItemEditer = new ItemEditer();
		this.add(ItemEditer);
		ItemList = new ItemList();
		this.add(ItemList);
		ResourceList = new ResourceList();

		PackInfoEditer = new PackInfoEditer();
		this.add(PackInfoEditer);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Window();
	}

	// メニュー操作受付
	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void componentResized(ComponentEvent e) {
		if(ItemList!=null){
			ItemList.setBounds(0, 100, 200, this.getHeight()-160);
		}
		if(ItemEditer!=null){
			ItemEditer.setBounds(200, 0, this.getWidth()-400, this.getHeight()-60);
		}
		if(PackInfoEditer!=null){
			PackInfoEditer.setBounds(0, 0, 200, 100);
		}
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	}
}
