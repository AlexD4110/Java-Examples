import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	 // JFrame = a GUI window to add components to 
	MyFrame(){
		
    
    this.setTitle("Whats Cooking good Looking"); //sets title of this; 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    this.setResizable(false); //prevent this from being resized 
    this.setSize(600,600); //sets the x-dimension, and y-dimension of this 
    this.setVisible(true); //make this visible 
    ImageIcon image = new ImageIcon("Alex.JPG"); //create an ImageIcon 
    this.setIconImage(image.getImage()); //change icon of this
    this.getContentPane().setBackground(new Color(212, 29, 100)); //change color of background }

}

}
