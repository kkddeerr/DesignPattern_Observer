package controller;

import java.util.Iterator;

import javax.swing.ImageIcon;

import model.FullStaminaAlarm;
import model.HighStaminaAlarm;
import model.Horse;
import model.LowStaminaWarning;
import model.ZeroStaminaAlarm;
import service.HorseRun;
import view.MainFrame;

public class Start {
	public static void main(String[] args){
		HorseRun horses=HorseRun.getInstance();
		
		Horse horse1= new Horse();
		Horse horse2= new Horse();
		Horse horse3= new Horse();
		Horse horse4= new Horse();
		Horse horse5= new Horse();
		
		horse1.setIcon(new ImageIcon("images/horse1.gif"));
		horse2.setIcon(new ImageIcon("images/horse2.gif"));
		horse3.setIcon(new ImageIcon("images/horse3.gif"));
		horse4.setIcon(new ImageIcon("images/horse4.gif"));
		horse5.setIcon(new ImageIcon("images/horse5.gif"));
	
		horses.add(horse1);
		horses.add(horse2);
		horses.add(horse3);
		horses.add(horse4);
		horses.add(horse5);
		
		
		new MainFrame();
	}
}

