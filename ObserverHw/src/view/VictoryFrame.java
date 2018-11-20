package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import controller.Play;
import model.Horse;

public class VictoryFrame extends JWindow{
	public final int WIDTH=550;
	public final int HEIGHT=350;
	
	private Horse winHorse;

	
	public VictoryFrame(Horse winHorse){
		this.setAlwaysOnTop(true);
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.winHorse=winHorse;
		
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();		
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);
		
		this.setContentPane(new WinerPanel());
		revalidate();
	}
	
	class WinerPanel extends JPanel{
		private JButton btn_exit;
		private JLabel winnerGraphic;
		
		WinerPanel(){
			
			this.setLayout(null);
			this.setBackground(new Color(255, 0,0,0));
			winnerGraphic= new JLabel();
			winnerGraphic.setIcon(winHorse.getGraphic().getIcon());
			winnerGraphic.setSize(247,224);			
			winnerGraphic.setLocation(150,50);
			add(winnerGraphic);	
			
			btn_exit =new JButton();
			btn_exit.setSize(85,33);
			btn_exit.setLocation(230,300);
			btn_exit.setOpaque(false);
			btn_exit.setBorderPainted(false);
			btn_exit.setFocusPainted(false);
			btn_exit.setContentAreaFilled(false);;
			btn_exit.setIcon(new ImageIcon("images/ok-button-hi.png"));
	
			this.add(btn_exit);
			
			btn_exit.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
	
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			ImageIcon icon=new ImageIcon("images/WinerWindow.jpg");
			Image img=icon.getImage();		
			g.drawImage(img, 0,0,this);

		}
	}
	

}
