import java.awt.Color; 
import javax.swing.ImageIcon; import javax.swing.JFrame; 

public class Main { 

public static void main(String[] args) { 

    // JFrame = a GUI window to add components to 

    JFrame frame = new JFrame(); //creates a frame 
    frame.setTitle("Whats Cooking good Looking"); //sets title of frame; 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    frame.setResizable(false); //prevent frame from being resized 
    frame.setSize(600,600); //sets the x-dimension, and y-dimension of frame 
    frame.setVisible(true); //make frame visible 
    ImageIcon image = new ImageIcon("Alex.JPG"); //create an ImageIcon 
    frame.setIconImage(image.getImage()); //change icon of frame
    frame.getContentPane().setBackground(new Color(212, 29, 100)); //change color of background }

 }
}