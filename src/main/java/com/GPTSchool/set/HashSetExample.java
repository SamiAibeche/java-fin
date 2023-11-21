import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> cars = new HashSet<>();

        // Adding elements to the HashSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // This will not be added as it's a duplicate

        // Removing an element from the HashSet
        cars.remove("Volvo");

        // Iterating over HashSet elements
        System.out.println("HashSet Elements:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
