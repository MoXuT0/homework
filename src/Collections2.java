import groceries.*;
import passport.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Collections2 {

    public static void main(String[] args) {

        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");

        ProductList groceries = new ProductList();

        Product tomatoes = new Product("Помидоры", 129.0, 2.0);
        Product cucumbers = new Product("Огурцы", 69.0, 1.5);
        Product sourCream = new Product("Сметана", 151.0, 0.25);

        groceries.addProduct(tomatoes);
        groceries.addProduct(cucumbers);
        groceries.addProduct(sourCream);

        System.out.println(groceries);

        // Домашнее задание 1
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");

        RecipeList recipeBook = new RecipeList();

        Recipe salad = new Recipe(groceries, "Салат летний");

        recipeBook.addRecipe(salad);

        System.out.println(recipeBook);

        // Задание 2
        System.out.println("Задание 2");

        int initialCapacity = 20;
        Set<Integer> numbers = new HashSet<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
            numbers.add(randomNumber);
        }
        numbers.forEach(System.out::println);

        System.out.println("___________________________");

        numbers.removeIf(integer -> (integer % 2 != 0));
        numbers.forEach(System.out::println);

        // Домашнее задание 3
        System.out.println("Домашнее задание 3");

        // Задание 1
        System.out.println("Задание 1");

        System.out.println("См. transport");

        // Задание 2
        System.out.println("Задание 2");

        int questions = 15;
        Set<String>  exercises = new HashSet<>();
        while (exercises.size() < questions) {
            Random random = new Random();
            int firstNumber = random.nextInt(9) + 1;
            int secondNumber = random.nextInt(9) + 1;
            if (!exercises.contains(firstNumber + " * " + secondNumber) && (!exercises.contains(secondNumber + " * " + firstNumber))) {
                exercises.add(firstNumber + " * " + secondNumber);
            }
        }
        exercises.forEach(System.out::println);

        // Задание 3
        System.out.println("Задание 3");

        Passport passport1 = new Passport("9816-4891", "Иванов", "Иван", "Иванович", "24.03.1978");
        Passport passport2 = new Passport("1841-8751", "Петров", "Петр", null, "15.11.1985");
        Passport passport3 = new Passport("5478-9631", "Алексеев", "Алексей", "Алексеевич", "01.08.1981");

        PassportList passportList = new PassportList();

        passportList.addPassport(passport1);
        passportList.addPassport(passport2);
        passportList.addPassport(passport3);

        System.out.println(passportList);
        System.out.println(passportList.findPassport("1841-8751"));

    }

}