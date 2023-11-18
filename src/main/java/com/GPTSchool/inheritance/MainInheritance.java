package com.GPTSchool.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Since Dog extends Animal, it can use its methods
        myDog.eat(); // This should print "Animal is eating"
        myDog.bark(); // This should print "Dog is barking"
    }
}