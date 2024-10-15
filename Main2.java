public class Main2 {
    public static void main(String[] args) {
        Task task = new Task("Task1",1);
        Command printcommand = new PrintTaskCommand(task);
        Command savecommand = new SaveTaskCommand(task);

        TaskInvoker invoker = new TaskInvoker();
        invoker.setCommand(printcommand);
        invoker.executeCommand();


        invoker.setCommand(savecommand);
        invoker.executeCommand();

    }

}
