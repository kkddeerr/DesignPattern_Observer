package model;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import controller.Run;

public class Horse extends Subject{
	private Run RunThread;
	private int stamina = 100;
	
	private JLabel graphic;
	private JLabel modetext;

	private setVelocity VelocityMode;
	private final int WIDTH=247;
	private final int HEIGHT=224;
	private int meter;
	private String announce;
	
	
	
	public Horse(){
		this.meter=0;
		graphic=new JLabel();
		graphic.setSize(WIDTH,HEIGHT);
		VelocityMode=new Slow();
		modetext=new JLabel();
	}
	
	public JLabel getModetext() {
		return modetext;
	}

	public void setModetext(JLabel modetext) {
		this.modetext = modetext;
	}

	public void setIcon(ImageIcon icon) {
		graphic.setIcon(icon);
	}
	
	public JLabel getGraphic(){
		return graphic;
	}
	public int getMeter() {
		return meter;
	}

	public void setMeter(int meter) {
		this.meter=meter;
	}
	
	public int getSpeed(){
		return VelocityMode.getVelocity();
	}

	
	public void setLocation(int x, int y){
		graphic.setLocation(x,y+50);
	}

	public setVelocity getRunningMode() {
		return VelocityMode;
	}

	public void setRunningMode(setVelocity runMode) {
		this.VelocityMode = runMode;
	}
	
	
	public void run(){
		RunThread=new Run(this);
		RunThread.start();

	}
	
	public void stop(){
		RunThread.interrupt();
	
	}
	
	
	public void consume(int amount) {
		stamina -= amount;
		if(stamina < 0) 
			stamina = 0;
		notifyObservers();
	}
	
	public void charge(int amount) {
		
		stamina += amount;
		if(stamina > 100)
			stamina = 100;
		
		notifyObservers();
	}
	
	public void setText(String announce) {
		this.announce = announce;
	}
	
	public String getText() {
		return announce;
	}
	
	
	public int getStamina() {
		return stamina;
	}
}
