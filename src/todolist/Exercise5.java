package todolist;

import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;

public class Exercise5 {
    public static void main(String[] args) {

        Task[] tasks = ToDoAPI.provideAllTasks(5);
        tasks[2].setStatus(Task.Status.DONE);

        ToDoAPI.deleteTaskWhichHasStatus(tasks,Task.Status.DONE);

        //TODO Remove from array or add to array.
        ToDoAPI.printAllTasks(tasks);

    }
}
