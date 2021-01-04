package todolist;

import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;
import todolist.source.helpers.ToDoDataProvider;

public class Exercise6 {
    public static void main(String[] args) {

        Task[] tasks = ToDoAPI.provideAllTasks(5);
        tasks[2].setEndDate(ToDoDataProvider.dateFromString("2021-06-06 06:06"));

        ToDoAPI.printTasksByEndDate(tasks, ToDoDataProvider.dateFromString("2021-06-06 06:06"));

    }
}
