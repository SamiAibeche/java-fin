# Collections in Java

This document provides an overview of the Collections framework in Java. Collections are used to store, retrieve, manipulate, and communicate aggregate data. They provide a more flexible and powerful alternative to arrays.

## Overview of Collections

The Java Collections Framework provides a set of interfaces and classes for storing and manipulating groups of data as a single unit, a collection. The framework includes several different types of collections like lists, sets, and maps, each with its own advantages.

## Key Interfaces

- **List**: An ordered collection (also known as a sequence). The user can access elements by their integer index and search for elements in the list.
- **Set**: A collection that cannot contain duplicate elements. It models the mathematical set abstraction.
- **Map**: An object that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most one value.

## Common Implementations

- **ArrayList**: A resizable-array implementation of the List interface.
- **HashSet**: An implementation of the Set interface backed by a hash table.
- **HashMap**: An implementation of the Map interface that uses a hash table.

## Examples

### Example 1: Using ArrayList

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```
### Example 2: Using HashSet

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("New York"); // This will not be added again

        System.out.println(cities);
    }
}
```
### Example 3: Using HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 95);
        marks.put("Charlie", 70);

        System.out.println("Bob's Mark: " + marks.get("Bob"));
    }
}
```
In these examples, `ArrayList`, `HashSet`, and `HashMap` are used to demonstrate the basic functionality of List, Set, and Map interfaces, respectively.

---

The Collections framework in Java provides a powerful set of tools to handle groups of objects. Understanding these collections and their usage is crucial for effective Java programming.

This README provides a clear and concise overview of the Collections framework in Java, with practical examples to illustrate the use of different types of collections. It's a great starting point for anyone looking to understand how to work with collections in Java.
