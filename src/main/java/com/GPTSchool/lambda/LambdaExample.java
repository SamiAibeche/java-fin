@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + addition.operation(10, 5));
    }
}