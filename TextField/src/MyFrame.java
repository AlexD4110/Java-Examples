import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.desktop.SystemSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ///exits
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Please bro please press this button");
		button.addActionListener(this);
		
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN,35));
		textField.setForeground(Color.DARK_GRAY);
		textField.setBackground(Color.BLACK);
		textField.setCaretColor(Color.WHITE);
		textField.setText("username");
		
		
		this.add(button);
		this.add(textField);
		this.pack(); //Adjust to fit the component that I add
		this.setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome "+ textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
			
			// TODO Auto-generated method stub
		}
		
	}

}
