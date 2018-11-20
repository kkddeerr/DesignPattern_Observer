package model;

import javax.swing.JLabel;

public class LowStaminaWarning implements Observer {
	private static final int LOW_STAMINA = 40;
	private Horse horse;
	
	public LowStaminaWarning(Horse horse) {
		this.horse = horse;
	}
	
	public void update() {
		int level = horse.getStamina();
		if(level < LOW_STAMINA && level != 0) {
			JLabel horseModeText=horse.getModetext();
			horseModeText.setText("The horse is Low Stamina" + "Present Stamina :" + level);
		}
			
	}
}

