public class TaskProcessingSystem {
    private TaskMediater mediater;
    private TaskList taskList;

    public TaskProcessingSystem() {

        mediater = new TaskMediater();

        TaskHandler low = new LowPriorityHandler();
        TaskHandler medium = new MediumPriorityHandler();
        TaskHandler high = new HigherPriorityHandler();

        low.setNextHandler(medium);
        medium.setNextHandler(high);


        low.setMediater(mediater);
        medium.setMediater(mediater);
        high.setMediater(mediater);

        TaskInvoker invoker = new TaskInvoker();
        mediater.setInvoker(invoker);
        mediater.setHandler(low);

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