import java.awt.Font;

import javax.swing.*;
import javax.swing.JLabel;
public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Como Estas");
	
	
	
	NewWindow(){
		
		label.setBounds(100,100,100,50);
		label.setFont(new Font(null,Font.PLAIN,10));
		
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
}
