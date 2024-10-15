public class SaveTaskCommand implements Command{
    private Task task;

    SaveTaskCommand(Task task){
        this.task = task;
    }
    @Override
    public void execute(){
        System.out.println("Saving the task : "+task.getName());
    }
}
