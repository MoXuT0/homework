package animal;

import java.util.Objects;

public abstract class Avian extends Animal {

    private String livingEnvironment;

    public Avian() {
        this(null,
                -1,
                null);
    }

    public Avian(String name,
                int age,
                String livingEnvironment) {
        super(name,
                age);
        setLivingEnvironment(livingEnvironment);
    }

    public abstract void hunt();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Utilities.validateString(livingEnvironment, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Avian avian = (Avian) o;
        return livingEnvironment.equals(avian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Avian{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + livingEnvironment +
                '}';
    }

}
