package valueEditer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

import types.GunData;

/** ListChooser用削除パネル付きのパネル isInBottonでデリーとパネルの中か取得*/
public class ListComponent extends JPanel implements ListCellRenderer<ListComponent> {
	private static final long serialVersionUID = 3283536785946717774L;
	
	// データ格納
	String name;
	int mode;
	GunData gundata;
	
	JLabel label;

	/**
	 * 銃用インスタンス モード 編集するデータ 名称
	 */
	public ListComponent(String str) {
		this.name = str;
		this.setLayout(null);
		this.setOpaque(false);

		//NamePanel
		JLabel name = new JLabel(str);
		name.setBounds(5, 1, 65, 18);
		this.add(name);
		//削除！のパネル
		LineBorder border = new LineBorder(Color.black, 1, false);
		label = new JLabel("delete");
		label.setBounds(70, 1, 35, 18);
		label.setBackground(Color.RED);
		label.setForeground(Color.white);
		label.setFont(new Font("BOLD", Font.BOLD, 10));
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		this.add(label);
	}

	/**レンダー登録用*/
	public ListComponent() {
	}

	/**削除ボタンの上か判別*/
	public boolean isInBotton(Point point){
		System.out.println(point+" "+label.getBounds()+" "+ label.getBounds().contains(point));
		return label.getBounds().contains(point);
	}
	

	//レンダーメゾット
	@Override
	public Component getListCellRendererComponent(JList<? extends ListComponent> list, ListComponent value, int index,
			boolean isSelected, boolean cellHasFocus) {
		return value;
	}
}
