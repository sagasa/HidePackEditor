package panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import editer.ItemEditer;
import editer.Window;
import types.BulletData;
import types.BulletData.BulletDataList;
import types.ItemInfo.ItemDataList;
import types.ItemInfo;
import types.base.EnumDataList;
import types.guns.GunData;
import types.guns.GunData.GunDataList;

public class ListChooser extends JPanel implements ComponentListener, MouseListener, ActionListener{
	private static final long serialVersionUID = 7470418576334013852L;
	DefaultListModel<ListComponent> listModel;
	JList<ListComponent> model;
	JScrollPane listSP;
	JComboBox<String> combo;
	JButton botton;

	//モード定数
	/**銃の使用マガジン選択*/
	public static final int GUN_MAGAZINE_LIST = 1;
	/**銃の使用マガジン選択*/
	public static final int GUN_ATTACHHMENT_LIST = 2;
	/**銃の使用マガジン選択*/
	public static final int GUN_FireMode = 3;

	//使用データ
	/**モード格納*/
	int mode;
	/**銃のデータ*/
	GunData Data;

	//銃用インスタンス
	public ListChooser(int mode ,GunData data){
		this.Data = data;
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
	    listSP.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
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
			for(BulletData data:Window.BulletList.values()){
				combo.addItem(data.getItemInfo().getShortName());
			}
			listModel.clear();
			for(String str: (String[])Data.getDataObject(GunDataList.BULLET_USE)){
				combo.removeItem(str);
		    	listModel.addElement(new ListComponent(str));
		    }
			break;
		case GUN_FireMode:
			combo.removeAllItems();

			for(String name:ItemEditer.allFireMode){
				combo.addItem(name);
			}
			listModel.clear();
			for(String str: (String[])Data.getDataObject(GunDataList.FIREMODE)){
				combo.removeItem(str);
		    	listModel.addElement(new ListComponent(str));
		    }
			break;
		}

	    this.repaint();
	}

	/**削除*/
	void delete(int index) {
		Data.setData(getDataType(), helper.ArrayEditer.RemoveFromArray((String[]) Data.getDataObject(getDataType()), listModel.getElementAt(index).name));
		write();
	}

	/**EnumDataList取得*/
	private EnumDataList getDataType(){
		switch (mode) {
		case GUN_MAGAZINE_LIST:
			return GunDataList.BULLET_USE;
		case GUN_FireMode:
			return GunDataList.FIREMODE;
		}
		return null;
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
			//ボタンの位置検出
			int index = model.locationToIndex(e.getPoint());
			//オフセットを除去して送る
			ListComponent comp = listModel.getElementAt(model.locationToIndex(e.getPoint()));
			Point offsetPoint = new Point(e.getX()-model.indexToLocation(index).x,e.getY()-model.indexToLocation(index).y);
			if(comp.isInDeleteBotton(offsetPoint)){
				delete(model.locationToIndex(e.getPoint()));
			}else if(comp.isInUpBotton(offsetPoint)){
				//上のインデックスと置き換え
				Data.setData(getDataType() ,helper.ArrayEditer.ChangeArrayIndex((String[])Data.getDataObject(getDataType()), index,index-1));
				write();
			}else if(comp.isInDownBotton(offsetPoint)){
				//上のインデックスと置き換え
				Data.setData(getDataType() ,helper.ArrayEditer.ChangeArrayIndex((String[])Data.getDataObject(getDataType()), index,index+1));
				write();
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ついか
		if(combo.getSelectedIndex()!=-1){
			Data.setData(getDataType() ,helper.ArrayEditer.AddToArray((String[])Data.getDataObject(getDataType()), combo.getSelectedItem().toString()));
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

		JLabel upLabel;
		JLabel downLabel;

		/**
		 * 銃用インスタンス モード 編集するデータ 名称
		 */
		public ListComponent(String str) {
			this.name = str;
			this.setLayout(null);
			this.setOpaque(false);

			//NamePanel
			JLabel name = new JLabel(str);
			name.setBounds(5, 1, 200, 18);
			this.add(name);
			//削除！のパネル
			label = new JLabel();
			label.setBounds(152, 1, 18, 18);
			label.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/delete.png")));
			label.setOpaque(false);
			this.add(label);

			upLabel = new JLabel();
			upLabel.setBounds(130, 0, 18, 8);
			upLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/up.png")));
			upLabel.setOpaque(false);
			upLabel.setVisible(false);
			this.add(upLabel);

			downLabel = new JLabel();
			downLabel.setBounds(130, 12, 18, 8);
			downLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/down.png")));
			downLabel.setOpaque(false);
			downLabel.setVisible(false);
			this.add(downLabel);
		}

		/**レンダー登録用*/
		public ListComponent() {
		}

		/**削除ボタンの上か判別*/
		public boolean isInDeleteBotton(Point point){
			return label.getBounds().contains(point)&&label.isVisible();
		}
		/**↑ボタンの上か判別*/
		public boolean isInUpBotton(Point point){
			return upLabel.getBounds().contains(point)&&upLabel.isVisible();
		}
		/**↓ボタンの上か判別*/
		public boolean isInDownBotton(Point point){
			return downLabel.getBounds().contains(point)&&downLabel.isVisible();
		}

		final LineBorder border = new LineBorder(Color.black, 1, false);

		//レンダーメゾット
		@Override
		public Component getListCellRendererComponent(JList<? extends ListComponent> list, ListComponent value, int index,
				boolean isSelected, boolean cellHasFocus) {

			value.upLabel.setVisible(!(index==0)&&isSelected);
			value.downLabel.setVisible(!(index == list.getModel().getSize()-1)&&isSelected);
			value.label.setVisible(list.getModel().getSize()>1);
			value.setBorder(null);
			if(isSelected){
				value.setBorder(border);
			}
			return value;
		}
	}

}
