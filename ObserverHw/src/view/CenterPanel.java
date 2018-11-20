package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CenterPanel extends JPanel{
	public final int WIDTH=1500;
	public final int HEIGHT=1200;
	private TrackFrame racingPanel;
	
	public CenterPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(null);
		this.setLayout(null);
		
		racingPanel=new TrackFrame();
		racingPanel.setSize(racingPanel.WIDTH,racingPanel.HEIGHT);
		racingPanel.setLocation(0, 0);
		this.add(racingPanel);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	

}
