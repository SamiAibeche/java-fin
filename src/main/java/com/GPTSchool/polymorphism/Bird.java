package com.GPTSchool.polymorphism;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}