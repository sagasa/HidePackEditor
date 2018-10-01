package editPanel.base;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import helper.EditHelper;
import types.base.DataBase;

public class BooleanSetPanel  extends ValueSetPanel implements ActionListener{

	/**文字列設定のパネル*/
	private static final long serialVersionUID = 1223234781121917857L;

	/** テキストボックス */
	private JCheckBox checkBox;


	/** DataBaseからの利用 */
	public BooleanSetPanel(DataBase data,String type) {
		super(data,type);
		init(EditHelper.getLocalizedName(data, type), (boolean) EditHelper.getData(data, type));
	}

	private void init(String lore,boolean defaultValue){
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setOpaque(false);
		this.setLayout(null);

		// テキストボックス
		checkBox = new JCheckBox(lore);
		checkBox.addActionListener(this);
		checkBox.setSelected(defaultValue);
		checkBox.setBorder(border);
		checkBox.setFont(new Font("BOLD", Font.BOLD, 13));
		checkBox.setEnabled(canEdit);
		this.add(checkBox);
	}

	@Override
	public void rePaint() {
		if(checkBox!=null){
			checkBox.setEnabled(canEdit);
		}
	}

	@Override
	public void saveValue() {
		save(checkBox.getSelectedObjects()!=null);
	}

	@Override
	public void risize() {
		checkBox.setBounds(2, 0, this.getWidth()-4, this.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		saveValue();
	}

}