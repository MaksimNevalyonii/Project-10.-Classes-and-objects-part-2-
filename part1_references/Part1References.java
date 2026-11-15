package part1_references;

public class Part1References {

    public static void main(String[] args) {
        // Часть 1.1 Присваивание
        demonstrateAssignments();

        System.out.println();

        // Часть 1.2 Аргументы
        demonstrateArguments();
    }

    // Часть 1.1 Присваивание: две переменные, один объект
    private static void demonstrateAssignments() {
        System.out.println("=== Part 1.1 Assignments ===");

        // Создаём объект класса. В 'first' лежит ссылка (адрес) на него.
        Person first = new Person("Alice", 20);

        // Присваиваем ЭТУ ЖЕ ссылку второй переменной.
        // Новый объект не создаётся: обе переменные указывают на один объект в памяти.
        Person second = first;

        System.out.println("Initial state:");
        System.out.println("first  -> " + first);
        System.out.println("second -> " + second);
        System.out.println("Same object? (first == second): " + (first == second));

        // Меняем свойства через первую переменную.
        first.name = "Bob";
        System.out.println("\nAfter first.name = \"Bob\":");
        System.out.println("first  -> " + first);
        System.out.println("second -> " + second); 

        // Меняем свойства через вторую переменную.
        second.age = 35;
        System.out.println("\nAfter second.age = 35:");
        System.out.println("first  -> " + first);  // изменение видно и здесь
        System.out.println("second -> " + second);

        System.out.println("\nConclusion: both variables point to the same object,"
                + " so a change made via one is seen via the other.");
    }

    // Часть 1.2 Аргументы: передача объекта в метод
    private static void demonstrateArguments() {
        System.out.println("=== Part 1.2 Arguments ===");

        // Создаём объект класса.
        Car car = new Car("Toyota Corolla", 50000);
        System.out.println("Before method call: " + car);

        // Передаём объект в метод. Java копирует ССЫЛКУ (а не сам объект),
        // поэтому параметр метода указывает на тот же объект, что и 'car'.
        addMileage(car, 1200);

        // Проверяем свойство вне метода: изменение видно,
        // потому что метод изменил исходный объект.
        System.out.println("After method call:  " + car);

        System.out.println("\nConclusion: the method changed the original object"
                + " because it received a copy of the reference to it.");
    }

    // Получает ссылку на Car и меняет его свойство.
    // Параметр c: ссылка на исходный объект Car.
    // Параметр distance: сколько километров добавить к пробегу.
    private static void addMileage(Car c, int distance) {
        // Меняем свойство объекта через полученную ссылку.
        c.mileage += distance;
        System.out.println("Inside method:      " + c);
    }
}