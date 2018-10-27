package editPanel.base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import helper.EditHelper;
import types.base.DataBase;

public class StringComboPanel extends ValueSetPanel implements ActionListener {

	/**リペイント時に参照されるset*/
	Set<String> AllList;

	/** DataBaseからの利用 */
	public StringComboPanel(DataBase data, String type, Set<String> defauletValue) {
		super(data, type);
		init(EditHelper.getLocalizedName(data,type), defauletValue, (String) EditHelper.getData(data, type));

	}

	private void init(String lore, Set<String> defauletValue, String selected) {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setOpaque(false);
		this.setLayout(null);
		AllList = defauletValue;
		// ラベル
		setting = new JLabel(lore + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setPreferredSize(new Dimension(0, 0));
		this.add(setting);

		// コンボボックス
		txtCombo = new JComboBox<String>();
		txtCombo.addActionListener(this);
		txtCombo.setBorder(border);
		txtCombo.setEnabled(canEdit);
		for (String data : AllList) {
			txtCombo.addItem(data);
		}
		this.add(txtCombo);
		setItem(selected);
	}

	/** 文字列設定のパネル */
	private static final long serialVersionUID = 1223234781121917857L;

	int textFieldWidth = 120;

	/** テキストボックスの幅を設定 */
	public void setTextBoxWidth(int width) {
		textFieldWidth = width;
		this.risize();
	}

	public void setItem(String item) {
		txtCombo.setSelectedItem(item);
	}

	/** コンボボックス */
	private JComboBox<String> txtCombo;
	private JLabel setting;

	@Override
	public void rePaint() {
		if (txtCombo != null) {
			txtCombo.setEnabled(canEdit);
			txtCombo.removeAllItems();
			for (String data : AllList) {
				txtCombo.addItem(data);
			}
			// DataBaseならそこから代入
			if (Data != null) {
				setItem(EditHelper.getData(Data, Type).toString());
			}
		}
	}

	@Override
	public void saveValue() {
	}

	@Override
	public void risize() {
		txtCombo.setBounds(this.getWidth() - textFieldWidth - 3, 0, textFieldWidth, this.getHeight());
		setting.setBounds(0, 0, this.getWidth() - textFieldWidth - 8, this.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (!txtCombo.getSelectedItem().equals("")) {
			save(txtCombo.getSelectedItem());
		}
	}
}
