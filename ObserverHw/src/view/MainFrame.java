package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	private JPanel northPanel;
	private JPanel southPanel;
	private JPanel centerPanel;
	public final int WIDTH=1300;
	public final int HEIGHT=700;
	
	
	
	
	
	public MainFrame(){	
		this.setVisible(true);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.getContentPane().setBackground(Color.WHITE);	
		
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();		
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);

		
		southPanel=new ButtonPanel();
		centerPanel=new CenterPanel();
		
		
		this.add(centerPanel,BorderLayout.CENTER);
		this.add(southPanel,BorderLayout.SOUTH);
		
		this.revalidate();
	}	
}
