import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JPanel buttonPanel; // Custom JPanel to set background color
	
	
	MyFrame(){
		
		buttonPanel = new JPanel();
	    buttonPanel.setLayout(null); // You can set the layout as per your requirement
	    buttonPanel.setBounds(200, 100, 250, 100);
	    buttonPanel.setBackground(Color.GRAY); // Set background color
		
		
		ImageIcon icon = new ImageIcon("src/file.png"); //You will ALWAYS need this in mac os.
		
		button = new JButton();
		//button.setBounds(x, y, width, height);
		button.setBounds(200, 100, 250, 100);
		
		button.addActionListener(this);
		
		button.setText("I'm a button");
		
		button.setIcon(icon);
		
		button.setFocusable(false);
		
		button.setVerticalTextPosition(JButton.BOTTOM);
		
		button.setHorizontalTextPosition(JButton.CENTER);
		
		button.setFont(new Font("Arial",Font.BOLD,30));
		
		button.setIconTextGap(-5);
		
		button.setForeground(Color.DARK_GRAY);
		
		button.setBackground(Color.LIGHT_GRAY);
		
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setOpaque(false);
		
		buttonPanel.add(button);
		//button.setEnabled(false)
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		
		this.add(button);
		this.setVisible(true);
		this.add(buttonPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Wassup");
			//button.setEnabled(false);
		}
	}
}
