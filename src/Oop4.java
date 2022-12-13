import transport.*;
import driver.*;

public class Oop4 {

    public static void main(String[] args) {

        // Домашнее задание 1
        System.out.println("Домашнее задание 1");

        // Задание 1
        System.out.println("Задание 1");

        Car car1 = new Car("Ford", "Focus", 3.1);
        Car car2 = new Car("Toyota", "Camri", 2.8);
        Car car3 = new Car("Audi", "A8", 4.0);
        Car car4 = new Car("BMW", "7", 3.5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Truck truck1 = new Truck("Hyundai", "HD 120", 4.5);
        Truck truck2 = new Truck("Mercedes-Benz", "Atego 818", 5.1);
        Truck truck3 = new Truck("ГАЗ", "33081", 3.9);
        Truck truck4 = new Truck("МАЗ", "5536A3", 4.1);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        Bus bus1 = new Bus("SIMAZ", "2258-538", 4.6);
        Bus bus2 = new Bus("Kia", "Granbird", 5.4);
        Bus bus3 = new Bus("Volvo", "7900", 5.0);
        Bus bus4 = new Bus("ЛАЗ", "AeroLAZ", 3.8);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");

        // Задание 2
        System.out.println("Задание 2");

        System.out.println("См. Competing.java");

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 3
        System.out.println("Задание 3");

        System.out.println("См. классы Сar, Truck и Bus");

        // Домашнее задание 4
        System.out.println("Домашнее задание 4");

        // Задание 3
        System.out.println("Задание 4");

        DriverC truckDriver = new DriverC("Иванов Иван Иванович", 10, truck1);
        System.out.println(truckDriver);

    }

}