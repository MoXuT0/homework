package transport;

import jdk.jshell.execution.Util;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;

    public abstract void startMoving();
    public abstract void stopMoving();

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

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
