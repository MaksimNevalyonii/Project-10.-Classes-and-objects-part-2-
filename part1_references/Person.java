package part1_references;

// Simple class used to demonstrate reference assignment (Part 1.1).
public class Person {
    // Properties of the object (changeable through any reference)
    String name;
    int age;

    // Constructor sets initial state
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}