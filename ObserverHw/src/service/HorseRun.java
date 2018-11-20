package service;

import java.util.Iterator;
import java.util.LinkedList;

import model.Horse;

public class HorseRun {
	private LinkedList<Horse> horses=new LinkedList<Horse>();
	private static final HorseRun instance=new HorseRun();
	
	public static HorseRun getInstance(){
		return instance;
	}
	
	public void add(Horse horse){
		horses.add(horse);
	}
	
	public Horse getHorse(int num){
		return horses.get(num);
	}
	
	public Iterator<Horse> iteraoter(){
		return horses.iterator();
	}
}
