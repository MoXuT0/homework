package animal;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String livingEnvironment;
    private double movementSpeed;

    public abstract void walk();

    public Mammal() {
        this(null,
                -1,
                null,
                -1);
    }

    public Mammal(String name,
                  int age,
                  String livingEnvironment,
                  double movementSpeed) {
        super(name,
                age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else this.livingEnvironment = livingEnvironment;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        if (movementSpeed <= 0) {
            this.movementSpeed = 1;
        } else this.movementSpeed = movementSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.movementSpeed, movementSpeed) == 0 && livingEnvironment.equals(mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + livingEnvironment +
                ", movementSpeed=" + movementSpeed +
                '}';
    }

}
