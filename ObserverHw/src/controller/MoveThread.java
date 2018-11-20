package controller;

import java.awt.Point;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Horse;
import service.HorseRun;

public class MoveThread implements Runnable{
	private JPanel racingpanel;
	private HorseRun horses;

	

	
	public MoveThread(){
		
		horses= HorseRun.getInstance();
		racingpanel=(JPanel) horses.getHorse(0).getGraphic().getParent();
	}

	public void run() {
		while(true){
			Iterator<Horse> iter=horses.iteraoter();
			while(iter.hasNext()){
				Horse horse=iter.next();
				Point p=horse.getGraphic().getLocation();
				p.setLocation(horse.getMeter(),p.y);
				horse.getGraphic().setLocation(p);
			}
			
			racingpanel.repaint();
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				return;
			}
		}
	}
	

}
