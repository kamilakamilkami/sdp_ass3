public class LowPriorityHandler extends TaskHandler{
    @Override
    public void handle(Task task){
        if (task.getPriority()==1){
            System.out.println("LowPriorityHandler processed task " + task.getName());
            mediater.notify(this,"executeCommand",task);
        } else if(nextHandler != null){
            nextHandler.handle(task);
        }
    }
}

