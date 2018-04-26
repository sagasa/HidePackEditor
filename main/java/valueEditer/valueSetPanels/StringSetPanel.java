package valueEditer.valueSetPanels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import hideEditer.ContentsList;
import hideEditer.MainWindow;
import types.GunData;
import types.GunData.GunDataList;
import types.base.DataBase;
import types.base.EnumDataList;

public class StringSetPanel extends ValueSetPanel{
	private static final long serialVersionUID = 3496770761921234269L;

	int textFieldWidth;
	
	/** テキストボックス */
	JTextField txtField;
	JLabel setting;

	/** コンストラクタ 編集可能 */
	public StringSetPanel(EnumDataList type, DataBase data) {
		this(type,data,true);
	}

	/** コンストラクタ 編集可能 テキストフィールド幅設定可能*/
	public StringSetPanel(EnumDataList type, DataBase data,int textFieldW) {
		this(type,data,true);
		this.textFieldWidth = textFieldW;
	}
	
	/** コンストラクタ 編集 可/不可 */
	public StringSetPanel(EnumDataList type, DataBase data, boolean canedit) {
		super(data,type,canedit);
		this.setOpaque(false);
		this.textFieldWidth = 147;
	}

	//インスタンス
	public void init() {
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.removeAll();
		this.setLayout(null);
		// ラベル
		setting = new JLabel(typeEnum.getName() + " :");
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(setting);

		// テキストボックス
		txtField = new JTextField(getValueString());
		txtField.addKeyListener(this);
		txtField.addFocusListener(this);
		txtField.setBorder(border);
		txtField.setEnabled(canEdit);
		this.add(txtField);
	}

	@Override
	public void rePaint() {
		txtField.setText(getValueString());
	}

	@Override
	public void setEnable(boolean canedit) {
		txtField.setEnabled(canedit);
	}

	@Override
	public void saveValue() {
		//表示書き換え
		if(typeEnum == GunDataList.DISPLAY_NAME){
			DataBase cash = MainWindow.gunMap.get(getValueString());
			MainWindow.gunMap.remove(getValueString());
			setValue(txtField.getText());
			MainWindow.gunMap.put(getValueString(), (GunData) cash);
			ContentsList.write();
		}else{
			setValue(txtField.getText());
		}
	}

	@Override
	public void risize() {
		txtField.setBounds(this.getWidth() - textFieldWidth - 3, 0, textFieldWidth, this.getHeight());
		setting.setBounds(0, 0, this.getWidth() - textFieldWidth-8, this.getHeight());
	}



}