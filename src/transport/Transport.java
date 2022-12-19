package transport;

import transport.driver.Driver;

import java.util.*;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;

    private final Set<Transport> racingTransport = new HashSet<>();
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();
    public abstract boolean passDiagnostics();
    public abstract void repair();

    public Transport() {
        this(null,
                null,
                -1);
    }

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        this.brand = Utilities.validateString(brand, "default");
        this.model = Utilities.validateString(model, "default");
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Double.max(engineVolume, 0);
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Transport> getRacingTransport() {
        return racingTransport;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
