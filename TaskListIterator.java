import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class TaskListIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int position = 0;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return tasks.get(position++);
    }
}
