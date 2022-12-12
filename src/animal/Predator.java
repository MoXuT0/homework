package animal;

import java.util.Objects;

public class Predator extends Mammal {
    private String foodType;

    public Predator() {
        this(null,
                -1,
                null,
                -1,
                null);
    }

    public Predator(String name,
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

    public void hunt() {
        System.out.println("охотится");
    }

    @Override
    public void eat() {
        System.out.println("ест мясо");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return foodType.equals(predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + getLivingEnvironment() +
                ", movementSpeed=" + getMovementSpeed() +
                ", foodType=" + foodType +
                '}';
    }

}
