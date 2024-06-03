//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Task {
//    private int id;
//    private String description;
//    private LocalDate dueDate;
//    private boolean completed;
//
//    public Task(int id, String description, LocalDate dueDate, boolean completed) {
//        this.id = id;
//        this.description = description;
//        this.dueDate = dueDate;
//        this.completed = completed;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }
//
//    @Override
//    public String toString() {
//        return "ID: " + id + ", Description: " + description + ", Due Date: " + dueDate + ", Completed: " + completed;
//    }
//}
//
//class TodoList {
//    private List<Task> tasks;
//
//    public TodoList() {
//        tasks = new ArrayList<>();
//    }
//
//    public void addTask(Task task) {
//        tasks.add(task);
//    }
//
//    public void markTaskAsCompleted(int taskId) {
//        for (Task task : tasks) {
//            if (task.getId() == taskId) {
//                task.setCompleted(true);
//                return;
//            }
//        }
//        System.out.println("Task with ID " + taskId + " not found.");
//    }
//
//    public void deleteTask(int taskId) {
//        tasks.removeIf(task -> task.getId() == taskId);
//    }
//
//    public void displayTodoList() {
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
//    }
//}
//
//public class TodoTaskMain {
//    public static void main(String[] args) {
//        TodoList todoList = new TodoList();
//        Scanner scanner = new Scanner(System.in);
//
//        // Example tasks
//        Task task1 = new Task(1, "Finish Java project", LocalDate.of(2024, 5, 20), false);
//        Task task2 = new Task(2, "Buy groceries", LocalDate.of(2024, 5, 18), false);
//        todoList.addTask(task1);
//        todoList.addTask(task2);
//
//        // Menu
//        int choice;
//        do {
//            System.out.println("\nTodo List Manager");
//            System.out.println("1. Add Task");
//            System.out.println("2. Mark Task as Completed");
//            System.out.println("3. Delete Task");
//            System.out.println("4. Display Todo List");
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter task description: ");
//                    String description = scanner.nextLine();
//                    System.out.print("Enter due date (YYYY-MM-DD): ");
//                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
////                    Task newTask = new Task(tasks.size() + 1, description, dueDate, false);
//                    todoList.addTask(newTask);
//                    System.out.println("Task added successfully.");
//                    break;
//                case 2:
//                    System.out.print("Enter ID of task to mark as completed: ");
//                    int taskId = scanner.nextInt();
//                    todoList.markTaskAsCompleted(taskId);
//                    break;
//                case 3:
//                    System.out.print("Enter ID of task to delete: ");
//                    int deleteId = scanner.nextInt();
//                    todoList.deleteTask(deleteId);
//                    System.out.println("Task deleted successfully.");
//                    break;
//                case 4:
//                    todoList.displayTodoList();
//                    break;
//                case 0:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
//            }
//        } while (choice != 0);
//
//        scanner.close();
//    }
//}