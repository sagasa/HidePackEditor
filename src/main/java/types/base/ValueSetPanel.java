package types.base;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import editer.ValueInfo;

public abstract class ValueSetPanel extends JPanel implements ComponentListener, KeyListener, FocusListener {
	private static final long serialVersionUID = -4980380877478474178L;

	public boolean canEdit;

	/** 通知先の保存 */
	ChangeListener target;
	int cate;

	protected DataBase Data;
	protected EnumDataInfo Type;

	public ValueSetPanel() {
		this(true);
	}

	public ValueSetPanel(boolean canedit) {
		this.canEdit = canedit;
		this.addKeyListener(this);
		this.addFocusListener(this);
		this.addComponentListener(this);
		repaint();
	}

	public ValueSetPanel(DataBase data, EnumDataInfo type, boolean canedit) {
		this(canedit);
		Data = data;
		Type = type;
	}

	public ValueSetPanel(DataBase data, EnumDataInfo type) {
		this();
		Data = data;
		Type = type;
	}

	/** 変更通知リスナーを設定 */
	public void addChangeListener(ChangeListener l, int cate) {
		this.cate = cate;
		target = l;
	}

	/** 有効化設定 */
	public void setEnabled(boolean value) {
		this.canEdit = value;
		setEnable(canEdit);
	}

	/** 数値などの更新 */
	abstract public void rePaint();

	/** 有効化更新 */
	abstract public void setEnable(boolean canedit);

	/** 数値保存 */
	abstract public void saveValue();

	/** リサイズ */
	abstract public void risize();

	@Override
	public void repaint() {
		super.repaint();
		setEnable(canEdit);
		if (Data != null) {
			rePaint();
		}
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}

	@Override
	public void focusGained(FocusEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			this.getParent().requestFocusInWindow();
		}
	}

	public void save(Object value) {
		if (target != null) {
			target.ValueChange(cate, value);
		}
		if (Data != null) {
			ValueInfo.setData(Data, Type, value);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		saveValue();
		if (Data != null) {
			repaint();
		}
	}

	@Override
	public void componentResized(ComponentEvent e) {
		risize();
	}
}
