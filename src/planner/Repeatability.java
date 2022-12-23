package planner;

public enum Repeatability {

    SINGLE("однократная"),
    DAILY("ежедневная"),
    WEEKLY("еженедельная"),
    MONTHLY("ежемесячная"),
    YEARLY("ежегодная");

    private final String name;

    Repeatability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
