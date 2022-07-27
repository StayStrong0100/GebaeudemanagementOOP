package GUI.Moritz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Raumsuche {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello");
	
	Raumsuche(){
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font("Comic Sans", Font.BOLD,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
