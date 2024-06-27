


// Importing Packages Swing is used for user interface.
// .* means that it will include all ranges of said package

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {

    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operationButtons; // Array to hold operation buttons (+, -, *, /)
    private JButton decimalButton; // New button for decimal
    private JButton clearButton;
    private JButton backspaceButton;
    private JButton equalsButton;

    private double currentValue;
    private char currentOperation;

    private boolean decimalClicked; // Flag to track if decimal is clicked

    public CalculatorGUI() {
        super("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayField = new JTextField(10);
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String num = e.getActionCommand();
                    displayField.setText(displayField.getText() + num);
                }
            });
        }

        operationButtons = new JButton[4];
        operationButtons[0] = new JButton("+");
        operationButtons[1] = new JButton("-");
        operationButtons[2] = new JButton("*");
        operationButtons[3] = new JButton("/");
        for (JButton button : operationButtons) {
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    performOperation(e.getActionCommand().charAt(0));
                }
            });
        }

        decimalButton = new JButton(".");
        buttonPanel.add(decimalButton);
        decimalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!decimalClicked) {
                    displayField.setText(displayField.getText() + ".");
                    decimalClicked = true;
                }
            }
        });

        clearButton = new JButton("C");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayField.setText("");
                currentValue = 0.0;
                currentOperation = ' ';
                decimalClicked = false;
            }
        });

        backspaceButton = new JButton("←");
        buttonPanel.add(backspaceButton);
        backspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = displayField.getText();
                if (currentText.length() > 0) {
                    displayField.setText(currentText.substring(0, currentText.length() - 1));
                }
                // Reset decimalClicked flag if decimal is deleted
                if (!currentText.contains(".")) {
                    decimalClicked = false;
                }
            }
        });

        equalsButton = new JButton("=");
        buttonPanel.add(equalsButton);
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double secondOperand = Double.parseDouble(displayField.getText());
                double result = performOperation(currentValue, secondOperand, currentOperation);
                displayField.setText(String.valueOf(result));
                decimalClicked = false; // Reset decimalClicked flag after calculation
            }
        });

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void performOperation(char operation) {
        currentValue = Double.parseDouble(displayField.getText());
        displayField.setText("");
        currentOperation = operation;
        decimalClicked = false; // Reset decimalClicked flag when new operation is started
    }

    private double performOperation(double firstOperand, double secondOperand, char operation) {
        switch (operation) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    return Double.NaN; // or handle error as needed
                }
            default:
                return secondOperand;  // If no operation is set, return the second operand
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI();
            }
        });
    }
}

