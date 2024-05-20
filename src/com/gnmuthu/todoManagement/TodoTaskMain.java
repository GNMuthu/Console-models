package com.gnmuthu.todoManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class TodoTaskMain {
    public static void main(String[] args) throws IOException {
        TodoTaskList todoTask = new TodoTaskList();
        Scanner sc = new Scanner(System.in);
        TodoTask task1 = new TodoTask(1, "complete console", LocalDate.of(2024, 05, 20), false);
        TodoTask task2 = new TodoTask(2, "After console start Android", LocalDate.of(2024, 05, 21), false);
        todoTask.addTask(task1);
        todoTask.addTask(task2);
        int choiceForTask;
        do {
            System.out.println("Task Operations List");
            System.out.println("1. Add Task");
            System.out.println("2. Set Task Status as Completed");
            System.out.println("3. Delete Task");
            System.out.println("4. List the Task");
            System.out.println("0. Exit");
            System.out.println("enter the Choice for Task performance");
            choiceForTask = sc.nextInt();
            switch (choiceForTask) {
                case 1:
                    System.out.println("Enter Task Description");
                    String taskDescription = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Due Date for Task (YYYY-MM-DD)");
                    String DueDate = sc.nextLine().trim();
                    LocalDate taskDueDate = LocalDate.parse(DueDate);
                    TodoTask newTodoTask = new TodoTask(todoTask.taskList.size() + 1, taskDescription, taskDueDate, false);
                    todoTask.addTask(newTodoTask);
                    System.out.println("Task Added");
                    break;
                case 2:
                    System.out.println("Enter the Task Id for Status change");
                    int taskId = sc.nextInt();
                    todoTask.markTaskStatusCompleted(taskId);
                    System.out.println("Task Status Marked as TRUE");
                    break;
                case 3:
                    System.out.println("Enter the task Id for Delete");
                    int taskIdDelete = sc.nextInt();
                    todoTask.deleteTask(taskIdDelete);
                    System.out.println("Task Removed from the List");
                    break;
                case 4:
                    todoTask.displayTaskList();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Enter the Choice for the Task from 1 to 4");
            }
        } while (choiceForTask != 0);
    }
}
