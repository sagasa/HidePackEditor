package valueEditer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hideEditer.MainWindow;
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

	JComboBox<String> sounds;
	
	public SoundSetPanel(DataBase d,int c){
		data = d;
		mode = c;
		this.setLayout(null);
		this.setOpaque(false);
		JLabel label = null;
		NumberSetPanel range = null;
		NumberSetPanel pitch = null;
		switch(mode){
		case GUN_SHOOT_SOUND:
			label = new JLabel("ShootSound");
			range = new NumberSetPanel(GunDataList.SOUND_SHOOT_RANGE,data);
			pitch = new NumberSetPanel(GunDataList.SOUND_SHOOT_PITCH,data);
			break;	
		case GUN_RELOAD_SOUND:
			label = new JLabel("ReloadSound");
			range = new NumberSetPanel(GunDataList.SOUND_RELOAD_RANGE,data);
			pitch = new NumberSetPanel(GunDataList.SOUND_RELOAD_PITCH,data);
			break;	
		}
		
		label.setFont(new Font("BOLD", Font.BOLD, 13));
		label.setBounds(80,5,100,18);
		this.add(label);
		range.setBounds(5,28,240,18);
		this.add(range);
		
		pitch.setBounds(5,51,240,18);
		this.add(pitch);
		JLabel nowsounds = new JLabel("SoundName : ");
		nowsounds.setBounds(10, 74, 80, 18);
		nowsounds.setFont(new Font("BOLD", Font.BOLD, 12));
		this.add(nowsounds);

		sounds = new JComboBox<String>();
		sounds.addActionListener(this);
		for (String name : MainWindow.soundMap.keySet()) {
			sounds.addItem(name);
		}
		sounds.setBounds(90, 74, 155, 18);
		sounds.setSelectedItem(get());
		sounds.setActionCommand("Set");
		this.add(sounds);
	}
	/**場合分けして取得*/
	String get(){
		switch(mode){
		case GUN_SHOOT_SOUND:
			return data.getDataString(GunDataList.SOUND_SHOOT_NAME);
		case GUN_RELOAD_SOUND:
			return data.getDataString(GunDataList.SOUND_RELOAD_NAME);
		}
		return null;
	}
	/**場合分けして格納*/
	void set(String value){
		switch(mode){
		case GUN_SHOOT_SOUND:
			data.setData(GunDataList.SOUND_SHOOT_NAME,value);
		case GUN_RELOAD_SOUND:
			data.setData(GunDataList.SOUND_RELOAD_NAME,value);
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		set(sounds.getSelectedItem().toString());
	}

}
