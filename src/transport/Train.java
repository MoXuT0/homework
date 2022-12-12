package transport;

public class Train extends Transport {

    private int cost;
    private int travelTime;
    private String departureStation;
    private String arrivalStation;
    private int carriages;

    public Train() {
        this(null,
                null,
                -1,
                null,
                null,
                -1,
                -1,
                -1,
                null,
                null,
                -1,
                0.00);
    }

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String colour,
                 double maxSpeed,
                 int cost,
                 int travelTime,
                 String departureStation,
                 String arrivalStation,
                 int carriages,
                 double fuelPercentage) {
        super(brand,
                model,
                year,
                country,
                colour,
                maxSpeed,
                fuelPercentage);
        setCost(cost);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setCarriages(carriages);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = Math.max(cost, 0);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 0);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = Utilities.validateString(departureStation, "default");
    }

    public String getArrivalStation () {
            return arrivalStation;
    }

    public void setArrivalStation (String arrivalStation){
        this.arrivalStation = Utilities.validateString(arrivalStation, "default");
    }

    public int getCarriages () {
        return carriages;
    }

    public void setCarriages (int carriages){
        this.carriages = Math.max(carriages, 1);
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand =" + getBrand() +
                ", model=" + getModel() +
                ", manufactureYear=" + getManufactureYear() +
                ", country=" + getCountry() +
                ", colour=" + getColour() +
                ", maxSpeed=" + getMaxSpeed() +
                ", cost=" + cost +
                ", travelTime=" + travelTime +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", carriages=" + carriages +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
        setFuelPercentage(100.00);
    }

}
