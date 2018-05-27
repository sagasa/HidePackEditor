package panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import editer.Window;
import types.base.ChangeListener;

/**パックインフォ書き換えパネル*/
public class PackInfoEditer extends JPanel implements ChangeListener{

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
		name = new StringSetPanel(ChangeListener.PACKINFO_NAME, "PackName","no loaded pack" , false);
		name.setTextBoxWidth(100);
		name.addChangeListener(this);
		name.setBounds(5,24,190,20);
		this.add(name);
		ver = new StringSetPanel(ChangeListener.PACKINFO_VER, "PackVer","no loaded pack" , false);
		ver.setTextBoxWidth(100);
		ver.addChangeListener(this);
		ver.setBounds(5,46,190,20);
		this.add(ver);
		root = new StringSetPanel(ChangeListener.PACKINFO_ROOTNAME, "RootName","no loaded pack" , false);
		root.setTextBoxWidth(100);
		root.addChangeListener(this);
		root.setBounds(5,68,190,20);
		this.add(root);
	}

	public void writeEditer(){
		if(Window.Pack!=null){
			name.setText(Window.Pack.PACK_NAME);
			name.setEnable(true);
			ver.setText(Window.Pack.PACK_VER);
			ver.setEnable(true);
			root.setText(Window.Pack.PACK_ROOTNAME);
			root.setEnable(true);
		}
	}

	@Override
	public void ValueChange(int cate, Object value) {

	}

}
