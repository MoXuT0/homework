package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int manufactureYear;
    private final String country;
    private String colour;
    private double maxSpeed;
    private double fuelPercentage;

    public Transport () {
        this(null,
                null,
                -1,
                null,
                null,
                -1,
                0.00);
    }

    public Transport(String brand,
                     String model,
                     int manufactureYear,
                     String country,
                     String colour,
                     double maxSpeed,
                     double fuelPercentage) {
        this.brand = Utilities.validateString(brand, "default");
        this.model = Utilities.validateString(model, "default");
        this.manufactureYear = Math.max(manufactureYear, 2000);
        this.country = Utilities.validateString(country, "Россия");
        setColour(colour);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = Utilities.validateString(colour, "белый");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = Double.max(maxSpeed, 0);
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0.00 || fuelPercentage > 100.00) {
            this.fuelPercentage = 0.00;
        } else this.fuelPercentage = fuelPercentage;
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", country='" + country + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelPercentage=" + fuelPercentage +
                '}';
    }

}
