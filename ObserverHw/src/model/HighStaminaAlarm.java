package model;

import javax.swing.JLabel;

public class HighStaminaAlarm implements Observer {
	private static final int HIGH_STAMINA = 70;
	private Horse horse;
	
	public HighStaminaAlarm(Horse horse) {
		this.horse = horse;
	}
	
	public void update() {
		int level = horse.getStamina();
		if(level > HIGH_STAMINA && level != 100) {
			JLabel horseModeText=horse.getModetext();
			horseModeText.setText("The horse is High Stamina" + "Present Stamina :" + level);
		}
	}
}
