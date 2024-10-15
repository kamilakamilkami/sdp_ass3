public class Main4 {
    public static void main(String[] args) {
        TaskProcessingSystem system = new TaskProcessingSystem();
        system.addTask(new Task(" Task1",1));
        system.addTask(new Task(" Task2",2));
        system.addTask(new Task(" Task2",3));

        system.processAllTasks();
    }
}
