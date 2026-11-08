package part2_collection;

// Part 2.2 Main (Option 2): objects are created in code.
// Demonstrates add, print, sort and find methods.
public class Part2Collection {

    public static void main(String[] args) {
        // Part 2.2 Create the collection (initial capacity 3 shows that it can grow)
        BookCollection library = new BookCollection(3);

        // Part 2.2 Create 5 different objects and add them to the collection
        library.add(new Book("Fahrenheit 451", "Ray Bradbury", "Dystopia", 1953, 4.5));
        library.add(new Book("Brave New World", "Aldous Huxley", "Dystopia", 1932, 4.4));
        library.add(new Book("The Martian", "Andy Weir", "Science Fiction", 2011, 4.6));
        library.add(new Book("Foundation", "Isaac Asimov", "Science Fiction", 1951, 4.4));
        library.add(new Book("The Little Prince", "Antoine de Saint-Exupery", "Fairy Tale", 1943, 4.8));

        // Part 2.1.4 print(): whole list in the order of adding
        System.out.println("=== Part 2.1.4 print() ===");
        library.print();

        // Part 2.1.4 printOne(i): one item
        System.out.println("\n=== Part 2.1.4 printOne(2) ===");
        library.printOne(2);

        // Part 2.1.6 sort(): bubble sort by year
        System.out.println("\n=== Part 2.1.6 sort() by year ===");
        library.sort();
        library.print();

        // Part 2.1.5 find(String): search by title
        System.out.println("\n=== Part 2.1.5 find() ===");
        library.find("the");
        library.find("xyz");

        // Part 2.1.7 Search by additional properties
        System.out.println("\n=== Part 2.1.7 Search by other properties ===");
        library.findByGenre("Dystopia");
        library.findByAuthorAndYear("Asimov", 1950);
    }
}