package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import types.base.ValueSetPanel;

public class StringComboPanel extends ValueSetPanel implements ActionListener{
	public StringComboPanel(String lore,String[] defauletValue, boolean canedit) {
		super(canedit);
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setOpaque(false);
		this.setLayout(null);
		// ラベル
		setting = new JLabel(lore + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
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
	}

	/**文字列設定のパネル*/
	private static final long serialVersionUID = 1223234781121917857L;

	int textFieldWidth = 120;

	/**テキストボックスの幅を設定*/
	public void setTextBoxWidth(int width){
		textFieldWidth = width;
		this.risize();
	}

	public void setItem(String item){
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
		if(txtCombo!=null){
			txtCombo.setEnabled(canedit);
		}
	}

	@Override
	public void saveValue() {

	}

	@Override
	public void risize() {
		txtCombo.setBounds(this.getWidth() - textFieldWidth - 3, 0, textFieldWidth, this.getHeight());
		setting.setBounds(0, 0, this.getWidth() - textFieldWidth-8, this.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!txtCombo.getSelectedItem().equals("")){
			save(txtCombo.getSelectedItem());
		}
	}
}