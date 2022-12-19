package transport;

import java.util.Objects;

public class Mechanic <T extends Transport>{
    private final String name;
    private final String company;

    public Mechanic() {
        this(null,
                null);
    }

    public Mechanic(String name,
                    String company) {
        this.name = Utilities.validateString(name, "default");
        this.company = Utilities.validateString(company, "default");
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean doMaintenance(T transport) {
        return transport.passDiagnostics();
    }

    public void repair(T transport) {
        transport.repair();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Механик " + getName() + " из компании " + getCompany();
    }

}
