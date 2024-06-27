import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox;
	
	public MyFrame() {
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("submit pls");
		
		checkBox = new JCheckBox("wassupppppp");
		checkBox.setFont(new Font("Arial", Font.BOLD, 35));
		checkBox.setFocusable(false);
	
		
		this.pack(); 
		
		this.add(checkBox);
		this.add(button);
		this.setVisible(true);
		
	}

	@Override //listens for events
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		
		}		
		
		
		
	}

	
}
