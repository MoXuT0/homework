package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key() {
            this(false, false);
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public static class Insurance{

        private final LocalDate expirationDate;
        private final double cost;
        private final String number;

        public Insurance() {
            this(null, -1, null);
        }

        public Insurance(LocalDate expirationDate, double cost, String number) {
            this.expirationDate = Objects.requireNonNullElseGet(expirationDate, () -> LocalDate.now().plusDays(365));
            this.cost = Double.max(cost, 0);
            this.number = Utilities.validateString(number, "123456789");
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpirationDate() {
            if (expirationDate.isBefore(LocalDate.now()) || expirationDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expirationDate=" + expirationDate +
                    ", cost=" + cost +
                    ", number='" + number +
                    '}';
        }

    }


    private double engineVolume;
    private String transmission;
    private final String body;
    private String registration;
    private final int seats;
    private boolean seasonalTires;
    private Key key;
    private Insurance insurance;

    public Car() {
        this(null,
                null,
                -1,
                null,
                null,
                -1,
                -1,
                null,
                null,
                null,
                -1,
                false,
                null,
                null,
                0.00);
    }

    public Car(String brand,
               String model,
               int manufactureYear,
               String country,
               String colour,
               double maxSpeed,
               double engineVolume,
               String transmission,
               String body,
               String registration,
               int seats,
               boolean seasonalTires,
               Key key,
               Insurance insurance,
               double fuelPercentage) {
        super(brand,
                model,
                manufactureYear,
                country,
                colour,
                maxSpeed,
                fuelPercentage);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (body == null || body.isEmpty() || body.isBlank()) {
            this.body = "default";
        } else this.body = body;
        setRegistration(registration);
        this.seats = Math.max(seats, 1);
        setSeasonalTires(seasonalTires);
        this.key = Objects.requireNonNullElseGet(key, Key::new);
        this.insurance = Objects.requireNonNullElseGet(insurance, Insurance::new);
    }

    public String getBody() {
        return body;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Double.max(engineVolume, 1.5);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Utilities.validateString(transmission, "default");
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        if (registration == null || registration.isEmpty() || registration.isBlank()) {
            this.registration = "default";
        }else if (!isCorrectRegistration(registration)){
            this.registration = "Неверный номер";
        } else this.registration = registration;
    }

    public boolean isCorrectRegistration(String registration) {
        if (registration.length() != 9) {
            return false;
        }
        char[] chars = registration.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;

    }

    public boolean isSeasonalTires() {
        return seasonalTires;
    }

    public void setSeasonalTires(boolean seasonalTires) {
        this.seasonalTires = seasonalTires;
    }

    public void changeTires() {
        seasonalTires = !seasonalTires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand =" + getBrand() +
                ", model=" + getModel() +
                ", manufactureYear=" + getManufactureYear() +
                ", country=" + getCountry() +
                ", colour=" + getColour() +
                ", maxSpeed=" + getMaxSpeed() +
                ", engineVolume=" + engineVolume +
                ", transmission=" + transmission +
                ", body=" + body +
                ", registration=" + registration +
                ", seats=" + seats +
                ", seasonalTires=" + (isSeasonalTires() ? "летняя" : "зимняя") +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
        setFuelPercentage(100.00);
    }

}
