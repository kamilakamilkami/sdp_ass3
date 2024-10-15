public class Main3 {
    public static void main(String[] args) {
        TaskMediater mediator = new TaskMediater();

        TaskHandler low = new LowPriorityHandler();
        TaskHandler medium = new MediumPriorityHandler();
        TaskHandler high = new HigherPriorityHandler();

        low.setNextHandler(medium);
        medium.setNextHandler(high);

        low.setMediater(mediator);
        medium.setMediater(mediator);
        high.setMediater(mediator);

        TaskInvoker invoker = new TaskInvoker();
        invoker.setCommand(new PrintTaskCommand(new Task(" Task1", 1)));
        mediator.setInvoker(invoker);

        mediator.setHandler(low);

        Task task = new Task("Task1", 1);
        mediator.notify(low, "process", task);
    }
}
