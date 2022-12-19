package transport.driver;

import transport.Car;

public class DriverB extends Driver<Car>{

    public DriverB(String fullName,
                   int experience,
                   Car car) {
        super(fullName,
                "B",
                experience,
                car);
    }

}
