package duke.initials;

public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public String getData() {
        return "D" + "|" +
                (isDone ? "1" : "0") + "| " + description + "| " + this.by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " + by + ")";
    }
}
