package transport;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private int supportAmount;

    public Sponsor() {
        this(null,
                -1);
    }

    public Sponsor(String name,
                   int supportAmount) {
        this.name = Utilities.validateString(name, "default");
        setSupportAmount(supportAmount);
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = Math.max(supportAmount, 0);
    }

    public void sponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд %d%n", name, supportAmount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Спонсор " + getName() + " с суммой " + getSupportAmount();
    }

}