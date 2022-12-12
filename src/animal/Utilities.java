package animal;

public class Utilities {

    public static String validateString(String value, String defaultValue) {
        return value == null || value.isEmpty() || value.isBlank() ? defaultValue : value;
    }

}