public class TodoCommand implements Command {
    private String taskName;

    public TodoCommand(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void execute(TaskList tasks, Storage storage) throws DukeException {
        Todo newTask = new Todo(taskName);
        tasks.add(newTask);
        System.out.println("Got it. I've added this task:");
        System.out.println(newTask);
        System.out.println("Now you have " + tasks.getSize() + " tasks in the list");
        storage.writeAll(tasks);
    }
}
