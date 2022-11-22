public class App {

    public static void main(String[] args) {

        // Домашнее задание
        System.out.println("Домашнее задание");

        Book book1 = new Book("Сияние", new Author("Стивен", "Кинг"), 1977);
        Book book2 = new Book("Дагон", new Author("Говард", "Лавкрафт"), 1917);
        Book book3 = new Book("Оно", new Author("Стивен", "Кинг"), 1986);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1.equals(book3));

        Author author1 = new Author("Джек", "Лондон");
        Author author2 = new Author("Джек", "Керуак");

        System.out.println(author1.equals(author2));

    }
}