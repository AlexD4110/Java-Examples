

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create an image for label.
        ImageIcon icon = new ImageIcon("src/file.png");

        // Create a label for the text and image.
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Create a red panel.
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        // Create a blue panel.
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(new BorderLayout());

        // Create a green panel.
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        // Create a frame.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);

        // Add the label to the blue panel.
        greenPanel.add(label, BorderLayout.CENTER);

        // Add panels to the frame.
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        // Make the frame visible.
        frame.setVisible(true);
    }
}
