import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public void listTasks() {
        System.out.println("Task List:");
        for (Task task : tasks) {
            System.out.println(task.getId() + ": " + task.getDescription());
        }
        System.out.println();
    }
}
