public class Event extends Task {
    private String time;

    public Event(String name, String time) {
        super(name);
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        return "[" + TaskType.E +"]" + "[" + this.getStatusIcon() + "] " + this.getName() +  " (at: " + this.getTime() + ")";
    }
    @Override
    public String toCSV() {
        return TaskType.E + "," + this.getStatusIcon()  + "," + this.getName() + "," + this.getTime();
    }
}
