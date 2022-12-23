package planner;

public enum TaskType {

    PERSONAL("личная"),
    WORK("рабочая");

    private final String name;

    TaskType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
