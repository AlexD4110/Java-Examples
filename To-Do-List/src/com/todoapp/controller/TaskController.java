
package com.todoapp.controller;

import com.todoapp.model.Task;
import com.todoapp.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks;
    private DefaultListModel<Task> taskModel;
    private MainFrame mainFrame;

    public TaskController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.tasks = new ArrayList<>();
        this.taskModel = (DefaultListModel<Task>) mainFrame.getTaskList().getModel();
        
        mainFrame.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask(mainFrame.getTaskInputField().getText());
                mainFrame.getTaskInputField().setText("");
            }
        });

        mainFrame.getRemoveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = mainFrame.getTaskList().getSelectedIndex();
                if (selectedIndex != -1) {
                    removeTask(taskModel.get(selectedIndex).getId());
                }
            }
        });

        mainFrame.getTaskList().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = mainFrame.getTaskList().getSelectedIndex();
                if (selectedIndex != -1) {
                    toggleTaskCompletion(taskModel.get(selectedIndex).getId());
                }
            }
        });

        updateView();
    }

    public void addTask(String description) {
        int id = tasks.size() + 1;
        Task newTask = new Task(id, description);
        tasks.add(newTask);
        updateView();
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        updateView();
    }

    public void toggleTaskCompletion(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.toggleCompleted();
                break;
            }
        }
        updateView();
    }

    private void updateView() {
        taskModel.clear();
        for (Task task : tasks) {
            taskModel.addElement(task);
        }
    }
}
