public class Author {

    private final String firstName;
    private final String lastName;

    public Author (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorName() {
        return firstName;
    }

    public String getAuthorSurname() {
        return lastName;
    }

    public String getFullName() {
        return (firstName + " " + lastName);
    }

}