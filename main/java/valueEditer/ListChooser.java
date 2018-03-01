package valueEditer;

import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import types.GunData;
import types.GunData.GunDataList;

public class ListChooser extends JPanel implements ComponentListener{
	private static final long serialVersionUID = 7470418576334013852L;
//TODO めっちゃやりかけ
	DefaultListModel<ListComponent> listModel;
	JScrollPane listSP;
	JComboBox<String> combo;
	JButton botton;

	//モード定数
	/**銃の使用マガジン選択*/
	static final int GUN_MAGAZINE_LIST = 1;

	//使用データ
	/**モード格納*/
	int mode;
	/**銃のデータ*/
	GunData gunData;

	//銃用インスタンス
	public ListChooser(int mode ,GunData data){
		this.gunData = data;
		this.setLayout(null);
		this.addComponentListener(this);
		//選択中リスト
		JList<ListComponent> model = new JList<ListComponent>();
		listModel = new DefaultListModel<ListComponent>();
		model.setCellRenderer(new ListComponent());
	    model.setModel(listModel);
	    model.setFixedCellHeight(20);
	    listSP = new JScrollPane();
	    listSP.getViewport().setView(model);
	    this.add(listSP);
	    //選択元のコンボボックス
	    combo = new JComboBox<String>();
	    this.add(combo);
	    //追加ボタン
	    botton = new JButton("add");
	    botton.setMargin(new Insets(0, 0, 0, 0));
	    this.add(botton);
	    write();
	}

	/**リストの内容更新*/
	void write(){
		//銃のデータから吸い出して適応
		System.out.println(GunDataList.TYPES_BULLETS.getData(gunData));
		listModel.clear();
		for(String str: (String[])GunDataList.TYPES_BULLETS.getData(gunData)){
			combo.addItem(str);
	    	listModel.addElement(new ListComponent(mode, gunData, str));
	    }
		//追加済みを削除
		//for
		
		
	    this.repaint();
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {}

	@Override
	public void componentResized(ComponentEvent arg0) {
	    listSP.setBounds(0, 0, this.getWidth(), this.getHeight()-22);
	    combo.setBounds(0, this.getHeight()-18, this.getWidth()-30, 18);
	    botton.setBounds(this.getWidth()-30, this.getHeight()-18, 30, 18);
	    this.revalidate();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {}
}
