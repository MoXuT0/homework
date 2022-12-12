package transport;

public class Bus extends Transport{

    public Bus(String brand,
               String model,
               int manufactureYear,
               String country,
               String colour,
               double maxSpeed,
               double fuelPercentage) {
        super(brand,
                model,
                manufactureYear,
                country,
                colour,
                maxSpeed,
                fuelPercentage);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
        setFuelPercentage(100.00);
    }

}
