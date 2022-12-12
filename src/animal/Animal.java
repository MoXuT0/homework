package animal;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private int age;

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public Animal() {
        this(null,
                -1);
    }

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name +
                ", age=" + age +
                '}';
    }

}
