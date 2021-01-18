package todolist;

import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;

public class Exercise2 {
    public static void main(String[] args) {

        Task[] tasks = ToDoAPI.provideAllTasks(7);
        tasks[2].setStatus(Task.Status.CLOSE);
        tasks[3].setStatus(Task.Status.DONE);
        tasks[4].setStatus(Task.Status.RESOLVE);

        ToDoAPI.printTasksByStatus(tasks,Task.Status.CLOSE);
        ToDoAPI.printTasksByStatus(tasks,Task.Status.DONE);
        ToDoAPI.printTasksByStatus(tasks,Task.Status.RESOLVE);
    }
}
