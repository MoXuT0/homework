package transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing{

    public enum BodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String name;

        BodyType(String name) {
            this.name = Utilities.validateString(name, "default");
        }

        @Override
        public String toString() {
            return name;
        }

    }

    private BodyType bodyType;

    public Car() {
        this(null,
                null,
                -1,
                null);
    }

    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType) {
        super(brand,
                model,
                engineVolume);
        setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = Objects.requireNonNull(bodyType);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал ехать");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил ехать");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        } else
            System.out.println("Тип кузова авто - " + bodyType);
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextDouble(5, 15);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextDouble(1, 200);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", volume=" + getEngineVolume() +
                "}";
    }

}
