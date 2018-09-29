package editPanel.base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import helper.EditHelper;
import types.base.DataBase;

public class NumberSetPanel extends ValueSetPanel implements MouseWheelListener {
	String nowValue;

	/** 文字列設定のパネル */
	private static final long serialVersionUID = 5973213511879454096L;

	int textFieldWidth = 40;
	boolean isFloat;

	Float Max = null;
	Float Min = null;
	String scale = null;

	/** DataBase以外からの利用 */
	public NumberSetPanel(String lore, String defauletValue, boolean canedit, boolean isFloat) {
		super(canedit);
		this.isFloat = isFloat;
		init(lore, defauletValue);
	}

	/** DataBaseからの利用 */
	public NumberSetPanel(DataBase data, EnumDataInfo type) {
		super(data, type);
		Max = type.getMax();
		Min = type.getMin();
		scale = type.getScale() != null ? type.getScale() : "1";
		try {
			this.isFloat = float.class.isAssignableFrom(EditHelper.getType(data, type))
					|| Float.class.isAssignableFrom(EditHelper.getType(data, type));
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		init(EditHelper.getLocalizedName(type), EditHelper.getData(data, type).toString());
	}

	private void init(String lore, String defauletValue) {
		this.setOpaque(false);
		this.setLayout(null);
		LineBorder border = new LineBorder(Color.black, 1, false);
		nowValue = defauletValue;
		// ラベル
		setting = new JLabel(lore + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 12));
		setting.setPreferredSize(new Dimension(0, 0));
		this.add(setting);

		// テキストボックス
		txtField = new JTextField(defauletValue);
		txtField.addKeyListener(this);
		txtField.addMouseWheelListener(this);
		txtField.addFocusListener(this);
		txtField.setBorder(border);
		txtField.setHorizontalAlignment(JTextField.CENTER);
		txtField.setEnabled(canEdit);
		this.add(txtField);
	}

	/** 最小最大の定義 */
	public NumberSetPanel setLimit(Float max, Float min) {
		Max = max;
		Min = min;
		return this;
	}

	/** テキストボックスの幅を設定 */
	public void setTextBoxWidth(int width) {
		textFieldWidth = width;
		this.risize();
	}

	/** テキストボックスの中身書き込み */
	public void setText(String value) {
		txtField.setText(value);
	}

	/** テキストボックス */
	private JTextField txtField;
	private JLabel setting;

	@Override
	public void rePaint() {
		if (txtField != null) {
			txtField.setEnabled(canEdit);
			// DataBaseならそこから代入
			if (Data != null) {
				txtField.setText(EditHelper.getData(Data, Type).toString());
			}
		}
	}

	/** 単位量増やすor減らす */
	private void change(int i) {

		float value = new BigDecimal(nowValue).add(new BigDecimal(scale).multiply(new BigDecimal(i))).floatValue();
		// 最小 最大の判定
		if (Max != null && Max < value) {
			txtField.setText(Max.toString());
		}
		if (Min != null && value < Min) {
			txtField.setText(Min.toString());
		}
		saveValue();
	}

	@Override
	public void saveValue() {
		// まずい場合のためにtry
		try {
			// 型で場合分け
			if (isFloat) {
				Float value = new Float(this.txtField.getText());
				if (Max != null && Max < value) {
					value = Max;
				}
				if (Min != null && value < Min) {
					value = Min;
				}
				save(value);
				nowValue = value.toString();
			} else {
				Integer value = new Integer(this.txtField.getText());
				if (Max != null && Max < value) {
					value = Max.intValue();
				}
				if (Min != null && value < Min) {
					value = Min.intValue();
				}
				save(value);
				nowValue = value.toString();
			}
		} catch (NumberFormatException e2) {
		}
		txtField.setText(nowValue);
	}

	@Override
	public void risize() {
		txtField.setBounds(this.getWidth() - textFieldWidth - 3, 0, textFieldWidth, this.getHeight());
		setting.setBounds(0, 0, this.getWidth() - textFieldWidth - 8, this.getHeight());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		switch (e.getKeyCode()) {
		case 38:
			change(1);
			break;
		case 40:
			change(-1);
			break;
		}
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		change(e.getWheelRotation() * -1);
	}
}
