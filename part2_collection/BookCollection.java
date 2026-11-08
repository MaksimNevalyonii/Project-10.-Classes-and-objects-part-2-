package part2_collection;

// Part 2.1 Collection class: stores Book objects in a private array.
public class BookCollection {
    // Part 2.1.1 Private property: number of stored elements
    private int count;

    // Part 2.1.2 Private array to store objects
    private Book[] books;

    // Creates an empty collection with the given initial capacity
    public BookCollection(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Part 2.1.3 add(newObj): adds a new item (the array grows if it is full)
    public void add(Book newObj) {
        if (count == books.length) {
            // Array is full: create a bigger one and copy the elements
            Book[] bigger = new Book[books.length * 2];
            for (int i = 0; i < count; i++) {
                bigger[i] = books[i];
            }
            books = bigger;
        }
        books[count] = newObj;
        count++;
    }

    // Part 2.1.4 printOne(i): prints detailed information about one item
    public void printOne(int i) {
        if (i < 0 || i >= count) {
            System.out.println("No book with index " + i);
            return;
        }
        System.out.println((i + 1) + ". " + books[i]);
    }

    // Part 2.1.4 print(): prints the whole list
    public void print() {
        if (count == 0) {
            System.out.println("The collection is empty.");
            return;
        }
        for (int i = 0; i < count; i++) {
            printOne(i);
        }
    }

    // Part 2.1.5 find(s): searches by the title field (case-insensitive, partial match)
    public void find(String s) {
        System.out.println("Search by title containing \"" + s + "\":");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().toLowerCase().contains(s.toLowerCase())) {
                printOne(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nothing found.");
        }
    }

    // Part 2.1.6 sort(): bubble sort by the numeric property (year, ascending)
    public void sort() {
        for (int pass = 0; pass < count - 1; pass++) {
            // After each pass the largest remaining element "bubbles" to the end
            for (int i = 0; i < count - 1 - pass; i++) {
                if (books[i].getYear() > books[i + 1].getYear()) {
                    // Swap neighbours that are in the wrong order
                    Book temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                }
            }
        }
    }

    // Part 2.1.7 Search by an additional string property (genre)
    public void findByGenre(String genre) {
        System.out.println("Search by genre \"" + genre + "\":");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getGenre().equalsIgnoreCase(genre)) {
                printOne(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nothing found.");
        }
    }

    // Part 2.1.7 Search by two properties simultaneously (author and minimal year)
    public void findByAuthorAndYear(String author, int minYear) {
        System.out.println("Search by author \"" + author + "\" and year >= " + minYear + ":");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().toLowerCase().contains(author.toLowerCase())
                    && books[i].getYear() >= minYear) {
                printOne(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nothing found.");
        }
    }

    // Returns the number of stored elements (count itself is private)
    public int size() {
        return count;
    }
}