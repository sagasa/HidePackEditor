package panels;

import java.awt.Color;
import java.awt.Dimension;
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

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;
import types.base.ValueSetPanel;

public class NumberSetPanel extends ValueSetPanel implements MouseWheelListener {
	String nowValue;
	/** DataBase以外からの利用 */
	public NumberSetPanel(String lore, String defauletValue, boolean canedit, boolean isFloat) {
		super(canedit);
		this.setOpaque(false);
		this.setLayout(null);
		this.isFloat = isFloat;
		init(lore, defauletValue);
	}

	DataBase Data;
	EnumDataList Type;
	/** DataBaseからの利用 */
	public NumberSetPanel(DataBase data,EnumDataList type,boolean canedit){
		super(canedit);
		this.setOpaque(false);
		this.setLayout(null);
		Data = data;
		Type = type;
		this.isFloat = type.getType().equals(DataType.Float);
		init(type.getName(), data.getDataString(type));
	}

	private void init(String lore, String defauletValue) {
		LineBorder border = new LineBorder(Color.black, 1, false);
		// ラベル
		setting = new JLabel(lore + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
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

	/** 文字列設定のパネル */
	private static final long serialVersionUID = 5973213511879454096L;

	int textFieldWidth = 25;
	boolean isFloat;

	/**DataBaseを使用するなら通知を行わない*/
	@Override
	public void save(Object value) {
		if(Data==null){
			super.save(value);
		}else{
			Data.setData(Type, value);
		}
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

	}

	@Override
	public void setEnable(boolean canedit) {
		if (txtField != null) {
			txtField.setEnabled(canedit);
		}
	}

	/** 単位量増やすor減らす */
	private void change(int i) {
		if(isFloat){
			float value = new BigDecimal(nowValue).add(new BigDecimal("0.1").multiply(new BigDecimal(i))).floatValue();
			save(value);
			nowValue = value+"";
		}else{
			int num = Integer.valueOf(nowValue)+1;
			save(num);
			nowValue = num+"";
		}
	}

	@Override
	public void saveValue() {
		Pattern p = Pattern.compile("[^\\d\\.]");
		Matcher m = p.matcher(this.txtField.getText());
		txtField.setText(m.replaceAll(""));
		// まずい場合のためにtry
		try {
			// 型で場合分け
			if (isFloat) {
				save(new Float(m.replaceAll("")));
				nowValue = m.replaceAll("");
			} else {
				save(new Integer(m.replaceAll("")));
				nowValue = m.replaceAll("");
			}
		} catch (NumberFormatException e2) {
			System.out.println(nowValue);
			txtField.setText(nowValue);
		}
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
