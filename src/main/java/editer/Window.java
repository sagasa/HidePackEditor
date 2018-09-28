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
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

import helper.JavaScriptTest;
import helper.LocalizeHandler;
import helper.LocalizeHandler.Lang;
import io.PackIO;
import panels.LWJGLPanel;
import types.*;
import types.guns.BulletData;
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
	/** IconのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> IconMap = new HashMap<String, BufferedImage>();
	/** ScopeのMAP Name - BufferedImage */
	public static Map<String, BufferedImage> ScopeMap = new HashMap<String, BufferedImage>();
	/** SoundのMAP Name - byte[] */
	public static Map<String, byte[]> SoundMap = new HashMap<String, byte[]>();

	public static String packPath;

	/** パック */
	public static ContentsPack Pack;

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
		ScopeMap = new HashMap<String, BufferedImage>();
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
		INSTANCE = this;
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
		JMenu file = new JMenu(LocalizeHandler.getLocalizedName(Lang.File));
		JMenu edit = new JMenu(LocalizeHandler.getLocalizedName(Lang.Edit));

		menubar.add(file);
		menubar.add(Box.createRigidArea(new Dimension(5, 1)));
		menubar.add(edit);

		addMenuItem(file, LocalizeHandler.getLocalizedName(Lang.New), "New");
		addMenuItem(file, LocalizeHandler.getLocalizedName(Lang.Open), "Open");
		addMenuItem(file, LocalizeHandler.getLocalizedName(Lang.Save), "Save");
		addMenuItem(file, LocalizeHandler.getLocalizedName(Lang.SaveAs), "SaveAs");
		JMenu inport = new JMenu(LocalizeHandler.getLocalizedName(Lang.Import));
		file.add(inport);
		addMenuItem(inport, LocalizeHandler.getLocalizedName(Lang.Gun), "inGun");
		addMenuItem(inport, LocalizeHandler.getLocalizedName(Lang.Magazine), "inMagazine");
		addMenuItem(inport, LocalizeHandler.getLocalizedName(Lang.Icon), "inIcon");
		addMenuItem(inport, LocalizeHandler.getLocalizedName(Lang.Sound), "inSound");
		addMenuItem(inport, LocalizeHandler.getLocalizedName(Lang.Scope), "inScope");

		ItemEditer = new ItemEditer();
		ItemList = new ItemList();
		PackInfoEditer = new PackInfoEditer();
		ResourceList = new ResourceList();

		this.add(ItemEditer);
		this.add(ItemList);
		this.add(ResourceList);
		this.add(PackInfoEditer);

		// 言語
		JMenu lang = new JMenu(LocalizeHandler.getLocalizedName(Lang.Lang));
		file.add(lang);
		ButtonGroup group = new ButtonGroup();

		for (String name : LocalizeHandler.getLangList()) {
			if (!name.equals("default")) {
				JRadioButtonMenuItem item = new JRadioButtonMenuItem(name);
				item.setSelected(name.equals(LocalizeHandler.getLang()));
				item.addActionListener(this);
				item.setActionCommand("Lang_" + name);
				group.add(item);
				lang.add(item);
			}
		}

		addMenuItem(file, LocalizeHandler.getLocalizedName(Lang.Exit), "Exit");

		this.setJMenuBar(menubar);
		this.setVisible(true);
		// パックがないなら作っとく
		if (Pack == null) {
			PackIO.makePack();
		}
	}

	private void addMenuItem(JMenu menu, String name, String cmd) {
		JMenuItem item = new JMenuItem(name);
		item.setActionCommand(cmd);
		item.addActionListener(this);
		menu.add(item);
	}

	public static void main(String[] args) {
		JavaScriptTest.init();
		try {
			JavaScriptTest.test();
		} catch (Exception e) {

			e.printStackTrace();
		}
		// LWJGLテスト
		//LWJGLPanel modelWindow = new LWJGLPanel();
		// System.out.println(FlanModelLoader.loadGunModel("AR3_AVS36Scoped.txt"));


		LocalizeHandler.init();
		LocalizeHandler.loadLang();
		LocalizeHandler.setLang("en");
		// new Window();
	}

	Editer openedEditer = null;

	/** エディター操作 */
	public void showEditer(Editer editer) {
		// 今出ているのを隠す
		if (openedEditer != null && !openedEditer.equals(editer)) {
			openedEditer.setVisibleEditer(false);
		}
		// 標示する
		if (editer != null) {
			openedEditer = editer;
			editer.setVisibleEditer(true);
		}
	}

	/** エディター操作 */
	public void rewriteEditer() {
		// 今出ているのを隠す

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
		} else if (e.getActionCommand().startsWith("Lang_")) {
			String cmd = e.getActionCommand();
			System.out.println(cmd);
			LocalizeHandler.setLang(cmd.replaceAll("Lang_", ""));
			this.dispose();
			new Window();
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
			} else {
				System.exit(0);
			}

		}
	}
}
