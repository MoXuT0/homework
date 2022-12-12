package animal;

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
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else this.livingEnvironment = livingEnvironment;
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
