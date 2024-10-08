package com.taskmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        TaskManager taskManager = new TaskManager();
        
        System.out.println("Welcome to the Task Manager!");
        
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline
            
            switch (choice) {
                case 1:
                    userManager.registerUser(scanner);
                    break;
                case 2:
                    if (userManager.login(scanner)) {
                        taskManager.manageTasks(scanner);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
