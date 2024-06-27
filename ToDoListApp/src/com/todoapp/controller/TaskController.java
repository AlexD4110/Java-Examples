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
        if (description == null || description.trim().isEmpty()) {
            return;  // Do not add empty tasks
        }
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


/*Key Terms and Concepts
1. Package
Definition: A namespace that organizes classes and interfaces.
Usage: Helps group related classes, making the code modular and easier to manage. Examples in this project are com.todoapp.model, com.todoapp.view, and com.todoapp.controller.
2. Class
Definition: A blueprint for creating objects, defining their properties and behaviors.
Usage: We have several classes like Task, MainFrame, TaskController, and Main.
3. Object
Definition: An instance of a class.
Usage: For example, Task objects represent individual tasks in the to-do list.
4. Field
Definition: A variable defined inside a class, representing the state of an object.
Usage: id, description, and isCompleted are fields in the Task class.
5. Method
Definition: A function defined inside a class, representing the behavior of an object.
Usage: Methods like getId(), getDescription(), isCompleted(), and toggleCompleted() in the Task class.
6. Constructor
Definition: A special method used to initialize objects.
Usage: The Task class has a constructor to initialize id and description.
7. Encapsulation
Definition: The practice of restricting access to certain details and exposing only necessary parts of an object.
Usage: Achieved using the private keyword for fields and providing public getter methods.
8. private Keyword
Definition: An access modifier that restricts visibility to within the class.
Usage: Fields like id, description, and isCompleted in the Task class are private.
9. GUI (Graphical User Interface)
Definition: A visual interface for interacting with software.
Usage: Implemented using the MainFrame class with Swing components like JTextField, JButton, and JList.
10. Swing
Definition: A Java library for building graphical user interfaces.
Usage: Used in the MainFrame class to create and manage UI components.
11. Event Listener
Definition: An interface that listens for events (e.g., button clicks, key presses).
Usage: Implemented using ActionListener for the Add button and task input field.
12. ActionListener Interface
Definition: An interface for receiving action events.
Usage: Added to the Add button and task input field to handle adding tasks.
13. JFrame
Definition: A Swing class for creating a window.
Usage: MainFrame extends JFrame to create the main application window.
14. JTextField
Definition: A Swing component that allows for single-line text input.
Usage: Used for entering new tasks in the MainFrame.
15. JButton
Definition: A Swing component that creates a clickable button.
Usage: Used for the Add and Remove buttons in the MainFrame.
16. JList
Definition: A Swing component that displays a list of items.
Usage: Used to display tasks in the MainFrame.
17. DefaultListModel
Definition: A class that provides a mutable list model for JList.
Usage: Used to manage the list of tasks in the TaskController.
18. Controller
Definition: A class that handles the logic and updates the view.
Usage: TaskController manages the tasks and updates the MainFrame view.
19. Model-View-Controller (MVC)
Definition: A design pattern that separates the data (model), the user interface (view), and the control logic (controller).
Usage: Applied through the Task class (model), MainFrame class (view), and TaskController class (controller).
20. Entry Point
Definition: The starting point of a Java application, usually the main method.
Usage: The Main class contains the main method to launch the application.
21. Lambda Expressions
Definition: A feature in Java that provides a clear and concise way to represent one method interface using an expression.
Usage: Used for adding action listeners succinctly, e.g., e -> addButton.doClick(). */




