package valueEditer;

import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import hideEditer.MainWindow;
import types.BulletData;
import types.GunData;
import types.BulletData.BulletDataList;
import types.GunData.GunDataList;

public class ListChooser extends JPanel implements ComponentListener, MouseListener, ActionListener{
	private static final long serialVersionUID = 7470418576334013852L;
	DefaultListModel<ListComponent> listModel;
	JList<ListComponent> model;
	JScrollPane listSP;
	JComboBox<String> combo;
	JButton botton;

	//モード定数
	/**銃の使用マガジン選択*/
	static final int GUN_MAGAZINE_LIST = 1;
	/**銃の使用マガジン選択*/
	static final int GUN_ATTACHHMENT_LIST = 2;

	//使用データ
	/**モード格納*/
	int mode;
	/**銃のデータ*/
	GunData gunData;

	//銃用インスタンス
	public ListChooser(int mode ,GunData data){
		this.gunData = data;
		this.mode = mode;
		this.setLayout(null);
		this.addComponentListener(this);
		//選択中リスト
		model = new JList<ListComponent>();
		listModel = new DefaultListModel<ListComponent>();
		model.addMouseListener(this);
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
	    botton.addActionListener(this);
	    botton.setMargin(new Insets(0, 0, 0, 0));
	    this.add(botton);
	    write();
	}

	/**リストの内容更新*/
	void write(){
		switch(mode){
		case GUN_MAGAZINE_LIST:
			//銃のデータから吸い出して適応
			combo.removeAllItems();
			//System.out.println(GunDataList.TYPES_BULLETS.getData(gunData));
			for(BulletData data:MainWindow.bulletMap.values()){
				combo.addItem((String) BulletDataList.DISPLAY_NAME.getData(data));
			}
			listModel.clear();
			for(String str: (String[])GunDataList.TYPES_BULLETS.getData(gunData)){
				combo.removeItem(str);
				System.out.println(str);
		    	listModel.addElement(new ListComponent(str));
		    }
			break;
		case GUN_ATTACHHMENT_LIST:
			//銃のデータから吸い出して適応
			combo.removeAllItems();
			//System.out.println(GunDataList.TYPES_ATTACHMENTS.getData(gunData));
			for(BulletData data:MainWindow.bulletMap.values()){
				combo.addItem((String) BulletDataList.DISPLAY_NAME.getData(data));
			}
			listModel.clear();
			//TODO アタッチメント追加したら追記
			for(String str: (String[])GunDataList.TYPES_ATTACHMENTS.getData(gunData)){
				combo.removeItem(str);
				System.out.println(str);
		    	listModel.addElement(new ListComponent(str));
		    }
			break;
		}

	    this.repaint();
	}

	/**削除*/
	void delete(int index) {
		switch (mode) {
		case GUN_MAGAZINE_LIST:
			GunDataList.TYPES_BULLETS.setData(gunData, helper.ArrayEditor.RemoveFromArray((String[]) GunDataList.TYPES_BULLETS.getData(gunData), listModel.getElementAt(index).name));
			break;
		}
		write();
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

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent e) {
		//要素があれば
		if(!listModel.isEmpty()){
			//削除ボタンの位置検出
			int index = model.locationToIndex(e.getPoint());
			//オフセットを除去して送る
			if(listModel.getElementAt(model.locationToIndex(e.getPoint())).isInBotton(new Point(e.getX()-model.indexToLocation(index).x,e.getY()-model.indexToLocation(index).y))){
				delete(model.locationToIndex(e.getPoint()));
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ついか
		if(combo.getSelectedIndex()!=-1){
			GunDataList.TYPES_BULLETS.setData(gunData, helper.ArrayEditor.AddToArray((String[]) GunDataList.TYPES_BULLETS.getData(gunData), combo.getSelectedItem().toString()));
			write();
		}

	}
}
