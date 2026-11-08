package part1_references;

// Part 1. References: assignments and arguments.
// Run this class to see both demonstrations in the console.
public class Part1References {

    public static void main(String[] args) {
        // Part 1.1 Assignments
        demonstrateAssignments();

        System.out.println();

        // Part 1.2 Arguments
        demonstrateArguments();
    }

    // Part 1.1 Assignments: two variables, one object
    private static void demonstrateAssignments() {
        System.out.println("=== Part 1.1 Assignments ===");

        // Create an object of the class. 'first' holds a reference (address) to it.
        Person first = new Person("Alice", 20);

        // Assign the SAME reference to a second variable.
        // No new object is created: both variables point to one object in memory.
        Person second = first;

        System.out.println("Initial state:");
        System.out.println("first  -> " + first);
        System.out.println("second -> " + second);
        System.out.println("Same object? (first == second): " + (first == second));

        // Change properties through the first variable.
        first.name = "Bob";
        System.out.println("\nAfter first.name = \"Bob\":");
        System.out.println("first  -> " + first);
        System.out.println("second -> " + second); // the change is visible here too

        // Change properties through the second variable.
        second.age = 35;
        System.out.println("\nAfter second.age = 35:");
        System.out.println("first  -> " + first);  // the change is visible here too
        System.out.println("second -> " + second);

        System.out.println("\nConclusion: both variables point to the same object,"
                + " so a change made via one is seen via the other.");
    }

    // Part 1.2 Arguments: passing an object into a method
    private static void demonstrateArguments() {
        System.out.println("=== Part 1.2 Arguments ===");

        // Create an object of the class.
        Car car = new Car("Toyota Corolla", 50000);
        System.out.println("Before method call: " + car);

        // Pass the object into a method. Java copies the REFERENCE (not the object),
        // so the method parameter points to the same object as 'car'.
        addMileage(car, 1200);

        // Check the property outside the method: the change is visible,
        // because the method modified the original object.
        System.out.println("After method call:  " + car);

        System.out.println("\nConclusion: the method changed the original object"
                + " because it received a copy of the reference to it.");
    }

    // Receives a reference to a Car and changes its property.
    // Parameter c: reference to the original Car object.
    // Parameter distance: kilometers to add to the mileage.
    private static void addMileage(Car c, int distance) {
        // Modify the object's property via the received reference.
        c.mileage += distance;
        System.out.println("Inside method:      " + c);
    }
}