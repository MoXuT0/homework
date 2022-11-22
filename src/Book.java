import java.util.Objects;

public class Book {

    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга [" + "Имя = " + name + ", Автор = " + author + ", Год публикации = " + publishingYear + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
