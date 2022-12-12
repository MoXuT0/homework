package animal;

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
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else this.livingEnvironment = livingEnvironment;
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
    public String toString() {
        return "Amphibian{" +
                "name= " + getName() +
                ", age=" + getAge() +
                ", livingEnvironment=" + livingEnvironment +
                '}';
    }

}