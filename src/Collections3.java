import groceries.Product;
import groceries.Recipe;

import java.util.*;

public class Collections3 {

    public static void main(String[] args) {

        // Домашнее задание 1
        System.out.println("Домашнее задание 1");
        // Задание 1
        System.out.println("Задание 1");

        Phonebook phonebook = new Phonebook();

        phonebook.addEntry("Иван Иванов", "89784561873");
        phonebook.addEntry("Сергей Сергеев", "82784531876");
        phonebook.addEntry("Алексей Алексеев", "86481543057");
        phonebook.addEntry("Денис Денисов", "80735128900");
        phonebook.addEntry("Василий Васильев", "83481534532");
        phonebook.addEntry("Дмитрий Дмитриев", "80153495125");
        phonebook.addEntry("Антон Антонов", "88413855408");
        phonebook.addEntry("Владислав Владиславов", "88902174323");
        phonebook.addEntry("Евгений Евгеньев", "80934525912");
        phonebook.addEntry("Николай Николаев", "87573185256");
        phonebook.addEntry("Роман Романов", "88438425961");
        phonebook.addEntry("Эдуард Эдуардов", "81810278904");
        phonebook.addEntry("Виктор Викторов", "81207534880");
        phonebook.addEntry("Руслан Русланов", "88136574812");
        phonebook.addEntry("Петр Петров", "89631480527");
        phonebook.addEntry("Павел Павлов", "88734101893");
        phonebook.addEntry("Аркадий Аркадьев", "87315046227");
        phonebook.addEntry("Максим Максимов", "88734515667");
        phonebook.addEntry("Юрий Юрьев", "80877425319");
        phonebook.addEntry("Михаил Михаилов", "89723401149");

        for (Map.Entry<String, String> entry : phonebook.getEntries()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Задание 2
        System.out.println("Задание 2");

        Product tomatoes = new Product("Помидоры", 129.0, 2.0);
        Product cucumbers = new Product("Огурцы", 69.0, 1.5);
        Product sourCream = new Product("Сметана", 151.0, 0.25);

        Recipe salad = new Recipe("Салат летний");

        salad.addProduct(tomatoes, 2.0);
        salad.addProduct(cucumbers, 2.5);
        salad.addProduct(sourCream, null);
        System.out.println(salad);
        System.out.println(salad.getRecipeSum());

        // Задание 3
        System.out.println("Задание 3");

        Task map = new Task();

        map.addElement("str1", 2);
        map.addElement("str2", 1);
        System.out.println(map);
        map.addElement("str1", 5);
        System.out.println(map);

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");

        // Задание 1
        System.out.println("Задание 1");

        int initialCapacity = 5;
        int listCapacity = 3;

        Map<String, List<Integer>> oldMap = new LinkedHashMap<>(initialCapacity);
        Map<String, Integer> newMap = new LinkedHashMap<>(initialCapacity);

        for (int i = 0; i < initialCapacity; i++) {
            StringBuilder builder = new StringBuilder("string" + (i + 1));
            List<Integer> list = new LinkedList<>();
            Random random = new Random();
            int sumOfList = 0;
            for (int j = 0; j < listCapacity; j++) {
                list.add(random.nextInt(1000));
                sumOfList += list.get(j);
            }
            oldMap.put(builder.toString(),  list);
            newMap.put(builder.toString(), sumOfList);
        }

        for(Map.Entry<String, List<Integer>> entry : oldMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Задание 2
        System.out.println("Задание 2");

        Map<Integer, String> map2 = new LinkedHashMap<>();

        map2.put(6, "map6");
        map2.put(9, "map9");
        map2.put(1, "map1");
        map2.put(10, "map10");
        map2.put(3, "map3");
        map2.put(2, "map2");
        map2.put(7, "map7");
        map2.put(8, "map8");
        map2.put(5, "map5");
        map2.put(4, "map4");

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static class Task {

        private final Map<String, Integer> map = new HashMap<>();

        public void addElement(String key, Integer value) {
            if (map.containsKey(key) && map.containsValue(value)) {
                throw new RuntimeException("Уже есть такой элемент");
            } else if (!map.containsKey(key)) {
                map.put(key, value);
            } else {
                map.replace(key, value);
            }
        }

        @Override
        public String toString() {
            return "Task{" +
                    "map=" + map +
                    '}';
        }

    }

}