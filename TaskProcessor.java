public class TaskProcessor {
    private TaskHandler chain;

    public TaskProcessor(){
        TaskHandler low = new LowPriorityHandler();
        TaskHandler medium = new MediumPriorityHandler();
        TaskHandler high = new HigherPriorityHandler();

        low.setNextHandler(medium);
        medium.setNextHandler(high);
        this.chain = low;
    }

    public void process(Task task){
        chain.handle(task);
    }
}
