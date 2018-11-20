package controller;

import java.util.Iterator;

import model.Horse;
import service.HorseRun;
import view.VictoryFrame;

public class Play {
	private static final Play instance=new Play();
	private HorseRun horses;
	private Thread horseMove;
	private Boolean play=false;
	
	public static Play getInsatnce(){
		return instance;
	}

	public void gamestart(){
		horses=HorseRun.getInstance();
		
		if(play==true)return;
		play=true;
		Iterator<Horse> iter=horses.iteraoter();
		
		while(iter.hasNext()){
			Horse horse= iter.next();
			horse.run();			
		}
		
		horseMove=new Thread(new MoveThread());
		horseMove.start();		
	}
	
	public void gameover(Horse winner){
		
		Iterator<Horse> iter=horses.iteraoter();		
		while(iter.hasNext()){
			Horse horse=iter.next();
			horse.stop();		
		}
		
		horseMove.interrupt();
		
		new VictoryFrame(winner);
	}
}

