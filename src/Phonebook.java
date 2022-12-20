import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private final HashMap<String, String> phonebook = new HashMap<>();

    public void addEntry(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public Set<Map.Entry<String, String>> getEntries() {
        return phonebook.entrySet();
    }

}
