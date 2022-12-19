package passport;

import java.util.Objects;

public class Passport {

    private String number;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;

    public Passport() {
        this(null,
                null,
                null,
                null,
                null);
    }

    public Passport(String number,
                    String lastName,
                    String firstName,
                    String middleName,
                    String dateOfBirth) {
        setNumber(number);
        setLastName(lastName);
        setFirstName(firstName);
        setMiddleName(middleName);
        setDateOfBirth(dateOfBirth);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() || lastName.isBlank()) {
            throw new IllegalArgumentException("Заполните фамилию");
        } else {
            this.lastName = lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
            throw new IllegalArgumentException("Заполните имя");
        } else {
            this.firstName = firstName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.isEmpty() || dateOfBirth.isBlank()) {
            throw new IllegalArgumentException("Заполните дату рождения");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

}
