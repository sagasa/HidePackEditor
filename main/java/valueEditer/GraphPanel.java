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

/**GUIのグラフ描画用*/
public class GraphPanel extends JPanel{
	private static final long serialVersionUID = 9205198248352176324L;
	
	/**リコイル表示*/
	static public final int RECOIL_GRAPH = 1;
	
	/**銃用*/
	public GraphPanel(int type,GunData data) {
		this.setBorder(new LineBorder(Color.black, 1, false));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.white);
		g2.fillRect(0, 0, 160, 160);
		//罫線描画
		g2.setPaint(Color.gray);
	    g2.setStroke(new BasicStroke(2.0f));
		g2.draw(new Line2D.Double(80.0d, 0.0d, 80.0d, 160.0d));
		g2.draw(new Line2D.Double(0.0d, 80.0d, 180.0d, 80.0d));
		g2.setStroke(new BasicStroke(1.0f));
		//10あたり何ピクセルか
		int d = 30;
		for(int i = 0;i<80;i += d){
			g2.setPaint(Color.gray);
			g2.draw(new Line2D.Double(80-i, 80-i, 80+i, 80-i));
			g2.draw(new Line2D.Double(80-i, 80-i, 80-i, 80+i));
			g2.draw(new Line2D.Double(80+i, 80-i, 80+i, 80+i));
			g2.draw(new Line2D.Double(80-i, 80+i, 80+i, 80+i));
			int draw = i/d*10;
			g2.drawString(draw+"", 80, 80-i);
		}
		
		
		g2.setPaint(Color.gray);
		
	}

}
