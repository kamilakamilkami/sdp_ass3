public abstract class TaskHandler {
    protected TaskHandler nextHandler;
    protected Mediater mediater;

    public void setNextHandler(TaskHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void setMediater(Mediater mediater){
        this.mediater = mediater;
    }

    public abstract void handle(Task task);

}
