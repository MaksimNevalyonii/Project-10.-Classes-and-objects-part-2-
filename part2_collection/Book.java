package part2_collection;

// Часть 2.1 Собственный класс: описывает книгу (предмет из моей области интересов).
public class Book {
    // Строковые свойства
    private String title;
    private String author;
    private String genre;

    // Числовые свойства (year используется для сортировки)
    private int year;
    private double rating;

    // Конструктор задаёт все свойства
    public Book(String title, String author, String genre, int year, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    // Геттер просто возвращает значение приватного поля. Остальные четыре геттера делают то же самое.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    // Подробное описание книги в одну строку
    @Override
    public String toString() {
        return String.format("\"%s\" by %s | genre: %s | year: %d | rating: %.1f",
                title, author, genre, year, rating);
    }
}