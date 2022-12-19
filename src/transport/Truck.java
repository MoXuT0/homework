package transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public enum WeightCapacity {

        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float minWeight;
        private final Float maxWeight;

        WeightCapacity(Float minWeight, Float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public Float getMinWeight() {
            return minWeight;
        }

        public Float getMaxWeight() {
            return maxWeight;
        }

    }

    private WeightCapacity weightCapacity;

    public Truck() {
        this(null,
                null,
                -1,
                null);
    }

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 WeightCapacity weightCapacity) {
        super(brand,
                model,
                engineVolume);
        setWeightCapacity(weightCapacity);
    }

    public WeightCapacity getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(WeightCapacity weightCapacity) {
        this.weightCapacity = Objects.requireNonNull(weightCapacity);
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
    public void printType() {
        if (weightCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        }
        else if (weightCapacity.getMinWeight() == null) {
            System.out.println("Грузоподъемность авто до " + weightCapacity.getMaxWeight());
        }
        else if (weightCapacity.getMaxWeight() == null) {
            System.out.println("Грузоподъемность авто от " + weightCapacity.getMinWeight());
        } else
            System.out.println("Грузоподъемность авто от " + weightCapacity.getMinWeight() + " до " + weightCapacity.getMaxWeight());
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен");
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
