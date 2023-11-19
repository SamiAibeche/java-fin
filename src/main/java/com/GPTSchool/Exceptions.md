# Java Exceptions

This document provides an overview of Exceptions in Java, including how they work and how to handle them. Exceptions are events that disrupt the normal flow of program execution. They can be caused by a variety of issues, such as user input errors, hardware failures, and more.

## Understanding Exceptions

In Java, an exception is an object that is thrown at runtime when an unexpected situation occurs. There are two main types of exceptions:

- **Checked Exceptions**: These are exceptions that must be either caught or declared in the method signature. They are checked at compile-time.
- **Unchecked Exceptions**: These are exceptions that are not checked at compile time. They usually indicate programming errors, such as logic mistakes or improper use of an API.

## Handling Exceptions

Java provides a robust mechanism to handle exceptions. The most common way of handling exceptions is by using `try-catch` blocks.

### Try-Catch Block

A `try` block encloses code that might throw an exception, while a `catch` block is used to handle the exception.

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```


### Finally Block
A finally block always executes, whether an exception is handled or not. It is typically used for cleanup code.

```java
try {
// Code that may throw an exception
} catch (ExceptionType e) {
// Code to handle the exception
} finally {
// Code that will always execute
}
```
## Examples

### Example 1: Handling IndexOutOfBoundsException

```java
try {
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    String text = list.get(1); // This will throw IndexOutOfBoundsException
} catch (IndexOutOfBoundsException e) {
    System.out.println("An exception occurred: " + e.getMessage());
}
```
### Example 2: Using finally Block
```java

FileReader fr = null;
try {
    fr = new FileReader("file.txt");
    // Read and process the file
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
} finally {
    if (fr != null) {
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("Error closing the file: " + e.getMessage());
        }
    }
}
```
In these examples, the try-catch block is used to handle potential exceptions, and the finally block is used to ensure that resources are closed properly regardless of whether an exception occurred.

---

Understanding and handling exceptions is crucial for building robust Java applications. This document covers the basics, but there are many more details and types of exceptions to explore as you advance in Java.

This README provides a concise yet informative overview of handling exceptions in Java, with examples to illustrate the concepts. It's a great resource for anyone looking to understand the basics of Java exception handling.
