package editPanel.base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import helper.EditHelper;
import types.base.DataBase;

public class StringSetPanel extends ValueSetPanel {
	public StringSetPanel(String lore, String defauletValue, boolean canedit) {
		super(canedit);
		init(lore, defauletValue);
	}

	/** DataBaseからの利用 */
	public StringSetPanel(DataBase data, EnumDataInfo type) {
		super(data, type);
		init(EditHelper.getLocalizedName(type), (String) EditHelper.getData(data, type));
	}

	private void init(String lore, String defauletValue) {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setOpaque(false);
		this.setLayout(null);
		// ラベル
		setting = new JLabel(lore + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		setting.setPreferredSize(new Dimension(0, 0));
		this.add(setting);

		// テキストボックス
		txtField = new JTextField(defauletValue);
		txtField.addKeyListener(this);
		txtField.addFocusListener(this);
		txtField.setBorder(border);
		txtField.setEnabled(canEdit);
		this.add(txtField);
	}

	/** 文字列設定のパネル */
	private static final long serialVersionUID = 1223234781121917857L;

	int textFieldWidth = 120;

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
				txtField.setText((String) EditHelper.getData(Data, Type));
			}
		}
	}

	@Override
	public void saveValue() {
		save(txtField.getText());
	}

	@Override
	public void risize() {
		txtField.setBounds(this.getWidth() - textFieldWidth - 3, 0, textFieldWidth, this.getHeight());
		setting.setBounds(0, 0, this.getWidth() - textFieldWidth - 8, this.getHeight());
	}

}
