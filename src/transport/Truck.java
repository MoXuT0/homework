package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public Truck() {
        this(null,
                null,
                -1);
    }

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand,
                model,
                engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал ехать");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил ехать");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextDouble(10, 20);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextDouble(1, 160);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", volume=" + getEngineVolume() +
                '}';
    }

}
