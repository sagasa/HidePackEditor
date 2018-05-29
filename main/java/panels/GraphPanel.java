package panels;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import types.GunData;
import types.GunData.GunDataList;
import types.base.GunRecoil;

/** GUIのグラフ描画用 */
public class GraphPanel extends JPanel {
	private static final long serialVersionUID = 9205198248352176324L;

	/** 表示スケール */
	int d = 60;

	final int radius = 100;
	private GunRecoil RecoilData;

	/** リコイルエディタ*/
	public GraphPanel(GunRecoil data,int diameter) {
		d = diameter;
		RecoilData = data;
		this.setBorder(new LineBorder(Color.black, 1, false));
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.white);
		//罫線描画
		writeRuledLine(g2);
		
		// グラフ描画 MIN
		g2.setPaint(Color.BLUE);
		float[] data = new float[6];
		data[0] = RecoilData.pitch_base_min;
		data[1] = RecoilData.pitch_spread_min;
		writeRecoilGraph(g2, data);
	
		g2.setPaint(Color.ORANGE);

	}

	// 罫線描画
	private void writeRuledLine(Graphics2D g2) {
		g2.fillRect(0, 0, radius * 2, radius * 2);
		// 罫線描画
		g2.setPaint(Color.gray);
		g2.setStroke(new BasicStroke(2.0f));
		g2.draw(new Line2D.Float(radius, 0.0f, radius, radius * 2));
		g2.draw(new Line2D.Float(0.0f, radius, radius * 2, radius));
		g2.setStroke(new BasicStroke(1.0f));
		// 10あたり何ピクセルか
		for (int i = d; i < 80; i += d) {
			g2.setPaint(Color.gray);
			g2.draw(new Line2D.Float(radius - i, radius - i, radius + i, radius - i));
			g2.draw(new Line2D.Float(radius - i, radius - i, radius - i, radius + i));
			g2.draw(new Line2D.Float(radius + i, radius - i, radius + i, radius + i));
			g2.draw(new Line2D.Float(radius - i, radius + i, radius + i, radius + i));
			// 数値記載
			g2.drawString("0", radius + 2, radius - 1);
			int draw = i / d * 10;
			g2.drawString(draw + "", radius + 2, 80 - i);
			g2.drawString(draw + "", radius + 2 + i, radius - 1);
			draw = i / d * -10;
			g2.drawString(draw + "", radius + 2, radius + i);
			g2.drawString(draw + "", radius + 2 - i, radius - 1);
		}
	}

	/** グラフ描画 配列の内容[xBase,xSpread,yBase,ySpread,xReturn,yRuturn]*/
	void writeRecoilGraph(Graphics2D g2, float[] data) {
		// 突き出た分の描画
		g2.setStroke(new BasicStroke(1.0f));
		g2.draw(new Line2D.Float(radius + data[0], radius - data[2] + data[3] + 15, radius + data[0],
				radius - data[2] - data[3] - 15));
		g2.draw(new Line2D.Float(radius + data[0] + data[1] + 15, radius - data[2], radius + data[0] - data[1] - 15,
				radius - data[2]));
		// センターの十字
		g2.setStroke(new BasicStroke(5.0f));
		g2.draw(new Line2D.Float(radius + data[0], radius - data[2] + data[3], radius + data[0],
				radius - data[2] - data[3]));
		g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2], radius + data[0] - data[1],
				radius - data[2]));
		// 四角描画
		g2.setStroke(new BasicStroke(1.5f));
		g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2] + data[3], radius + data[0] - data[1],
				radius - data[2] + data[3]));
		g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2] - data[3], radius + data[0] - data[1],
				radius - data[2] - data[3]));
		g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2] + data[3], radius + data[0] + data[1],
				radius - data[2] - data[3]));
		g2.draw(new Line2D.Float(radius + data[0] - data[1], radius - data[2] + data[3], radius + data[0] - data[1],
				radius - data[2] - data[3]));
	}
}
