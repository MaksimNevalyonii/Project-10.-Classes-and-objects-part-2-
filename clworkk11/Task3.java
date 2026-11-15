package clworkk11;

class Vehicle {
    void move() {
        System.out.println("The vehicle moves");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on the road");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("The bicycle is pedaled along");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Vehicle(), new Car(), new Bicycle() };

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}