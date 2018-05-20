package hideEditer.dataEditer.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import hideEditer.dataEditer.ChangeListener;
import types.base.DataBase;
import types.base.EnumDataList;

/** 設定ボックス IntとFloatのみ対応 changeListener付 */
public class NumberSetPanel extends ValueSetPanel implements MouseWheelListener{
	private static final long serialVersionUID = 3496770761921234269L;

	// 内容
	/** ラベル */
	JLabel setting;
	/** テキストボックス */
	JTextField setting2;

	/** コンストラクタ 編集可能 */
	public NumberSetPanel(EnumDataList d, DataBase gun) {
		this(d, gun, true);
	}

	/** コンストラクタ 編集 可/不可 */
	public NumberSetPanel(EnumDataList d, DataBase gun, boolean canedit) {
		super(gun,d,canedit);
		this.addComponentListener(this);
		this.setOpaque(false);
	}


	// 画面制作
	public void init() {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setLayout(null);
		// ラベル
		setting = new JLabel(typeEnum.getName() + " :");
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


	/** 1増やすor1減らす 引数 1,-1 */
	void change(int i) {
		// 編集可能なら
		//System.out.println(i +" "+data.getDataInt(typeEnum) + "  "+canEdit +" "+ typeEnum.getMin());
		if (canEdit){
			switch (this.getDataType()) {
			case Int:
				int num = data.getDataInt(typeEnum);
				if (typeEnum.getMin() == null||num + i >= (typeEnum).getMin()) {
					setValue(num + i);
				}

				break;
			case Float:
				String num2 = data.getDataString(typeEnum);
				float value = new BigDecimal(num2).add(new BigDecimal("0.1").multiply(new BigDecimal(i))).floatValue();
				if (typeEnum.getMin() == null || value >= typeEnum.getMin()) {
					setValue(value);
				}

				// System.out.println(num2+" "+(e.getWheelRotation()*-0.1));
				break;
			default:
				break;
			}
			// 更新を通知
			if (target != null) {
				target.valueChange(ChangeListener.NUMBER_CHANGE);
			}
			repaint();
		}

	}


	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// System.out.println(e.getWheelRotation());
		change(e.getWheelRotation() * -1);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		// System.out.println(e.getSource());
		switch (e.getKeyCode()) {
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
	public void saveValue() {
		Pattern p = Pattern.compile("[^\\d\\.]");
		Matcher m = p.matcher(this.setting2.getText());
		// まずい場合のためにtry
		try {
			// 型で場合分け
			switch (typeEnum.getType()) {
			case Int:
				setValue(new Integer(m.replaceAll("")));
				break;
			case Float:
				setValue(new Float(m.replaceAll("")));
				break;
			default:
				break;
			}
		} catch (NumberFormatException e2) {
		}
		// 更新を通知
		if (target != null) {
			target.valueChange(ChangeListener.NUMBER_CHANGE);
		}

	}

	@Override
	public void risize() {
		setting.setBounds(0, 0, this.getWidth() - 33, this.getHeight());
		setting2.setBounds(this.getWidth() - 30, 0, 30, this.getHeight());

	}

	@Override
	public void rePaint() {
		if (data != null){
			setting2.setText(data.getDataString(typeEnum));
		}
	}
	@Override
	public void setEnable(boolean canedit) {
		setting2.setEnabled(canedit);
	}
}
