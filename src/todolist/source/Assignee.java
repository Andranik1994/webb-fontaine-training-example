package todolist.source;

public class Assignee {

    public enum Position {
        QA("Quality Assurance Engineer"),
        ENGINEER("Software Engineer"),
        PM("Project Manager"),
        PO("Project Owner");

        private final String name;

        Position(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }

    }

    private String firstName;
    private String lastName;
    private Position position;

    public Assignee(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\nLast Name: %s\nPosition: %s", firstName, lastName, position.toString());
    }
}
