package passport;

import java.util.HashMap;
import java.util.Objects;

public class PassportList {

    private HashMap<String, Passport> passportList = new HashMap<>();

    public void addPassport(Passport passport) {
        if (!passportList.containsKey(passport.getNumber())){
            passportList.put(passport.getNumber(), passport);
        } else {
            passportList.replace(passport.getNumber(), passport);
        }
    }

    public void removePassport(Passport passport) {
        passportList.remove(passport);
    }

    public Passport findPassport(String passportNumber) {
        if (passportList.containsKey(passportNumber)) {
            return passportList.get(passportNumber);
        } else {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PassportList that = (PassportList) o;
        return Objects.equals(passportList, that.passportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportList);
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passportList=" + passportList +
                '}';
    }

}
