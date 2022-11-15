import java.util.Arrays;

public class Arrays2 {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        // Задание 1
        System.out.println("Задание 1");
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задание 3
        System.out.println("Задание 3");
        double days = 30.0;
        double average = total / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }
}