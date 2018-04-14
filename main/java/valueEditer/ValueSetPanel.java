package valueEditer;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import types.BulletData;
import types.BulletData.BulletDataList;
import types.GunData;
import types.GunData.GunDataList;

public abstract class ValueSetPanel extends JPanel implements ComponentListener, KeyListener, FocusListener{
	private static final long serialVersionUID = -4980380877478474178L;
	
	private boolean canEdit;
	
	private GunData gundata;
	private BulletData bulletdata;
	
	private GunDataList gunTypeList;
	private BulletDataList bulletTypeList;
	
	//
	private ValueSetPanel(boolean canedit){
		canEdit = canedit;
		this.addComponentListener(this);
	}
	
	protected ValueSetPanel(GunData data,GunDataList type ,boolean canedit){
		this(canedit);
		gundata = data;
		gunTypeList = type;
	}
	
	/**パネルの配置*/
	abstract public void init();
	/**有効化 数値などの更新*/
	abstract public void paintEnable();
	/**無効化 数値などの更新*/
	abstract public void paintDisable();
	/**数値保存*/
	abstract public void saveValue();
	/**リサイズ*/
	abstract public void risize();

	@Override
	public void repaint() {
		super.repaint();
		if (canEdit == true){
			paintEnable();
		}else{
			paintDisable();
		}
	}
	@Override
	public void componentHidden(ComponentEvent e) {}
	@Override
	public void componentMoved(ComponentEvent e) {}
	@Override
	public void componentShown(ComponentEvent e) {}
	@Override
	public void focusGained(FocusEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10){
			this.getParent().requestFocusInWindow();
		}
	}
	@Override
	public void focusLost(FocusEvent e) {
		saveValue();
	}
	@Override
	public void componentResized(ComponentEvent e) {
		risize();
	}
}
