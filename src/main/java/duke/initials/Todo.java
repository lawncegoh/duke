package duke.initials;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    public String getData() {
        return "T" + "|" +
                (isDone ? "1" : "0") + "| " + description;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}