
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        
        // Create an image for label.
        ImageIcon image = new ImageIcon("src/tooth.png");
        
        // Create boundary lines for label and set their color and size.
        JLabel label = new JLabel("Huhhhhhhh");
        label.setBackground(new Color(0xABF095));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(new Color(0x000000), 5));
        label.setBounds(0, 0, 500, 500); // (x, y, width, height)
        label.setFont(new Font("SansSerif", Font.PLAIN, 20)); // Use a font available on macOS
        label.setForeground(new Color(0x4878F5)); // Set the text color
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Center the text horizontally
        label.setVerticalTextPosition(JLabel.CENTER); // Center the text vertically
        label.setHorizontalAlignment(JLabel.CENTER); // Center the icon horizontally within the label
        label.setVerticalAlignment(JLabel.CENTER); // Center the icon vertically within the label
        label.setIconTextGap(0);
        label.setVisible(true); // Ensure the label is visible
        
        // Create a frame to display the label
        JFrame frame = new JFrame();
        frame.setSize(600, 600); // Set frame size
        frame.setLayout(null); // Set layout to null for absolute positioning
        
        frame.add(label); // Add label to the frame
        frame.revalidate(); // Notify the layout manager
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the frame on exit
        frame.setVisible(true); // Make the frame visible
        frame.repaint(); // Repaint the frame
    }
}





