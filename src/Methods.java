import java.time.LocalDate;

public class Methods {

    public static void checkLeapYear(int currentYear) {
        if (currentYear % 4 != 0) {
            System.out.println(currentYear + " год не является високосным");
        } else if (currentYear % 100 == 0 && currentYear % 400 != 0) {
            System.out.println(currentYear + " год не является високосным");
        } else {
            System.out.println(currentYear + " год является високосным");
        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        }
        return 1;
    }

        public static void getClientApp(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculateDaysToDeliver(int deliveryDistance) {
        int deliveryDistanceInterval = 40;
        int deliveryDistanceMinimum = 20;
        int deliveryDays = 1;
        if (deliveryDistance >= deliveryDistanceMinimum) {
            deliveryDays = (deliveryDays + ((deliveryDistanceMinimum + deliveryDistance) / deliveryDistanceInterval));
        }
        System.out.println("Потребуется дней для доставки: " + deliveryDays);
    }

    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        checkLeapYear(2020);

        // Задание 2
        System.out.println("Задание 2");
        getClientApp(getClientOS("iOS"), LocalDate.now().getYear());

        // Задание 3
        System.out.println("Задание 3");
        calculateDaysToDeliver(95);

    }
}