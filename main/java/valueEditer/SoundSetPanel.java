package valueEditer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hideEditer.MainWindow;
import types.ImageData;
import types.GunData.GunDataList;
import types.base.DataBase;
import valueEditer.valueSetPanels.NumberSetPanel;

/**再生する音の設定 ファイル名とピッチをセットで*/
public class SoundSetPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 4067090528518009773L;

	public static final int GUN_SHOOT_SOUND = 1;
	public static final int GUN_RELOAD_SOUND = 2;

	DataBase data;
	int mode;

	public SoundSetPanel(DataBase d,int c){
		data = d;
		mode = c;
		this.setLayout(null);
		this.setOpaque(false);
		switch(mode){
		case GUN_SHOOT_SOUND:
			JLabel label = new JLabel("ShootSound");
			label.setFont(new Font("BOLD", Font.BOLD, 13));
			label.setBounds(80,5,100,18);
			this.add(label);
			NumberSetPanel range = new NumberSetPanel(GunDataList.SOUND_SHOOT_RANGE,data);
			range.setBounds(5,28,240,18);
			this.add(range);
			NumberSetPanel pitch = new NumberSetPanel(GunDataList.SOUND_SHOOT_PITCH,data);
			pitch.setBounds(5,51,240,18);
			this.add(pitch);
			JLabel nowsounds = new JLabel("SoundName : ");
			nowsounds.setBounds(5, 74, 110, 18);
			nowsounds.setFont(new Font("BOLD", Font.BOLD, 12));
			this.add(nowsounds);

			JComboBox<String> sounds = new JComboBox<String>();
			sounds.addActionListener(this);
			sounds.addItem("");
			for (String name : MainWindow.soundMap.keySet()) {
				sounds.addItem(name);
			}
			sounds.setBounds(170, 74, 75, 18);
			sounds.setSelectedItem(data.getDataString(GunDataList.SOUND_SHOOT_NAME));
			sounds.setActionCommand("iconSet");
			this.add(sounds);
			break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
