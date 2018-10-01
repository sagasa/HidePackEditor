package editPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import types.effect.Recoil;


/** GUIのグラフ描画用 */
public class RecoilGraphPanel extends JPanel {
	private static final long serialVersionUID = 9205198248352176324L;

	/** 表示スケール */
	private int d = 15;

	private int radius = 150;
	private Recoil RecoilData;

	/** リコイルエディタ */
	public RecoilGraphPanel(int radius) {
		this.radius = radius;
		this.setBorder(new LineBorder(Color.black, 1, false));
	}

	public void setRecoilData(Recoil data) {
		RecoilData = data;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.white);
		// 縮尺調整
		d = getScale();
		// 罫線描画
		writeRuledLine(g2);
		// データが入っていないなら
		if (RecoilData == null || !RecoilData.USE) {
			return;
		}
		// グラフ描画 MIN
		g2.setPaint(Color.BLUE);
		float[] data = new float[6];
		data[0] = RecoilData.MIN_YAW_BASE;
		data[1] = RecoilData.MIN_YAW_SPREAD;
		data[2] = RecoilData.MIN_PITCH_BASE;
		data[3] = RecoilData.MIN_PITCH_SPREAD;
		data[4] = RecoilData.MIN_YAW_RETURN;
		data[5] = RecoilData.MIN_PITCH_RETURN;
		writeRecoilGraph(g2, data);

		g2.setPaint(Color.ORANGE);
		data[0] = RecoilData.MAX_YAW_BASE;
		data[1] = RecoilData.MAX_YAW_SPREAD;
		data[2] = RecoilData.MAX_PITCH_BASE;
		data[3] = RecoilData.MAX_PITCH_SPREAD;
		data[4] = RecoilData.MAX_YAW_RETURN;
		data[5] = RecoilData.MAX_PITCH_RETURN;
		writeRecoilGraph(g2, data);
	}

	/** 縮尺調整 */
	private int getScale() {
		// デフォルトを返す
		if (RecoilData == null) {
			return 10;
		}
		float maxValue = 0;
		maxValue = Math.max(maxValue, Math.abs(RecoilData.MIN_PITCH_BASE) + RecoilData.MIN_PITCH_SPREAD);
		maxValue = Math.max(maxValue, Math.abs(RecoilData.MAX_PITCH_BASE) + RecoilData.MAX_PITCH_SPREAD);
		maxValue = Math.max(maxValue, Math.abs(RecoilData.MIN_YAW_BASE) + RecoilData.MIN_YAW_SPREAD);
		maxValue = Math.max(maxValue, Math.abs(RecoilData.MAX_YAW_BASE) + RecoilData.MAX_YAW_SPREAD);
		int scale = (int) (radius / (maxValue));
		return scale > 15 ? 15 : scale;
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
		for (int i = 0; i < radius; i += d * 5) {
			g2.setPaint(Color.gray);
			g2.draw(new Line2D.Float(radius - i, radius - i, radius + i, radius - i));
			g2.draw(new Line2D.Float(radius - i, radius - i, radius - i, radius + i));
			g2.draw(new Line2D.Float(radius + i, radius - i, radius + i, radius + i));
			g2.draw(new Line2D.Float(radius - i, radius + i, radius + i, radius + i));
			// 数値記載
			g2.drawString("0", radius + 2, radius - 1);
			int draw = i / d;
			g2.drawString(draw + "", radius + 2, radius - i);
			g2.drawString(draw + "", radius + 2 + i, radius - 1);
			draw = i / d * -1;
			g2.drawString(draw + "", radius + 2, radius + i);
			g2.drawString(draw + "", radius + 2 - i, radius - 1);
		}
	}

	/** グラフ描画 配列の内容[xBase,xSpread,yBase,ySpread,xReturn,yRuturn] */
	void writeRecoilGraph(Graphics2D g2, float[] data) {
		for (int i = 0; i < 4; i++) {
			data[i] = data[i] * d;
		}
		data[4] = data[4];
		data[5] = data[5];
		// 突き出た分の描画
		g2.setStroke(new BasicStroke(1.0f));
		g2.draw(new Line2D.Float(radius + data[0], radius - data[2] + data[3] + 15, radius + data[0],
				radius - data[2] - data[3] - 15));
		g2.draw(new Line2D.Float(radius + data[0] + data[1] + 15, radius - data[2], radius + data[0] - data[1] - 15,
				radius - data[2]));
		// センターの十字
		g2.setStroke(new BasicStroke(3.0f));
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
		// 戻った後の拡散範囲
		g2.draw(new Line2D.Float(radius + (data[0] + data[1]) * (1-data[4]), radius - (data[2] + data[3]) * (1-data[5]),
				radius + (data[0] - data[1]) * (1-data[4]), radius - (data[2] + data[3]) * (1-data[5])));
		g2.draw(new Line2D.Float(radius + (data[0] + data[1]) * (1-data[4]), radius - (data[2] - data[3]) * (1-data[5]),
				radius + (data[0] - data[1]) * (1-data[4]), radius - (data[2] - data[3]) * (1-data[5])));
		g2.draw(new Line2D.Float(radius + (data[0] + data[1]) * (1-data[4]), radius - (data[2] + data[3]) * (1-data[5]),
				radius + (data[0] + data[1]) * (1-data[4]), radius - (data[2] - data[3]) * (1-data[5])));
		g2.draw(new Line2D.Float(radius + (data[0] - data[1]) * (1-data[4]), radius - (data[2] + data[3]) * (1-data[5]),
				radius + (data[0] - data[1]) * (1-data[4]), radius - (data[2] - data[3]) * (1-data[5])));
	}
}