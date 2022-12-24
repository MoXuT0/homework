package planner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Repeatable {

    private String title;
    private String description;
    private TaskType taskType;
    private LocalDateTime dateTime;
    private Repeatability repeatability;
    private final int id;
    private static int counter = 1;

    public Task(){
        this(null,
                null,
                null,
                null,
                null);
    }

    public Task(String title,
                String description,
                TaskType taskType,
                LocalDateTime dateTime,
                Repeatability repeatability) {
        setTitle(title);
        setDescription(description);
        setTaskType(taskType);
        setDateTime(dateTime);
        setRepeatability(repeatability);
        this.id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new IllegalArgumentException("Неправильно указано описание");
        } else {
            this.title = title;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isEmpty() || description.isBlank()) {
            throw new IllegalArgumentException("Неправильно указано описание");
        } else {
            this.description = description;
        }
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = Objects.requireNonNull(taskType);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = Objects.requireNonNull(dateTime);
    }

    public Repeatability getRepeatability() {
        return repeatability;
    }

    public void setRepeatability(Repeatability repeatability) {
        this.repeatability = Objects.requireNonNull(repeatability);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean nextDate(LocalDate localDate) {
        switch (repeatability) {
            case SINGLE:
                return localDate.equals(dateTime.toLocalDate());
            case DAILY:
                return localDate.equals(dateTime.toLocalDate())
                        || localDate.isAfter(dateTime.toLocalDate());
            case WEEKLY:
                return localDate.equals(dateTime.toLocalDate())
                        || (localDate.isAfter(dateTime.toLocalDate())
                        && localDate.getDayOfWeek().equals(dateTime.toLocalDate().getDayOfWeek()));
            case MONTHLY:
                return localDate.equals(dateTime.toLocalDate())
                        || (localDate.isAfter(dateTime.toLocalDate())
                        && localDate.getDayOfMonth() == dateTime.toLocalDate().getDayOfMonth());
            case YEARLY:
                return localDate.equals(dateTime.toLocalDate())
                        || (localDate.isAfter(dateTime.toLocalDate())
                        && localDate.getDayOfMonth() == dateTime.toLocalDate().getDayOfMonth()
                        && localDate.getMonth().equals(dateTime.toLocalDate().getMonth()));
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id +
                ". " + title +
                ". " + description +
                ". " + taskType.getName() +
                ". " + (dateTime.toLocalDate() + " " + dateTime.toLocalTime()) +
                ". " + repeatability.getName() + ".\n";
    }

}
