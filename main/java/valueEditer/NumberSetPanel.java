package valueEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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

/**設定ボックス IntとFloatのみ対応*/
public class NumberSetPanel extends JPanel implements MouseWheelListener, KeyListener, FocusListener, ComponentListener{
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
	public NumberSetPanel(GunDataList d,GunData gun){
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = true;
		this.addComponentListener(this);
		this.setOpaque(false);
	}
	/**コンストラクタ 編集 可/不可*/
	public NumberSetPanel(GunDataList d,GunData gun, boolean canedit){
		datatype = d;
		data = gun;
		type = "gun";
		canEdit = canedit;
		init();
	}

	//描画
	void init(){
		LineBorder border = new LineBorder(Color.black, 1, false);
		//this.setBorder(border);
		this.setLayout(null);
		//ラベル
		JLabel setting = new JLabel(((GunDataList) datatype).getName()+" :");
		setting.setBounds(0, 0, this.getWidth()-33, this.getHeight());
		setting.setHorizontalAlignment(JLabel.RIGHT);
		setting.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(setting);

		//テキストボックス
		//条件分岐
		if(canEdit){
			setting2 = new JTextField(((GunDataList) datatype).getData((GunData)data).toString());
			setting2.setBounds(this.getWidth()-30, 0, 30 , this.getHeight());
			setting2.addMouseWheelListener(this);
			setting2.addKeyListener(this);
			setting2.addFocusListener(this);
			setting2.setBorder(border);
			this.add(setting2);
		}else{
			JLabel setting2 = new JLabel(((GunDataList) datatype).getData((GunData)data).toString());
			setting2.setBounds(this.getWidth()-30, 0, 30 , this.getHeight());
			setting2.setHorizontalAlignment(JLabel.CENTER);
			setting2.setFont(new Font("BOLD", Font.BOLD, 13));
			this.add(setting2);
		}
	}
	
	/**1増やすor1減らす 引数 1,-1*/
	void change(int i){
		switch (((GunDataList) datatype).getType()){
		case "int":
			int num = new Integer (((GunDataList) datatype).getData((GunData)data).toString());
			if (((GunDataList) datatype).getMin()!=null){
				if(num+i>=((GunDataList) datatype).getMin()){
					((GunDataList) datatype).setData((GunData)data,num+(i));
				}
			}else{
				((GunDataList) datatype).setData((GunData)data,num+(i));
			}
			
			break;
		case "float":
			String num2 = ((GunDataList) datatype).getData((GunData)data).toString();
			
			float value = new BigDecimal(num2).add(new BigDecimal("0.1").multiply(new BigDecimal(i))).floatValue();
			Float min = ((GunDataList) datatype).getMin();
			if (min == null || value >= min){
				((GunDataList) datatype).setData((GunData)data,value);
			}
			
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
	public void mouseWheelMoved(MouseWheelEvent e) {
		//System.out.println(e.getWheelRotation());
		change(e.getWheelRotation());
		}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case 10:
			set();
			this.getParent().requestFocusInWindow();
		break;
		case 38:
			change(1);
		break;
		case 40:
			change(-1);
		break;
		}
		//System.out.println(e.getKeyCode());

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void focusGained(FocusEvent e) {
	}
	@Override
	public void focusLost(FocusEvent e) {
		//これをフラグに書き換える
		set();
	}
	
	@Override
	public void componentResized(ComponentEvent arg0) {
		init();
	}
	
	@Override
	public void componentHidden(ComponentEvent arg0) {}
	@Override
	public void componentMoved(ComponentEvent arg0) {}
	@Override
	public void componentShown(ComponentEvent arg0) {}
}
