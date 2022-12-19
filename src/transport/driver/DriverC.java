package transport.driver;

import transport.Truck;

public class DriverC extends Driver<Truck>{

    public DriverC(String fullName,
                   int experience,
                   Truck truck) {
        super(fullName,
                "C",
                experience,
                truck);
    }

}
