package com.taskmanager;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String priority; // e.g., High, Medium, Low
    private String status; // e.g., Pending, In-Progress, Completed

    public Task(String title, String description, LocalDate dueDate, String priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return title + " (" + priority + "): " + description + " - Due: " + dueDate + " - Status: " + status;
    }
}
