package valueEditer;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import types.GunData;

/** ListChooser用削除パネル付きのパネル */
public class ListComponent extends JPanel implements ComponentListener, ListCellRenderer<ListComponent> {
	private static final long serialVersionUID = 3283536785946717774L;

	public static final int GUN_MAGAZINE = 1;

	// データ格納
	int mode;
	GunData gundata;

	/**
	 * 銃用インスタンス モード 編集するデータ 名称
	 */
	public ListComponent(int mode, GunData data, String str) {
		this.mode = mode;
		this.gundata = data;

		JButton botton = new JButton("set");
		this.addComponentListener(this);
		this.add(botton);
	}

	//レンダーメゾット
	@Override
	public Component getListCellRendererComponent(JList<? extends ListComponent> list, ListComponent value, int index,
			boolean isSelected, boolean cellHasFocus) {
		return this;
	}


	@Override
	public void componentHidden(ComponentEvent arg0) {
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	}

	@Override
	public void componentResized(ComponentEvent arg0) {

	}

	@Override
	public void componentShown(ComponentEvent arg0) {
	}
}
