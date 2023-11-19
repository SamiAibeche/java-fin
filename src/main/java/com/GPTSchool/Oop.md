# Object-Oriented Programming Concepts

This document provides a clear and detailed summary of key object-oriented programming concepts: inheritance, polymorphism, interfaces, and abstract classes.

## 1. Inheritance

### What It Is
Inheritance is a mechanism where a new class (called a subclass or child class) derives properties and behaviors (methods) from an existing class (called a superclass or parent class).

### Key Benefit
It promotes code reusability. You can create a class based on an existing class, extending its functionalities and modifying behaviors as needed.

### Example
Consider a general class `Animal` (superclass) and a specific class `Dog` (subclass). `Dog` inherits traits from `Animal` (like eating or sleeping behaviors) but can also have its unique behaviors (like barking).

## 2. Polymorphism

### What It Is
Polymorphism means "many forms." In programming, it allows objects of different classes to be treated as objects of a common super class. The most common use of polymorphism is when a parent class reference is used to refer to a child class object.

### Key Benefit
It enhances flexibility and maintainability. The same interface can be used to execute methods of different classes.

### Example
If `Animal` is a superclass and has a method `makeSound`, the subclasses `Dog` and `Bird` can have their own implementation of `makeSound` (barking, chirping). You can use an `Animal` reference to call `makeSound` without knowing the specific type of animal.

## 3. Interfaces

### What It Is
An interface is a completely "abstract class" that is used to group related methods with empty bodies. Classes "implement" interfaces and provide the method definitions.

### Key Benefit
Interfaces specify what a class must do, but not how it does it. They are used to achieve complete abstraction and multiple inheritance in Java.

### Example
If you have an interface `Flyable` with a method `fly`, any class like `Bird` or `Airplane` implementing this interface would provide its own implementation of `fly`.

## 4. Abstract Classes

### What It Is
An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without a body). It can also have methods with a defined behavior.

### Key Benefit
Abstract classes allow you to define a base class with some common functionality and some abstract behaviors that subclasses must implement.

### Example
If you have an abstract class `Vehicle` with an abstract method `move` and a regular method `fuelUp`, subclasses like `Car` and `Bicycle` would provide their own implementation of `move`, but can inherit `fuelUp` as is.

---

These concepts are fundamental in object-oriented programming and are used to create flexible, modular, and reusable code.
