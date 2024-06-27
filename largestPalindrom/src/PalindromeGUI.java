
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeGUI extends JFrame implements ActionListener {
	private JTextField inputField;
    private JButton findButton;
    private JLabel resultLabel;
    private Solution solution;
    

    public PalindromeGUI() {
        // Set up the frame
        setTitle("Longest Palindromic Substring Finder");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        s

        // Initialize components
        inputField = new JTextField(20);
        findButton = new JButton("Find Longest Palindrome");
        findButton.addActionListener(this);
        resultLabel = new JLabel("Result will be displayed here");
        BackgroundColor inputBlank = new JColorChooser(setBackground(Color.BLACK));
        // Add components to the frame
        add(new JLabel("Enter a string: "));
        add(inputField);
        add(findButton);
        add(resultLabel);
        add();

        // Initialize solution object
        solution = new Solution();
    }

    private void setForeground(JTextField jTextField) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findButton) {
            // Get the input string from the text field
            String input = inputField.getText();
            // Find the longest palindromic substring
            String result = solution.longestPalindrome(input);
            // Display the result in the label
            resultLabel.setText("Longest Palindromic Substring: " + result);
        }
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            PalindromeGUI gui = new PalindromeGUI();
            gui.setVisible(true);
        });
    }
}
