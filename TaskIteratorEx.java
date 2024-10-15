public class TaskIteratorEx {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Task1",1));
        taskList.addTask(new Task("task2",2));
        taskList.addTask(new Task("Task3",3));

        for (Task task:taskList){
            System.out.println("Iterating task : "+task.getName());
        }
    }
}
