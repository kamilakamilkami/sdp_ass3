public class PrintTaskCommand implements Command{
    private Task task;

    public PrintTaskCommand(Task task){
        this.task = task;
    }
    @Override
    public void execute(){
        System.out.println("Executing task : " + task.getName());
    }
}




