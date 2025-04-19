package TaskManager;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskSystem taskSystem = new TaskSystem();
        TaskManager taskManager = taskSystem.getTaskManager();

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Next Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Display Next Task");
            System.out.println("6. Display All Completed Tasks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority (integer): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter task status (e.g., pending): ");
                    String status = scanner.nextLine();
                    taskManager.addTask(new Task(title, description, priority, status));
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    Task removedTask = taskManager.removeTask();
                    if (removedTask == null) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("Removed task: " + removedTask);
                    }
                    break;
                case 3:
                    System.out.print("Enter task title to mark as completed: ");
                    String taskToComplete = scanner.nextLine();
                    boolean found = false;
                    for (Task task : taskManager.getTaskQueue()) {
                        if (task.getTitle().equalsIgnoreCase(taskToComplete)) {
                            taskManager.setStatus(task, "completed");
                            System.out.println("Task marked as completed.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Task not found.");
                    }
                    break;
                case 4:
                    taskManager.displayAllTasks();
                    break;
                case 5:
                    taskManager.displayNext();
                    break;
                case 6:
                    taskManager.displayAllCompleted();
                    break;
                case 7:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
