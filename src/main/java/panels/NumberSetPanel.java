package panels;

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

import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;
import types.base.ValueSetPanel;

public class NumberSetPanel extends ValueSetPanel implements MouseWheelListener {
	String nowValue;
	/** DataBase以外からの利用 */
	public NumberSetPanel(String lore, String defauletValue, boolean canedit, boolean isFloat) {
		super(canedit);
		this.isFloat = isFloat;
		init(lore, defauletValue);
	}

	DataBase Data;
	EnumDataList Type;
	/** DataBaseからの利用 */
	public NumberSetPanel(DataBase data,EnumDataList type,boolean canedit){
		super(canedit);
		Data = data;
		Type = type;
		Max = type.getMax();
		Min = type.getMin();
		this.isFloat = type.getType().equals(DataType.Float);
		init(type.getName(), data.getDataString(type));
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

	/** 文字列設定のパネル */
	private static final long serialVersionUID = 5973213511879454096L;

	int textFieldWidth = 40;
	boolean isFloat;

	Float Max = null;
	Float Min = null;

	/**最小最大の定義*/
	public NumberSetPanel setLimit(Float max,Float min){
		Max = max;
		Min = min;
		return this;
	}

	/**DataBaseを使用しているなら書き換え*/
	@Override
	public void save(Object value) {
		if(Data!=null){
			Data.setData(Type, value);
		}
		super.save(value);
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
			//最小 最大の判定
			if(Max!=null&&Max<value){
				return;
			}
			if(Min!=null&&value<Min){
				return;
			}
			save(value);
			nowValue = value+"";

		}else{
			int num = Integer.valueOf(nowValue)+i;
			//最小 最大の判定
			if(Max!=null&&Max<num){
				return;
			}
			if(Min!=null&&num<Min){
				return;
			}
			save(num);
			nowValue = num+"";
		}
		txtField.setText(nowValue);
	}

	@Override
	public void saveValue() {
		// まずい場合のためにtry
		try {
			// 型で場合分け
			if (isFloat) {
				Float value = new Float(this.txtField.getText());
				if(Max!=null&&Max<value){
					value = Max;
				}
				if(Min!=null&&value<Min){
					value = Min;
				}
				save(value);
				nowValue = value.toString();
			} else {
				Integer value = new Integer(this.txtField.getText());
				if(Max!=null&&Max<value){
					value = Max.intValue();
				}
				if(Min!=null&&value<Min){
					value = Min.intValue();
				}
				save(value);
				nowValue =  value.toString();
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
