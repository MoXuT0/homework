package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void doDiagnostics() {
        if (!transports.isEmpty()) {
            Transport transport = transports.poll();
            if (!transport.passDiagnostics()) {
                transport.repair();
            }
        }
    }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "transports=" + transports +
                '}';
    }

}
