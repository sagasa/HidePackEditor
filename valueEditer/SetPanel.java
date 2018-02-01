package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import types.GunData;
import types.GunData.GunDataList;

public class SetPanel extends JPanel implements ActionListener, MouseWheelListener, KeyListener{
	private static final long serialVersionUID = 3496770761921234269L;

	/**データリスト*/
	Object datatype;
	/**データ*/
	Object data;
	/**データ型*/
	String type;
	/**set可能かどうか*/
	boolean canEdit;

	/**テキストボックス*/
	JTextField setting2;

	/**コンストラクタ 編集可能*/
	public SetPanel(GunDataList d,GunData gun){
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = true;
	}
	/**コンストラクタ 編集 可/不可*/
	public SetPanel(GunDataList d,GunData gun, boolean canedit){
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = canedit;
	}

	/**設定ボックス IntとFloatのみ対応*/
	@Override
	public void paintComponent(Graphics g){
		LineBorder border = new LineBorder(Color.black, 1, false);
		this.setLayout(null);
		//ラベル
		JLabel setting = new JLabel(((GunDataList) datatype).getName()+" :");
		setting.setBounds(0, 0, this.getWidth()-70, this.getHeight());
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(setting);

		//テキストボックス
		//条件分岐
		if(canEdit){
			setting2 = new JTextField(((GunDataList) datatype).getData((GunData)data).toString());
			setting2.setBounds(this.getWidth()-68, 0, 30 , this.getHeight());
			setting2.addMouseWheelListener(this);
			setting2.addKeyListener(this);
			setting2.setBorder(border);
			this.add(setting2);
		}else{
			JLabel setting2 = new JLabel(((GunDataList) datatype).getData((GunData)data).toString());
			setting2.setBounds(this.getWidth()-68, 0, 30 , this.getHeight());
			setting2.setHorizontalAlignment(JLabel.CENTER);
			setting2.setFont(new Font("BOLD", Font.BOLD, 13));
			this.add(setting2);
		}



		//決定ボタン
		JButton setting3 = new JButton("set");
		setting3.setBounds(this.getWidth()-36, 0,36 , this.getHeight());
		setting3.setBorder(border);
		setting3.addActionListener(this);
		setting3.setActionCommand("setGun");
		setting3.setEnabled(canEdit);
		this.add(setting3);

	}
	/**1増やすor1減らす 引数 1,-1*/
	void change(int i){
		switch (((GunDataList) datatype).getType()){
		case "int":
			int num = new Integer (((GunDataList) datatype).getData((GunData)data).toString());
			((GunDataList) datatype).setData((GunData)data,num+(i));
		break;
		case "float":
			String num2 = ((GunDataList) datatype).getData((GunData)data).toString();
			((GunDataList) datatype).setData((GunData)data,new BigDecimal(num2).add(new BigDecimal("-0.1").multiply(new BigDecimal(i))));
			//System.out.println(num2+" "+(e.getWheelRotation()*-0.1));
		break;
		}
		setting2.setText(((GunDataList) datatype).getData((GunData)data).toString());
	}

	/**決定*/
	void set(){
		Pattern p = Pattern.compile("[^\\d\\.]");
		Matcher m = p.matcher(this.setting2.getText());
		//まずい場合のためにtry
		try{
			//型で場合分け
			switch (((GunDataList) datatype).getType()){
			case "int":
				((GunDataList) datatype).setData((GunData)data,new Integer(m.replaceAll("")));
			break;
			case "float":
				((GunDataList) datatype).setData((GunData)data,new Float(m.replaceAll("")));
			break;
			}
		}catch(NumberFormatException e2){}

		setting2.setText(((GunDataList) datatype).getData((GunData)data).toString());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		set();
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		//System.out.println(e.getWheelRotation());
		change(e.getWheelRotation());
		}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case 10:
			set();
		break;
		case 38:
			change(-1);
		break;
		case 40:
			change(1);
		break;
		}
		//System.out.println(e.getKeyCode());

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void keyTyped(KeyEvent e) {

	}
	;
}
