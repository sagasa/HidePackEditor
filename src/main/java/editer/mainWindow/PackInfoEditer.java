package editer.mainWindow;

import editPanel.base.StringSetPanel;
import editer.Main;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


/**パックインフォ書き換えパネル*/
public class PackInfoEditer extends JPanel{

	/**パックインフォ書き換えパネル*/
	private static final long serialVersionUID = -1121568080966240011L;

	private static final LineBorder blackBorder = new LineBorder(Color.black, 1, false);

	StringSetPanel name;
	StringSetPanel ver;
	StringSetPanel root;

	public PackInfoEditer() {
		this.setBorder(blackBorder);
		this.setLayout(null);

		JLabel lore = new JLabel("PackInfo");
		lore.setBounds(10, 2, 100, 20);
		lore.setFont(new Font("BOLD", Font.BOLD, 13));
		this.add(lore);
		name = new StringSetPanel(Main.Pack,"PACK_NAME");
		name.setTextBoxWidth(100);
		name.setBounds(5,24,190,20);
		this.add(name);
		ver = new StringSetPanel(Main.Pack,"PACK_VER");
		ver.setTextBoxWidth(100);
		ver.setBounds(5,46,190,20);
		this.add(ver);
		root = new StringSetPanel(Main.Pack,"PACK_ROOTNAME");
		root.setTextBoxWidth(100);
		root.setBounds(5,68,190,20);
		this.add(root);

		write();
	}

	public void write(){
		if(Main.Pack!=null){
			name.setText(Main.Pack.PACK_NAME);
			name.setEnable(true);
			ver.setText(Main.Pack.PACK_VER);
			ver.setEnable(true);
			root.setText(Main.Pack.PACK_ROOTNAME);
			root.setEnable(true);
		}else{
			name.setText("no loaded pack");
			name.setEnable(false);
			ver.setText("no loaded pack");
			ver.setEnable(false);
			root.setText("no loaded pack");
			root.setEnable(false);
		}
	}
}
