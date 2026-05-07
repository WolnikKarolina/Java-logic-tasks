import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ToDoList {

    Scanner sc = new Scanner(System.in);
    public record Task(String name, String description, Priority priority) {
    }
    Queue<Task> tasks = new PriorityQueue<>(Comparator.comparing(Task::priority).reversed());
    public void addTask(){
        System.out.println("Podaj nazwe zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis");
        String description = sc.nextLine();
        System.out.println("Podaj priorytet - LOW, MEDIUM, HIGH");
        Priority priority = Priority.valueOf(sc.nextLine());
        Task task = new Task(name, description, priority);
        tasks.add(task);
    }

    public void printTasks(){
        tasks.forEach(System.out::println);
    }

    public void doTask(){
        tasks.poll();
    }

    public enum Priority {
        LOW, MEDIUM, HIGH;
    }

    static void main(String[] args) {
        ToDoList td = new ToDoList();
        td.addTask();
        td.addTask();
        td.addTask();
        td.addTask();
        td.doTask();
        td.printTasks();
    }
}