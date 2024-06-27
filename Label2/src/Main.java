

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        
        // Create an image for label.
        ImageIcon image = new ImageIcon("src/tooth.png");
        
        // Create a label for the image.
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBorder(BorderFactory.createLineBorder(new Color(0x000000), 5)); // Border for image label
        
        // Create a panel to hold both the image label and text label.
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setBackground(Color.LIGHT_GRAY);
        
        // Create a label for the text.
        JLabel textLabel = new JLabel("Huhhhhhhh");
        textLabel.setFont(new Font("SansSerif", Font.PLAIN, 20)); // Use a font available on macOS
        textLabel.setForeground(new Color(0x4878F5)); // Set the text color
        
        // Add components to the panel.
        panel.add(imageLabel);
        panel.add(textLabel);
        
        // Create a frame to display the panel.
        JFrame frame = new JFrame();
        frame.setSize(600, 600); // Set frame size
        frame.getContentPane().setBackground(new Color(0xABF095)); // Set background color of the frame
        
        frame.add(panel); // Add panel to the frame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the frame on exit
        frame.setVisible(true); // Make the frame visible
    }
}
