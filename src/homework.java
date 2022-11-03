public class homework {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
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

        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistanceTotal = 95;
        int deliveryDistanceInterval = 40;
        int deliveryDistanceMinimum = 20;
        int deliveryDays = 1;
        if (deliveryDistanceTotal >= deliveryDistanceMinimum) {
            deliveryDays = (deliveryDays + ((deliveryDistanceMinimum + deliveryDistanceTotal) / deliveryDistanceInterval));
        }
        System.out.println("Потребуется дней для доставки: " + deliveryDays);

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}