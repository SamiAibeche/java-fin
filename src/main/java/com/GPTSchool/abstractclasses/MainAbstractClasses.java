package com.GPTSchool.abstractclasses;

public class MainAbstractClasses {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myBird = new Bird();

        myDog.makeSound(); // Outputs: Dog barks
        myDog.eat();       // Outputs: Animal is eating

        myBird.makeSound(); // Outputs: Bird chirps
        myBird.eat();       // Outputs: Animal is eating
    }
}