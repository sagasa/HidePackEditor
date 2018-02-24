package valueEditer;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListChooser extends JPanel implements ComponentListener{
	private static final long serialVersionUID = 7470418576334013852L;
//TODO めっちゃやりかけ
	DefaultListModel<String> listModel;
	JScrollPane listSP;
	
	public ListChooser(String[] list){
		this.setLayout(null);
		this.addComponentListener(this);
		//元リスト
		JList<String> model = new JList<String>();
		listModel = new DefaultListModel<String>();
	    model.setModel(listModel);
	    listSP = new JScrollPane();
	    listSP.getViewport().setView(model);
	    listModel.addElement("testObj");
	    for(String str: list){
	    	listModel.addElement(str);
	    }
	    this.repaint();
	    this.add(listSP);
	    
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {}

	@Override
	public void componentMoved(ComponentEvent arg0) {}

	@Override
	public void componentResized(ComponentEvent arg0) {
	    listSP.setBounds(0, 0, this.getWidth(), this.getHeight());
	    this.revalidate();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {}
}
