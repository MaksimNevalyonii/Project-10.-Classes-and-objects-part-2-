package clworkk11; 

// Класс Book - чертёж книги
class Book {
    String title;  // название
    String author; // автор

    // Конструктор: создаёт книгу с названием и автором
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Task1 {
    public static void main(String[] args) { // отсюда старт программы

        // Создаём одну книгу; first хранит ссылку на неё
        Book first = new Book("Old Title", "Jane Doe");

        // Копируется ссылка, а не книга: обе переменные указывают на одну книгу
        Book second = first;

        // Меняем название через second (изменится и для first)
        second.title = "New Title";

        // Выведет: New Title
        System.out.println(first.title);
    }
}