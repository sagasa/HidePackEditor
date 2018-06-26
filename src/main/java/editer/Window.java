package editer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import io.PackIO;
import types.*;
import types.guns.GunData;

/** メインのフレーム この中にすべて描画 */
public class Window extends JFrame implements ActionListener, ComponentListener {
	/** メインWindow */
	private static final long serialVersionUID = -3092968886747656737L;

	/** Windowのインスタンス */
	public static Window INSTANCE;
	/** 銃のMAP DisplayName-GunData */
	public static Map<String, GunData> GunList = new HashMap<String, GunData>();
	/** 弾のMAP DisplayName-BulletData */
	public static Map<String, BulletData> BulletList = new HashMap<String, BulletData>();
	/** IconのMAP BulletData */
	public static Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP BulletData */
	public static Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();

	public static String packPath;

	/** パック */
	public static ContentsPack Pack;

	public static Window MainWindow;
	public static ItemList ItemList;
	public static ItemEditer ItemEditer;
	public static ResourceList ResourceList;
	public static PackInfoEditer PackInfoEditer;

	/** 変数初期化 */
	public void clear() {
		packPath = null;
		Pack = null;
		BulletList = new HashMap<String, BulletData>();
		GunList = new HashMap<String, GunData>();
		IconMap = new HashMap<String, BufferedImage>();
		IconMap.put("sample", editer.ResourceList.nullImage);
		SoundMap = new HashMap<String, byte[]>();
		ItemList.write();
		editer.ItemList.gunNum = 0;
		editer.ItemList.bulletNum = 0;
		PackInfoEditer.write();
		ItemEditer.clearEditer();
	}

	/** メニューバーと各パネルを配置 */
	public Window() {
		MainWindow = this;
		this.setTitle("HidePackEditer");
		this.setIconImage(new ImageIcon(ClassLoader.getSystemResource("icon/M14_scope.png")).getImage());
		this.setLayout(null);
		this.addComponentListener(this);
		// 画面の中央に適当なサイズで出現
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowClosing());
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

		addMenuItem(file, "New", "New");
		addMenuItem(file, "Open", "Open");
		addMenuItem(file, "Save", "Save");
		addMenuItem(file, "Save As...", "SaveAs");
		JMenu inport = new JMenu("import");
		file.add(inport);
		addMenuItem(inport, "Gun", "inGun");
		addMenuItem(inport, "Magazine", "inMagazine");
		addMenuItem(inport, "Icon", "inIcon");
		addMenuItem(inport, "Sound", "inSound");
		addMenuItem(file, "Exit", "Exit");

		this.setJMenuBar(menubar);

		ItemEditer = new ItemEditer();
		this.add(ItemEditer);
		ItemList = new ItemList();
		this.add(ItemList);
		ResourceList = new ResourceList();
		this.add(ResourceList);

		PackInfoEditer = new PackInfoEditer();
		this.add(PackInfoEditer);

		this.setVisible(true);
	}

	private void addMenuItem(JMenu menu, String name, String cmd) {
		JMenuItem item = new JMenuItem(name);
		item.setActionCommand(cmd);
		item.addActionListener(this);
		menu.add(item);
	}

	public static void main(String[] args) {
		INSTANCE = new Window();
	}

	// メニュー操作受付
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New")) {
			PackIO.makePack();
		} else if (e.getActionCommand().equals("Open")) {
			PackIO.openPack();
		} else if (e.getActionCommand().equals("Save") && Pack != null) {
			PackIO.save();
		} else if (e.getActionCommand().equals("SaveAs") && Pack != null) {
			PackIO.saveAs();
		} else if (e.getActionCommand().equals("inGun")) {
			PackIO.inportGun();
		} else if (e.getActionCommand().equals("inMagazine")) {
			PackIO.inportMagazine();
		} else if (e.getActionCommand().equals("inIcon")) {
			PackIO.inportIcon();
		} else if (e.getActionCommand().equals("inSound")) {
			PackIO.inportSound();
		}
	}

	@Override
	public void componentResized(ComponentEvent e) {
		if (ItemList != null) {
			ItemList.setBounds(0, 100, 200, this.getHeight() - 160);
		}
		if (ItemEditer != null) {
			ItemEditer.setBounds(200, 0, this.getWidth() - 400, this.getHeight() - 60);
		}
		if (ResourceList != null) {
			ResourceList.setBounds(this.getWidth() - 200, 0, 200, this.getHeight() - 60);
		}
		if (PackInfoEditer != null) {
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

	class WindowClosing extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			// 変更があったなら
			if (PackIO.isChanged) {
				int ans = JOptionPane.showConfirmDialog(INSTANCE, "save before closing?");
				if (ans == JOptionPane.YES_OPTION) {
					PackIO.save();
					System.exit(0);
				} else if (ans == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}else{
				System.exit(0);
			}

		}
	}
}
