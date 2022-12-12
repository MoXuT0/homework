package animal;

import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian() {
        this(null,
                -1,
                null);
    }

    public Amphibian(String name,
                     int age,
                     String livingEnvironment) {
        super(name,
                age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Utilities.validateString(livingEnvironment, "default");
    }

    public void hunt() {
        System.out.println("охотится");
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
        System.out.println("ползает или плавает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Amphibian amphibian = (Amphibian) o;
        return livingEnvironment.equals(amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + livingEnvironment +
                '}';
    }

}