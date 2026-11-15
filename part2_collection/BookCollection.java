package part2_collection;

// Часть 2.1 Класс-коллекция: хранит объекты Book в приватном массиве.
public class BookCollection {
    // Часть 2.1.1 Приватное свойство: количество хранимых элементов
    private int count;

    // Часть 2.1.2 Приватный массив для хранения объектов
    private Book[] books;

    // Создаёт пустую коллекцию с заданной начальной вместимостью
    public BookCollection(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Часть 2.1.3 add(newObj): добавляет новый элемент (массив увеличивается, если он заполнен)
    public void add(Book newObj) {
        if (count == books.length) {
            // Массив заполнен: создаём массив побольше и копируем элементы
            Book[] bigger = new Book[books.length * 2];
            for (int i = 0; i < count; i++) {
                bigger[i] = books[i];
            }
            books = bigger;
        }
        books[count] = newObj;
        count++;
    }

    // Часть 2.1.4 printOne(i): выводит подробную информацию об одном элементе
    public void printOne(int i) {
        if (i < 0 || i >= count) {
            System.out.println("No book with index " + i);
            return;
        }
        System.out.println((i + 1) + ". " + books[i]);
    }

    // Часть 2.1.4 print(): выводит весь список
    public void print() {
        if (count == 0) {
            System.out.println("The collection is empty.");
            return;
        }
        for (int i = 0; i < count; i++) {
            printOne(i);
        }
    }

    // Часть 2.1.5 find(s): поиск по полю title (без учёта регистра, по части строки)
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

    // Часть 2.1.6 sort(): сортировка пузырьком по числовому свойству (year, по возрастанию)
    public void sort() {
        for (int pass = 0; pass < count - 1; pass++) {
            // После каждого прохода самый большой из оставшихся элементов "всплывает" в конец
            for (int i = 0; i < count - 1 - pass; i++) {
                if (books[i].getYear() > books[i + 1].getYear()) {
                    // Меняем местами соседние элементы, стоящие в неправильном порядке
                    Book temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                }
            }
        }
    }

    // Часть 2.1.7 Поиск по дополнительному строковому свойству (genre)
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

    // Часть 2.1.7 Поиск сразу по двум свойствам (автор и минимальный год)
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

    // Возвращает количество хранимых элементов (само поле count приватное)
    public int size() {
        return count;
    }
}