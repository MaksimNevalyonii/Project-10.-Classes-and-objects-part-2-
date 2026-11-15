package clworkk11; 

// Базовый класс: общий "родитель" для всего транспорта
class Vehicle {
    void move() {
        System.out.println("The vehicle moves"); // "Транспорт движется"
    }
}

// Car наследуется от Vehicle (extends): у неё уже есть move() от родителя
class Car extends Vehicle {
    @Override // переопределяем move(): у машины своё поведение
    void move() {
        System.out.println("The car drives on the road"); // "Машина едет по дороге"
    }
}

// Bicycle тоже наследник Vehicle и тоже переопределяет move()
class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("The bicycle is pedaled along"); // "Велосипед едет на педалях"
    }
}

public class Task3 {
    public static void main(String[] args) { // отсюда старт программы

        // Массив типа Vehicle: в нём можно хранить и обычный транспорт,
        // и машину, и велосипед (они все "Vehicle")
        Vehicle[] vehicles = { new Vehicle(), new Car(), new Bicycle() };

        // Проходим по каждому элементу массива по очереди
        for (Vehicle v : vehicles) {
            v.move(); // вызывается move() того объекта, который реально лежит в v
        }
    }
}