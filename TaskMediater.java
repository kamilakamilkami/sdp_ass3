public class TaskMediater implements Mediater{
    private TaskHandler handler;
    private TaskInvoker invoker;

    public void setHandler(TaskHandler handler){
        this.handler = handler;
    }

    public void setInvoker(TaskInvoker invoker){
        this.invoker = invoker;
    }

    @Override
    public void notify(TaskHandler handler, String event, Task task) {
        if(event.equals("process")){
            this.handler.handle(task);
        } else if(event.equals("executeCommand")){
            this.invoker.executeCommand();
        }
    }

    public TaskHandler getHandler() {
        return handler;
    }

    // Getter for invoker
    public TaskInvoker getInvoker() {
        return invoker;
    }

}
