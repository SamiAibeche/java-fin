package com.GPTSchool.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myBird = new Bird();

        myDog.makeSound(); // Outputs: Dog barks
        myBird.makeSound(); // Outputs: Bird chirps

        // Demonstrating polymorphism
        Animal[] animals = new Animal[]{new Dog(), new Bird()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}