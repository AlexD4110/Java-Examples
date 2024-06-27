


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JTextField taskInputField;
    private JButton addButton;
    private JButton removeButton;
    private JList<Task> taskList;

    public MainFrame() {
        setTitle("To-Do List Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskInputField = new JTextField();
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        taskList = new JList<>(new DefaultListModel<>());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(removeButton, BorderLayout.SOUTH);
    }

    public JTextField getTaskInputField() {
        return taskInputField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public JList<Task> getTaskList() {
        return taskList;
    }
}

