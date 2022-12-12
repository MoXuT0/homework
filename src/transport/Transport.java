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
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else this.model = model;
        if (manufactureYear <= 0) {
            this.manufactureYear = 2000;
        } else this.manufactureYear = manufactureYear;
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else this.country = country;
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
        if (colour == null || colour.isEmpty() || colour.isBlank()) {
            this.colour = "белый";
        } else this.colour = colour;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 1;
        } else this.maxSpeed = maxSpeed;
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
