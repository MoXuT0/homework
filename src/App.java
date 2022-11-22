public class App {

    public static void main(String[] args) {

        // Домашнее задание
        System.out.println("Домашнее задание");

        Book book1 = new Book("Сияние", new Author("Стивен", "Кинг"), 1977);
        Book book2 = new Book("Дагон", new Author("Говард", "Лавкарфт"), 1917);

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());

        book1.setPublishingYear(1978);
        System.out.println("Измененный год публикации - " + book1.getPublishingYear());

    }
}