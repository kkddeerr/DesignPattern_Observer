package model;

import javax.swing.JLabel;

public class FullStaminaAlarm implements Observer {
	private static final int FULL_STAMINA = 100;
	private Horse horse;
	
	public FullStaminaAlarm(Horse horse) {
		this.horse = horse;
	}
	
	public void update() {
		int level = horse.getStamina();
	
		if(level == FULL_STAMINA){
			JLabel horseModeText=horse.getModetext();
			horseModeText.setText("The horse is Full Stamina" + "Present Stamina :" + level);
		}
	}
}