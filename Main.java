public class Main {
    public static void main(String[] args) {
        TaskProcessor processor = new TaskProcessor();

        Task task1 = new Task(" Task 1",1);
        Task task2 = new Task(" Task 2",2);
        Task task3 = new Task(" Task 3",3);

        processor.process(task1);
        processor.process(task2);
        processor.process(task3);

    }
}
