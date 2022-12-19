package transport.driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fullName,
                   int experience,
                   Bus bus) {
        super(fullName,
                "D",
                experience,
                bus);
    }

}
