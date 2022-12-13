package driver;

import transport.Transport;
import transport.Utilities;

import java.util.Objects;

public abstract class Driver<T extends Transport> {

    private final String fullName;
    private String license;
    private int experience;
    private T transport;

    public Driver() {
        this(null,
                null,
                -1,
                null);
    }

    public Driver(String fullName,
                  String license,
                  int experience,
                  T transport) {
        this.fullName = Utilities.validateString(fullName, "default");
        setLicense(license);
        setExperience(experience);
        setTransport(transport);
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = Utilities.validateString(license, "default");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 0);
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = Objects.requireNonNull(transport);
    }

    public void startMove() {
        System.out.println("Водитель " + getFullName() + " начал ехать");
    }

    public void stopMove() {
        System.out.println("Водитель " + getFullName() + " закончил ехать");
    }

    public void refuelCar() {
        System.out.println("Водитель " + getFullName() + " заправляет свой " + transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public String toString() {
        return "Водитель " + getFullName() + " управляет автомобилем " +
                transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде";
    }

}
