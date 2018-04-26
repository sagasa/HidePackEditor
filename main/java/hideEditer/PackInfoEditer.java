package hideEditer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import types.ContentsPack;
import types.ContentsPack.PackDataList;
import types.GunData.GunDataList;

/**右上のパック情報編集用 インスタンスは1つまで*/
public class PackInfoEditer extends JPanel implements ActionListener, FocusListener {
	private static final long serialVersionUID = 1845308493302986037L;

	static PackInfoEditer Editer;

	public PackInfoEditer(){
		Editer = this;
		MainWindow.MainWindow.add(this);
		this.setLayout(null);
		reSize();
		write();
	}


	JTextField NameText;
	JTextField VersionText;
	/**描画*/
	public static void write(){
		Editer.removeAll();
		if (MainWindow.Pack!=null){
			Editer.EditPanel();
		}else{
			Editer.StartPanel();
		}

	}

	/**初期画面*/
	void StartPanel(){
		//ラベル
		JLabel shortName = new JLabel("NoPack");
		shortName.setBounds(0, 0, 200,80);
		shortName.setFont(new Font("BOLD", Font.BOLD, 13));
		shortName.setHorizontalAlignment(JLabel.CENTER);
		shortName.setVerticalAlignment(JLabel.CENTER);
		//shortName.setBorder(border);
		this.add(shortName);
	}

	/**編集画面*/
	void EditPanel(){
		LineBorder border = new LineBorder(Color.black, 1, false);

		Editer.setBorder(border);

		//ラベル
		JLabel shortName = new JLabel("PackName :");
		shortName.setBounds(5, 4, 70, 24);
		shortName.setFont(new Font("BOLD", Font.BOLD, 11));
	//	shortName.setBorder(border);
		this.add(shortName);

		//テキストボックス
		NameText = new JTextField(MainWindow.Pack.getDataString(PackDataList.PACK_NAME));
		NameText.setBounds(70, 5, 95, 24);
		NameText.addFocusListener(this);
		NameText.setBorder(border);
		this.add(NameText);

		//決定ボタン
		JButton shortName3 = new JButton("set");
		shortName3.setBounds(165, 5, 25, 24);
		shortName3.setBorder(border);
		shortName3.addActionListener(this);
		shortName3.setActionCommand("setName");
		this.add(shortName3);

		//ラベル
		JLabel displayName = new JLabel("Version :");
		displayName.setBounds(5, 35, 70, 24);
		displayName.setFont(new Font("BOLD", Font.BOLD, 11));
	//	shortName.setBorder(border);
		this.add(displayName);

		//テキストボックス
		VersionText = new JTextField(MainWindow.Pack.getDataString(PackDataList.PACK_VERSION));
		VersionText.setBounds(70, 35, 95, 24);
		VersionText.setBorder(border);
		VersionText.addFocusListener(this);
		this.add(VersionText);

		//決定ボタン
		JButton displayName3 = new JButton("set");
		displayName3.setBounds(165, 35, 25, 24);
		displayName3.setBorder(border);
		displayName3.addActionListener(this);
		displayName3.setActionCommand("setVersion");
		this.add(displayName3);
	}
	public static void reSize(){
		Editer.setBounds(0, 0, 200, 80);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("setName")){
			ContentsPack.PackDataList.PACK_NAME.setData(MainWindow.Pack,NameText.getText());
		}
		if (e.getActionCommand().equals("setVersion")){
			ContentsPack.PackDataList.PACK_VERSION.setData(MainWindow.Pack,VersionText.getText());
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("this "+e.toString());

	}

	@Override
	public void focusLost(FocusEvent arg0) {

	}
}
