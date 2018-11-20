package controller;

import java.util.ArrayList;

import model.Fast;
import model.FullStaminaAlarm;
import model.HighStaminaAlarm;
import model.Horse;
import model.LowStaminaWarning;
import model.NormalStaminaAlarm;
import model.Observer;
import model.Slow;
import model.VeryFast;
import model.VerySlow;
import model.ZeroStaminaAlarm;
import model.setVelocity;

public class Run extends Thread{
	private ArrayList<setVelocity> modes;
	private Horse horse;
	
	

	public Run(Horse horse){
		
		Observer fullstaminaAlarm = new FullStaminaAlarm(horse);
		Observer highstaminaAlarm = new HighStaminaAlarm(horse);
		Observer lowstaminaAlarm = new LowStaminaWarning(horse);
		Observer normalstaminaAlarm = new NormalStaminaAlarm(horse);
		Observer zerostaminaAlarm = new ZeroStaminaAlarm(horse);
		
		this.horse=horse;
		modes=new ArrayList<setVelocity>();
		modes.add(new VeryFast());
		modes.add(new Fast());
		modes.add(new Slow());
		modes.add(new VerySlow());
		
		horse.addObserver(fullstaminaAlarm);
		horse.addObserver(highstaminaAlarm);
		horse.addObserver(lowstaminaAlarm);
		horse.addObserver(normalstaminaAlarm);
		horse.addObserver(zerostaminaAlarm);

	}
	
	public void run() {
		
		int location = horse.getMeter();
		int speed;
		
		while(true){
		
			int random = (int) (Math.random() * 4);
			setVelocity mode= modes.get(random);
			
			if(random==0) 
				horse.consume(5);
			else if(random==1) horse.consume(3);
			else if(random==2) horse.consume(1);
			else horse.charge(1);
			
			horse.setRunningMode(mode);
			
			location=horse.getMeter();
			speed=horse.getSpeed();
			horse.setMeter(location+speed);
			
			if(location>=930)
				Play.getInsatnce().gameover(horse);
			
			try{
				Thread.sleep(150);
			}catch (Exception e) {
				return;
			}	
		}
		
	}

}
