package com.taskmanager;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();  // Manages user registration and login
        TaskManager taskManager = new TaskManager();  // Manages tasks

        System.out.println("===== Welcome to the Task Manager Application =====");

        // Application Loop
        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Handle user registration
                    userManager.registerUser(scanner);
                    break;

                case 2:
                    // Handle user login
                    if (userManager.login(scanner)) {
                        // If login is successful, allow the user to manage tasks
                        taskManager.manageTasks(scanner);
                    }
                    break;

                case 3:
                    // Exit the application
                    System.out.println("Exiting Task Manager... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
