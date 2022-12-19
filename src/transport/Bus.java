package transport;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    public enum SeatCapacity{

        VERY_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);

        private final Integer minSeats;
        private final Integer maxSeats;

        SeatCapacity(Integer minSeats, Integer maxSeats) {
            this.minSeats = minSeats;
            this.maxSeats = maxSeats;
        }

        public Integer getMinSeats() {
            return minSeats;
        }

        public Integer getMaxSeats() {
            return maxSeats;
        }

    }

    private SeatCapacity seatCapacity;

    public Bus() {
        this(null,
                null,
                -1,
                null);
    }

    public Bus(String brand,
               String model,
               double engineVolume,
               SeatCapacity seatCapacity) {
        super(brand,
                model,
                engineVolume);
        setSeatCapacity(seatCapacity);
    }

    public SeatCapacity getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(SeatCapacity seatCapacity) {
        this.seatCapacity = Objects.requireNonNull(seatCapacity);
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
    public void printType() {
        if (seatCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else if (seatCapacity.getMinSeats() == null) {
            System.out.println("Вместимость авто до " + seatCapacity.getMaxSeats());
        } else if (seatCapacity.getMaxSeats() == null) {
            System.out.println("Вместимость авто от " + seatCapacity.getMinSeats());
        } else
            System.out.println("Вместимость авто от " + seatCapacity.getMinSeats() + " до " + seatCapacity.getMaxSeats());
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобусу " + getBrand() + getModel() +" диагностика не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + getModel() + " починен");
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
