package todolist.source.helpers;

import functionsobjects.FunctionsObjects;
import functionsobjects.persons.Company;
import todolist.source.Assignee;
import todolist.source.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ToDoDataProvider {

    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("yyyy-mm-dd hh:mm");
    private static final Date invalidDate = new Date(0);

    public static Assignee[] assignees;

    static String[] firstNames = {"Peter", "Andrew", "James", "Philip", "Bartholomew", "Matthew", "Thomas", "James", "Simon", "Judas", "Judas Iscariot"};
    static String[] lastNames = {"A.", "B.", "C.", "D.", "E.", "F", "G.", "H.", "J.", "K.", "L."};

    public static Task[] tasks;

    static String[] titles = {"Task Title 1", "Task Title 2", "Task Title 3",
            "Task Title 4", "Task Title 5", "Task Title 6",
            "Task Title 7", "Task Title 8", "Task Title 9", "Task Title 10", null};
    static String[] descriptions = {"Task Description 1", "Task Description 2", "Task Description 3",
            "Task Description 4", "Task Description 5", "Task Description 6",
            "Task Description 7", "Task Description 8", "Task Description 9", "Task Description 10", null};
    static Date[] endDates = {dateFromString("2021-05-12 15:45"), dateFromString("2021-04-19 06:45"), dateFromString("2021-02-12 11:00"),
            dateFromString("2021-01-16 08:01"), dateFromString("2021-11-04 12:00"), dateFromString("2021-03-08 09:00"), null};

    public static Date dateFromString(String date) {
        try {
            return dateFormat.parse(date);
        } catch (ParseException dfe) {
            return invalidDate;
        }
    }

    private static Date getRandomDateFrom(Date[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    private static Assignee.Position getRandomAssigneePosition() {
        Random random = new Random();
        return Assignee.Position.values()[random.nextInt(Assignee.Position.values().length)];
    }

    private static Task.Priority getRandomTaskPriority() {
        Random random = new Random();
        return Task.Priority.values()[random.nextInt(Task.Priority.values().length)];
    }

    private static String getRandomStringFrom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    private static Assignee getRandomAssigneeFrom(Assignee[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public static Assignee[] provideAssignees(int quantity) {
        assignees = new Assignee[quantity];
        for (int i = 0; i < quantity; ++i) {
            if (i == quantity - 1 && i > 0) {
                break;
            }
            String firstName = getRandomStringFrom(firstNames);
            String lastName = getRandomStringFrom(lastNames);
            Assignee.Position position = getRandomAssigneePosition();
            Assignee assignee = new Assignee(firstName, lastName, position);
            assignees[i] = assignee;
        }
        return assignees;
    }

    public static Task[] provideRandomTasks(int quantity) {
        Assignee[] assignees = provideAssignees(quantity);
        tasks = new Task[quantity];
        for (int i = 0; i < quantity; ++i) {
            Task task = new Task.Builder(getRandomStringFrom(titles))
                    .withDescription(getRandomStringFrom(descriptions))
                    .withAssignee(getRandomAssigneeFrom(assignees))
                    .withEndDate(getRandomDateFrom(endDates))
                    .withPriority(getRandomTaskPriority())
                    .build();
            tasks[i] = task;
        }
        return tasks;
    }


}
