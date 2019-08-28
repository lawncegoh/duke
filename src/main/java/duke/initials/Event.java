package duke.initials;

public class Event extends Task {
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    public String getData() {
        return "E" + "|" +
                (isDone ? "1" : "0") + "| " + description + "| " + this.at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at: " + at + ")";
    }
}