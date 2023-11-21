import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> userAges = new HashMap<>();

        // Adding elements to the HashMap
        userAges.put("Alice", 28);
        userAges.put("Bob", 34);
        userAges.put("Charlie", 22);

        // Removing an element from the HashMap
        userAges.remove("Charlie");

        // Iterating over HashMap entries
        System.out.println("HashMap Elements:");
        for (Map.Entry<String, Integer> entry : userAges.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
