package todolist;

import todolist.source.Assignee;
import todolist.source.Task;
import todolist.source.helpers.ToDoAPI;

public class Exercise4 {
    public static void main(String[] args) {

        Assignee andranik = new Assignee("Andranik", "Alajajyan", Assignee.Position.QA);

        Task[] tasks = ToDoAPI.provideAllTasks(5);
        tasks[2].setAssignee(andranik);


        ToDoAPI.printTasksByAssignee(tasks, andranik);

    }
}
