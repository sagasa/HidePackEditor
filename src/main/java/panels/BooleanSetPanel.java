package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import types.base.DataBase;
import types.base.EnumDataList;
import types.base.ValueSetPanel;

public class BooleanSetPanel  extends ValueSetPanel implements ActionListener{

	/**文字列設定のパネル*/
	private static final long serialVersionUID = 1223234781121917857L;

	/** テキストボックス */
	private JCheckBox checkBox;

	/**DataBase以外からの利用*/
	public BooleanSetPanel(String lore,boolean defauletValue, boolean canedit) {
		super(canedit);
		init(lore, defauletValue);
	}

	DataBase Data;
	EnumDataList Type;
	/** DataBaseからの利用 */
	public BooleanSetPanel(DataBase data,EnumDataList type, boolean canedit) {
		super(canedit);
		Data = data;
		Type = type;
		init(type.getName(), data.getDataBoolean(type));
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

	}

	@Override
	public void setEnable(boolean canedit) {
		if(checkBox!=null){
			checkBox.setEnabled(canedit);
		}
	}

	/**DataBaseを使用するなら通知を行わない*/
	@Override
	public void save(Object value) {
		super.save(value);
		if(Data!=null){
			Data.setData(Type, value);
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