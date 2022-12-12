package animal;

public class Flying extends Avian {
    private String movementType;

    public Flying() {
        this(null,
                -1,
                null,
                null);
    }

    public Flying(String name,
                  int age,
                  String livingEnvironment,
                  String movementType) {
        super(name,
                age,
                livingEnvironment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "default";
        } else this.movementType = movementType;
    }

    public void fly() {
        System.out.println("летает");
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void move() {
        System.out.println("двигается");
    }

    @Override
    public void hunt() {
        System.out.println("охотится");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + getLivingEnvironment() +
                ", movementType=" + movementType +
                '}';
    }

}
