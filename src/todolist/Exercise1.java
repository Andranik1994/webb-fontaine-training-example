package todolist;

import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;

public class Exercise1 {
    public static void main(String[] args) {

        Task[] tasks = ToDoAPI.provideAllTasks(5);

    }

}
