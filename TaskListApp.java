import java.util.Scanner;

public class TaskListApp {
    private static TaskList taskList = new TaskList();
    private static int taskIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Task List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(taskIdCounter++, description);
                    taskList.addTask(task);
                    System.out.println("Task added.\n");
                    break;
                case 2:
                    System.out.print("Enter task ID to remove: ");
                    int taskIdToRemove = scanner.nextInt();
                    taskList.removeTask(taskIdToRemove);
                    System.out.println("Task removed.\n");
                    break;
                case 3:
                    taskList.listTasks();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.\n");
                    break;
            }
        }

        scanner.close();
    }
}
