package todolist;

import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;

public class Exercise3 {
    public static void main(String[] args) {

        Task[] tasks = ToDoAPI.provideAllTasks(5);

        ToDoAPI.printTasksByPriority(tasks,Task.Priority.HIGH);
        ToDoAPI.printTasksOrderedByPriority(tasks);

    }
}
