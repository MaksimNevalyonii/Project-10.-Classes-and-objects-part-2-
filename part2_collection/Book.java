package part2_collection;

// Part 2.1 Custom class: represents a book (an item from my area of interest).
public class Book {
    // String properties
    private String title;
    private String author;
    private String genre;

    // Numeric properties (year is used for sorting)
    private int year;
    private double rating;

    // Constructor sets all properties
    public Book(String title, String author, String genre, int year, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    // Getters
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

    // Detailed one-line description of the book
    @Override
    public String toString() {
        return String.format("\"%s\" by %s | genre: %s | year: %d | rating: %.1f",
                title, author, genre, year, rating);
    }
}