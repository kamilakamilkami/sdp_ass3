public class TaskProcessingSystem {
    private TaskMediater mediater;
    private TaskList taskList;

    public TaskProcessingSystem() {
        // Initialize Mediator
        mediater = new TaskMediater();

        // Initialize Handlers
        TaskHandler low = new LowPriorityHandler();
        TaskHandler medium = new MediumPriorityHandler();
        TaskHandler high = new HigherPriorityHandler();

        // Set up the chain
        low.setNextHandler(medium);
        medium.setNextHandler(high);

        // Set Mediator for Handlers
        low.setMediater(mediater);
        medium.setMediater(mediater);
        high.setMediater(mediater);

        // Initialize Invoker
        TaskInvoker invoker = new TaskInvoker();
        mediater.setInvoker(invoker);

        // Set Mediator's Handler
        mediater.setHandler(low);

        // Initialize Task List
        taskList = new TaskList();
    }

    public void addTask(Task task) {
        taskList.addTask(task);
    }

    public void processAllTasks() {
        for (Task task : taskList) {
            Command command = new PrintTaskCommand(task);
            mediater.getInvoker().setCommand(command);
            mediater.notify(mediater.getHandler(), "process", task);
        }
    }
}