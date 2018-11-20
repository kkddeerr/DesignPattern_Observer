package model;

import javax.swing.JLabel;

public class ZeroStaminaAlarm implements Observer {
	private static final int ZERO_STAMINA = 0;
	private Horse horse;
	
	public ZeroStaminaAlarm(Horse horse) {
		this.horse = horse;
	}
	
	public void update() {
		int level = horse.getStamina();
		if(level == ZERO_STAMINA) {
			JLabel horseModeText=horse.getModetext();
			horseModeText.setText("The horse is Zero Stamina" + "Present Stamina :" + level);
		}
	}
}
