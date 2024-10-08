package com.taskmanager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void manageTasks(Scanner scanner) {
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Exit Task Manager");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTaskStatus(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private void addTask(Scanner scanner) {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter due date (yyyy-mm-dd): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter priority (High, Medium, Low): ");
        String priority = scanner.nextLine();

        tasks.add(new Task(title, description, dueDate, priority));
        System.out.println("Task added successfully!");
    }

    private void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private void updateTaskStatus(Scanner scanner) {
        System.out.print("Enter task title to update: ");
        String title = scanner.nextLine();
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Enter new status (Pending, In-Progress, Completed): ");
                String status = scanner.nextLine();
                task.setStatus(status);
                System.out.println("Task status updated!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
