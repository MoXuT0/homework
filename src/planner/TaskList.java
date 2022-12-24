package planner;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TaskList {

    private final Map<Integer, Task> taskList = new LinkedHashMap<>();

    public void addTask(Task task) {
        if (taskList.containsKey(task.getId())) {
            throw new RuntimeException("Такая задача уже есть");
        } else {
            taskList.put(task.getId(), task);
        }
    }

    public void removeTask(int id) {
        taskList.remove(id);
    }

    public void printTasks() {
        for (Map.Entry<Integer, Task> entry : taskList.entrySet()) {
            System.out.println(entry);
        }
    }

    public Set<Task> getTasksForDate(LocalDate date){
        Set<Task> tasksForDate = new HashSet<>();
        for (Task task : taskList.values()) {
            if (task.nextDate(date)) {
                tasksForDate.add(task);
            }
        }
        return tasksForDate;
    }

    @Override
    public String toString() {
        return taskList.values().toString();
    }

}
