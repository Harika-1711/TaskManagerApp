package com.taskmanager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManager {
    private Map<String, String> users = new HashMap<>();

    public void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!users.containsKey(username)) {
            users.put(username, password);
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Username already exists.");
        }
    }

    public boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }
}
