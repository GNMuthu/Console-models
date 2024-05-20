package com.gnmuthu.todoManagement;

import java.util.ArrayList;
import java.util.List;

import com.gnmuthu.todoManagement.TodoTask;

public class TodoTaskList {
    TodoTaskList() {
//TodoTask task =new TodoTask();
    }

    List<TodoTask> taskList = new ArrayList<>();

    public void addTask(TodoTask task) {
        taskList.add(task);
    }

    public void markTaskStatusCompleted(int taskId) {
        for (TodoTask task : taskList) {
            if (task.getTaskId() == taskId) {
                task.setTaskStatus(true);
                return;
            }
        }
        System.out.println("Task Id" + taskId + "Not found");
    }

    public void deleteTask(int taskId) {
        taskList.removeIf(task-> task.getTaskId()==taskId);
    }
    public void displayTaskList()
    {
        for(TodoTask task:taskList) {
            System.out.println("Task Id:\t"+task.taskId);
            System.out.println("Task Description:\t"+task.description);
            System.out.println("Task Due Date:\t"+task.taskDueDate);
            System.out.println("Task Status:\t"+task.taskStatus);
        }
    }
}
