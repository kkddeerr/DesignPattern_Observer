package model;

import javax.swing.JLabel;

public class NormalStaminaAlarm implements Observer {
	private static final int NORMAL_STAMINA = 40;
	private Horse horse;
	
	public NormalStaminaAlarm(Horse horse) {
		this.horse = horse;
	}
	
	public void update() {
		int level = horse.getStamina();
		if(level > NORMAL_STAMINA && level < 70) {
			JLabel horseModeText=horse.getModetext();
			horseModeText.setText("The horse is Normal Stamina" + "Present Stamina :" + level);
		}
			
	}
}

