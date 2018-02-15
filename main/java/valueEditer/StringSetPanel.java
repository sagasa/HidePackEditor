package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import types.GunData;
import types.GunData.GunDataList;

public class StringSetPanel extends JPanel implements KeyListener, FocusListener, ComponentListener {
	private static final long serialVersionUID = 3496770761921234269L;

	/** データリスト */
	Object datatype;
	/** データ */
	Object data;
	/** データ型 */
	String type;
	/** set可能かどうか */
	boolean canEdit;

	/** テキストボックス */
	JTextField txtField;

	/** コンストラクタ 編集可能 */
	public StringSetPanel(GunDataList d, GunData gun) {
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = true;
		this.addComponentListener(this);
		this.setOpaque(false);
	}

	/** コンストラクタ 編集 可/不可 */
	public StringSetPanel(GunDataList d, GunData gun, boolean canedit) {
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = canedit;
	}

	// 描画
	void write() {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.removeAll();
		this.setLayout(null);
		// ラベル
		JLabel setting = new JLabel(getname() + " :");
		setting.setBounds(0, 0, this.getWidth() - 155, this.getHeight());
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(setting);

		// テキストボックス
		// 条件分岐
		if (canEdit) {
			txtField = new JTextField(get());
			txtField.setBounds(this.getWidth() - 150, 0, 147, this.getHeight());
			txtField.addKeyListener(this);
			txtField.addFocusListener(this);
			txtField.setBorder(border);
			this.add(txtField);
		} else {
			JLabel setting2 = new JLabel(get());
			setting2.setBounds(this.getWidth() - 150, 0, 147, this.getHeight());
			setting2.setHorizontalAlignment(JLabel.CENTER);
			setting2.setFont(new Font("BOLD", Font.BOLD, 13));
			this.add(setting2);
		}
	}

	/**変数から登録名読み込み*/
	String getname(){
		String value = null;
		switch (type) {
		case "gun":
			value = ((GunDataList) datatype).getName();
			break;
		}

		return value;
	}

	/**変数からデータ読み込み*/
	String get(){
		String value = null;
		switch (type) {
		case "gun":
			value = ((GunDataList) datatype).getData((GunData) data).toString();
			break;
		}

		return value;
	}

	/** 変数に書き込み */
	void set(String value) {
		switch (type) {
		case "gun":
			((GunDataList) datatype).setData((GunData) data, value);
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 10:
			set(txtField.getText());
			this.getParent().requestFocusInWindow();
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
		set(txtField.getText());
	}

	@Override
	public void componentResized(ComponentEvent e) {
		write();
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}
}