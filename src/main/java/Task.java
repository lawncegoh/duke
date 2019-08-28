public abstract class Task {
    protected String description;
    protected boolean isDone;
    protected String date;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public abstract String getData();

    @Override
    public String toString() {
        return '[' + getStatusIcon() + "] " + description;
    }
}