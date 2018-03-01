package valueEditer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

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
		this.setLayout(null);
		this.setOpaque(false);

		//NamePanel
		JLabel name = new JLabel(str);
		name.setBounds(5, 1, 65, 18);
		this.add(name);
		//削除！のパネル
		LineBorder border = new LineBorder(Color.black, 1, false);
		JLabel label = new JLabel("delete");
		label.setBounds(70, 1, 35, 18);
		label.setBackground(Color.RED);
		label.setForeground(Color.white);
		label.setFont(new Font("BOLD", Font.BOLD, 10));
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		this.addComponentListener(this);
		this.add(label);
	}

	/**レンダー登録用*/
	public ListComponent() {
	}

	//レンダーメゾット
	@Override
	public Component getListCellRendererComponent(JList<? extends ListComponent> list, ListComponent value, int index,
			boolean isSelected, boolean cellHasFocus) {
		return value;
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
