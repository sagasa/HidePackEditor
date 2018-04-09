package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import types.GunData;
import types.GunData.GunDataList;

/** 設定ボックス IntとFloatのみ対応 changeListener付 */
public class NumberSetPanel extends JPanel
		implements MouseWheelListener, KeyListener, FocusListener, ComponentListener {
	private static final long serialVersionUID = 3496770761921234269L;

	/** データリスト */
	Object datatype;
	/** データ */
	Object data;
	/** データ型 */
	String type;
	/** set可能かどうか */
	boolean canEdit;

	/** 通知先の保存 */
	ChangeListener target;

	// 内容
	/** ラベル */
	JLabel setting;
	/** テキストボックス */
	JTextField setting2;

	/** コンストラクタ 編集可能 */
	public NumberSetPanel(GunDataList d, GunData gun) {
		this(d, gun, true);
	}

	/** コンストラクタ 編集 可/不可 */
	public NumberSetPanel(GunDataList d, GunData gun, boolean canedit) {
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = canedit;
		this.addComponentListener(this);
		this.setOpaque(false);
		init();
		write();
	}

	/** 編集可能か切り替え */
	public void setEnabled(boolean value) {
		canEdit = value;
	}

	/** 変更通知リスナーを追加 */
	public void addChangeListener(ChangeListener l) {
		target = l;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		write();
	}

	// 画面制作
	void init() {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setLayout(null);
		// ラベル
		setting = new JLabel(((GunDataList) datatype).getName() + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(setting);
		// テキストボックス
		setting2 = new JTextField();
		setting2.addMouseWheelListener(this);
		setting2.addKeyListener(this);
		setting2.addFocusListener(this);
		setting2.setBorder(border);
		this.add(setting2);
	}

	// 内容更新
	void write() {
		// テキストボックス
		setting2.setText(((GunDataList) datatype).getData((GunData) data).toString());
		setting2.setEnabled(canEdit);
	}

	/** 1増やすor1減らす 引数 1,-1 */
	void change(int i) {
		// 編集可能なら
		if (canEdit) {
			switch (((GunDataList) datatype).getType()) {
			case "int":
				int num = new Integer(((GunDataList) datatype).getData((GunData) data).toString());
				if (((GunDataList) datatype).getMin() != null) {
					if (num + i >= ((GunDataList) datatype).getMin()) {
						((GunDataList) datatype).setData((GunData) data, num + (i));
					}
				} else {
					((GunDataList) datatype).setData((GunData) data, num + (i));
				}

				break;
			case "float":
				String num2 = ((GunDataList) datatype).getData((GunData) data).toString();

				float value = new BigDecimal(num2).add(new BigDecimal("0.1").multiply(new BigDecimal(i))).floatValue();
				Float min = ((GunDataList) datatype).getMin();
				if (min == null || value >= min) {
					((GunDataList) datatype).setData((GunData) data, value);
				}

				// System.out.println(num2+" "+(e.getWheelRotation()*-0.1));
				break;
			}
			// 更新を通知
			if (target != null) {
				target.valueChange();
			}
			repaint();

		}
	}

	/** 決定 */
	void set() {
		Pattern p = Pattern.compile("[^\\d\\.]");
		Matcher m = p.matcher(this.setting2.getText());
		// まずい場合のためにtry
		try {
			// 型で場合分け
			switch (((GunDataList) datatype).getType()) {
			case "int":
				((GunDataList) datatype).setData((GunData) data, new Integer(m.replaceAll("")));
				break;
			case "float":
				((GunDataList) datatype).setData((GunData) data, new Float(m.replaceAll("")));
				break;
			}
		} catch (NumberFormatException e2) {
		}
		// 更新を通知
		if (target != null) {
			target.valueChange();
		}
		repaint();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// System.out.println(e.getWheelRotation());
		change(e.getWheelRotation() * -1);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println(e.getSource());
		switch (e.getKeyCode()) {
		case 10:
			set();
			this.getParent().requestFocusInWindow();
			break;
		case 38:
			change(1);
			break;
		case 40:
			change(-1);
			break;
		}
		// System.out.println(e.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void focusGained(FocusEvent e) {
	}

	@Override
	public void focusLost(FocusEvent e) {
		// これをフラグに書き換える
		set();
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		setting.setBounds(0, 0, this.getWidth() - 33, this.getHeight());
		setting2.setBounds(this.getWidth() - 30, 0, 30, this.getHeight());
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
	}
}
