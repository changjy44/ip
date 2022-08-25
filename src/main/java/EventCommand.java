public class EventCommand implements Command {
    private String eventName;
    private String eventLocationString;

    public EventCommand(String eventName, String eventLocationString) {
        this.eventName = eventName;
        this.eventLocationString = eventLocationString;
    }

    @Override
    public void execute(TaskList tasks, Storage storage) throws DukeException {
        Event newTask = new Event(eventName,eventLocationString);
        tasks.add(newTask);
        System.out.println("Got it. I've added this task:");
        System.out.println(newTask);
        System.out.println("Now you have " + tasks.getSize() + " tasks in the list");
        storage.writeAll(tasks);
    }
}
