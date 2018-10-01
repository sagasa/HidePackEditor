package editPanel.base;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

import helper.EditHelper;
import types.base.DataBase;

public abstract class ValueSetPanel extends JPanel implements ComponentListener, KeyListener, FocusListener {
	private static final long serialVersionUID = -4980380877478474178L;

	public boolean canEdit;

	/** 通知先の保存 */
	HideListener target;
	int cate;

	protected DataBase Data;
	protected String Type;

	public ValueSetPanel(DataBase data, String field, boolean canedit) {
		Data = data;
		Type = field;
		canEdit = canedit;
		this.addKeyListener(this);
		this.addFocusListener(this);
		this.addComponentListener(this);
		repaint();
	}

	public ValueSetPanel(DataBase data, String field) {
		this(data, field, true);
	}

	/** 変更通知リスナーを設定 */
	public void addChangeListener(HideListener l, int cate) {
		this.cate = cate;
		target = l;
	}

	/** 有効化設定 */
	public ValueSetPanel setEnable(boolean value) {
		this.canEdit = value;
		rePaint();
		return this;
	}

	/** データ保存 nullはNG */
	public void save(Object value) {
		if (target != null) {
			target.ValueChange(cate, value);
		}
		if (Data != null) {
			EditHelper.setData(Data, Type, value);
		}
	}

	/** 数値などの更新 */
	abstract public void rePaint();

	/** 数値保存リクエスト */
	abstract public void saveValue();

	/** リサイズ */
	abstract public void risize();

	@Override
	public void repaint() {
		super.repaint();
		rePaint();
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

	@Override
	public void focusLost(FocusEvent e) {
		saveValue();
	}

	@Override
	public void componentResized(ComponentEvent e) {
		risize();
	}
}
