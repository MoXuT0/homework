package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    public Bus() {
        this(null,
                null,
                -1);
    }

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand,
                model,
                engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал ехать");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил ехать");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }

    @Override
    public double bestLapTime() {
        return ThreadLocalRandom.current().nextDouble(15, 25);
    }

    @Override
    public double maxSpeed() {
        return ThreadLocalRandom.current().nextDouble(1, 120);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", volume=" + getEngineVolume() +
                '}';
    }

}
