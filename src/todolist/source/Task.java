package todolist.source;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    public enum Priority {
        NO_PRIORITY,
        LOW,
        NORMAL,
        MEDIUM,
        HIGH,
        CRITICAL
    }

    public enum Status {
        OPEN,
        RESOLVE,
        DONE,
        CLOSE
    }

    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private Priority priority;
    private Status status;
    private Assignee assignee;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setStatus(Status status) {
        System.out.printf("%s task status changed to %s\n", title, status.toString());
        this.status = status;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    private Task() {

    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm");
        if (endDate == null || assignee == null) {
            if (endDate == null && assignee == null) {
                return String.format("Title: %s\n" +
                                "Description: %s\n" +
                                "Start Date: %s\n" +
                                "End Date: Not Set\n" +
                                "Priority: %s\n" +
                                "Status: %s\n" +
                                "Assignee: Not Set",
                        title, description, dateFormat.format(startDate), priority.toString(), status.toString());
            }
            if (endDate == null) {
                return String.format("Title: %s\n" +
                                "Description: %s\n" +
                                "Start Date: %s\n" +
                                "End Date: NotSet\n" +
                                "Priority: %s\n" +
                                "Status: %s\n" +
                                "Assignee: ↓\n%s",
                        title, description, dateFormat.format(startDate), priority.toString(), status.toString(), assignee.toString());
            }
            return String.format("Title: %s\n" +
                            "Description: %s\n" +
                            "Start Date: %s\n" +
                            "End Date: %s\n" +
                            "Priority: %s\n" +
                            "Status: %s\n" +
                            "Assignee: Not Set",
                    title, description, dateFormat.format(startDate), dateFormat.format(endDate), priority.toString(), status.toString());

        }
        return String.format("Title: %s\n" +
                        "Description: %s\n" +
                        "Start Date: %s\n" +
                        "End Date: %s\n" +
                        "Priority: %s\n" +
                        "Status: %s\n" +
                        "Assignee: ↓\n%s",
                title, description, dateFormat.format(startDate), dateFormat.format(endDate), priority.toString(), status.toString(), assignee.toString());
    }


    public static class Builder {

        private String title;
        private String description;
        private Date startDate;
        private Date endDate;
        private Priority priority;
        private Status status;
        private Assignee assignee;

        // TODO Question with empty title
        public Builder(String title) {
            if (title == null) {
                title = "Def Title";
            }
            this.title = title;
            this.status = Status.OPEN;
            this.description = " No Description";
            this.priority = Priority.NO_PRIORITY;
            this.startDate = new Date(System.currentTimeMillis());
        }

        public Builder withDescription(String description) {
            if (description != null) {
                this.description = description;
            }
            return this;
        }

        public Builder withEndDate(Date endDate) {
            if (endDate != null) {
                this.endDate = endDate;
            }
            return this;
        }

        public Builder withPriority(Priority priority) {
            if (priority != null) {
                this.priority = priority;
            }
            return this;
        }

        public Builder withAssignee(Assignee assignee) {
            if (assignee != null) {
                this.assignee = assignee;
            }
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.title = title;
            task.description = description;
            task.startDate = startDate;
            task.endDate = endDate;
            task.priority = priority;
            task.status = status;
            task.assignee = assignee;
            return task;
        }

    }

}
