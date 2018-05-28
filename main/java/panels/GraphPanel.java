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

/**GUIのグラフ描画用*/
public class GraphPanel extends JPanel{
	private static final long serialVersionUID = 9205198248352176324L;

	GunData gundata;
	int cate;

	/**表示スケール*/
	int d = 60;

	final int radius = 100;

	/**銃用*/
	public GraphPanel(GunData data,int cate) {
		this(data);
		this.cate = cate;
	}
	/**銃用*/
	public GraphPanel(GunData data) {
		this.gundata = data;
		this.setBorder(new LineBorder(Color.black, 1, false));
	}


	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.white);
		 g2.fillRect(0, 0, radius*2, radius*2);
		// 罫線描画
		g2.setPaint(Color.gray);
		g2.setStroke(new BasicStroke(2.0f));
		g2.draw(new Line2D.Float(radius, 0.0f, radius, radius*2));
		g2.draw(new Line2D.Float(0.0f, radius, radius*2, radius));
		g2.setStroke(new BasicStroke(1.0f));
		// 10あたり何ピクセルか
		for (int i = d; i < 80; i += d) {
			g2.setPaint(Color.gray);
			g2.draw(new Line2D.Float(radius - i, radius - i, radius + i, radius - i));
			g2.draw(new Line2D.Float(radius - i, radius - i, radius - i, radius + i));
			g2.draw(new Line2D.Float(radius + i, radius - i, radius + i, radius + i));
			g2.draw(new Line2D.Float(radius - i, radius + i, radius + i, radius + i));
			// 数値記載
			g2.drawString("0", radius+2, radius-1);
			int draw = i / d * 10;
			g2.drawString(draw + "", radius+2, 80 - i);
			g2.drawString(draw + "", radius+2 + i, radius-1);
			draw = i / d * -10;
			g2.drawString(draw + "", radius+2, radius + i);
			g2.drawString(draw + "", radius+2 - i, radius-1);
		}
		//使用されているかを取得



		//編集可能なら
		if(doWrite){
			//グラフ描画 MIN
			int p = 0;
			float[] data = new float[4];
			for (GunDataList settingData : GunDataList.values()) {
				// カテゴリ分け -1以外なら
				if (settingData.getCate() == cate) {
					data[p] = gundata.getDataFloat(settingData) * (d / 10);
					//System.out.println("描画" + settingData.getName());
					p++;
				}
			}
			g2.setPaint(Color.BLUE);
			writeRecoilGraph(g2,data);
			//グラフ描画 MAX
			p = 0;
			data = new float[4];
			for (GunDataList settingData : GunDataList.values()) {
				// カテゴリ分け -1以外なら
				if (settingData.getCate() == cate+4) {
					data[p] = gundata.getDataFloat(settingData) * (d / 10);
					//System.out.println("描画" + settingData.getName());
					p++;
				}
			}
			g2.setPaint(Color.ORANGE);
			writeRecoilGraph(g2,data);
		}

	}
	//グラフ描画
	void writeRecoilGraph(Graphics2D g2, float[] data){
		//突き出た分の描画
				g2.setStroke(new BasicStroke(1.0f));
				g2.draw(new Line2D.Float(radius + data[0], radius - data[2] + data[3] + 15, radius + data[0],
						radius - data[2] - data[3] - 15));
				g2.draw(new Line2D.Float(radius + data[0] + data[1]+ 15, radius - data[2], radius + data[0] - data[1]- 15,
						radius - data[2]));
				//センターの十字
				g2.setStroke(new BasicStroke(5.0f));
				g2.draw(new Line2D.Float(radius + data[0], radius - data[2] + data[3], radius + data[0],
						radius - data[2] - data[3]));
				g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2], radius + data[0] - data[1],
						radius - data[2]));
				//四角描画
				g2.setStroke(new BasicStroke(1.5f));
				g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2] + data[3], radius + data[0] - data[1], radius - data[2] + data[3]));
				g2.draw(new Line2D.Float(radius + data[0] + data[1], radius - data[2] - data[3],radius + data[0] - data[1] , radius - data[2] - data[3]));
				g2.draw(new Line2D.Float(radius + data[0] + data[1],radius - data[2] + data[3] ,radius + data[0] + data[1] , radius - data[2] - data[3]));
				g2.draw(new Line2D.Float(radius + data[0] - data[1],radius - data[2] + data[3] ,radius + data[0] - data[1] , radius - data[2] - data[3]));
	}
}
