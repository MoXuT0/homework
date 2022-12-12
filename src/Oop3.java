import animal.*;
import transport.*;

import java.time.LocalDate;

public class Oop3 {

    public static void main(String[] args) {

        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 150,
                1.7, "ручная", "седан", "у873тф629", 5, false,
                new Car.Key(false, false),
                new Car.Insurance(LocalDate.now(), 10_000, "843157924"), 48.55);
        System.out.println(lada);

        // Задание 2
        System.out.println("Задание 2");

        Train lastochka = new Train("Ласточка", "B-901", 2011,"Россия", null, 301,
                3500, 4,"Белорусский вокзал","Минск-Пассажирский", 11, 88.91);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270,
                1700, 5, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 77.01);
        System.out.println(lastochka);
        System.out.println(leningrad);

        // Задание 3
        System.out.println("Задание 3");

        Bus gaz = new Bus("ГАЗ", "ГАЗель 065", 2011, "Россия", "черный", 80, 89.55);
        Bus kia = new Bus("KIA", "Cosmos", 2018, "Южная Корея", "белый", 90, 14.12);
        Bus deawoo = new Bus("Daewoo", "BC095", 2013, "Южная Корея", "синий", 75, 59.84);

        System.out.println(gaz);
        System.out.println(kia);
        System.out.println(deawoo);

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");

        // Задание 1
        System.out.println("Задание 1");

        deawoo.refill();
        System.out.println(deawoo);

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 1
        System.out.println("Задание 1");

        Herbivore gazelle = new Herbivore("Газель", 5, "саванна", 40, "трава и листья");
        System.out.println(gazelle);
        gazelle.move();
        gazelle.eat();
        gazelle.sleep();
        gazelle.walk();

        Predator tiger = new Predator("Тигр", 7, "джунгли", 55, "мясо");
        System.out.println(tiger);
        tiger.move();
        tiger.eat();
        tiger.sleep();
        tiger.walk();

        Amphibian frog = new Amphibian("Лягушка", 1, "озера и пруды");
        System.out.println(frog);
        frog.eat();
        frog.hunt();
        frog.move();

        Flying gull = new Flying("Чайка", 3, "море и пляж", "летает");
        System.out.println(gull);
        gull.move();
        gull.eat();
        gull.sleep();
        gull.hunt();
        
        Flightless penguin1 = new Flightless("Пингвин", 4, "Северный и Южный полюса", "плавает и ходит");
        System.out.println(penguin1);
        penguin1.move();
        penguin1.eat();
        penguin1.sleep();
        penguin1.hunt();

        Flightless penguin2 = new Flightless("Пингвин", 4, "Северный и Южный полюса", "плавает и ходит");
        isEqual(penguin1, gull);
        isEqual(penguin1, penguin2);

    }

    public static void isEqual(Animal firstObj, Animal secondObj) {
        if (firstObj.equals(secondObj)) {
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты не равны");
        }
    }

}
