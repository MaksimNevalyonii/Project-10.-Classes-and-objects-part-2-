package clworkk11;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Book first = new Book("Old Title", "Jane Doe");
        Book second = first; 

        second.title = "New Title"; 

        System.out.println(first.title); 
    }
}