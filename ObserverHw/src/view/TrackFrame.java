package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Horse;
import service.HorseRun;

public class TrackFrame extends JPanel {
	public final int WIDTH = 1500;
	public final int HEIGHT = 900;
	public TrackFrame() {

		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setBackground(null);
		this.setLayout(null);

		HorseRun horses = HorseRun.getInstance();

		Horse horse1 = horses.getHorse(0);
		horse1.setLocation(horse1.getMeter(), 0);
		JLabel horse1modeText = horse1.getModetext();
		horse1modeText.setBounds(400, 230, 450, 70);
		horse1modeText.setOpaque(false);
		horse1modeText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		this.add(horse1modeText);
		this.add(horse1.getGraphic());

		Horse horse2 = horses.getHorse(1);
		horse2.setLocation(horse2.getMeter(), 75);
		
		JLabel horse2modeText = horse2.getModetext();
		horse2modeText.setBounds(400, 230 + 75, 450, 70);
		horse2modeText.setOpaque(false);
		horse2modeText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		this.add(horse2modeText);
		this.add(horse2.getGraphic());

		Horse horse3 = horses.getHorse(2);
		horse3.setLocation(horse3.getMeter(), 160);

		JLabel horse3modeText = horse3.getModetext();

		horse3modeText.setBounds(400, 230 + 75 + 75, 450, 70);
		horse3modeText.setOpaque(false);
		horse3modeText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		this.add(horse3modeText);
		this.add(horse3.getGraphic());

		Horse horse4 = horses.getHorse(3);
		horse4.setLocation(horse4.getMeter(), 240);
		JLabel horse4modeText = horse4.getModetext();
		horse4modeText.setBounds(400, 230 + 75 + 75 + 75, 450, 70);
		horse4modeText.setOpaque(false);
		horse4modeText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		this.add(horse4modeText);
		this.add(horse4.getGraphic());

		Horse horse5 = horses.getHorse(4);
		horse5.setLocation(horse5.getMeter(), 320);
		JLabel horse5modeText = horse5.getModetext();
		horse5modeText.setBounds(400, 230 + 75 + 75 + 75 + 90, 450, 70);
		horse5modeText.setOpaque(false);
		horse5modeText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		this.add(horse5modeText);
		this.add(horse5.getGraphic());

	}

	public void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("images/background.jpg");
		Image img = icon.getImage();
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);
	}

}
