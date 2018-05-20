package hideEditer.dataEditer.base;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import hideEditer.dataEditer.ChangeListener;
import types.base.DataBase;
import types.base.DataType;
import types.base.EnumDataList;

public abstract class ValueSetPanel extends JPanel implements ComponentListener, KeyListener, FocusListener{
	private static final long serialVersionUID = -4980380877478474178L;

	public boolean canEdit;

	public DataBase data;

	public EnumDataList typeEnum;

	/** 通知先の保存 */
	ChangeListener target;

	/***/
	public ValueSetPanel(boolean canedit){
		this.canEdit = canedit;
		this.addKeyListener(this);
		this.addFocusListener(this);
		this.addComponentListener(this);
	}

	public ValueSetPanel(DataBase data,EnumDataList type ,boolean canedit){
		this(canedit);
		this.data = data;
		this.typeEnum = type;
		init();
		repaint();
	}

	/** 変更通知リスナーを追加 */
	public void addChangeListener(ChangeListener l) {
		target = l;
	}

	/**型取得*/
	DataType getDataType(){
		return typeEnum.getType();
	}
	/**データ取得*/
	int getValueInt(){
		return data.getDataInt(typeEnum);
	}
	/**データ取得*/
	float getValueFloat(){
		return data.getDataFloat(typeEnum);
	}
	/**データ取得*/
	boolean getValueBoolean(){
		return data.getDataBoolean(typeEnum);
	}
	/**データ取得*/
	String getValueString(){
		return data.getDataString(typeEnum);
	}
	/**データ取得*/
	String[] getValueStringArray(){
		return data.getDataStringArray(typeEnum);
	}
	/**データ格納*/
	void setValue(Object value){
		data.setData(typeEnum, value);
	}
	/**有効化設定*/
	public void setEnabled(boolean value){
		this.canEdit = value;
		setEnable(canEdit);
	}

	/**パネルの配置*/
	abstract public void init();
	/**数値などの更新*/
	abstract public void rePaint();
	/**有効化更新*/
	abstract public void setEnable(boolean canedit);
	/**数値保存*/
	abstract public void saveValue();
	/**リサイズ*/
	abstract public void risize();

	@Override
	public void repaint() {
		super.repaint();
		if (data != null){
			setEnable(canEdit);
			rePaint();
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
		repaint();
	}
	@Override
	public void componentResized(ComponentEvent e) {
		risize();
	}
}
