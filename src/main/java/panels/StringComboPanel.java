package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import editer.ValueInfo;
import helper.ArrayEditer;
import types.base.DataBase;
import types.base.EnumDataInfo;
import types.base.ValueSetPanel;

public class StringComboPanel extends ValueSetPanel implements ActionListener {

	public StringComboPanel(String lore, String[] defauletValue, String selected, boolean canedit) {
		super(canedit);
		init(lore, defauletValue, selected);
	}

	/** DataBaseからの利用 */
	public StringComboPanel(DataBase data, EnumDataInfo type, String[] defauletValue, boolean canedit) {
		super(data, type, canedit);
		init(ValueInfo.getLocalizedName(type), defauletValue, (String) ValueInfo.getData(data, type));

	}

	private void init(String lore, String[] defauletValue, String selected) {
		// もしコンボ一覧に含まれていない値が初期値なら
		if (!Arrays.asList(defauletValue).contains(selected)) {
			defauletValue = ArrayEditer.AddToArray(defauletValue, selected);
		}

		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setOpaque(false);
		this.setLayout(null);
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
		for (String data : defauletValue) {
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

	}

	@Override
	public void setEnable(boolean canedit) {
		if (txtCombo != null) {
			txtCombo.setEnabled(canedit);
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
