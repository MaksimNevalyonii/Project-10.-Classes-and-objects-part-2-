package part2_collection;

// Часть 2.2 Main (вариант 2): объекты создаются в коде.
// Демонстрирует методы add, print, sort и find.
public class Part2Collection {

    public static void main(String[] args) {
        // Часть 2.2 Создаём коллекцию (начальная вместимость 3 показывает, что она может расти)
        BookCollection library = new BookCollection(3);

        // Часть 2.2 Создаём 5 разных объектов и добавляем их в коллекцию
        library.add(new Book("Fahrenheit 451", "Ray Bradbury", "Dystopia", 1953, 4.5));
        library.add(new Book("Brave New World", "Aldous Huxley", "Dystopia", 1932, 4.4));
        library.add(new Book("The Martian", "Andy Weir", "Science Fiction", 2011, 4.6));
        library.add(new Book("Foundation", "Isaac Asimov", "Science Fiction", 1951, 4.4));
        library.add(new Book("The Little Prince", "Antoine de Saint-Exupery", "Fairy Tale", 1943, 4.8));

        // Часть 2.1.4 print(): весь список в порядке добавления
        System.out.println("=== Part 2.1.4 print() ===");
        library.print();

        // Часть 2.1.4 printOne(i): один элемент
        System.out.println("\n=== Part 2.1.4 printOne(2) ===");
        library.printOne(2);

        // Часть 2.1.6 sort(): сортировка пузырьком по году
        System.out.println("\n=== Part 2.1.6 sort() by year ===");
        library.sort();
        library.print();

        // Часть 2.1.5 find(String): поиск по названию
        System.out.println("\n=== Part 2.1.5 find() ===");
        library.find("the");
        library.find("xyz");

        // Часть 2.1.7 Поиск по дополнительным свойствам
        System.out.println("\n=== Part 2.1.7 Search by other properties ===");
        library.findByGenre("Dystopia");
        library.findByAuthorAndYear("Asimov", 1950);
    }
}