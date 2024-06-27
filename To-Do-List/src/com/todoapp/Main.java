package com.todoapp;

import com.todoapp.controller.TaskController;
import com.todoapp.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            TaskController controller = new TaskController(mainFrame);
            mainFrame.setVisible(true);
        });
    }
}
