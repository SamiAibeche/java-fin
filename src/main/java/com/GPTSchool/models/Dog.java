public class Dog {

    // Datas Initialization
    private String breed;
    private int age;
    String color;

    //Set up constructor
    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    //Set up main Method
    public static void main(String[] args) {
        Dog myDog = new Dog("Labrador", 3, "golden");
        myDog.bark();
        System.out.println("My dog is a " + myDog.getBreed() + " and it is " + myDog.getAge() + " years old.");
    }

    // Getters & Setters
    /**
     * @return String bread
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return Int age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return String color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    // Class method
    public void bark() {
        System.out.println("Woof!");
    }
}
