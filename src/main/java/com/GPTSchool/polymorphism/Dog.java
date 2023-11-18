package com.GPTSchool.polymorphism;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}