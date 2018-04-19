package valueEditer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

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
			for(String str: gunData.getDataStringArray(GunDataList.TYPES_BULLETS)){
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
			for(String str: gunData.getDataStringArray(GunDataList.TYPES_ATTACHMENTS)){
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
			GunDataList.TYPES_BULLETS.setData(gunData, helper.ArrayEditer.RemoveFromArray(gunData.getDataStringArray(GunDataList.TYPES_BULLETS), listModel.getElementAt(index).name));
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
			GunDataList.TYPES_BULLETS.setData(gunData, helper.ArrayEditer.AddToArray(gunData.getDataStringArray(GunDataList.TYPES_BULLETS), combo.getSelectedItem().toString()));
			write();
		}

	}


	/** ListChooser用削除パネル付きのパネル isInBottonでデリーとパネルの中か取得*/
	class ListComponent extends JPanel implements ListCellRenderer<ListComponent> {
		private static final long serialVersionUID = 3283536785946717774L;

		// データ格納
		String name;
		int mode;

		JLabel label;

		/**
		 * 銃用インスタンス モード 編集するデータ 名称
		 */
		public ListComponent(String str) {
			this.name = str;
			this.setLayout(null);
			this.setOpaque(false);

			//NamePanel
			JLabel name = new JLabel(str);
			name.setBounds(5, 1, 65, 18);
			this.add(name);
			//削除！のパネル
			LineBorder border = new LineBorder(Color.black, 1, false);
			label = new JLabel("delete");
			label.setBounds(70, 1, 35, 18);
			label.setBackground(Color.RED);
			label.setForeground(Color.white);
			label.setFont(new Font("BOLD", Font.BOLD, 10));
			label.setBorder(border);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setOpaque(true);
			this.add(label);
		}

		/**レンダー登録用*/
		public ListComponent() {
		}

		/**削除ボタンの上か判別*/
		public boolean isInBotton(Point point){
			System.out.println(point+" "+label.getBounds()+" "+ label.getBounds().contains(point));
			return label.getBounds().contains(point);
		}


		//レンダーメゾット
		@Override
		public Component getListCellRendererComponent(JList<? extends ListComponent> list, ListComponent value, int index,
				boolean isSelected, boolean cellHasFocus) {
			return value;
		}
	}

}
