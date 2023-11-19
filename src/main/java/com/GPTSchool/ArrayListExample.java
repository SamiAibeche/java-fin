import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Removing an element from the ArrayList
        fruits.remove("Banana");

        // Iterating over ArrayList elements
        System.out.println("ArrayList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
