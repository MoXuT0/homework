public class Cycles2 {
    public static void main(String[] args) {

        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");
        int month = 0;
        int sum = 0;
        while (sum <= 2_459_00) {
            month = month + 1;
            sum = sum + 15_000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int countryPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 0;
        while (year < 10) {
            year++;
            countryPopulation = countryPopulation + (birthRate - deathRate) * countryPopulation / 1000;
        }
        System.out.println("Год " + year + ", численность населения составляет " + countryPopulation);

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");
        int sum2 = 15_000;
        for (int month2 = 1; sum2 <= 12_000_000; month2++) {
            sum2 += sum2 * 0.07;
            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + sum2 + " рублей");
        }

        // Задание 2
        System.out.println("Задание 2");
        int sum3 = 15_000;
        for (int month3 = 1; sum3 <= 12_000_000; month3++) {
            sum3 += sum3 * 0.07;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + sum3 + " рублей");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int sum4 = 15_000;
        for (int month4 = 1; month4 <= 9 * 12; month4++) {
            sum4 += sum4 * 0.07;
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + ", сумма накоплений равна " + sum3 + " рублей");
            }
        }

        // Задание 4
        System.out.println("Задание 4");
        int fridayReport = 4;
        for (int dayReport = fridayReport; dayReport <= 31; dayReport = dayReport + 7) {
            System.out.println("Сегодня пятница, " + dayReport + "-е число. Необходимо подготовить отчет.");
        }

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задача 1
        System.out.println("Задача 1");
        int yearCurrent = 2022;
        int yearStart = yearCurrent - 200;
        int yearFinish = yearCurrent + 100;
        for (int yearComet = yearStart; yearComet < yearFinish; yearComet++) {
            if (yearComet % 79 == 0) {
                System.out.println(yearComet);
            }
        }

        // Задача 2
        System.out.println("Задача 2");
        int two = 2;
        for (int mult = 1; mult <= 10; mult++) {
            int result = two * mult;
            System.out.println(two + "*" + mult + "=" + result);
        }

    }
}