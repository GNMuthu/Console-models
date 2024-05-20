package com.gnmuthu.todoManagement;

import java.time.LocalDate;

public class TodoTask {
    int taskId;
    String description;
    LocalDate taskDueDate;
    boolean taskStatus;

    TodoTask(int taskId, String description, LocalDate taskDueDate, boolean taskStatus) {
        this.taskId = taskId;
        this.description = description;
        this.taskDueDate = taskDueDate;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTaskDueDate() {
        return taskDueDate;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String toString() {
        return "id" + taskId + "\n Description" + description + "\n Task Due Date" + taskDueDate + "\n Task Status" + taskStatus;
    }
}
