

import java.awt.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		
		
		
		javax.swing.JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3, 8, 0));
		
		
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		
		
		
		
		
		frame.setVisible(true);
	}

}
