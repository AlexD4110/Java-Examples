

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane is pop up standard dialog box that prompts user for input
		// informs them of something

		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "YO WATCHOUTTTTT", "WARNING", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "YES, NO, CANCEL", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//JOptionPane.showMessageDialog(null, "This is some info OOOOOO", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
		
	
		//JOptionPane.showMessageDialog(null, "YOUR COMPUTER HAS A VIRUS", "", JOptionPane.ERROR_MESSAGE);
		
		
		
		//int answer = JOptionPane.showConfirmDialog(null, "The cow said moo", "MOO", JOptionPane.YES_NO_CANCEL_OPTION);
	
		//String name = JOptionPane.showInputDialog("what is thy name");
		
		//System.out.println("Hello thy " + name);
		String[] responseStrings = {"Meh", "Maybe" , "IDK" , "I think so", "I guess"};
		
		ImageIcon icon = new ImageIcon("src/SFemoji.png");
		JOptionPane.showOptionDialog(
				null,
				"You are eh", "secreto",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon, 
				responseStrings,
				args);
		
		}
	}



