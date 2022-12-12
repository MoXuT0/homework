package animal;

public class Herbivore extends Mammal {
    private String foodType;

    public Herbivore() {
        this(null,
                -1,
                null,
                -1,
                null);
    }

    public Herbivore(String name,
                     int age,
                     String livingEnvironment,
                     double movementSpeed,
                     String foodType) {
        super(name,
                age,
                livingEnvironment,
                movementSpeed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if (foodType == null || foodType.isEmpty() || foodType.isBlank()) {
            this.foodType = "default";
        } else this.foodType = foodType;
    }

    public void graze() {
        System.out.println("пасется");
    }

    @Override
    public void eat() {
        System.out.println("ест траву");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void move() {
        System.out.println("бегает");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + getLivingEnvironment() +
                ", movementSpeed=" + getMovementSpeed() +
                ", foodType=" + foodType +
                '}';
    }
}