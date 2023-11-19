import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        try {
            // Attempt to access the fourth element of the list
            int number = numbers.get(3);
            System.out.println("Number at index 3: " + number);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}