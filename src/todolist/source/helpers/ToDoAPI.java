package todolist.source.helpers;

import todolist.source.Assignee;
import todolist.source.Task;

import java.util.Date;

public class ToDoAPI {

    public static Task[] provideAllTasks(int quantity) {
        System.out.printf("--------------------PROVIDE %d TASKS\n", quantity);
        Task[] tasks = ToDoDataProvider.provideRandomTasks(quantity);
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
            System.out.println("--------------------");
        }
        return tasks;
    }

    public static void printAllTasks(Task[] tasks) {
        System.out.println("--------------------PRINT TASKS");
        for (Task task : tasks) {
            System.out.println(task);
            System.out.println("--------------------");
        }
    }

    public static void printTasksByStatus(Task[] tasks, Task.Status status) {
        System.out.printf("--------------------PRINT TASKS WITH STATUS '%s'\n", status.toString());
        for (Task task : tasks) {
            if (task.getStatus().equals(status)) {
                System.out.println(task);
                System.out.println("--------------------");
            }
        }
    }

    public static void printTasksByPriority(Task[] tasks, Task.Priority priority) {
        System.out.printf("--------------------PRINT TASKS WITH PRIORITY '%s'\n", priority.toString());
        for (Task task : tasks) {
            if (task.getPriority().equals(priority)) {
                System.out.println(task);
                System.out.println("--------------------");
            }
        }
    }

    public static void printTasksOrderedByPriority(Task[] tasks) {
        System.out.println("--------------------PRINT TASKS ORDERED BY PRIORITY");
        for (Task.Priority priority : Task.Priority.values()) {
            for (Task task : tasks) {
                if (task.getPriority().equals(priority)) {
                    System.out.println(task);
                    System.out.println("--------------------");
                }
            }
        }
    }

    public static void printTasksByAssignee(Task[] tasks, Assignee assignee) {
        System.out.printf("--------------------PRINT TASKS WITH ASSIGNEE \n '%s'\n\n", assignee.toString());
        for (Task task : tasks) {
            if (task.getAssignee() == assignee) {
                System.out.println(task);
                System.out.println("--------------------");
            }
        }
    }

    public static void deleteTaskWhichHasStatus(Task[] tasks, Task.Status status) {
        System.out.printf("--------------------DELETE TASKS WITH STATUS '%s'\n", status.toString());
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].getStatus().equals(status)) {
                System.out.printf("%s deleted\n", tasks[i].getTitle());
                System.out.println("--------------------");
                tasks[i] = null;
            }
        }
    }

    public static void printTasksByEndDate(Task[] tasks, Date endDate) {
        System.out.printf("--------------------PRINT TASKS WITH END DATE '%s'\n\n", endDate.toString());
        for (Task task : tasks) {
            if (task.getEndDate().equals(endDate)) {
                System.out.println(task);
                System.out.println("--------------------");
            }
        }
    }
}
