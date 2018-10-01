package editer.mainWindow;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import editer.Main;
import io.PackIO;
import localize.LocalizeHandler;
import localize.LocalizeHandler.Lang;

/** メインのフレーム この中にすべて描画 */
public class MainWindow extends JFrame implements ActionListener, ComponentListener {
	/** メインWindow */
	private static final long serialVersionUID = -3092968886747656737L;

	/** Windowのインスタンス */
	public static MainWindow INSTANCE;

	public static ItemList ItemList;
	public static ResourceList ResourceList;
	public static PackInfoEditer PackInfoEditer;
	public static JPanel ItemEditer;

	/** メニューバーと各パネルを配置 */
	public MainWindow() {
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

		ItemEditer = null;
		ItemList = new ItemList();
		PackInfoEditer = new PackInfoEditer();
		ResourceList = new ResourceList();

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
		if (Main.Pack == null) {
			PackIO.makePack();
		}
	}

	public static void setEditer(JPanel editer) {
		if (ItemEditer != null) {
			INSTANCE.remove(ItemEditer);
		}
		ItemEditer = editer;
		if (editer != null) {
			INSTANCE.add(ItemEditer);
			resize();
		}
	}

	private void addMenuItem(JMenu menu, String name, String cmd) {
		JMenuItem item = new JMenuItem(name);
		item.setActionCommand(cmd);
		item.addActionListener(this);
		menu.add(item);
	}

	// メニュー操作受付
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New")) {
			PackIO.makePack();
		} else if (e.getActionCommand().equals("Open")) {
			PackIO.openPack();
		} else if (e.getActionCommand().equals("Save") && Main.Pack != null) {
			PackIO.save();
		} else if (e.getActionCommand().equals("SaveAs") && Main.Pack != null) {
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
			LocalizeHandler.setLang(cmd.replaceAll("Lang_", ""));
			this.dispose();
			new MainWindow();
		}
	}

	@Override
	public void componentResized(ComponentEvent e) {
		resize();
	}

	public static void resize(){
		if (ItemList != null) {
			ItemList.setBounds(0, 100, 200, INSTANCE.getHeight() - 160);
		}
		if (ItemEditer != null) {
			ItemEditer.setBounds(200, 0, INSTANCE.getWidth() - 400, INSTANCE.getHeight() - 60);
		}
		if (ResourceList != null) {
			ResourceList.setBounds(INSTANCE.getWidth() - 200, 0, 200, INSTANCE.getHeight() - 60);
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
