package valueEditer;

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

	/**リコイル罫線*/
	static public final int RECOIL_RULE = 1;
	/**リコイルグラフ*/
	static public final int RECOIL_GRAPH = 2;

	/**モード*/
	int mode;
	GunData gundata;
	int cate;

	/**表示スケール*/
	int d = 30;

	/**銃用*/
	public GraphPanel(int type,GunData data,int cate) {
		this(type, data);
		this.cate = cate;
	}
	/**銃用*/
	public GraphPanel(int type,GunData data) {
		this.mode = type;
		this.gundata = data;
		this.setBorder(new LineBorder(Color.black, 1, false));
		if(mode ==RECOIL_GRAPH){

		}
		this.setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.white);


		// g2.fillRect(0, 0, 160, 160);
		// 罫線描画
		g2.setPaint(Color.gray);
		g2.setStroke(new BasicStroke(2.0f));
		g2.draw(new Line2D.Double(80.0d, 0.0d, 80.0d, 160.0d));
		g2.draw(new Line2D.Double(0.0d, 80.0d, 180.0d, 80.0d));
		g2.setStroke(new BasicStroke(1.0f));
		// 10あたり何ピクセルか
		for (int i = d; i < 80; i += d) {
			g2.setPaint(Color.gray);
			g2.draw(new Line2D.Double(80 - i, 80 - i, 80 + i, 80 - i));
			g2.draw(new Line2D.Double(80 - i, 80 - i, 80 - i, 80 + i));
			g2.draw(new Line2D.Double(80 + i, 80 - i, 80 + i, 80 + i));
			g2.draw(new Line2D.Double(80 - i, 80 + i, 80 + i, 80 + i));
			// 数値記載
			g2.drawString("0", 82, 79);
			int draw = i / d * 10;
			g2.drawString(draw + "", 82, 80 - i);
			g2.drawString(draw + "", 82 + i, 79);
			draw = i / d * -10;
			g2.drawString(draw + "", 82, 80 + i);
			g2.drawString(draw + "", 82 - i, 79);
		}

		//グラフ描画 MIN
		int p = 0;
		int[] data = new int[4];
		for (GunDataList settingData : GunDataList.values()) {
			// カテゴリ分け -1以外なら
			if (settingData.getCate() == cate) {
				data[p] = (int) (new Float(settingData.getData(gundata).toString()) * (d / 10));
				//System.out.println("描画" + settingData.getName());
				p++;
			}
		}
		g2.setPaint(Color.BLUE);
		writeRecoilGraph(g2,data);
		//グラフ描画 MAX
		p = 0;
		data = new int[4];
		for (GunDataList settingData : GunDataList.values()) {
			// カテゴリ分け -1以外なら
			if (settingData.getCate() == cate+4) {
				data[p] = (int) (new Float(settingData.getData(gundata).toString()) * (d / 10));
				//System.out.println("描画" + settingData.getName());
				p++;
			}
		}
		g2.setPaint(Color.ORANGE);
		writeRecoilGraph(g2,data);

	}
	//グラフ描画
	void writeRecoilGraph(Graphics2D g2, int[] data){
		//突き出た分の描画
				g2.setStroke(new BasicStroke(1.0f));
				g2.draw(new Line2D.Double(80 + data[0], 80 - data[2] + data[3] + 15, 80 + data[0],
						80 - data[2] - data[3] - 15));
				g2.draw(new Line2D.Double(80 + data[0] + data[1]+ 15, 80 - data[2], 80 + data[0] - data[1]- 15,
						80 - data[2]));
				//センターの十字
				g2.setStroke(new BasicStroke(5.0f));
				g2.draw(new Line2D.Double(80 + data[0], 80 - data[2] + data[3], 80 + data[0],
						80 - data[2] - data[3]));
				g2.draw(new Line2D.Double(80 + data[0] + data[1], 80 - data[2], 80 + data[0] - data[1],
						80 - data[2]));
				//四角描画
				g2.setStroke(new BasicStroke(1.5f));
				g2.draw(new Line2D.Double(80 + data[0] + data[1], 80 - data[2] + data[3], 80 + data[0] - data[1], 80 - data[2] + data[3]));
				g2.draw(new Line2D.Double(80 + data[0] + data[1], 80 - data[2] - data[3],80 + data[0] - data[1] , 80 - data[2] - data[3]));
				g2.draw(new Line2D.Double(80 + data[0] + data[1],80 - data[2] + data[3] ,80 + data[0] + data[1] , 80 - data[2] - data[3]));
				g2.draw(new Line2D.Double(80 + data[0] - data[1],80 - data[2] + data[3] ,80 + data[0] - data[1] , 80 - data[2] - data[3]));
	}
}
