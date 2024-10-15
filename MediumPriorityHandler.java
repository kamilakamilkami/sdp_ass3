public class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handle(Task task){
        if (task.getPriority()==2){
            System.out.println("MediumPriorityHandler processed task"+task.getName());
        } else if(nextHandler != null){
            nextHandler.handle(task);
        }
    }
}
