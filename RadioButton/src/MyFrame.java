import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton HamburgerButton;
	JRadioButton ChickenButton;
	
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		 pizzaButton = new JRadioButton("pizza");
		 HamburgerButton = new JRadioButton("hamburger");
		 ChickenButton = new JRadioButton("chicken");
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(ChickenButton);
		group.add(HamburgerButton);
		group.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		HamburgerButton.addActionListener(this);
		ChickenButton.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(ChickenButton);
		this.add(HamburgerButton);
		this.pack();
		this.setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==pizzaButton) {
			System.out.println("This is pizza");
		}
		else if(e.getSource()==HamburgerButton) {
			System.out.println("hambugga");
		}
		else if (e.getSource()==ChickenButton) {
			System.out.println("chickynuggets");
			
		}
	}
	
	
	
}
