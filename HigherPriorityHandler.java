public class HigherPriorityHandler extends TaskHandler{
    @Override
    public void handle(Task task){
        if(task.getPriority()==3){
            System.out.println("HigherPriorityHandler processed task"+task.getName());
        } else if(nextHandler!=null){
            nextHandler.handle(task);
        }
    }
}
